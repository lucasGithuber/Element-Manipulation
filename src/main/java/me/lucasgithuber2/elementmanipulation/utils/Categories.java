package me.lucasgithuber2.elementmanipulation.utils;

import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.experimental.UtilityClass;
import me.lucasgithuber2.elementmanipulation.ElementManipulation;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


@UtilityClass
public class Categories {
    public static final ItemGroup EMELEMENTS = new SubGroup(
            "em_elements",
            new CustomItemStack(new ItemStack(Material.PRISMARINE_SHARD), BukkitComponentSerializer.legacy().serialize
                    (ElementManipulation.MM.parse("<gradient:#ff0000:#f4ff00>Elements</gradient>")))
    );
    public static final ItemGroup EMMACHINES = new SubGroup(
            "em_machines",
            new CustomItemStack(new ItemStack(Material.BLAST_FURNACE), BukkitComponentSerializer.legacy().serialize
                    (ElementManipulation.MM.parse("<gradient:#A3A3A3:#818181>Machines</gradient>"))));

    public static final ItemGroup EMJUNCTION_CATEGORY = new SubGroup(
            "em_junctions",
            new CustomItemStack(Material.SMITHING_TABLE, BukkitComponentSerializer.legacy().serialize
                    (ElementManipulation.MM.parse("<gradient:#A3A3A3:#FFFFFF>Junctions</gradient>"))));

    public static final ItemGroup EMMAIN = new MultiGroup(
            "em_manipulation",
            new CustomItemStack(Material.NETHERITE_BLOCK, BukkitComponentSerializer.legacy().serialize
                    (ElementManipulation.MM.parse("<gradient:#5e4fa2:#f79459>Elements Manipulation</gradient>"))),
            EMELEMENTS, EMMACHINES, EMJUNCTION_CATEGORY
    );
    public static void setup(ElementManipulation elm){
        EMJUNCTION_CATEGORY.register(elm);
        EMMAIN.register(elm);
    }

}
