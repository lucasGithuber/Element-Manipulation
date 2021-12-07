package me.lucasgithuber2.elementmanipulation.utils;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.lucasgithuber2.elementmanipulation.ElementManipulation;
import me.lucasgithuber2.elementmanipulation.Items;
import org.bukkit.NamespacedKey;

public class RecipeTypes {
    public static final RecipeType EM_DECONSTRUCTOR = new RecipeType(new NamespacedKey(ElementManipulation.i(), "em_deconstructor_recipetype"), Items.EM_Deconstructor, "", "&8Extract using the deconstructor");
    public static final RecipeType EM_JUNCTIONTABLE = new RecipeType(new NamespacedKey(ElementManipulation.i(), "em_junctiontable_recipetype"), Items.EM_JUNCTIONTABLE, "", "&8construct using the junction table");
}
