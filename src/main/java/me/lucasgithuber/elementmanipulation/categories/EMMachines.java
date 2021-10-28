package me.lucasgithuber.elementmanipulation.categories;

import io.github.mooy1.infinitylib.groups.SubGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;

public class EMMachines {
    public static final ItemGroup EMMACHINES = new SubGroup("em_machines",
            new CustomItemStack(Material.NETHER_STAR, "&bMachines"));
}
