package me.lucasgithuber.elementmanipulation.misc;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.elements.Elements;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class MiscItems {
    public static final SlimefunItemStack CLEAR_GLASS_1 = new SlimefunItemStack(
            "EM_CLEAR_GLASS_1",
            Material.GLASS_PANE,
            "&8Clear glass &7(33%)",
            "&8This glass is more clear than the common",
            "&8Because the heat separated its molecules"
    );
    public static final SlimefunItemStack CLEAR_GLASS_2 = new SlimefunItemStack(
            "EM_CLEAR_GLASS_2",
            Material.GLASS_PANE,
            "&7Clear glass &7(66%)",
            "&7This glass is very clearer than the common",
            "&7Because the heat separated its molecules",
            "&7too distant one from each other"
    );
    public static final SlimefunItemStack CLEAR_GLASS_3 = new SlimefunItemStack(
            "EM_CLEAR_GLASS_3",
            Material.GLASS_PANE,
            "&fClear glass",
            "&fThis glass is so clear that it seems",
            "&fThere's nothing in your way"
    );
    public static final SlimefunItemStack BISMUTH_BLOCK = new SlimefunItemStack(
            "EM_BISMUTH_BLOCK",
            Material.SEA_LANTERN,
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#FF00D0:#8C00F7>Bismuth block</gradient>")),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#FF00D0:#8C00F7>Glows</gradient>"))
    );
    public static void setup(ElementManipulation em){
        new UnplaceableBlock(Categories.MISCELLANEOUS, CLEAR_GLASS_1, RecipeType.SMELTERY, new ItemStack[]{
                new ItemStack(Material.GLASS_PANE), null, null,
                null, null, null,
                null, null, null
        }).register(em);
        new UnplaceableBlock(Categories.MISCELLANEOUS, CLEAR_GLASS_2, RecipeType.SMELTERY, new ItemStack[]{
                CLEAR_GLASS_1, null, null,
                null, null, null,
                null, null, null
        }).register(em);
        new UnplaceableBlock(Categories.MISCELLANEOUS, CLEAR_GLASS_3, RecipeType.SMELTERY, new ItemStack[]{
                CLEAR_GLASS_2, null, null,
                null, null, null,
                null, null, null
        }).register(em);
        new SlimefunItem(Categories.MISCELLANEOUS, BISMUTH_BLOCK, RecipeType.COMPRESSOR, new ItemStack[]{
                Elements.BISMUTH,Elements.BISMUTH,Elements.BISMUTH,
                Elements.BISMUTH,Elements.BISMUTH,Elements.BISMUTH,
                Elements.BISMUTH,Elements.BISMUTH,Elements.BISMUTH
        }).register(em);
    }
}
