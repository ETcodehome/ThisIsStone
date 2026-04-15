package net.mcreator.whatisstone.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.biome.Biome;

public class PinkAdditionalGenerationConditionProcedure {
   // 1. Define TagKeys as static constants to optimize worldgen performance.
   // Using the "c" namespace for common cross-loader compatibility.
   private static final TagKey<Biome> IS_BEACH_COMMON = TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "is_beach"));
   private static final TagKey<Biome> IS_MAGICAL_COMMON = TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "is_magical"));
   private static final TagKey<Biome> IS_MUSHROOM_COMMON = TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "is_mushroom"));

   // 2. Standard Minecraft beach tag for vanilla parity.
   private static final TagKey<Biome> IS_BEACH_MINECRAFT = TagKey.create(Registries.BIOME, ResourceLocation.withDefaultNamespace("is_beach"));

   public static boolean execute(LevelAccessor world, double x, double y, double z) {
      BlockPos pos = BlockPos.containing(x, y, z);

      // 3. Obtain the biome holder (1.21.1 returns Holder<Biome>).
      var biomeHolder = world.getBiome(pos);

      // 4. Perform the check using the optimized holder logic.
      return biomeHolder.is(IS_BEACH_COMMON) ||
              biomeHolder.is(IS_MAGICAL_COMMON) ||
              biomeHolder.is(IS_MUSHROOM_COMMON) ||
              biomeHolder.is(IS_BEACH_MINECRAFT);
   }
}