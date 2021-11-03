package me.lucasgithuber.elementmanipulation;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.Configuration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import static me.lucasgithuber.elementmanipulation.ElementManipulation.MM;

public class Items {

    public static final SlimefunItemStack EM_Hydrogen = new SlimefunItemStack("EM_HYDROGEN", new ItemStack(Material.PRISMARINE_CRYSTALS), BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#38CA08:#25FF09>Hydrogen</gradient>")), BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#38CA08:#25FF09>Fish like it</gradient>")), "non-metal");

    private static final Configuration cfg = ElementManipulation.i().getConfig();

    static {
        ItemMeta meta = EM_Hydrogen.getItemMeta();
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        EM_Hydrogen.setItemMeta(meta);
        EM_Hydrogen.addUnsafeEnchantment(Enchantment.WATER_WORKER, 3);
    }

    public static final SlimefunItemStack EM_Deconstructor = new SlimefunItemStack("EM_DECONSTRUCTOR", new ItemStack(Material.SMITHING_TABLE), BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#535353:#161616>Deconstructor</gradient>")), "&8Turns materials into elements", "&8Machine");

    static {
        ItemMeta meta = EM_Deconstructor.getItemMeta();
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        EM_Deconstructor.setItemMeta(meta);
        EM_Deconstructor.addUnsafeEnchantment(Enchantment.WATER_WORKER, 3);
    }

    public static final SlimefunItemStack EM_Oxygen = new SlimefunItemStack("EM_OXYGEN", new ItemStack(Material.PRISMARINE_CRYSTALS), BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#38CA08:#25FF09>Oxygen</gradient>")), BukkitComponentSerializer.legacy().serialize(MM.parse("<gradient:#38CA08:#25FF09>Essential for humans</gradient>", "&anon-metal")));

    static {
        ItemMeta meta = EM_Oxygen.getItemMeta();
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        EM_Oxygen.setItemMeta(meta);
        EM_Oxygen.addUnsafeEnchantment(Enchantment.WATER_WORKER, 3);
    }

    ;

    public static final SlimefunItemStack EM_JUNCTION_TABLE = new SlimefunItemStack("EM_JUNCTION_TABLE", Material.SMITHING_TABLE, BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#000000:#FFFFFF>Junction Table</gradient>")), BukkitComponentSerializer.legacy().serialize(MM.parse("<gradient:#FFFFFF:#000000>Used to make items from elements</gradient>", "&8Machine")),
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.power(2048, "/Craft"));

}