package me.lucasgithuber.elementmanipulation.misc;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.machines.JunctionTable;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import me.lucasgithuber.elementmanipulation.utils.RecipeTypes;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

import org.bukkit.inventory.meta.ItemMeta;

import static me.lucasgithuber.elementmanipulation.elements.Elements.*;

public final class Analisis {
    public static final SlimefunItemStack FOOL_GOLD = new SlimefunItemStack(
        "EM_FOOL_GOLD",
        new ItemStack(Material.GOLD_NUGGET),
        "&6Fool's gold",
        "&8Fake gold",
        "&8FeS3"
    );
    public static final SlimefunItemStack HEMATITE = new SlimefunItemStack(
        "EM_HEMATITE",
        new ItemStack(Material.IRON_NUGGET),
        "&7Hematite",
        "&8Very common in earth",
        "&8Fe2O3"
    );
    public static final SlimefunItemStack MAGNETITE = new SlimefunItemStack(
        "EM_MAGNETITE",
        new ItemStack(Material.IRON_NUGGET),
        "&7Magnetite",
        "&8Magnetic",
        "&8Fe3O4"
    );
    public static final SlimefunItemStack MAGNESIOFERRITE = new SlimefunItemStack(
        "EM_MAGNESIOFERRITE",
        new ItemStack(Material.IRON_NUGGET),
        "&7Magnesioferrite",
        "&8Fumarolic ",
        "&8MgO-Fe2O3"
    );
    public static final SlimefunItemStack GOETHITE = new SlimefunItemStack(
        "EM_GOETHITE",
        new ItemStack(Material.IRON_NUGGET),
        "&7Goethite",
        "&8Can be &4red, &6orange, &8 and &eyellow",
        "&8Fe2O3-H2O"
    );
    public static final SlimefunItemStack HYDROGOETHITE = new SlimefunItemStack(
        "EM_HYDROGOETHITE",
        new ItemStack(Material.IRON_NUGGET),
        "&7Hydrogoethite",
        "&8Kinda contains water",
        "&83(Fe2O3)-4(H2O)"
    );
    public static final SlimefunItemStack LIMONITE = new SlimefunItemStack(
        "EM_LIMONITE",
        new ItemStack(Material.IRON_NUGGET),
        "&7Limonite",
        "&8Not made of lemon. kinda contains water",
        "&82(Fe2O3)-3(H2O)"
    );
    public static final SlimefunItemStack SIDERITE = new SlimefunItemStack(
        "EM_SIDERITE",
        new ItemStack(Material.IRON_NUGGET),
        "&7Siderite",
        "&8Contains carbon",
        "&8FeCO3"
    );
    public static final SlimefunItemStack PYRITE = new SlimefunItemStack(
        "EM_PYRITE",
        new ItemStack(Material.IRON_NUGGET),
        "&7Pyrite",
        "&8Shiny! Reflects some light",
        "&8FeS2"
    );
    static {
        ItemMeta meta = PYRITE.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        PYRITE.setItemMeta(meta);
        PYRITE.addUnsafeEnchantment(Enchantment.LUCK, 1);
    }
    public static final SlimefunItemStack PYRROTITE = new SlimefunItemStack(
        "EM_PYRROTITE",
        new ItemStack(Material.IRON_NUGGET),
        "&7Pyrrotite",
        "&8Magnetism so small it doesnt work",
        "&8Fe1S"
    );
    public static final SlimefunItemStack ILMENITE = new SlimefunItemStack(
        "EM_ILMENITE",
        new ItemStack(Material.IRON_NUGGET),
        "&7Ilmenite",
        "&8Contains titanium",
        "&8FeTiO3"
    );

    public static final SlimefunItemStack BISMUTHINITE = new SlimefunItemStack(
        "EM_BISMUTHINITE",
        BISMUTH,
        "&7Bismuthinite",
        "&dGlows",
        "&8Bi2S3"
    );
    public static final SlimefunItemStack BISMITE = new SlimefunItemStack(
        "EM_BISMITE",
        BISMUTH,
        "&7Bismite",
        "&dGlows",
        "&8Bi2O3"
    );
    public static final SlimefunItemStack CALAVERITE = new SlimefunItemStack(
        "EM_CALAVERITE",
        new ItemStack(Material.GOLD_NUGGET),
        "&eCalaverite",
        "&eReal gold",
        "&8AuTe2"
    );
}