package com.example.addon;

import com.example.addon.modules.*;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.item.Items;

public class AddonTemplate extends MeteorAddon {
    // Definimos la columna principal con un icono de Manzana Dorada
    public static final Category GOLDEN = new Category("Golden", Items.GOLDEN_APPLE.getDefaultStack());

    @Override
    public void onInitialize() {
        // Registro de los módulos en el sistema de Meteor
        Modules.get().add(new AutoEZ());
        Modules.get().add(new AntiPush());
        Modules.get().add(new FullBright());
        Modules.get().add(new InstaMine());
    }

    @Override
    public String getPackage() {
        return "com.example.addon";
    }
}
