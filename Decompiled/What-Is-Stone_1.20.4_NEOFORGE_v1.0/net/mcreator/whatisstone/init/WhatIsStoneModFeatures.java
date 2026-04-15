package net.mcreator.whatisstone.init;

import net.mcreator.whatisstone.world.features.ArkosicSandstoneFeatureFeature;
import net.mcreator.whatisstone.world.features.BrecciaFeatureFeature;
import net.mcreator.whatisstone.world.features.ConglomerateFeatureFeature;
import net.mcreator.whatisstone.world.features.DolomiteFeatureFeature;
import net.mcreator.whatisstone.world.features.LimestoneFeatureFeature;
import net.mcreator.whatisstone.world.features.MarbleFeatureFeature;
import net.mcreator.whatisstone.world.features.MudstoneFeatureFeature;
import net.mcreator.whatisstone.world.features.PegmatiteFeatureFeature;
import net.mcreator.whatisstone.world.features.PeridotiteFeatureFeature;
import net.mcreator.whatisstone.world.features.PumiceFeatureFeature;
import net.mcreator.whatisstone.world.features.QuartziteFeatureFeature;
import net.mcreator.whatisstone.world.features.RhyoliteFeatureFeature;
import net.mcreator.whatisstone.world.features.SchistFeatureFeature;
import net.mcreator.whatisstone.world.features.ScoriaFeatureFeature;
import net.mcreator.whatisstone.world.features.SerpentiniteFeatureFeature;
import net.mcreator.whatisstone.world.features.SoapstoneFeatureFeature;
import net.mcreator.whatisstone.world.features.WhiteGraniteFeatureFeature;
import net.mcreator.whatisstone.world.features.WhiteLimestoneFeatureFeature;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class WhatIsStoneModFeatures {
   public static final DeferredRegister<Feature<?>> REGISTRY;
   public static final DeferredHolder<Feature<?>, Feature<?>> MARBLE_FEATURE;
   public static final DeferredHolder<Feature<?>, Feature<?>> PUMICE_FEATURE;
   public static final DeferredHolder<Feature<?>, Feature<?>> CONGLOMERATE_FEATURE;
   public static final DeferredHolder<Feature<?>, Feature<?>> LIMESTONE_FEATURE;
   public static final DeferredHolder<Feature<?>, Feature<?>> BRECCIA_FEATURE;
   public static final DeferredHolder<Feature<?>, Feature<?>> WHITE_GRANITE_FEATURE;
   public static final DeferredHolder<Feature<?>, Feature<?>> DOLOMITE_FEATURE;
   public static final DeferredHolder<Feature<?>, Feature<?>> RHYOLITE_FEATURE;
   public static final DeferredHolder<Feature<?>, Feature<?>> PEGMATITE_FEATURE;
   public static final DeferredHolder<Feature<?>, Feature<?>> WHITE_LIMESTONE_FEATURE;
   public static final DeferredHolder<Feature<?>, Feature<?>> SCHIST_FEATURE;
   public static final DeferredHolder<Feature<?>, Feature<?>> SCORIA_FEATURE;
   public static final DeferredHolder<Feature<?>, Feature<?>> SERPENTINITE_FEATURE;
   public static final DeferredHolder<Feature<?>, Feature<?>> SOAPSTONE_FEATURE;
   public static final DeferredHolder<Feature<?>, Feature<?>> ARKOSIC_SANDSTONE_FEATURE;
   public static final DeferredHolder<Feature<?>, Feature<?>> MUDSTONE_FEATURE;
   public static final DeferredHolder<Feature<?>, Feature<?>> PERIDOTITE_FEATURE;
   public static final DeferredHolder<Feature<?>, Feature<?>> QUARTZITE_FEATURE;

   static {
      REGISTRY = DeferredRegister.create(Registries.FEATURE, "what_is_stone");
      MARBLE_FEATURE = REGISTRY.register("marble_feature", MarbleFeatureFeature::new);
      PUMICE_FEATURE = REGISTRY.register("pumice_feature", PumiceFeatureFeature::new);
      CONGLOMERATE_FEATURE = REGISTRY.register("conglomerate_feature", ConglomerateFeatureFeature::new);
      LIMESTONE_FEATURE = REGISTRY.register("limestone_feature", LimestoneFeatureFeature::new);
      BRECCIA_FEATURE = REGISTRY.register("breccia_feature", BrecciaFeatureFeature::new);
      WHITE_GRANITE_FEATURE = REGISTRY.register("white_granite_feature", WhiteGraniteFeatureFeature::new);
      DOLOMITE_FEATURE = REGISTRY.register("dolomite_feature", DolomiteFeatureFeature::new);
      RHYOLITE_FEATURE = REGISTRY.register("rhyolite_feature", RhyoliteFeatureFeature::new);
      PEGMATITE_FEATURE = REGISTRY.register("pegmatite_feature", PegmatiteFeatureFeature::new);
      WHITE_LIMESTONE_FEATURE = REGISTRY.register("white_limestone_feature", WhiteLimestoneFeatureFeature::new);
      SCHIST_FEATURE = REGISTRY.register("schist_feature", SchistFeatureFeature::new);
      SCORIA_FEATURE = REGISTRY.register("scoria_feature", ScoriaFeatureFeature::new);
      SERPENTINITE_FEATURE = REGISTRY.register("serpentinite_feature", SerpentiniteFeatureFeature::new);
      SOAPSTONE_FEATURE = REGISTRY.register("soapstone_feature", SoapstoneFeatureFeature::new);
      ARKOSIC_SANDSTONE_FEATURE = REGISTRY.register("arkosic_sandstone_feature", ArkosicSandstoneFeatureFeature::new);
      MUDSTONE_FEATURE = REGISTRY.register("mudstone_feature", MudstoneFeatureFeature::new);
      PERIDOTITE_FEATURE = REGISTRY.register("peridotite_feature", PeridotiteFeatureFeature::new);
      QUARTZITE_FEATURE = REGISTRY.register("quartzite_feature", QuartziteFeatureFeature::new);
   }
}
