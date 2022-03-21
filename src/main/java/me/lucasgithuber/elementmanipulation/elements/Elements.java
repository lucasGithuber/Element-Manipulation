package me.lucasgithuber.elementmanipulation.elements;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import me.lucasgithuber.elementmanipulation.utils.RecipeTypes;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.Material;
import org.bukkit.configuration.Configuration;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.inventory.ItemStack;

public class Elements {

    //elements
    //non-metals
    public static final SlimefunItemStack HYDROGEN = new SlimefunItemStack(
            "EM_HYDROGEN",
            new ItemStack(Material.LIME_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#38CA08:#25FF09>Hydrogen</gradient>")),
            "&8Symbol: H",
            "&8Atomic number: 1",
            "&8Atomic mass: 1.008",
            "&aElement group: non-metals");
public static final SlimefunItemStack CARBON = new SlimefunItemStack(
        "EM_CARBON",
        new ItemStack(Material.LIME_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#38CA08:#25FF09>Carbon</gradient>")),
        "&8Symbol: C",
        "&8Atomic number: 6",
        "&8Atomic mass: 12.011",
        "&aElement group: non-metals");
public static final SlimefunItemStack NITROGEN = new SlimefunItemStack(
        "EM_NITROGEN",
        new ItemStack(Material.LIME_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#38CA08:#25FF09>Nitrogen</gradient>")),
        "&8Symbol: N",
        "&8Atomic number: 7",
        "&8Atomic mass: 14.007",
        "&aElement group: non-metals");
public static final SlimefunItemStack OXYGEN = new SlimefunItemStack(
        "EM_OXYGEN",
        new ItemStack(Material.LIME_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#38CA08:#25FF09>Oxygen</gradient>")),
        "&8Symbol: O",
        "&8Atomic number: 8",
        "&8Atomic mass: 15.999",
        "&aElement group: non-metals");
public static final SlimefunItemStack PHOSPHORUS = new SlimefunItemStack(
        "EM_PHOSPHORUS",
        new ItemStack(Material.LIME_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#38CA08:#25FF09>Phosphorus</gradient>")),
        "&8Symbol: P",
        "&8Atomic number: 15",
        "&8Atomic mass: 30.974",
        "&aElement group: non-metals");
public static final SlimefunItemStack SULFUR = new SlimefunItemStack(
        "SULFUR",
        new ItemStack(Material.LIME_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#38CA08:#25FF09>Sulfur</gradient>")),
        "&8Symbol: S",
        "&8Atomic number: 16",
        "&8Atomic mass: 32.065",
        "&aElement group: non-metals");
public static final SlimefunItemStack SELENIUM = new SlimefunItemStack(
        "EM_SELENIUM",
        new ItemStack(Material.LIME_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#38CA08:#25FF09>Selenium</gradient>")),
        "&8Symbol: S",
        "&8Atomic number: 34",
        "&8Atomic mass: 78.96",
        "&aElement group: non-metals");


//elements/alkalines
public static final SlimefunItemStack LITHIUM = new SlimefunItemStack(
        "EM_LITHIUM",
        new ItemStack(Material.ORANGE_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#F3A33B:#FF953E>Lithium</gradient>")),
        "&8Symbol: Li",
        "&8Atomic number: 3",
        "&8Atomic mass: 6.941",
        "&aElement group: alkalines"
);
public static final SlimefunItemStack SODIUM = new SlimefunItemStack(
        "EM_SODIUM",
        new ItemStack(Material.ORANGE_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#F3A33B:#FF953E>Sodium</gradient>")),
        "&8Symbol: Na",
        "&8Atomic number: 11",
        "&8Atomic mass: 22.990",
        "&aElement group: alkalines"
);
public static final SlimefunItemStack POTASSIUM = new SlimefunItemStack(
        "EM_POTASSIUM",
        new ItemStack(Material.ORANGE_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#F3A33B:#FF953E>Potassium</gradient>")),
        "&8Symbol: K",
        "&8Atomic number: 19",
        "&8Atomic mass: 39.098",
        "&aElement group: alkalines"
);
public static final SlimefunItemStack RUBIDIUM = new SlimefunItemStack(
        "EM_RUBIDIUM",
        new ItemStack(Material.ORANGE_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#F3A33B:#FF953E>Rubidium</gradient>")),
        "&8Symbol: Rb",
        "&8Atomic number: 37",
        "&8Atomic mass: 85.468",
        "&aElement group: alkalines"
);
public static final SlimefunItemStack CAESIUM = new SlimefunItemStack(
        "EM_CAESIUM",
        new ItemStack(Material.ORANGE_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#F3A33B:#FF953E>Caesium</gradient>")),
        "&8Symbol: Cs",
        "&8Atomic number: 55",
        "&8Atomic mass: 132.905",
        "&aElement group: alkalines"
);
public static final SlimefunItemStack FRANCIUM = new SlimefunItemStack(
        "EM_FRANCIUM",
        new ItemStack(Material.ORANGE_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#F3A33B:#FF953E>Francium</gradient>")),
        "&8Symbol: Fr",
        "&8Atomic number: 87",
        "&8Atomic mass: [223]",
        "&aElement group: alkalines"
);

//elements/halogens
public static final SlimefunItemStack FLUORINE = new SlimefunItemStack(
        "EM_FLUORINE",
        new ItemStack(Material.CYAN_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#EEFF00:#97FFE5>Fluorine</gradient>")),
        "&8Symbol: F",
        "&8Atomic number: 9",
        "&8Atomic mass: 19.998",
        "&aElement group: halogens"
);
public static final SlimefunItemStack CHLORINE = new SlimefunItemStack(
        "EM_CHANGE",
        new ItemStack(Material.CYAN_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#EEFF00:#97FFE5>Chlorine</gradient>")),
        "&8Symbol: Cl",
        "&8Atomic number: 17",
        "&8Atomic mass: 35.453",
        "&aElement group: halogens"
);
public static final SlimefunItemStack BROMINE = new SlimefunItemStack(
        "EM_BROMINE",
        new ItemStack(Material.CYAN_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#EEFF00:#97FFE5>Bromine</gradient>")),
        "&8Symbol: Br",
        "&8Atomic number: 35",
        "&8Atomic mass: 79.904",
        "&aElement group: halogens"
);
public static final SlimefunItemStack IODINE = new SlimefunItemStack(
        "EM_IODINE",
        new ItemStack(Material.CYAN_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#EEFF00:#97FFE5>Iodine</gradient>")),
        "&8Symbol: I",
        "&8Atomic number: 53",
        "&8Atomic mass: 126.904 47",
        "&aElement group: halogens"
);
public static final SlimefunItemStack ASTATINE = new SlimefunItemStack(
        "EM_ASTATINE",
        new ItemStack(Material.CYAN_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#EEFF00:#97FFE5>Astatine</gradient>")),
        "&8Symbol: At",
        "&8Atomic number: 85",
        "&8Atomic mass: [210]",
        "&aElement group: halogens"
);
public static final SlimefunItemStack TENNESSINE = new SlimefunItemStack(
        "EM_TENNESSINE",
        new ItemStack(Material.CYAN_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#EEFF00:#97FFE5>Tennessine</gradient>")),
        "&8Symbol: Ts",
        "&8Atomic number: 117",
        "&8Atomic mass: [294]",
        "&aElement group: halogens"
);

//elements/alkaline-earths
public static final SlimefunItemStack BERYLLIUM = new SlimefunItemStack(
        "EM_BERYLLIUM",
        new ItemStack(Material.YELLOW_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#EDE342:#BBB816>Beryllium</gradient>")),
        "&8Symbol: Be",
        "&8Atomic number: 4",
        "&8Atomic mass: 9.012",
        "&aElement group: Alkaline earth metals"
);
public static final SlimefunItemStack MAGNESIUM = new SlimefunItemStack(
        "EM_MAGNESIUM",
        new ItemStack(Material.YELLOW_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#EDE342:#BBB816>Magnesium</gradient>")),
        "&8Symbol: Mg",
        "&8Atomic number: 12",
        "&8Atomic mass: 24.305",
        "&aElement group: Alkaline earth metals"
);
public static final SlimefunItemStack CALCIUM = new SlimefunItemStack(
        "EM_CALCIUM",
        new ItemStack(Material.YELLOW_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#EDE342:#BBB816>Calcium</gradient>")),
        "&8Symbol: Ca",
        "&8Atomic number: 20",
        "&8Atomic mass: 40.078",
        "&aElement group: Alkaline earth metals"
);
public static final SlimefunItemStack STRONTIUM = new SlimefunItemStack(
        "EM_STRONTIUM",
        new ItemStack(Material.YELLOW_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#EDE342:#BBB816>Strontium</gradient>")),
        "&8Symbol: Sr",
        "&8Atomic number: 38",
        "&8Atomic mass: 87.62",
        "&aElement group: Alkaline earth metals"
);
public static final SlimefunItemStack BARIUM = new SlimefunItemStack(
        "EM_BARIUM",
        new ItemStack(Material.YELLOW_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#EDE342:#BBB816>Barium</gradient>")),
        "&8Symbol: Ba",
        "&8Atomic number: 56",
        "&8Atomic mass: 137.327",
        "&aElement group: Alkaline earth metals"
);
public static final SlimefunItemStack RADIUM = new SlimefunItemStack(
        "EM_RADIUM",
        new ItemStack(Material.YELLOW_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#EDE342:#BBB816>Radium</gradient>")),
        "&8Symbol: Ra",
        "&8Atomic number: 88",
        "&8Atomic mass: [226]",
        "&aElement group: Alkaline earth metals"
);
//elements/semi-metals
public static final SlimefunItemStack BORON = new SlimefunItemStack(
        "EM_BORON",
        new ItemStack(Material.LIGHT_BLUE_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#8B8B8B:#6E6E6E>Boron</gradient>")),
        "&8Symbol: B",
        "&8Atomic number: 5",
        "&8Atomic mass: 10.811",
        "&aElement group: Semi-metals"
);
public static final SlimefunItemStack SILICON = new SlimefunItemStack(
        "EM_SILICON",
        new ItemStack(Material.LIGHT_BLUE_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#8B8B8B:#6E6E6E>Silicon</gradient>")),
        "&8Symbol: Si",
        "&8Atomic number: 14",
        "&8Atomic mass: 28.086",
        "&aElement group: Semi-metals"
);
public static final SlimefunItemStack GERMANIUM = new SlimefunItemStack(
        "EM_GERMANIUM",
        new ItemStack(Material.LIGHT_BLUE_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#8B8B8B:#6E6E6E>Germanium</gradient>")),
        "&8Symbol: Ge",
        "&8Atomic number: 32",
        "&8Atomic mass: 72.64",
        "&aElement group: Semi-metals"
);
public static final SlimefunItemStack ARSENIC = new SlimefunItemStack(
        "EM_ARSENIC",
        new ItemStack(Material.LIGHT_BLUE_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#8B8B8B:#6E6E6E>Arsenic</gradient>")),
        "&8Symbol: As",
        "&8Atomic number: 33",
        "&8Atomic mass: 74.922",
        "&aElement group: Semi-metals"
);
public static final SlimefunItemStack ANTIMONY = new SlimefunItemStack(
        "EM_ANTIMONY",
        new ItemStack(Material.LIGHT_BLUE_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#8B8B8B:#6E6E6E>Antimony</gradient>")),
        "&8Symbol: Sb",
        "&8Atomic number: 51",
        "&8Atomic mass: 121.76",
        "&aElement group: Semi-metals"
);
public static final SlimefunItemStack TELURIUM = new SlimefunItemStack(
        "EM_TELURIUM",
        new ItemStack(Material.LIGHT_BLUE_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#8B8B8B:#6E6E6E>Telurium</gradient>")),
        "&8Symbol: Te",
        "&8Atomic number: 52",
        "&8Atomic mass: 127.6",
        "&aElement group: Semi-metals"
);
public static final SlimefunItemStack POLONIUM = new SlimefunItemStack(
        "EM_POLONIUM",
        new ItemStack(Material.LIGHT_BLUE_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#8B8B8B:#6E6E6E>Polonium</gradient>")),
        "&8Symbol: Po",
        "&8Atomic number: 84",
        "&8Atomic mass: [210]",
        "&aElement group: Semi-metals"
);
    //elements/others
    public static final SlimefunItemStack ALUMINUM = new SlimefunItemStack(
            "EM_ALUMINUM",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>Aluminum</gradient>")),
            "&8Symbol: Al",
            "&8Atomic number: 13",
            "&8Atomic mass: 26.982",
            "&aElement group: Other-metals"
    );
public static final SlimefunItemStack GALLIUM = new SlimefunItemStack(
        "EM_GALLIUM",
        new ItemStack(Material.GRAY_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#8B8B8B:#6E6E6E>Gallium</gradient>")),
        "&8Symbol: Ga",
        "&8Atomic number: 31",
        "&8Atomic mass: 69.723",
        "&aElement group: Other-metals"
);
public static final SlimefunItemStack INDIUM = new SlimefunItemStack(
        "EM_INDIUM",
        new ItemStack(Material.GRAY_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#8B8B8B:#6E6E6E>Indium</gradient>")),
        "&8Symbol: Indium",
        "&8Atomic number: 49",
        "&8Atomic mass: 114.818",
        "&aElement group: Other-metals"
);
public static final SlimefunItemStack THALLIUM = new SlimefunItemStack(
        "EM_THALLIUM",
        new ItemStack(Material.GRAY_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#8B8B8B:#6E6E6E>Thallium</gradient>")),
        "&8Symbol: Tl",
        "&8Atomic number: 81",
        "&8Atomic mass: 204.383",
        "&aElement group: Other-metals"
);
public static final SlimefunItemStack NIHONIUM = new SlimefunItemStack(
        "EM_NIHONIIUM",
        new ItemStack(Material.GRAY_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#8B8B8B:#6E6E6E>Nihonium</gradient>")),
        "&8Symbol: Nh",
        "&8Atomic number: 113",
        "&8Atomic mass: [286]",
        "&aElement group: Other-metals"
);
public static final SlimefunItemStack TIN = new SlimefunItemStack(
        "EM_TIN",
        new ItemStack(Material.GRAY_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#8B8B8B:#6E6E6E>Tin</gradient>")),
        "&8Symbol: Sn",
        "&8Atomic number: 50",
        "&8Atomic mass: 118.71",
        "&aElement group: Other-metals"
);
public static final SlimefunItemStack LEAD = new SlimefunItemStack(
        "EM_LEAD",
        new ItemStack(Material.GRAY_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#8B8B8B:#6E6E6E>Lead</gradient>")),
        "&8Symbol: Pb",
        "&8Atomic number: 82",
        "&8Atomic mass: 207.2",
        "&aElement group: Other-metals"
);
public static final SlimefunItemStack FLEROVIUM= new SlimefunItemStack(
        "EM_FLEROVIUM",
        new ItemStack(Material.GRAY_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#8B8B8B:#6E6E6E>Flerovium</gradient>")),
        "&8Symbol: Fl",
        "&8Atomic number: 114",
        "&8Atomic mass: [289]",
        "&aElement group: Other-metals"
);
public static final SlimefunItemStack BISMUTH = new SlimefunItemStack(
        "EM_BISMUTH",
        new ItemStack(Material.GRAY_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#8B8B8B:#6E6E6E>Bismuth</gradient>")),
        "&8Symbol: Bi",
        "&8Atomic number: 83",
        "&8Atomic mass: 208.98",
        "&aElement group: Other-metals"
);
public static final SlimefunItemStack MOSCOVIUM = new SlimefunItemStack(
        "EM_MOSCOVIUM",
        new ItemStack(Material.GRAY_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#8B8B8B:#6E6E6E>Moscovium</gradient>")),
        "&8Symbol: Mc",
        "&8Atomic number: 115",
        "&8Atomic mass: [288]",
        "&aElement group: Other-metals"
);
public static final SlimefunItemStack LIVERMORIUM = new SlimefunItemStack(
        "EM_LIVERMORIUM",
        new ItemStack(Material.GRAY_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#8B8B8B:#6E6E6E:>Livermorium</gradient>")),
        "&8Symbol: Lv",
        "&8Atomic number: 116",
        "&8Atomic mass: [293]]",
        "&aElement group: Other-metals"
);

//elements/transition metals
public static final SlimefunItemStack SCANDIUM = new SlimefunItemStack(
        "EM_SCANDIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Scandium</gradient>")),
        "&8Symbol: Sc",
        "&8Atomic number: 21",
        "&8Atomic mass: 44.956",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack VANADIUM = new SlimefunItemStack(
        "EM_VANADIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Vanadium</gradient>")),
        "&8Symbol: V",
        "&8Atomic number: 23",
        "&8Atomic mass: 50.942",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack CHROMIUM = new SlimefunItemStack(
        "EM_CHROMIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Chromium</gradient>")),
        "&8Symbol: Cr",
        "&8Atomic number: 24",
        "&8Atomic mass: 51.996",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack MANGANESE = new SlimefunItemStack(
        "EM_MANGANESE",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Manganese</gradient>")),
        "&8Symbol: Mn",
        "&8Atomic number: 25",
        "&8Atomic mass: 54.938",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack IRON = new SlimefunItemStack(
        "EM_IRON",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Iron</gradient>")),
        "&8Symbol: Fe",
        "&8Atomic number: 26",
        "&8Atomic mass: 55.845",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack COBALT = new SlimefunItemStack(
        "EM_COBALT",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Cobalt</gradient>")),
        "&8Symbol: Co",
        "&8Atomic number: 27",
        "&8Atomic mass: 58.933",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack NICKEL = new SlimefunItemStack(
        "EM_NICKEL",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Nickel</gradient>")),
        "&8Symbol: Ni",
        "&8Atomic number: 28",
        "&8Atomic mass: 58.693",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack COPPER = new SlimefunItemStack(
        "EM_COPPER",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Copper</gradient>")),
        "&8Symbol: Cu",
        "&8Atomic number: 29",
        "&8Atomic mass: 63.546",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack ZINC = new SlimefunItemStack(
        "EM_ZINC",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Zinc</gradient>")),
        "&8Symbol: Zn",
        "&8Atomic number: 30",
        "&8Atomic mass: 65.409",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack YTTRIUM = new SlimefunItemStack(
        "EM_YTTRIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Yttrium</gradient>")),
        "&8Symbol: Y",
        "&8Atomic number: 39",
        "&8Atomic mass: 88.906",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack ZIRCONIUM = new SlimefunItemStack(
        "EM_ZIRCONIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Zirconium</gradient>")),
        "&8Symbol: Zr",
        "&8Atomic number: 40",
        "&8Atomic mass: 91.224",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack NIOBIUM = new SlimefunItemStack(
        "EM_NIOBIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Niobium</gradient>")),
        "&8Symbol: Nb",
        "&8Atomic number: 41",
        "&8Atomic mass: 92.906",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack MOLYBDENIUM = new SlimefunItemStack(
        "EM_MOLYBDENIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Molybdenium</gradient>")),
        "&8Symbol: Mo",
        "&8Atomic number: 42",
        "&8Atomic mass: 95.94",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack TECHTENIUM = new SlimefunItemStack(
        "EM_TECHTENIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Techtenium</gradient>")),
        "&8Symbol: Tc",
        "&8Atomic number: 43",
        "&8Atomic mass: [98]",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack RHUTENIUM = new SlimefunItemStack(
        "EM_RHUTENIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Rhutenium</gradient>")),
        "&8Symbol: Ru",
        "&8Atomic number: 44",
        "&8Atomic mass: 101.07",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack RHODIUM = new SlimefunItemStack(
        "EM_RHODIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Rhodium</gradient>")),
        "&8Symbol: Rh",
        "&8Atomic number: 45",
        "&8Atomic mass: 102.905 50",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack PALADIUM = new SlimefunItemStack(
        "EM_PALADIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Paladium</gradient>")),
        "&8Symbol: Pd",
        "&8Atomic number: 46",
        "&8Atomic mass: 106.42",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack SILVER = new SlimefunItemStack(
        "EM_SILVER",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Silver</gradient>")),
        "&8Symbol: Ag",
        "&8Atomic number: 47",
        "&8Atomic mass: 107.868",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack CADMIUM = new SlimefunItemStack(
        "EM_CADMIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Cadmium</gradient>")),
        "&8Symbol: Cd",
        "&8Atomic number: 48",
        "&8Atomic mass: 112.411",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack HAFNIUM = new SlimefunItemStack(
        "EM_HAFNIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Hafnium</gradient>")),
        "&8Symbol: Hf",
        "&8Atomic number: 72",
        "&8Atomic mass: 178.49",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack TANTALUM = new SlimefunItemStack(
        "EM_TANTALUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Tantalum</gradient>")),
        "&8Symbol: Ta",
        "&8Atomic number: 73",
        "&8Atomic mass: 180.948",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack TUNGSTEN = new SlimefunItemStack(
        "EM_TUNGSTEN",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Tungsten</gradient>")),
        "&8Symbol: W",
        "&8Atomic number: 74",
        "&8Atomic mass: 183.84",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack RHENIUM = new SlimefunItemStack(
        "EM_RHENIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Rhenium</gradient>")),
        "&8Symbol: Re",
        "&8Atomic number: 75",
        "&8Atomic mass: 186.207",
        "&aElement group: Transition-metals"
);

public static final SlimefunItemStack PLATINIUM = new SlimefunItemStack(
        "EM_PLATINUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Platinum</gradient>")),
        "&8Symbol: Pt",
        "&8Atomic number: 78",
        "&8Atomic mass: 195.084",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack GOLD = new SlimefunItemStack(
        "EM_GOLD",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Gold</gradient>")),
        "&8Symbol: Au",
        "&8Atomic number: 79",
        "&8Atomic mass: 196.967",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack MERCURY = new SlimefunItemStack(
        "EM_MERCURY",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Mercury</gradient>")),
        "&8Symbol: Hg",
        "&8Atomic number: 80",
        "&8Atomic mass: 200.59",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack RHUTERFORDIUM = new SlimefunItemStack(
        "EM_RHUTERFORDIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Rhuterfordium</gradient>")),
        "&8Symbol: Rf",
        "&8Atomic number: 104",
        "&8Atomic mass: 261",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack DUBNIUM = new SlimefunItemStack(
        "EM_DUBNIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Dubnium</gradient>")),
        "&8Symbol: Db",
        "&8Atomic number: 105",
        "&8Atomic mass: [262]",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack SEABORGIUM = new SlimefunItemStack(
        "EM_SEABORGIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Seaborgium</gradient>")),
        "&8Symbol: Sb",
        "&8Atomic number: 106",
        "&8Atomic mass: [266]",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack BOHRIUM = new SlimefunItemStack(
        "EM_BOHRIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Bohrium</gradient>")),
        "&8Symbol: Bh",
        "&8Atomic number: 107",
        "&8Atomic mass: [264]",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack HASSIUM = new SlimefunItemStack(
        "EM_HASSIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Hassium</gradient>")),
        "&8Symbol: Hs",
        "&8Atomic number: 108",
        "&8Atomic mass: [277]",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack MEITNERIUM = new SlimefunItemStack(
        "EM_MEITNERIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Meitnerium</gradient>")),
        "&8Symbol: Mt",
        "&8Atomic number: 109",
        "&8Atomic mass: [268]",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack DARMSTADTIUM = new SlimefunItemStack(
        "EM_DARMSTADTIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Darmstadtium</gradient>")),
        "&8Symbol: Ds",
        "&8Atomic number: 110",
        "&8Atomic mass: [271]",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack ROENTGENIUM = new SlimefunItemStack(
        "EM_ROENTGENIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Roentgenium</gradient>")),
        "&8Symbol: Rg",
        "&8Atomic number: 111",
        "&8Atomic mass: [272]",
        "&aElement group: Transition-metals"
);
public static final SlimefunItemStack COPERNICIUM = new SlimefunItemStack(
        "EM_COPERNICIUM",
        new ItemStack(Material.MAGENTA_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#f08080:#ffdab9:>Copernicium</gradient>")),
        "&8Symbol: Cn",
        "&8Atomic number: 112",
        "&8Atomic mass: [277]",
        "&aElement group: Transition-metals"
);
//elements/noble-gasses
public static final SlimefunItemStack HELIUM = new SlimefunItemStack(
        "EM_HELIUM",
        new ItemStack(Material.CYAN_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#0097B1:#51BFD89:>Helium</gradient>")),
        "&8Symbol: He",
        "&8Atomic number: 2",
        "&8Atomic mass: 4.008",
        "&aElement group: Noble-gasses"
);
public static final SlimefunItemStack NEON = new SlimefunItemStack(
        "EM_NEON",
        new ItemStack(Material.CYAN_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#0097B1:#51BFD89:>Neon</gradient>")),
        "&8Symbol: Ne",
        "&8Atomic number: 10",
        "&8Atomic mass: 20.18",
        "&aElement group: Noble-gasses"
);
public static final SlimefunItemStack ARGON = new SlimefunItemStack(
        "EM_ARGON",
        new ItemStack(Material.CYAN_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#0097B1:#51BFD89:>Argon</gradient>")),
        "&8Symbol: Ar",
        "&8Atomic number: 18",
        "&8Atomic mass: 39.948",
        "&aElement group: Noble-gasses"
);
public static final SlimefunItemStack KRYPTON = new SlimefunItemStack(
        "EM_KRYPTON",
        new ItemStack(Material.CYAN_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#0097B1:#51BFD89:>Krypton</gradient>")),
        "&8Symbol:  Kr",
        "&8Atomic number: 36",
        "&8Atomic mass: 83.798",
        "&aElement group: Noble-gasses"
);
public static final SlimefunItemStack XENON = new SlimefunItemStack(
        "EM_XENON",
        new ItemStack(Material.CYAN_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#0097B1:#51BFD89:>Xenon</gradient>")),
        "&8Symbol: Xe",
        "&8Atomic number: 54",
        "&8Atomic mass: 131.293",
        "&aElement group: Noble-gasses"
);
public static final SlimefunItemStack RADON= new SlimefunItemStack(
        "EM_RADON",
        new ItemStack(Material.CYAN_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#0097B1:#51BFD89:>Radon</gradient>")),
        "&8Symbol: Rn",
        "&8Atomic number: 86",
        "&8Atomic mass: [220]",
        "&aElement group: Noble-gasses"
);
public static final SlimefunItemStack OGANESSON = new SlimefunItemStack(
        "EM_OGANESSON",
        new ItemStack(Material.CYAN_DYE),
        BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                "<gradient:#0097B1:#51BFD89:>Oganesson</gradient>")),
        "&8Symbol: Og",
        "&8Atomic number: 110",
        "&8Atomic mass: [294]",
        "&aElement group: Noble-gasses"
);

public static void setup(ElementManipulation em){

            new EMElement(Categories.EMElements, OXYGEN, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, HYDROGEN, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, CARBON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, NITROGEN, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, PHOSPHORUS, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, SELENIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, SULFUR, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            //alkalines
            new EMElement(Categories.EMElements, LITHIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, SODIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, POTASSIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, RUBIDIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, CAESIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, FRANCIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            //halogens
            new EMElement(Categories.EMElements, FLUORINE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, CHLORINE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, BROMINE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, IODINE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, ASTATINE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, TENNESSINE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            //alkaline earths
            new EMElement(Categories.EMElements, BERYLLIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, MAGNESIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, STRONTIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, CALCIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, RADIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, BARIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            //semi-metals
            new EMElement(Categories.EMElements, BORON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, SILICON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, GERMANIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, ARSENIC, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, ANTIMONY, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, TELURIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, POLONIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);

            //others

            new EMElement(Categories.EMElements, ALUMINUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, GALLIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, INDIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, THALLIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, NIHONIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, TIN, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, LEAD, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, FLEROVIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, BISMUTH, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, MOSCOVIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, LIVERMORIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);

            //transition-metals

            new EMElement(Categories.EMElements, SILVER, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, COPPER, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, GOLD, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, SCANDIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, VANADIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, RHODIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, CHROMIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, MANGANESE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, IRON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, COBALT, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, NICKEL, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, ZINC, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, YTTRIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, NIOBIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, MOLYBDENIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, PALADIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, RHUTENIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, CADMIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, HAFNIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, TANTALUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, TUNGSTEN, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, RHENIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);


            new EMElement(Categories.EMElements, PLATINIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, MERCURY, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, RHUTERFORDIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, DUBNIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, SEABORGIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, BOHRIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, HASSIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, MEITNERIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, DARMSTADTIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, ROENTGENIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, COPERNICIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, ZIRCONIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, TECHTENIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            //noble gasses
            new EMElement(Categories.EMElements, HELIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, NEON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, ARGON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, KRYPTON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, XENON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, RADON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);
            new EMElement(Categories.EMElements, OGANESSON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                    {null,null,null,null,null,null,null,null,null}).register(em);

}
}

