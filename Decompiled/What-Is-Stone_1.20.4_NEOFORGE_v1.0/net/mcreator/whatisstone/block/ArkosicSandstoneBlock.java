package net.mcreator.whatisstone.block;

import java.util.Collections;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.storage.loot.LootParams;

public class ArkosicSandstoneBlock extends Block {
   public ArkosicSandstoneBlock() {
      super(Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(1.4F, 5.0F).requiresCorrectToolForDrops());
   }

   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 15;
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
}
