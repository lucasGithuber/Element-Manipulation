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
    public static final SlimefunItemStack EMHydrogen = new SlimefunItemStack("EM_HYDROGEN", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Hydrogen</gradient>")), "&aFish like it", "&anon-metal");

    private static final Configuration cfg = ElementManipulation.i().getConfig();


    public static final SlimefunItemStack EMOxygen = new SlimefunItemStack("EM_OXYGEN", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Oxygen</gradient>")), "&aEssential for humans", "&anon-metal");


    public static final SlimefunItemStack EMCarbon = new SlimefunItemStack("EM_CARBON", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Carbon</gradient>")), "&8Not slimefun carbon", "&anon-metal");


    public static final SlimefunItemStack EMNitrogen = new SlimefunItemStack("EM_NITROGEN", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Nitrogen</gradient>")),  "&3DRIP", "&anon-metal");


    public static final SlimefunItemStack EMPhosphorus = new SlimefunItemStack("EM_PHOSPHORUS", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Phosphorus</gradient>")), "", "&anon-metal");


    public static final SlimefunItemStack EMSulfur = new SlimefunItemStack("EM_SULFUR", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Sulfur</gradient>")), "&8Not slimefun sulfur", "non-metal");


    public static final SlimefunItemStack EMSelenium = new SlimefunItemStack("EM_SELENIUM", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Selenium</gradient>")), "", "&anon-metal");


    //alkalines
    public static final SlimefunItemStack EMLithium = new SlimefunItemStack("EM_LITHIUM", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#F3A33B:#FF953E>Lithium</gradient>")), "", "&6alkaline");


    public static final SlimefunItemStack EMSodium = new SlimefunItemStack("EM_SODIUM", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#F3A33B:#FF953E>Sodium</gradient>")), "", "&6alkaline");


    public static final SlimefunItemStack EMPotassium = new SlimefunItemStack("EM_POTASSIUM", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#F3A33B:#FF953E>Potassium</gradient>")), "", "&6alkaline");


    public static final SlimefunItemStack EMRubidium = new SlimefunItemStack("EM_RUBIDIUM,", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#F3A33B:#FF953E>Rubidium</gradient>")), "", "&6alkaline");


    public static final SlimefunItemStack EMCaesium = new SlimefunItemStack("EM_CAESIUM", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#F3A33B:#FF953E>Caesium</gradient>")), "", "&6alkaline");


    public static final SlimefunItemStack EMFrancium = new SlimefunItemStack("EM_FRANCIUM", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#F3A33B:#FF953E>Francium</gradient>")), "", "&6alkaline");


    //halogens

    public static final SlimefunItemStack EMFluorine = new SlimefunItemStack("EM_FLUORINE", new ItemStack(Material.CYAN_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EEFF00:#97FFE5>Fluorine</gradient>")), "", "&bHalogen");


    public static final SlimefunItemStack EMChlorine = new SlimefunItemStack("CHLORINE", new ItemStack(Material.CYAN_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EEFF00:#97FFE5>Chlorine</gradient>")), "", "&bHalogen");


    public static final SlimefunItemStack EMBromine = new SlimefunItemStack("EM_BROMINE", new ItemStack(Material.CYAN_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EEFF00:#97FFE5>Iodine</gradient>")), "", "&bHalogen");


    public static final SlimefunItemStack EMIodine = new SlimefunItemStack("EM_IODINE", new ItemStack(Material.CYAN_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EEFF00:#97FFE5>Iodine</gradient>")), "", "&bHalogen");


    public static final SlimefunItemStack EMAstatine = new SlimefunItemStack("EM_ASTATINE", new ItemStack(Material.CYAN_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EEFF00:#97FFE5>Astatine</gradient>")), "", "&bHalogen");


    public static final SlimefunItemStack EMTennessine = new SlimefunItemStack("EM_TENNESSINE", new ItemStack(Material.CYAN_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EEFF00:#97FFE5>Tennessine</gradient>")), "", "&bHalogen");

    //elements/alkaline-earths
    public static final SlimefunItemStack EMBerilium = new SlimefunItemStack("EM_BERILIUM", new ItemStack(Material.YELLOW_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EDE342:#BBB816>Changeme</gradient>")), "", "&eAlkaline-earth");

    public static final SlimefunItemStack EMMagnesium = new SlimefunItemStack("EM_MAGNESIUM", new ItemStack(Material.YELLOW_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EDE342:#BBB816>Magnesium</gradient>")), "&8Not slimefun magnesium", "&eAlkaline-earth");

    public static final SlimefunItemStack EMCalcium = new SlimefunItemStack("EM_CALCIUM", new ItemStack(Material.YELLOW_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EDE342:#BBB816>Calcium</gradient>")), "", "&eAlkaline-earth");

    public static final SlimefunItemStack EMStrontium = new SlimefunItemStack("EM_STRONTIUM", new ItemStack(Material.YELLOW_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EDE342:#BBB816>Strontium</gradient>")), "", "&eAlkaline-earth");

    public static final SlimefunItemStack EMRadium = new SlimefunItemStack("EM_RADIUM", new ItemStack(Material.YELLOW_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EDE342:#BBB816>Radium</gradient>")), "", "&eAlkaline-earth");

    public static final SlimefunItemStack EMBarium = new SlimefunItemStack("EM_BARIUM", new ItemStack(Material.YELLOW_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EDE342:#BBB816>Barium</gradient>")), "", "&eAlkaline-earth");
    //elements/semi-metals
    public static final SlimefunItemStack EMBoron = new SlimefunItemStack("EM_BORON", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>Boron</gradient>")), "", "&3semi-metal");

    public static final SlimefunItemStack EMSilicon = new SlimefunItemStack("EM_SILICON", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>Silicon</gradient>")), "&8Not Slimefun silicon", "&3semi-metal");

    public static final SlimefunItemStack EMGermanium = new SlimefunItemStack("EM_GERMANIUM", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>Germanium</gradient>")), "", "&3semi-metal");

    public static final SlimefunItemStack EMArsenic = new SlimefunItemStack("EM_ARSENIC", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>Arsenic</gradient>")), "", "&3semi-metal");

    public static final SlimefunItemStack EMAntimony = new SlimefunItemStack("EM_ANTIMONY", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>Antimony</gradient>")), "", "&3semi-metal");

    public static final SlimefunItemStack EMTellurium = new SlimefunItemStack("EM_TELLURIUM", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>Tellurium</gradient>")), "", "&3semi-metal");

    public static final SlimefunItemStack EMPolonium = new SlimefunItemStack("EM_POLONIUM", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>Polonium</gradient>")), "", "&3semi-metal");
    //elements/others
    public static final SlimefunItemStack EMAluminum = new SlimefunItemStack("EM_ALUMINUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Aluminum</gradient>")), "", "&7other-metals");

    public static final SlimefunItemStack EMGallium = new SlimefunItemStack("EM_GALLIUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Gallium</gradient>")), "", "&7other-metals");

    public static final SlimefunItemStack EMIndium = new SlimefunItemStack("EM_INDIUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Indium</gradient>")), "", "&7other-metals");

    public static final SlimefunItemStack EMThallium = new SlimefunItemStack("EM_THALLIM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Thallium</gradient>")), "", "&7other-metals");

    public static final SlimefunItemStack EMNihonium = new SlimefunItemStack("EM_NIHONIUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Nihonium</gradient>")), "", "&7other-metals");

    public static final SlimefunItemStack EMTin = new SlimefunItemStack("EM_TIN", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Tin</gradient>")), "&8Not slimefun tin", "&7other-metals");

    public static final SlimefunItemStack EMLead = new SlimefunItemStack("EM_LEAD", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Lead</gradient>")), "&8Not slimefun lead", "&7other-metals");

    public static final SlimefunItemStack EMFlerovium = new SlimefunItemStack("EM_FLEROVIUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Flerovium</gradient>")), "", "&7other-metals");

    public static final SlimefunItemStack EMBismuth = new SlimefunItemStack("EM_BISMUTH", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Bismuth</gradient>")), "", "&7other-metals");

    public static final SlimefunItemStack EMMoscovium = new SlimefunItemStack("EM_MOSCOVIUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Moscovium</gradient>")), "", "&7other-metals");

    public static final SlimefunItemStack EMLivermorium = new SlimefunItemStack("EM_LIVERMORIUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>Livermorium</gradient>")), "", "&7other-metals");
    //elements/transition metals
    public static final SlimefunItemStack EMCopper = new SlimefunItemStack("EM_COPPER", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Copper</gradient>")), "&8Not slimefun copper", "&7transition-metals");
    public static final SlimefunItemStack EMAu = new SlimefunItemStack("EM_GOLD", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Gold</gradient>")), "", "&7transition-metals");
    public static final SlimefunItemStack EMScandium = new SlimefunItemStack("EM_SCANDIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Scandium</gradient>")), "", "&7transition-metals");
//machines


    public static final SlimefunItemStack EMDeconstructor = new SlimefunItemStack("EM_DECONSTRUCTOR", Material.SMITHING_TABLE, BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#000000:#FFFFFF>Deconstructor</gradient>")), "&8Used to make items from elements", "&8Machine",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.power(128, "/s"));


    public static final SlimefunItemStack EMJunctionTable= new SlimefunItemStack(
            "EM_JUNCTION_TABLE",
            Material.SMITHING_TABLE,
            "&aJunction table",
            "&7Used to craft items from elements",
            "",
            MachineLore.energy(4096) + "per item"
    );

    public static void setup(ElementManipulation em) {
        new EMJunctionTable(Categories.EMMachines, EMJunctionTable, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, null, null, null, SlimefunItems.FISH_JERKY, null, null, null, null
        }, 4096).register(em);
    }
}
