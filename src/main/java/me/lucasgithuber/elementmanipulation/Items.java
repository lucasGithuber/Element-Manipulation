package me.lucasgithuber.elementmanipulation;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;

import me.lucasgithuber.elementmanipulation.machines.EMJunctionTable;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.Material;
import org.bukkit.configuration.Configuration;
import org.bukkit.inventory.ItemStack;

public class Items {
    //elements
    //non-metals
    public static final SlimefunItemStack EM_Hydrogen = new SlimefunItemStack("EM_HYDROGEN", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Hydrogen</gradient>")), "&aFish like it", "&anon-metal");

    private static final Configuration cfg = ElementManipulation.i().getConfig();


    public static final SlimefunItemStack EM_Oxygen = new SlimefunItemStack("EM_OXYGEN", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Oxygen</gradient>")), "&aEssential for humans", "&anon-metal");


    public static final SlimefunItemStack EM_Carbon = new SlimefunItemStack("EM_CARBON", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Carbon</gradient>")), "&8Not slimefun carbon", "&anon-metal");


    public static final SlimefunItemStack EM_Nitrogen = new SlimefunItemStack("EM_NITROGEN", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Nitrogen</gradient>")),  "&3DRIP", "&anon-metal");


    public static final SlimefunItemStack EM_Phosphorus = new SlimefunItemStack("EM_PHOSPHORUS", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Phosphorus</gradient>")), "", "&anon-metal");


    public static final SlimefunItemStack EM_Sulfur = new SlimefunItemStack("EM_SULFUR", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Sulfur</gradient>")), "&8Not slimefun sulfur", "non-metal");


    public static final SlimefunItemStack EM_Selenium = new SlimefunItemStack("EM_SELENIUM", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Selenium</gradient>")), "", "&anon-metal");


    //alkalines
    public static final SlimefunItemStack EM_Lithium = new SlimefunItemStack("EM_LITHIUM", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#F3A33B:#FF953E>Lithium</gradient>")), "", "&6alkaline");


    public static final SlimefunItemStack EM_Sodium = new SlimefunItemStack("EM_SODIUM", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#F3A33B:#FF953E>Sodium</gradient>")), "", "&6alkaline");


    public static final SlimefunItemStack EM_Potassium = new SlimefunItemStack("EM_POTASSIUM", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#F3A33B:#FF953E>Potassium</gradient>")), "", "&6alkaline");


    public static final SlimefunItemStack EM_Rubidium = new SlimefunItemStack("EM_RUBIDIUM,", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#F3A33B:#FF953E>Rubidium</gradient>")), "", "&6alkaline");


    public static final SlimefunItemStack EM_Caesium = new SlimefunItemStack("EM_CAESIUM", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#F3A33B:#FF953E>Caesium</gradient>")), "", "&6alkaline");


    public static final SlimefunItemStack EM_Francium = new SlimefunItemStack("EM_FRANCIUM", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#F3A33B:#FF953E>Francium</gradient>")), "", "&6alkaline");


    //halogens

    public static final SlimefunItemStack EM_Fluorine = new SlimefunItemStack("EM_FLUORINE", new ItemStack(Material.CYAN_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EEFF00:#97FFE5>Fluorine</gradient>")), "", "&bHalogen");


    public static final SlimefunItemStack EM_Chlorine = new SlimefunItemStack("CHLORINE", new ItemStack(Material.CYAN_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EEFF00:#97FFE5>Chlorine</gradient>")), "", "&bHalogen");


    public static final SlimefunItemStack EM_Bromine = new SlimefunItemStack("EM_BROMINE", new ItemStack(Material.CYAN_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EEFF00:#97FFE5>Iodine</gradient>")), "", "&bHalogen");


    public static final SlimefunItemStack EM_Iodine = new SlimefunItemStack("EM_IODINE", new ItemStack(Material.CYAN_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EEFF00:#97FFE5>Iodine</gradient>")), "", "&bHalogen");


    public static final SlimefunItemStack EM_Astatine = new SlimefunItemStack("EM_ASTATINE", new ItemStack(Material.CYAN_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EEFF00:#97FFE5>Astatine</gradient>")), "", "&bHalogen");


    public static final SlimefunItemStack EM_Tennessine = new SlimefunItemStack("EM_TENNESSINE", new ItemStack(Material.CYAN_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EEFF00:#97FFE5>Tennessine</gradient>")), "", "&bHalogen");

    //elements/alkaline-earths
    public static final SlimefunItemStack EM_Berilium = new SlimefunItemStack("EM_BERILIUM", new ItemStack(Material.YELLOW_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EDE342:#BBB816>Changeme</gradient>")), "", "&eAlkaline-earth");

    public static final SlimefunItemStack EM_Magnesium = new SlimefunItemStack("EM_MAGNESIUM", new ItemStack(Material.YELLOW_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EDE342:#BBB816>Magnesium</gradient>")), "&8Not slimefun magnesium", "&eAlkaline-earth");

    public static final SlimefunItemStack EM_Calcium = new SlimefunItemStack("EM_CALCIUM", new ItemStack(Material.YELLOW_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EDE342:#BBB816>Calcium</gradient>")), "", "&eAlkaline-earth");

    public static final SlimefunItemStack EM_Strontium = new SlimefunItemStack("EM_STRONTIUM", new ItemStack(Material.YELLOW_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EDE342:#BBB816>Strontium</gradient>")), "", "&eAlkaline-earth");

    public static final SlimefunItemStack EM_Radium = new SlimefunItemStack("EM_RADIUM", new ItemStack(Material.YELLOW_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EDE342:#BBB816>Radium</gradient>")), "", "&eAlkaline-earth");

    public static final SlimefunItemStack EM_Barium = new SlimefunItemStack("EM_BARIUM", new ItemStack(Material.YELLOW_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EDE342:#BBB816>Barium</gradient>")), "", "&eAlkaline-earth");
    //elements/semi-metals
    public static final SlimefunItemStack EM_Boron = new SlimefunItemStack("EM_BORON", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>Boron</gradient>")), "", "&3semi-metal");

    public static final SlimefunItemStack EM_Silicon = new SlimefunItemStack("EM_SILICON", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>Silicon</gradient>")), "&8Not Slimefun silicon", "&3semi-metal");

    public static final SlimefunItemStack EM_Germanium = new SlimefunItemStack("EM_GERMANIUM", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>Germanium</gradient>")), "", "&3semi-metal");

    public static final SlimefunItemStack EM_Arsenic = new SlimefunItemStack("EM_ARSENIC", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>Arsenic</gradient>")), "", "&3semi-metal");

    public static final SlimefunItemStack EM_Antimony = new SlimefunItemStack("EM_ANTIMONY", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>Antimony</gradient>")), "", "&3semi-metal");

    public static final SlimefunItemStack EM_Tellurium = new SlimefunItemStack("EM_TELLURIUM", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>Tellurium</gradient>")), "", "&3semi-metal");

    public static final SlimefunItemStack EM_Polonium = new SlimefunItemStack("EM_POLONIUM", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>Polonium</gradient>")), "", "&3semi-metal");
    //elements/others
    public static final SlimefunItemStack EM_Aluminum = new SlimefunItemStack("EM_ALUMINUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Aluminum</gradient>")), "", "&7other-metals");

    public static final SlimefunItemStack EM_Gallium = new SlimefunItemStack("EM_GALLIUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Gallium</gradient>")), "", "&7other-metals");

    public static final SlimefunItemStack EM_Indium = new SlimefunItemStack("EM_INDIUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Indium</gradient>")), "", "&7other-metals");

    public static final SlimefunItemStack EM_Thallium = new SlimefunItemStack("EM_THALLIM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Thallium</gradient>")), "", "&7other-metals");

    public static final SlimefunItemStack EM_Nihonium = new SlimefunItemStack("EM_NIHONIUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Nihonium</gradient>")), "", "&7other-metals");

    public static final SlimefunItemStack EM_Tin = new SlimefunItemStack("EM_TIN", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Tin</gradient>")), "&8Not slimefun tin", "&7other-metals");

    public static final SlimefunItemStack EM_Lead = new SlimefunItemStack("EM_LEAD", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Lead</gradient>")), "&8Not slimefun lead", "&7other-metals");

    public static final SlimefunItemStack EM_Flerovium = new SlimefunItemStack("EM_FLEROVIUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Flerovium</gradient>")), "", "&7other-metals");

    public static final SlimefunItemStack EM_Bismuth = new SlimefunItemStack("EM_BISMUTH", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Bismuth</gradient>")), "", "&7other-metals");

    public static final SlimefunItemStack EM_Moscovium = new SlimefunItemStack("EM_MOSCOVIUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Moscovium</gradient>")), "", "&7other-metals");

    public static final SlimefunItemStack EM_Livermorium = new SlimefunItemStack("EM_LIVERMORIUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Livermorium</gradient>")), "", "&7other-metals");
//items



//machines


    public static final SlimefunItemStack EM_Deconstructor = new SlimefunItemStack("EM_DECONSTRUCTOR", Material.SMITHING_TABLE, BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#000000:#FFFFFF>Deconstructor</gradient>")), "&8Used to make items from elements", "&8Machine",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.power(128, "/s"));


    public static final SlimefunItemStack EM_JUNCTIONTABLE = new SlimefunItemStack(
            "EM_JUNCTION_TABLE",
            Material.SMITHING_TABLE,
            "&aJunction table",
            "&7Used to craft items from elements",
            "",
            MachineLore.energy(4096) + "per item"
    );

    public static void setup(ElementManipulation em) {
        new EMJunctionTable(Categories.EMMACHINES, EM_JUNCTIONTABLE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, null, null, null, SlimefunItems.FISH_JERKY, null, null, null, null
        }, 4096).register(em);
    }
}