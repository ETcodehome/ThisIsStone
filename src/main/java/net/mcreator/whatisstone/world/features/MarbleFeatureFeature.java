package net.mcreator.whatisstone.world.features;

import net.mcreator.whatisstone.procedures.WhiteAdditionalGenerationConditionProcedure;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class MarbleFeatureFeature extends OreFeature {
   public MarbleFeatureFeature() {
      super(OreConfiguration.CODEC);
   }

   public boolean place(FeaturePlaceContext<OreConfiguration> context) {
      WorldGenLevel world = context.level();
      int x = context.origin().getX();
      int y = context.origin().getY();
      int z = context.origin().getZ();
      return !WhiteAdditionalGenerationConditionProcedure.execute(world, (double)x, (double)y, (double)z) ? false : super.place(context);
   }
}
