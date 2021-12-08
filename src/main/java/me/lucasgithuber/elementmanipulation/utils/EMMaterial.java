package me.lucasgithuber.elementmanipulation.utils;

import me.lucasgithuber.elementmanipulation.machines.EMJunctionTable;
import org.bukkit.inventory.ItemStack;


import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.Soulbound;


public final class EMMaterial extends SlimefunItem implements Soulbound, NotPlaceable {

    public EMMaterial(SlimefunItemStack stack, ItemStack[] recipe) {
        super(Categories.EMJUNCTION_CATEGORY, stack, EMJunctionTable.TYPE, recipe);
    }

}