package me.lucasgithuber.elementmanipulation.utils;

import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.experimental.UtilityClass;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


@UtilityClass
public class Categories {
    public static final ItemGroup EMElements = new SubGroup(
            "em_elements",
            new CustomItemStack(new ItemStack(Material.PRISMARINE_SHARD), BukkitComponentSerializer.legacy().serialize
                    (ElementManipulation.MM.deserialize("<gradient:#ff0000:#f4ff00>Elements</gradient>")))
    );
    public static final ItemGroup EMMachines = new SubGroup(
            "em_machines",
            new CustomItemStack(new ItemStack(Material.BLAST_FURNACE), BukkitComponentSerializer.legacy().serialize
                    (ElementManipulation.MM.deserialize("<gradient:#A3A3A3:#818181>Machines</gradient>"))));

    public static final ItemGroup EMJunctionCategory = new JunctionGroupTest(
            ElementManipulation.createKey("junction_category"),
            new CustomItemStack(Material.SMITHING_TABLE, BukkitComponentSerializer.legacy().serialize
                    (ElementManipulation.MM.deserialize("<gradient:#A3A3A3:#FFFFFF>Junctions</gradient>"))),3);

    public static final ItemGroup EMMain = new MultiGroup(
            "em_manipulation",
            new CustomItemStack(Material.NETHERITE_BLOCK, BukkitComponentSerializer.legacy().serialize
                    (ElementManipulation.MM.deserialize("<gradient:#5e4fa2:#f79459>Elements Manipulation</gradient>"))),
            EMElements, EMMachines, EMJunctionCategory
    );
    public static final ItemGroup EMJunctionCheat = new SubGroup("junction_cheat",
            new CustomItemStack(Material.SMITHING_TABLE, "&bJunctions &c- INCORRECT RECIPES"));

    public static void setup(ElementManipulation elm){
        EMJunctionCategory.register(elm);
        EMMain.register(elm);
        EMJunctionCheat.register(elm);
    }

}
