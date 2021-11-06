package me.lucasgithuber.elementmanipulation;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.Configuration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.awt.*;

import static me.lucasgithuber.elementmanipulation.ElementManipulation.MM;

public class Items {
//elements
    //non-metals
    public static final SlimefunItemStack EM_Hydrogen = new SlimefunItemStack("EM_HYDROGEN", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#38CA08:#25FF09>Hydrogen</gradient>")), "&aFish like it", "&anon-metal");

    private static final Configuration cfg = ElementManipulation.i().getConfig();

    static {
        ItemMeta meta = EM_Hydrogen.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        EM_Hydrogen.setItemMeta(meta);
        EM_Hydrogen.addUnsafeEnchantment(Enchantment.WATER_WORKER, 3);
    }

    public static final SlimefunItemStack EM_Oxygen = new SlimefunItemStack("EM_OXYGEN", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#38CA08:#25FF09>Oxygen</gradient>")), "&aEssential for humans", "&anon-metal");

    static {
        ItemMeta meta = EM_Oxygen.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        EM_Oxygen.setItemMeta(meta);
        EM_Oxygen.addUnsafeEnchantment(Enchantment.WATER_WORKER, 3);
    }

    public static final SlimefunItemStack EM_Carbon = new SlimefunItemStack("EM_CARBON", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#38CA08:#25FF09>Carbon</gradient>")), "&8Not slimefun carbon", "&anon-metal");

    static {
        ItemMeta meta = EM_Carbon.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        EM_Carbon.setItemMeta(meta);
        EM_Carbon.addUnsafeEnchantment(Enchantment.WATER_WORKER, 3);
    }

    public static final SlimefunItemStack EM_Nitrogen = new SlimefunItemStack("EM_NITROGEN", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#38CA08:#25FF09>Nitrogen</gradient>")), ChatColor.of(Color.BLUE)+"DRIP", "&anon-metal");

    static {
        ItemMeta meta = EM_Nitrogen.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        EM_Nitrogen.setItemMeta(meta);
        EM_Nitrogen.addUnsafeEnchantment(Enchantment.WATER_WORKER, 3);
    }

    public static final SlimefunItemStack EM_Phosphorus = new SlimefunItemStack("EM_PHOSPHORUS", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#38CA08:#25FF09>Phosphorus</gradient>")), "", "&anon-metal");

    static {
        ItemMeta meta = EM_Phosphorus.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        EM_Phosphorus.setItemMeta(meta);
        EM_Phosphorus.addUnsafeEnchantment(Enchantment.WATER_WORKER, 3);
    }

    public static final SlimefunItemStack EM_Sulfur = new SlimefunItemStack("EM_SULFUR", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#38CA08:#25FF09>Sulfur</gradient>")), "&8Not slimefun sulfur", "non-metal");

    static {
        ItemMeta meta = EM_Sulfur.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        EM_Sulfur.setItemMeta(meta);
        EM_Sulfur.addUnsafeEnchantment(Enchantment.WATER_WORKER, 3);
    }

    public static final SlimefunItemStack EM_Selenium = new SlimefunItemStack("EM_SELENIUM", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#38CA08:#25FF09>Selenium</gradient>")), "", "&anon-metal");

    static {
        ItemMeta meta = EM_Selenium.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        EM_Selenium.setItemMeta(meta);
        EM_Selenium.addUnsafeEnchantment(Enchantment.WATER_WORKER, 3);
    }
    //alkalines
    public static final SlimefunItemStack EM_Lithium = new SlimefunItemStack("EM_LITHIUM", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#F3A33B:#FF953E>Lithium</gradient>")), "", "&6alkaline");

    static {
        ItemMeta meta = EM_Lithium.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        EM_Lithium.setItemMeta(meta);
        EM_Lithium.addUnsafeEnchantment(Enchantment.WATER_WORKER, 3);
    }

    public static final SlimefunItemStack EM_Sodium = new SlimefunItemStack("EM_SODIUM", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#F3A33B:#FF953E>Sodium</gradient>")), "", "&6alkaline");

    static {
        ItemMeta meta = EM_Sodium.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        EM_Sodium.setItemMeta(meta);
        EM_Sodium.addUnsafeEnchantment(Enchantment.WATER_WORKER, 3);
    }

    public static final SlimefunItemStack EM_Potassium = new SlimefunItemStack("EM_POTASSIUM", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#F3A33B:#FF953E>Potassium</gradient>")), "", "&6alkaline");

    static {
        ItemMeta meta = EM_Potassium.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        EM_Potassium.setItemMeta(meta);
        EM_Potassium.addUnsafeEnchantment(Enchantment.WATER_WORKER, 3);
    }

    public static final SlimefunItemStack EM_Rubidium = new SlimefunItemStack("EM_RUBIDIUM,", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#F3A33B:#FF953E>Rubidium</gradient>")), "", "&6alkaline");

    static {
        ItemMeta meta = EM_Rubidium.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        EM_Rubidium.setItemMeta(meta);
        EM_Rubidium.addUnsafeEnchantment(Enchantment.WATER_WORKER, 3);
    }

    public static final SlimefunItemStack EM_Caesium = new SlimefunItemStack("EM_CAESIUM", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#F3A33B:#FF953E>Caesium</gradient>")), "", "&6alkaline");

    static {
        ItemMeta meta = EM_Caesium.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        EM_Caesium.setItemMeta(meta);
        EM_Caesium.addUnsafeEnchantment(Enchantment.WATER_WORKER, 3);
    }

    public static final SlimefunItemStack EM_Francium = new SlimefunItemStack("EM_FRANCIUM", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#F3A33B:#FF953E>Francium</gradient>")), "", "&6alkaline");

    static {
        ItemMeta meta = EM_Francium.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        EM_Francium.setItemMeta(meta);
        EM_Francium.addUnsafeEnchantment(Enchantment.WATER_WORKER, 3);
    }

    //halogens

    public static final SlimefunItemStack EM_Fluorine = new SlimefunItemStack("EM_FLUORINE", new ItemStack(Material.CYAN_DYE), BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#EEFF00:#97FFE5>Fluorine</gradient>")), "", "&bHalogen");

    static {
        ItemMeta meta = EM_Fluorine.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        EM_Fluorine.setItemMeta(meta);
        EM_Fluorine.addUnsafeEnchantment(Enchantment.WATER_WORKER, 3);
    }
//machines


    public static final SlimefunItemStack EM_Deconstructor = new SlimefunItemStack("EM_DECONSTRUCTOR", Material.SMITHING_TABLE, BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#000000:#FFFFFF>Deconstructor</gradient>")), "&8Used to make items from elements", "&8Machine",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.power(128, "/s"));


    public static final SlimefunItemStack EM_Junction_table = new SlimefunItemStack("EM_JUNCTION_TABLE", Material.SMITHING_TABLE, BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#000000:#FFFFFF>Junction Table</gradient>")), "&8Used to make items from elements", "&8Machine",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.power(2048, "/s"));

}