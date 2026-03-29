package de.tomalbrc.paintbrush.impl.block;

import eu.pb4.polymer.blocks.api.PolymerTexturedBlock;
import net.fabricmc.fabric.api.networking.v1.context.PacketContext;
import net.minecraft.util.ColorRGBA;
import net.minecraft.world.level.block.SandBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Map;

public class FallingTexturedBlock extends SandBlock implements PolymerTexturedBlock {
    final Map<BlockState, BlockState> state;

    public FallingTexturedBlock(ColorRGBA colorRGBA, Properties properties, Map<BlockState, BlockState> state) {
        super(colorRGBA, properties);

        this.state = state;
    }

    @Override
    public BlockState getPolymerBlockState(BlockState blockState, PacketContext packetContext) {
        return this.state.values().iterator().next();
    }
}
