package me.psiber.thisisstone.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.biome.Biome;

public class WhiteAdditionalGenerationConditionProcedure {
   // 1. Define constants for common and vanilla tags to protect worldgen performance.
   private static final TagKey<Biome> IS_SNOWY_COMMON = TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "is_snowy"));
   private static final TagKey<Biome> IS_ICY_COMMON = TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "is_icy"));
   private static final TagKey<Biome> IS_MOUNTAIN_COMMON = TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "is_mountain"));

   // 2. Standard Minecraft tags for specific biome categories.
   private static final TagKey<Biome> IS_RIVER_MINECRAFT = TagKey.create(Registries.BIOME, ResourceLocation.withDefaultNamespace("is_river"));
   private static final TagKey<Biome> IS_TAIGA_MINECRAFT = TagKey.create(Registries.BIOME, ResourceLocation.withDefaultNamespace("is_taiga"));

   public static boolean execute(LevelAccessor world, double x, double y, double z) {
      BlockPos pos = BlockPos.containing(x, y, z);

      // 3. Retrieve the biome holder (1.21.1 Holder API).
      var biomeHolder = world.getBiome(pos);

      // 4. Perform the optimized checks.
      return biomeHolder.is(IS_SNOWY_COMMON) ||
              biomeHolder.is(IS_ICY_COMMON) ||
              biomeHolder.is(IS_MOUNTAIN_COMMON) ||
              biomeHolder.is(IS_RIVER_MINECRAFT) ||
              biomeHolder.is(IS_TAIGA_MINECRAFT);
   }
}