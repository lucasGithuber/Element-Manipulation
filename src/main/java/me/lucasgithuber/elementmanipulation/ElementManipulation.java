package me.lucasgithuber.elementmanipulation;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.plugin.java.JavaPluginLoader;

import java.io.File;

public class ElementManipulation extends AbstractAddon {

    public ElementManipulation(JavaPluginLoader loader, PluginDescriptionFile description, File dataFolder, File file) {
        super(loader, description, dataFolder, file,
                "lucasGithuber", "ElementManipulation", "master", "auto-update");
    }

    public ElementManipulation() {
        super("lucasGithuber", "ElementManipulation", "master", "auto-update");
    }

    @Override
    public void enable() {
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // You could start an Auto-Updater for example
        }        ItemStack elementManipulationMainItem = new CustomItemStack(Material.DIAMOND, "&4Element Manipulation", "an addon that adds the capacity to the player to manipulate atoms and create new materials", "&a> Click to open");

        NamespacedKey elementManipulationMain = new NamespacedKey(this, "Element_Manipulation");

        ItemGroup itemGroup = new ItemGroup(elementManipulationMain, elementManipulationMainItem);

        //junction table
        SlimefunItemStack slimefunItem = new SlimefunItemStack("COOL_DIAMOND", Material.DIAMOND, "&4Cool Diamond", "&c+20% Coolness");
        ItemStack[] recipe = { new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD), null, new ItemStack(Material.DIAMOND), null, new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD) };

        SlimefunItem item = new SlimefunItem(itemGroup, slimefunItem, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
        item.register(this);
    }

    @Override
    public void disable() {
        // Logic for disabling the plugin...
    }

}
