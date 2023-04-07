package com.dwarslooper.antip2w;

import com.dwarslooper.antip2w.commands.CommandExample;
import com.dwarslooper.antip2w.modules.ModuleExample;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.commands.Commands;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.item.Items;
import org.slf4j.Logger;

public class Addon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("No More P2W", Items.WITHER_SKELETON_SKULL.getDefaultStack());

    @Override
    public void onInitialize() {
        LOG.info("Initializing NoMoreP2W Template");

        // Modules
        Modules.get().add(new ModuleExample());

        // Commands
        Commands.get().add(new CommandExample());

        // HUD
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.dwarslooper.antip2w";
    }
}
