package me.psiber.thisisstone.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.biome.Biome;

public class GreenAdditionalGenerationConditionProcedure {
   // 1. In 1.21.1, define TagKeys as constants to prevent overhead during worldgen.
   // 2. Use the "c" namespace for common tags (lush, jungle, swamp).
   private static final TagKey<Biome> IS_LUSH = TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "is_lush"));
   private static final TagKey<Biome> IS_JUNGLE = TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "is_jungle"));
   private static final TagKey<Biome> IS_SWAMP = TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "is_swamp"));

   // 3. For Minecraft-specific tags, use the default namespace.
   private static final TagKey<Biome> MINECRAFT_IS_JUNGLE = TagKey.create(Registries.BIOME, ResourceLocation.withDefaultNamespace("is_jungle"));

   public static boolean execute(LevelAccessor world, double x, double y, double z) {
      BlockPos pos = BlockPos.containing(x, y, z);

      // 4. world.getBiome(pos) now returns a Holder<Biome> in 1.21.1.
      var biomeHolder = world.getBiome(pos);

      // 5. Use .is() on the holder for efficient tag checking.
      return biomeHolder.is(IS_LUSH) ||
              biomeHolder.is(IS_JUNGLE) ||
              biomeHolder.is(IS_SWAMP) ||
              biomeHolder.is(MINECRAFT_IS_JUNGLE);
   }
}