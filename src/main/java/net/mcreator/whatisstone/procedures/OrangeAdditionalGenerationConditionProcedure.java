package net.mcreator.whatisstone.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.biome.Biome;

public class OrangeAdditionalGenerationConditionProcedure {
   // 1. Define constants for common tags (Badlands/Mesa and Savanna)
   // NeoForge 1.21.1 uses the "c" namespace for common cross-loader tags.
   private static final TagKey<Biome> IS_BADLANDS_COMMON = TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "is_badlands"));
   private static final TagKey<Biome> IS_SAVANNA_COMMON = TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "is_savanna"));

   // 2. Standard Minecraft tags for extra coverage
   private static final TagKey<Biome> IS_BADLANDS_MINECRAFT = TagKey.create(Registries.BIOME, ResourceLocation.withDefaultNamespace("is_badlands"));
   private static final TagKey<Biome> IS_SAVANNA_MINECRAFT = TagKey.create(Registries.BIOME, ResourceLocation.withDefaultNamespace("is_savanna"));

   public static boolean execute(LevelAccessor world, double x, double y, double z) {
      BlockPos pos = BlockPos.containing(x, y, z);

      // 3. Obtain the biome holder (1.21.1 returns Holder<Biome>)
      var biomeHolder = world.getBiome(pos);

      // 4. Efficient tag comparison
      return biomeHolder.is(IS_BADLANDS_COMMON) ||
              biomeHolder.is(IS_SAVANNA_COMMON) ||
              biomeHolder.is(IS_BADLANDS_MINECRAFT) ||
              biomeHolder.is(IS_SAVANNA_MINECRAFT);
   }
}