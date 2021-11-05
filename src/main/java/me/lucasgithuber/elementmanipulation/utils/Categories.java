package me.lucasgithuber.elementmanipulation.utils;

import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.experimental.UtilityClass;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import static me.lucasgithuber.elementmanipulation.ElementManipulation.MM;


@UtilityClass
public class Categories {
    public static final ItemGroup EMELEMENTS = new SubGroup(
            "em_elements",
            new CustomItemStack(new ItemStack(Material.PRISMARINE_SHARD), BukkitComponentSerializer.legacy().serialize
                    (MM.parse("<gradient:#ff0000:#f4ff00>Elements</gradient>")))
    );
    public static final ItemGroup EMMACHINES = new SubGroup(
            "em_machines",
            new CustomItemStack(new ItemStack(Material.BLAST_FURNACE), BukkitComponentSerializer.legacy().serialize
                    (MM.parse("<gradient:#A3A3A3:#818181>Machines</gradient>"))));

    public static final ItemGroup EMJUNCTION_CATEGORY = new SubGroup(
            "em_junctions",
            new CustomItemStack(Material.SMITHING_TABLE, BukkitComponentSerializer.legacy().serialize
                    (MM.parse("<gradient:#A3A3A3:#FFFFFF>Junctions</gradient>"))));

    public static final ItemGroup EMMAIN = new MultiGroup(
            "em_manipulation",
            new CustomItemStack(Material.NETHERITE_BLOCK, BukkitComponentSerializer.legacy().serialize
                    (MM.parse("<gradient:#5e4fa2:#f79459>Elements Manipulation</gradient>"))),
            EMELEMENTS, EMMACHINES
    );

}