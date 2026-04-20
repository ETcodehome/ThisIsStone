package me.psiber.thisisstone.init;

import me.psiber.thisisstone.world.features.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ThisIsStoneModFeatures {
   public static final DeferredRegister<Feature<?>> REGISTRY =
           DeferredRegister.create(Registries.FEATURE, "this_is_stone");

   public static final DeferredHolder<Feature<?>, MarbleFeatureFeature> MARBLE_FEATURE =
           REGISTRY.register("marble_feature", () -> new MarbleFeatureFeature());

   public static final DeferredHolder<Feature<?>, PumiceFeatureFeature> PUMICE_FEATURE =
           REGISTRY.register("pumice_feature", () -> new PumiceFeatureFeature());

   public static final DeferredHolder<Feature<?>, ConglomerateFeatureFeature> CONGLOMERATE_FEATURE =
           REGISTRY.register("conglomerate_feature", () -> new ConglomerateFeatureFeature());

   public static final DeferredHolder<Feature<?>, LimestoneFeatureFeature> LIMESTONE_FEATURE =
           REGISTRY.register("limestone_feature", () -> new LimestoneFeatureFeature());

   public static final DeferredHolder<Feature<?>, BrecciaFeatureFeature> BRECCIA_FEATURE =
           REGISTRY.register("breccia_feature", () -> new BrecciaFeatureFeature());

   public static final DeferredHolder<Feature<?>, WhiteGraniteFeatureFeature> WHITE_GRANITE_FEATURE =
           REGISTRY.register("white_granite_feature", () -> new WhiteGraniteFeatureFeature());

   public static final DeferredHolder<Feature<?>, DolomiteFeatureFeature> DOLOMITE_FEATURE =
           REGISTRY.register("dolomite_feature", () -> new DolomiteFeatureFeature());

   public static final DeferredHolder<Feature<?>, RhyoliteFeatureFeature> RHYOLITE_FEATURE =
           REGISTRY.register("rhyolite_feature", () -> new RhyoliteFeatureFeature());

   public static final DeferredHolder<Feature<?>, PegmatiteFeatureFeature> PEGMATITE_FEATURE =
           REGISTRY.register("pegmatite_feature", () -> new PegmatiteFeatureFeature());

   public static final DeferredHolder<Feature<?>, WhiteLimestoneFeatureFeature> WHITE_LIMESTONE_FEATURE =
           REGISTRY.register("white_limestone_feature", () -> new WhiteLimestoneFeatureFeature());

   public static final DeferredHolder<Feature<?>, SchistFeatureFeature> SCHIST_FEATURE =
           REGISTRY.register("schist_feature", () -> new SchistFeatureFeature());

   public static final DeferredHolder<Feature<?>, ScoriaFeatureFeature> SCORIA_FEATURE =
           REGISTRY.register("scoria_feature", () -> new ScoriaFeatureFeature());

   public static final DeferredHolder<Feature<?>, SerpentiniteFeatureFeature> SERPENTINITE_FEATURE =
           REGISTRY.register("serpentinite_feature", () -> new SerpentiniteFeatureFeature());

   public static final DeferredHolder<Feature<?>, SoapstoneFeatureFeature> SOAPSTONE_FEATURE =
           REGISTRY.register("soapstone_feature", () -> new SoapstoneFeatureFeature());

   public static final DeferredHolder<Feature<?>, ArkosicSandstoneFeatureFeature> ARKOSIC_SANDSTONE_FEATURE =
           REGISTRY.register("arkosic_sandstone_feature", () -> new ArkosicSandstoneFeatureFeature());

   public static final DeferredHolder<Feature<?>, MudstoneFeatureFeature> MUDSTONE_FEATURE =
           REGISTRY.register("mudstone_feature", () -> new MudstoneFeatureFeature());

   public static final DeferredHolder<Feature<?>, PeridotiteFeatureFeature> PERIDOTITE_FEATURE =
           REGISTRY.register("peridotite_feature", () -> new PeridotiteFeatureFeature());

   public static final DeferredHolder<Feature<?>, QuartziteFeatureFeature> QUARTZITE_FEATURE =
           REGISTRY.register("quartzite_feature", () -> new QuartziteFeatureFeature());
}