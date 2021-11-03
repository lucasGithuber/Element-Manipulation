package me.lucasgithuber.elementmanipulation.utils;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.Items;
import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;

public class RecipeTypes {
    public static final RecipeType JUNCTION_TABLE_TYPE = new RecipeType(new NamespacedKey(ElementManipulation.i(), "soul_collector_type"), Items.EM_JUNCTION_TABLE, "", ChatColor.DARK_PURPLE+"Crafted in the Junction Table");
}
