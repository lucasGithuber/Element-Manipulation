package me.lucasgithuber.elementmanipulation;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.lucasgithuber.elementmanipulation.machines.JunctionTable;
import me.lucasgithuber.elementmanipulation.machines.RockAnalyzer;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Items{
    //machines

    public static final SlimefunItemStack EMDeconstructor = new SlimefunItemStack("EM_DECONSTRUCTOR", Material.SMITHING_TABLE, BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.deserialize("<gradient:#000000:#FFFFFF>Deconstructor</gradient>")), "&8Used to make items from elements", "&8Machine",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.power(128, "/s"));

    public static final SlimefunItemStack EMUltraCompressor = new SlimefunItemStack("EM_ULTRA_COMPRESSOR", Material.PISTON, BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.deserialize("<gradient:#000000:#FFFFFF>Ultra compressor</gradient>")), "&8Used to compress elements", "&8Machine",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.power(4092, "/s"));


    public static final SlimefunItemStack EMJunctionTable= new SlimefunItemStack(
            "EM_JUNCTION_TABLE",
            Material.SMITHING_TABLE,
            "&aJunction table",
            "&7Used to craft items from elements",
            "",
            MachineLore.energy(4096) + "per item"
    );
    public static final SlimefunItemStack ROCK_ANALYZER= new SlimefunItemStack(
            "EM_ROCK_ANALYZER",
            Material.LODESTONE,
            "&7Rock analyzer",
            "&7Analyzes rocks to get solid elements",
            "&7like transition-metals",
            "",
            MachineLore.energy(512) + "/t"
    );

    public static void setup(ElementManipulation em) {
        new JunctionTable(Categories.EMMachines, EMJunctionTable, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.NETHER_STAR),new ItemStack(Material.GLASS),new ItemStack(Material.NETHER_STAR),
                SlimefunItems.REINFORCED_PLATE,SlimefunItems.CRAFTING_MOTOR,SlimefunItems.REINFORCED_PLATE,
                new ItemStack(Material.BLACK_CONCRETE),SlimefunItems.LARGE_CAPACITOR,new ItemStack(Material.BLACK_CONCRETE),
        }, 4096).register(em);
        /*new RockAnalyzer(Categories.EMMachines, ROCK_ANALYZER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
         *       new ItemStack(Material.NETHER_STAR),new ItemStack(Material.SPYGLASS),new ItemStack(Material.NETHER_STAR),
                SlimefunItems.REINFORCED_PLATE,new ItemStack(Material.GLASS),SlimefunItems.REINFORCED_PLATE,
                new ItemStack(Material.BLACK_CONCRETE),SlimefunItems.LARGE_CAPACITOR,new ItemStack(Material.BLACK_CONCRETE),
        }).setCapacity(2048).setEnergyConsumption(512).setProcessingSpeed(1).register(em);*/
    }

}