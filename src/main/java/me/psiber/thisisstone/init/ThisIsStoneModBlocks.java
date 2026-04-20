package me.psiber.thisisstone.init;

import me.psiber.thisisstone.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ThisIsStoneModBlocks {

   public static final DeferredRegister<Block> REGISTRY = DeferredRegister.createBlocks("this_is_stone");

   static{

      REGISTRY.register("anthracite",                 () -> new GenericStoneBlock(1.0F, 3.0F, SoundType.STONE));

      REGISTRY.register("arkosic_sandstone",          () -> new GenericStoneBlock(0.8F, 4.0F, SoundType.STONE));
      REGISTRY.register("arkosic_sandstone_slab",     () -> new GenericSlabBlock( 0.8F, 4.0F, SoundType.STONE));
      REGISTRY.register("arkosic_sandstone_stairs",   () -> new GenericStairBlock(0.8F, 4.0F, SoundType.STONE));

      REGISTRY.register("black_marble",               () -> new GenericStoneBlock(1.2F, 5.0F, SoundType.CALCITE));
      REGISTRY.register("black_marble_slab",          () -> new GenericSlabBlock( 1.2F, 5.0F, SoundType.CALCITE));
      REGISTRY.register("black_marble_stairs",        () -> new GenericStairBlock(1.2F, 5.0F, SoundType.CALCITE));

      REGISTRY.register("breccia",                    () -> new GenericStoneBlock(1.8F, 7.0F, SoundType.STONE));
      REGISTRY.register("breccia_slab",               () -> new GenericSlabBlock( 1.8F, 7.0F, SoundType.STONE));
      REGISTRY.register("breccia_stairs",             () -> new GenericStairBlock(1.8F, 7.0F, SoundType.STONE));

      REGISTRY.register("conglomerate",               () -> new GenericStoneBlock(1.6F, 6.5F, SoundType.STONE));
      REGISTRY.register("conglomerate_slab",          () -> new GenericSlabBlock( 1.6F, 6.5F, SoundType.STONE));
      REGISTRY.register("conglomerate_stairs",        () -> new GenericStairBlock(1.6F, 6.5F, SoundType.STONE));

      REGISTRY.register("dacite",                     () -> new GenericStoneBlock(2.0F, 8.0F, SoundType.BASALT));
      REGISTRY.register("dacite_slab",                () -> new GenericSlabBlock( 2.0F, 8.0F, SoundType.BASALT));
      REGISTRY.register("dacite_stairs",              () -> new GenericStairBlock(2.0F, 8.0F, SoundType.BASALT));
      REGISTRY.register("dacite_bricks",              () -> new GenericStoneBlock(2.0F, 8.0F, SoundType.BASALT));
      REGISTRY.register("dacite_brick_slab",          () -> new GenericSlabBlock( 2.0F, 8.0F, SoundType.BASALT));
      REGISTRY.register("dacite_brick_stairs",        () -> new GenericStairBlock(2.0F, 8.0F, SoundType.BASALT));

      REGISTRY.register("dolomite",                   () -> new GenericStoneBlock(1.3F, 5.0F, SoundType.CALCITE));
      REGISTRY.register("dolomite_slab",              () -> new GenericSlabBlock( 1.3F, 5.0F, SoundType.CALCITE));
      REGISTRY.register("dolomite_stairs",            () -> new GenericStairBlock(1.3F, 5.0F, SoundType.CALCITE));

      REGISTRY.register("gabbro",                     () -> new GenericStoneBlock(2.5F, 10.0F, SoundType.BASALT));
      REGISTRY.register("gabbro_slab",                () -> new GenericSlabBlock( 2.5F, 10.0F, SoundType.BASALT));
      REGISTRY.register("gabbro_stairs",              () -> new GenericStairBlock(2.5F, 10.0F, SoundType.BASALT));

      REGISTRY.register("gneiss",                     () -> new GenericStoneBlock(1.7F, 6.5F, SoundType.STONE));
      REGISTRY.register("gneiss_slab",                () -> new GenericSlabBlock( 1.7F, 6.5F, SoundType.STONE));
      REGISTRY.register("gneiss_stairs",              () -> new GenericStairBlock(1.7F, 6.5F, SoundType.STONE));

      REGISTRY.register("grey_limestone",             () -> new GenericStoneBlock(1.1F, 4.5F, SoundType.STONE));
      REGISTRY.register("grey_limestone_slab",        () -> new GenericSlabBlock( 1.1F, 4.5F, SoundType.STONE));
      REGISTRY.register("grey_limestone_stairs",      () -> new GenericStairBlock(1.1F, 4.5F, SoundType.STONE));

      REGISTRY.register("limestone",                  () -> new GenericStoneBlock(1.0F, 4.0F, SoundType.STONE));
      REGISTRY.register("limestone_slab",             () -> new GenericSlabBlock( 1.0F, 4.0F, SoundType.STONE));
      REGISTRY.register("limestone_stairs",           () -> new GenericStairBlock(1.0F, 4.0F, SoundType.STONE));
      REGISTRY.register("limestone_bricks",           () -> new GenericStoneBlock(1.0F, 4.0F, SoundType.STONE));
      REGISTRY.register("limestone_brick_slab",       () -> new GenericSlabBlock( 1.0F, 4.0F, SoundType.STONE));
      REGISTRY.register("limestone_brick_stairs",     () -> new GenericStairBlock(1.0F, 4.0F, SoundType.STONE));

      REGISTRY.register("marble",                     () -> new GenericStoneBlock(1.1F, 5.0F, SoundType.CALCITE));
      REGISTRY.register("marble_slab",                () -> new GenericSlabBlock( 1.1F, 5.0F, SoundType.CALCITE));
      REGISTRY.register("marble_stairs",              () -> new GenericStairBlock(1.1F, 5.0F, SoundType.CALCITE));

      REGISTRY.register("mudstone",                   () -> new GenericStoneBlock(0.8F, 3.0F, SoundType.PACKED_MUD));
      REGISTRY.register("mudstone_slab",              () -> new GenericSlabBlock( 0.8F, 3.0F, SoundType.PACKED_MUD));
      REGISTRY.register("mudstone_stairs",            () -> new GenericStairBlock(0.8F, 3.0F, SoundType.PACKED_MUD));

      REGISTRY.register("pegmatite",                  () -> new GenericStoneBlock(1.5F, 6.0F, SoundType.STONE));
      REGISTRY.register("pegmatite_slab",             () -> new GenericSlabBlock( 1.5F, 6.0F, SoundType.STONE));
      REGISTRY.register("pegmatite_stairs",           () -> new GenericStairBlock(1.5F, 6.0F, SoundType.STONE));

      REGISTRY.register("peridotite",                 () -> new GenericStoneBlock(2.2F, 9.0F, SoundType.BASALT));
      REGISTRY.register("peridotite_slab",            () -> new GenericSlabBlock( 2.2F, 9.0F, SoundType.BASALT));
      REGISTRY.register("peridotite_stairs",          () -> new GenericStairBlock(2.2F, 9.0F, SoundType.BASALT));

      REGISTRY.register("polished_black_marble",         () -> new GenericStoneBlock(1.2F, 5.0F, SoundType.CALCITE));
      REGISTRY.register("polished_black_marble_slab",    () -> new GenericSlabBlock( 1.2F, 5.0F, SoundType.CALCITE));
      REGISTRY.register("polished_black_marble_stairs",  () -> new GenericStairBlock(1.2F, 5.0F, SoundType.CALCITE));

      REGISTRY.register("polished_dolomite",          () -> new GenericStoneBlock(1.3F, 5.0F, SoundType.CALCITE));
      REGISTRY.register("polished_dolomite_slab",     () -> new GenericSlabBlock( 1.3F, 5.0F, SoundType.CALCITE));
      REGISTRY.register("polished_dolomite_stairs",   () -> new GenericStairBlock(1.3F, 5.0F, SoundType.CALCITE));

      REGISTRY.register("polished_gneiss",            () -> new GenericStoneBlock(1.7F, 6.5F, SoundType.STONE));
      REGISTRY.register("polished_gneiss_slab",       () -> new GenericSlabBlock( 1.7F, 6.5F, SoundType.STONE));
      REGISTRY.register("polished_gneiss_stairs",     () -> new GenericStairBlock(1.7F, 6.5F, SoundType.STONE));

      REGISTRY.register("polished_grey_limestone",      () -> new GenericStoneBlock(1.1F, 4.5F, SoundType.STONE));
      REGISTRY.register("polished_grey_limestone_slab", () -> new GenericSlabBlock( 1.1F, 4.5F, SoundType.STONE));
      REGISTRY.register("polished_grey_limestone_stairs",() -> new GenericStairBlock(1.1F, 4.5F, SoundType.STONE));

      REGISTRY.register("polished_limestone",         () -> new GenericStoneBlock(1.0F, 4.0F, SoundType.STONE));
      REGISTRY.register("polished_limestone_slab",    () -> new GenericSlabBlock( 1.0F, 4.0F, SoundType.STONE));
      REGISTRY.register("polished_limestone_stairs",  () -> new GenericStairBlock(1.0F, 4.0F, SoundType.STONE));

      REGISTRY.register("polished_marble",            () -> new GenericStoneBlock(1.1F, 5.0F, SoundType.CALCITE));
      REGISTRY.register("polished_marble_slab",       () -> new GenericSlabBlock( 1.1F, 5.0F, SoundType.CALCITE));
      REGISTRY.register("polished_marble_stairs",     () -> new GenericStairBlock(1.1F, 5.0F, SoundType.CALCITE));
      REGISTRY.register("polished_marble_bricks",     () -> new GenericStoneBlock(1.1F, 5.0F, SoundType.CALCITE));
      REGISTRY.register("polished_marble_brick_slab", () -> new GenericSlabBlock( 1.1F, 5.0F, SoundType.CALCITE));
      REGISTRY.register("polished_marble_brick_stairs",() -> new GenericStairBlock(1.1F, 5.0F, SoundType.CALCITE));

      REGISTRY.register("polished_mudstone",           () -> new GenericStoneBlock(0.8F, 3.0F, SoundType.STONE));
      REGISTRY.register("polished_mudstone_slab",      () -> new GenericSlabBlock( 0.8F, 3.0F, SoundType.STONE));
      REGISTRY.register("polished_mudstone_stairs",    () -> new GenericStairBlock(0.8F, 3.0F, SoundType.STONE));

      REGISTRY.register("polished_peridotite",         () -> new GenericStoneBlock(2.2F, 9.0F, SoundType.BASALT));
      REGISTRY.register("polished_peridotite_slab",    () -> new GenericSlabBlock( 2.2F, 9.0F, SoundType.BASALT));
      REGISTRY.register("polished_peridotite_stairs",  () -> new GenericStairBlock(2.2F, 9.0F, SoundType.BASALT));

      REGISTRY.register("polished_quartzite",          () -> new GenericStoneBlock(2.0F, 9.0F, SoundType.STONE));
      REGISTRY.register("polished_quartzite_slab",     () -> new GenericSlabBlock( 2.0F, 9.0F, SoundType.STONE));
      REGISTRY.register("polished_quartzite_stairs",   () -> new GenericStairBlock(2.0F, 9.0F, SoundType.STONE));

      REGISTRY.register("polished_rhyolite",           () -> new GenericStoneBlock(1.6F, 6.5F, SoundType.STONE));
      REGISTRY.register("polished_rhyolite_slab",      () -> new GenericSlabBlock( 1.6F, 6.5F, SoundType.STONE));
      REGISTRY.register("polished_rhyolite_stairs",    () -> new GenericStairBlock(1.6F, 6.5F, SoundType.STONE));

      REGISTRY.register("polished_schist",             () -> new GenericStoneBlock(1.4F, 6.0F, SoundType.STONE));

      REGISTRY.register("polished_serpentinite",       () -> new GenericStoneBlock(1.4F, 6.0F, SoundType.STONE));
      REGISTRY.register("polished_serpentinite_slab",  () -> new GenericSlabBlock( 1.4F, 6.0F, SoundType.STONE));
      REGISTRY.register("polished_serpentinite_stairs",() -> new GenericStairBlock(1.4F, 6.0F, SoundType.STONE));

      REGISTRY.register("polished_soapstone",          () -> new GenericStoneBlock(0.6F, 2.0F, SoundType.STONE));
      REGISTRY.register("polished_soapstone_slab",     () -> new GenericSlabBlock( 0.6F, 2.0F, SoundType.STONE));
      REGISTRY.register("polished_soapstone_stairs",   () -> new GenericStairBlock(0.6F, 2.0F, SoundType.STONE));

      REGISTRY.register("polished_white_limestone",    () -> new GenericStoneBlock(1.0F, 4.0F, SoundType.STONE));
      REGISTRY.register("polished_white_limestone_slab",() -> new GenericSlabBlock( 1.0F, 4.0F, SoundType.STONE));
      REGISTRY.register("polished_white_limestone_stairs",() -> new GenericStairBlock(1.0F, 4.0F, SoundType.STONE));

      REGISTRY.register("pumice",                     () -> new GenericStoneBlock(0.5F, 1.5F, SoundType.TUFF));
      REGISTRY.register("pumice_slab",                () -> new GenericSlabBlock( 0.5F, 1.5F, SoundType.TUFF));
      REGISTRY.register("pumice_stairs",              () -> new GenericStairBlock(0.5F, 1.5F, SoundType.TUFF));
      REGISTRY.register("pumice_bricks",              () -> new GenericStoneBlock(0.7F, 2.5F, SoundType.TUFF));
      REGISTRY.register("pumice_brick_slab",          () -> new GenericSlabBlock( 0.7F, 2.5F, SoundType.TUFF));
      REGISTRY.register("pumice_brick_stairs",        () -> new GenericStairBlock(0.7F, 2.5F, SoundType.TUFF));

      REGISTRY.register("quartzite",                   () -> new GenericStoneBlock(2.0F, 9.0F, SoundType.STONE));
      REGISTRY.register("quartzite_slab",              () -> new GenericSlabBlock( 2.0F, 9.0F, SoundType.STONE));
      REGISTRY.register("quartzite_stairs",            () -> new GenericStairBlock(2.0F, 9.0F, SoundType.STONE));

      REGISTRY.register("rhyolite",                    () -> new GenericStoneBlock(1.6F, 6.5F, SoundType.STONE));
      REGISTRY.register("rhyolite_slab",               () -> new GenericSlabBlock( 1.6F, 6.5F, SoundType.STONE));
      REGISTRY.register("rhyolite_stairs",             () -> new GenericStairBlock(1.6F, 6.5F, SoundType.STONE));

      REGISTRY.register("schist",                      () -> new GenericStoneBlock(1.4F, 6.0F, SoundType.STONE));
      REGISTRY.register("schist_slab",                 () -> new GenericSlabBlock( 1.4F, 6.0F, SoundType.STONE));
      REGISTRY.register("schist_stairs",               () -> new GenericStairBlock(1.4F, 6.0F, SoundType.STONE));

      REGISTRY.register("scoria",                      () -> new GenericStoneBlock(0.9F, 3.5F, SoundType.BASALT));
      REGISTRY.register("scoria_slab",                 () -> new GenericSlabBlock( 0.9F, 3.5F, SoundType.BASALT));
      REGISTRY.register("scoria_stairs",               () -> new GenericStairBlock(0.9F, 3.5F, SoundType.BASALT));

      REGISTRY.register("serpentinite",                () -> new GenericStoneBlock(1.4F, 6.0F, SoundType.STONE));
      REGISTRY.register("serpentinite_slab",           () -> new GenericSlabBlock( 1.4F, 6.0F, SoundType.STONE));
      REGISTRY.register("serpentinite_stairs",         () -> new GenericStairBlock(1.4F, 6.0F, SoundType.STONE));

      REGISTRY.register("shale",                       () -> new GenericStoneBlock(0.7F, 2.5F, SoundType.STONE));
      REGISTRY.register("shale_slab",                  () -> new GenericSlabBlock( 0.7F, 2.5F, SoundType.STONE));
      REGISTRY.register("shale_stairs",                () -> new GenericStairBlock(0.7F, 2.5F, SoundType.STONE));

      REGISTRY.register("slate",                       () -> new GenericStoneBlock(1.5F, 6.0F, SoundType.STONE));
      REGISTRY.register("slate_slab",                  () -> new GenericSlabBlock( 1.5F, 6.0F, SoundType.STONE));
      REGISTRY.register("slate_stairs",                () -> new GenericStairBlock(1.5F, 6.0F, SoundType.STONE));

      REGISTRY.register("soapstone",                   () -> new GenericStoneBlock(0.6F, 2.0F, SoundType.STONE));
      REGISTRY.register("soapstone_slab",              () -> new GenericSlabBlock( 0.6F, 2.0F, SoundType.STONE));
      REGISTRY.register("soapstone_stairs",            () -> new GenericStairBlock(0.6F, 2.0F, SoundType.STONE));

      REGISTRY.register("white_granite",               () -> new GenericStoneBlock(1.8F, 7.0F, SoundType.STONE));
      REGISTRY.register("white_granite_slab",          () -> new GenericSlabBlock( 1.8F, 7.0F, SoundType.STONE));
      REGISTRY.register("white_granite_stairs",        () -> new GenericStairBlock(1.8F, 7.0F, SoundType.STONE));

      REGISTRY.register("white_limestone",             () -> new GenericStoneBlock(1.0F, 4.0F, SoundType.STONE));
      REGISTRY.register("white_limestone_slab",        () -> new GenericSlabBlock( 1.0F, 4.0F, SoundType.STONE));
      REGISTRY.register("white_limestone_stairs",      () -> new GenericStairBlock(1.0F, 4.0F, SoundType.STONE));

   }



}
