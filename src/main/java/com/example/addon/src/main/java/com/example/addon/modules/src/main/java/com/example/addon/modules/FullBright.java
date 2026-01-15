package com.example.addon.modules;

import com.example.addon.AddonTemplate;
import meteordevelopment.meteorclient.systems.modules.Module;

public class FullBright extends Module {
    public FullBright() {
        super(AddonTemplate.GOLDEN, "full-bright", "Luz total.");
    }
    @Override public void onActivate() { mc.options.getGamma().setValue(100.0); }
    @Override public void onDeactivate() { mc.options.getGamma().setValue(1.0); }
}
