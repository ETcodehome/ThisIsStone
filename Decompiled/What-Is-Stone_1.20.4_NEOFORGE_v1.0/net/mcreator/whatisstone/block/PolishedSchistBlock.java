package net.mcreator.whatisstone.block;

import java.util.Collections;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Axis;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.storage.loot.LootParams;

public class PolishedSchistBlock extends Block {
   public static final EnumProperty<Direction.Axis> AXIS;

   public PolishedSchistBlock() {
      super(Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.ANCIENT_DEBRIS).strength(1.75F, 6.0F).requiresCorrectToolForDrops());
      this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(AXIS, Axis.Y));
   }

   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 15;
   }

   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
      builder.add(new Property[]{AXIS});
   }

   public BlockState getStateForPlacement(BlockPlaceContext context) {
      return (BlockState)this.defaultBlockState().setValue(AXIS, context.getClickedFace().getAxis());
   }

   public BlockState rotate(BlockState state, Rotation rot) {
      if (rot == Rotation.CLOCKWISE_90 || rot == Rotation.COUNTERCLOCKWISE_90) {
         if (state.getValue(AXIS) == Axis.X) {
            return (BlockState)state.setValue(AXIS, Axis.Z);
         }

         if (state.getValue(AXIS) == Axis.Z) {
            return (BlockState)state.setValue(AXIS, Axis.X);
         }
      }

      return state;
   }

   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
      Item var6 = player.getInventory().getSelected().getItem();
      if (var6 instanceof PickaxeItem tieredItem) {
         return tieredItem.getTier().getLevel() >= 0;
      } else {
         return false;
      }
   }

   public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
      List<ItemStack> dropsOriginal = super.getDrops(state, builder);
      return !dropsOriginal.isEmpty() ? dropsOriginal : Collections.singletonList(new ItemStack(this, 1));
   }

   static {
      AXIS = BlockStateProperties.AXIS;
   }
}
