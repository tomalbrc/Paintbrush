package de.tomalbrc.paintbrush.util;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceArrayMap;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import net.minecraft.core.Holder;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Map;

public class Data {
    public static Map<Identifier, Identifier> TEXTURE_REDIRECT = ImmutableMap.<Identifier, Identifier>builder()
            .put(Identifier.withDefaultNamespace("block/mossy_cobblestone"), Identifier.withDefaultNamespace("block/cobblestone"))
            .put(Identifier.withDefaultNamespace("block/mossy_stone_bricks"), Identifier.withDefaultNamespace("block/stone_bricks"))
            .build();

    public static Map<Block, Holder.Reference<Block>> TAGS = new Reference2ReferenceArrayMap<>();

    public static Map<Block, Map<DyeColor, Map<BlockState, BlockState>>> MODELMAP_BY_BLOCK_DYE = new Reference2ObjectOpenHashMap<>();

    public static Map<Block, Block> MODEL_REMAP = ImmutableMap.<Block, Block>builder()
//            .put(Blocks.ACACIA_LOG, Blocks.OAK_LOG) // TODO: stripping logic
//            .put(Blocks.SPRUCE_LOG, Blocks.OAK_LOG)
//            .put(Blocks.DARK_OAK_LOG, Blocks.OAK_LOG)
//            .put(Blocks.MANGROVE_LOG, Blocks.OAK_LOG)
//            .put(Blocks.JUNGLE_LOG, Blocks.OAK_LOG)

            .put(Blocks.STRIPPED_BIRCH_LOG, Blocks.STRIPPED_OAK_LOG)
            .put(Blocks.STRIPPED_ACACIA_LOG, Blocks.STRIPPED_OAK_LOG)
            .put(Blocks.STRIPPED_SPRUCE_LOG, Blocks.STRIPPED_OAK_LOG)
            .put(Blocks.STRIPPED_DARK_OAK_LOG, Blocks.STRIPPED_OAK_LOG)
            .put(Blocks.STRIPPED_CHERRY_LOG, Blocks.STRIPPED_OAK_LOG)
            .put(Blocks.STRIPPED_MANGROVE_LOG, Blocks.STRIPPED_OAK_LOG)
            .put(Blocks.STRIPPED_JUNGLE_LOG, Blocks.STRIPPED_OAK_LOG)

            .put(Blocks.PALE_OAK_PLANKS, Blocks.OAK_PLANKS)
            .put(Blocks.BIRCH_PLANKS, Blocks.OAK_PLANKS)
            .put(Blocks.BAMBOO_PLANKS, Blocks.OAK_PLANKS)
            .put(Blocks.ACACIA_PLANKS, Blocks.OAK_PLANKS)
            .put(Blocks.SPRUCE_PLANKS, Blocks.OAK_PLANKS)
            .put(Blocks.DARK_OAK_PLANKS, Blocks.OAK_PLANKS)
            .put(Blocks.CHERRY_PLANKS, Blocks.OAK_PLANKS)
            .put(Blocks.MANGROVE_PLANKS, Blocks.OAK_PLANKS)
            .put(Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS)

            .put(Blocks.RED_SAND, Blocks.SAND)

            .build();


