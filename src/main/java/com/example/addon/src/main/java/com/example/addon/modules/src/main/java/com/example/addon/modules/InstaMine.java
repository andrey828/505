package com.example.addon.modules;

import com.example.addon.AddonTemplate;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.hit.BlockHitResult;

public class InstaMine extends Module {
    public InstaMine() {
        super(AddonTemplate.GOLDEN, "insta-mine", "Mina con paquetes.");
    }

    @EventHandler
    private void onTick(TickEvent.Pre event) {
        if (mc.interactionManager.isBreakingBlock() && mc.crosshairTarget instanceof BlockHitResult bhr) {
            BlockPos pos = bhr.getBlockPos();
            mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(PlayerActionC2SPacket.Action.STOP_DESTROY_BLOCK, pos, Direction.UP));
            mc.player.swingHand(Hand.MAIN_HAND);
        }
    }
}
