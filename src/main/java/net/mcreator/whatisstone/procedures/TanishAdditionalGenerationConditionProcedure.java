package net.mcreator.whatisstone.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.biome.Biome;

public class TanishAdditionalGenerationConditionProcedure {
   // 1. Define constants for common and vanilla tags.
   // "c" is the standard namespace for common biome tags in 1.21.1.
   private static final TagKey<Biome> IS_DESERT_COMMON = TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "is_desert"));
   private static final TagKey<Biome> IS_OCEAN_MINECRAFT = TagKey.create(Registries.BIOME, ResourceLocation.withDefaultNamespace("is_ocean"));

   public static boolean execute(LevelAccessor world, double x, double y, double z) {
      BlockPos pos = BlockPos.containing(x, y, z);

      // 2. Retrieve the biome holder.
      var biomeHolder = world.getBiome(pos);

      // 3. Perform efficient tag checks.
      return biomeHolder.is(IS_DESERT_COMMON) ||
              biomeHolder.is(IS_OCEAN_MINECRAFT);
   }
}