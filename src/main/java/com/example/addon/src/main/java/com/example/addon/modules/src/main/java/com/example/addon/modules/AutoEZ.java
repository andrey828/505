package com.example.addon.modules;

import com.example.addon.AddonTemplate;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.network.packet.s2c.play.DeathMessageS2CPacket;

public class AutoEZ extends Module {
    public AutoEZ() {
        super(AddonTemplate.GOLDEN, "auto-ez", "Mensaje al matar.");
    }

    @EventHandler
    private void onPacket(PacketEvent.Receive event) {
        if (event.packet instanceof DeathMessageS2CPacket packet) {
            if (!packet.getMessage().getString().contains(mc.player.getEntityName())) {
                mc.player.networkHandler.sendChatMessage("EZ! Golden Addon on top.");
            }
        }
    }
}