    public static ReferenceArrayList<Block> prepare() {
        var list = ReferenceArrayList.of(
                Blocks.GLOWSTONE,
                //Blocks.CHISELED_NETHER_BRICKS, too dark
                Blocks.SANDSTONE,
                Blocks.SAND,
                Blocks.DEEPSLATE,
                Blocks.COBBLED_DEEPSLATE,
                Blocks.TUFF,
                Blocks.CHISELED_TUFF,
                Blocks.TUFF_BRICKS,
                Blocks.CHISELED_TUFF_BRICKS,
                Blocks.POLISHED_TUFF,
                Blocks.COBBLESTONE,
                Blocks.MOSSY_COBBLESTONE,
                Blocks.STONE,
                Blocks.STONE_BRICKS,
                Blocks.MOSSY_STONE_BRICKS,
                Blocks.CHISELED_STONE_BRICKS,
                Blocks.SMOOTH_STONE,
                Blocks.NETHERRACK,
                Blocks.AMETHYST_BLOCK,
                Blocks.CALCITE,
                Blocks.POLISHED_DEEPSLATE,
                Blocks.IRON_BLOCK,
                Blocks.QUARTZ_BLOCK,
                Blocks.QUARTZ_BRICKS,
                Blocks.CHISELED_QUARTZ_BLOCK,

                //Blocks.BIRCH_LOG,
                //Blocks.PALE_OAK_LOG,
                //Blocks.OAK_LOG,

                Blocks.DIORITE,
                Blocks.POLISHED_DIORITE,
                Blocks.ANDESITE,
                Blocks.POLISHED_ANDESITE,
                Blocks.DRIPSTONE_BLOCK,

                Blocks.STRIPPED_OAK_LOG,
                Blocks.OAK_PLANKS
        );
        list.addAll(MODEL_REMAP.keySet());

        var terramap = ImmutableMap.<DyeColor, Map<BlockState, BlockState>>builder()
                .put(DyeColor.WHITE, ImmutableMap.of(Blocks.DYED_TERRACOTTA.white().defaultBlockState(), Blocks.DYED_TERRACOTTA.white().defaultBlockState()))
                .put(DyeColor.ORANGE, ImmutableMap.of(Blocks.DYED_TERRACOTTA.orange().defaultBlockState(), Blocks.DYED_TERRACOTTA.orange().defaultBlockState()))
                .put(DyeColor.MAGENTA, ImmutableMap.of(Blocks.DYED_TERRACOTTA.magenta().defaultBlockState(), Blocks.DYED_TERRACOTTA.magenta().defaultBlockState()))
                .put(DyeColor.LIGHT_BLUE, ImmutableMap.of(Blocks.DYED_TERRACOTTA.lightBlue().defaultBlockState(), Blocks.DYED_TERRACOTTA.lightBlue().defaultBlockState()))
                .put(DyeColor.YELLOW, ImmutableMap.of(Blocks.DYED_TERRACOTTA.yellow().defaultBlockState(), Blocks.DYED_TERRACOTTA.yellow().defaultBlockState()))
                .put(DyeColor.LIME, ImmutableMap.of(Blocks.DYED_TERRACOTTA.lime().defaultBlockState(), Blocks.DYED_TERRACOTTA.lime().defaultBlockState()))
                .put(DyeColor.PINK, ImmutableMap.of(Blocks.DYED_TERRACOTTA.pink().defaultBlockState(), Blocks.DYED_TERRACOTTA.pink().defaultBlockState()))
                .put(DyeColor.GRAY, ImmutableMap.of(Blocks.DYED_TERRACOTTA.gray().defaultBlockState(), Blocks.DYED_TERRACOTTA.gray().defaultBlockState()))
                .put(DyeColor.LIGHT_GRAY, ImmutableMap.of(Blocks.DYED_TERRACOTTA.lightGray().defaultBlockState(), Blocks.DYED_TERRACOTTA.lightGray().defaultBlockState()))
                .put(DyeColor.CYAN, ImmutableMap.of(Blocks.DYED_TERRACOTTA.cyan().defaultBlockState(), Blocks.DYED_TERRACOTTA.cyan().defaultBlockState()))
                .put(DyeColor.PURPLE, ImmutableMap.of(Blocks.DYED_TERRACOTTA.purple().defaultBlockState(), Blocks.DYED_TERRACOTTA.purple().defaultBlockState()))
                .put(DyeColor.BLUE, ImmutableMap.of(Blocks.DYED_TERRACOTTA.blue().defaultBlockState(), Blocks.DYED_TERRACOTTA.blue().defaultBlockState()))
                .put(DyeColor.BROWN, ImmutableMap.of(Blocks.DYED_TERRACOTTA.brown().defaultBlockState(), Blocks.DYED_TERRACOTTA.brown().defaultBlockState()))
                .put(DyeColor.GREEN, ImmutableMap.of(Blocks.DYED_TERRACOTTA.green().defaultBlockState(), Blocks.DYED_TERRACOTTA.green().defaultBlockState()))
                .put(DyeColor.RED, ImmutableMap.of(Blocks.DYED_TERRACOTTA.red().defaultBlockState(), Blocks.DYED_TERRACOTTA.red().defaultBlockState()))
                .put(DyeColor.BLACK, ImmutableMap.of(Blocks.DYED_TERRACOTTA.black().defaultBlockState(), Blocks.DYED_TERRACOTTA.black().defaultBlockState()))
                .build();

        for (Map.Entry<DyeColor, Map<BlockState, BlockState>> entry : terramap.entrySet()) {
            var newmap = new Reference2ReferenceArrayMap<>(terramap);
            var block = entry.getValue().values().iterator().next().getBlock();
            MODELMAP_BY_BLOCK_DYE.put(block, newmap);
            list.add(block);
        }
        MODELMAP_BY_BLOCK_DYE.put(Blocks.TERRACOTTA, terramap);
        list.add(Blocks.TERRACOTTA);

        var concretemap = ImmutableMap.<DyeColor, Map<BlockState, BlockState>>builder()
                .put(DyeColor.WHITE, ImmutableMap.of(Blocks.CONCRETE.white().defaultBlockState(), Blocks.CONCRETE.white().defaultBlockState()))
                .put(DyeColor.ORANGE, ImmutableMap.of(Blocks.CONCRETE.orange().defaultBlockState(), Blocks.CONCRETE.orange().defaultBlockState()))
                .put(DyeColor.MAGENTA, ImmutableMap.of(Blocks.CONCRETE.magenta().defaultBlockState(), Blocks.CONCRETE.magenta().defaultBlockState()))
                .put(DyeColor.LIGHT_BLUE, ImmutableMap.of(Blocks.CONCRETE.lightBlue().defaultBlockState(), Blocks.CONCRETE.lightBlue().defaultBlockState()))
                .put(DyeColor.YELLOW, ImmutableMap.of(Blocks.CONCRETE.yellow().defaultBlockState(), Blocks.CONCRETE.yellow().defaultBlockState()))
                .put(DyeColor.LIME, ImmutableMap.of(Blocks.CONCRETE.lime().defaultBlockState(), Blocks.CONCRETE.lime().defaultBlockState()))
                .put(DyeColor.PINK, ImmutableMap.of(Blocks.CONCRETE.pink().defaultBlockState(), Blocks.CONCRETE.pink().defaultBlockState()))
                .put(DyeColor.GRAY, ImmutableMap.of(Blocks.CONCRETE.gray().defaultBlockState(), Blocks.CONCRETE.gray().defaultBlockState()))
                .put(DyeColor.LIGHT_GRAY, ImmutableMap.of(Blocks.CONCRETE.lightGray().defaultBlockState(), Blocks.CONCRETE.lightGray().defaultBlockState()))
                .put(DyeColor.CYAN, ImmutableMap.of(Blocks.CONCRETE.cyan().defaultBlockState(), Blocks.CONCRETE.cyan().defaultBlockState()))
                .put(DyeColor.PURPLE, ImmutableMap.of(Blocks.CONCRETE.purple().defaultBlockState(), Blocks.CONCRETE.purple().defaultBlockState()))
                .put(DyeColor.BLUE, ImmutableMap.of(Blocks.CONCRETE.blue().defaultBlockState(), Blocks.CONCRETE.blue().defaultBlockState()))
                .put(DyeColor.BROWN, ImmutableMap.of(Blocks.CONCRETE.brown().defaultBlockState(), Blocks.CONCRETE.brown().defaultBlockState()))
                .put(DyeColor.GREEN, ImmutableMap.of(Blocks.CONCRETE.green().defaultBlockState(), Blocks.CONCRETE.green().defaultBlockState()))
                .put(DyeColor.RED, ImmutableMap.of(Blocks.CONCRETE.red().defaultBlockState(), Blocks.CONCRETE.red().defaultBlockState()))
                .put(DyeColor.BLACK, ImmutableMap.of(Blocks.CONCRETE.black().defaultBlockState(), Blocks.CONCRETE.black().defaultBlockState()))
                .build();

        for (Map.Entry<DyeColor, Map<BlockState, BlockState>> entry : concretemap.entrySet()) {
            var newmap = new Reference2ReferenceArrayMap<>(concretemap);
            var block = entry.getValue().values().iterator().next().getBlock();
            MODELMAP_BY_BLOCK_DYE.put(block, newmap);
            list.add(block);
        }


        var glassmap = ImmutableMap.<DyeColor, Map<BlockState, BlockState>>builder()
                .put(DyeColor.WHITE, ImmutableMap.of(Blocks.STAINED_GLASS.white().defaultBlockState(), Blocks.STAINED_GLASS.white().defaultBlockState()))
                .put(DyeColor.ORANGE, ImmutableMap.of(Blocks.STAINED_GLASS.orange().defaultBlockState(), Blocks.STAINED_GLASS.orange().defaultBlockState()))
                .put(DyeColor.MAGENTA, ImmutableMap.of(Blocks.STAINED_GLASS.magenta().defaultBlockState(), Blocks.STAINED_GLASS.magenta().defaultBlockState()))
                .put(DyeColor.LIGHT_BLUE, ImmutableMap.of(Blocks.STAINED_GLASS.lightBlue().defaultBlockState(), Blocks.STAINED_GLASS.lightBlue().defaultBlockState()))
                .put(DyeColor.YELLOW, ImmutableMap.of(Blocks.STAINED_GLASS.yellow().defaultBlockState(), Blocks.STAINED_GLASS.yellow().defaultBlockState()))
                .put(DyeColor.LIME, ImmutableMap.of(Blocks.STAINED_GLASS.lime().defaultBlockState(), Blocks.STAINED_GLASS.lime().defaultBlockState()))
                .put(DyeColor.PINK, ImmutableMap.of(Blocks.STAINED_GLASS.pink().defaultBlockState(), Blocks.STAINED_GLASS.pink().defaultBlockState()))
                .put(DyeColor.GRAY, ImmutableMap.of(Blocks.STAINED_GLASS.gray().defaultBlockState(), Blocks.STAINED_GLASS.gray().defaultBlockState()))
                .put(DyeColor.LIGHT_GRAY, ImmutableMap.of(Blocks.STAINED_GLASS.lightGray().defaultBlockState(), Blocks.STAINED_GLASS.lightGray().defaultBlockState()))
                .put(DyeColor.CYAN, ImmutableMap.of(Blocks.STAINED_GLASS.cyan().defaultBlockState(), Blocks.STAINED_GLASS.cyan().defaultBlockState()))
                .put(DyeColor.PURPLE, ImmutableMap.of(Blocks.STAINED_GLASS.purple().defaultBlockState(), Blocks.STAINED_GLASS.purple().defaultBlockState()))
                .put(DyeColor.BLUE, ImmutableMap.of(Blocks.STAINED_GLASS.blue().defaultBlockState(), Blocks.STAINED_GLASS.blue().defaultBlockState()))
                .put(DyeColor.BROWN, ImmutableMap.of(Blocks.STAINED_GLASS.brown().defaultBlockState(), Blocks.STAINED_GLASS.brown().defaultBlockState()))
                .put(DyeColor.GREEN, ImmutableMap.of(Blocks.STAINED_GLASS.green().defaultBlockState(), Blocks.STAINED_GLASS.green().defaultBlockState()))
                .put(DyeColor.RED, ImmutableMap.of(Blocks.STAINED_GLASS.red().defaultBlockState(), Blocks.STAINED_GLASS.red().defaultBlockState()))
                .put(DyeColor.BLACK, ImmutableMap.of(Blocks.STAINED_GLASS.black().defaultBlockState(), Blocks.STAINED_GLASS.black().defaultBlockState()))
                .build();

        for (Map.Entry<DyeColor, Map<BlockState, BlockState>> entry : glassmap.entrySet()) {
            var newmap = new Reference2ReferenceArrayMap<>(glassmap);
            var block = entry.getValue().values().iterator().next().getBlock();
            MODELMAP_BY_BLOCK_DYE.put(block, newmap);
            list.add(block);
        }
        MODELMAP_BY_BLOCK_DYE.put(Blocks.GLASS, glassmap);
        list.add(Blocks.GLASS);

        return list;
    }
}
