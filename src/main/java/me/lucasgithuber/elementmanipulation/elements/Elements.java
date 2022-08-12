package me.lucasgithuber.elementmanipulation.elements;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import me.lucasgithuber.elementmanipulation.utils.RecipeTypes;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Elements {
    public static final String NON_METALS =  "&aElement group: non-metals";
    public static final String ALKALINES = "&aElement group: alkalines";
    public static final String HALOGENS = "&aElement group: halogens";
    public static final String ALKALINE_EARTH = "&aElement group: alkaline earth metals";
    public static final String SEMI_METALS = "&aElement group: semi metals";
    public static final String OTHER_METALS = "&aElement group: other metals";
    public static final String TRANSITION_METALS = "&aElement group: Transition metals";
    public static final String NOBLE_GASSES = "&aElement group: Noble gasses";
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
            NON_METALS);
    public static final SlimefunItemStack CARBON = new SlimefunItemStack(
            "EM_CARBON",
            new ItemStack(Material.LIME_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#38CA08:#25FF09>Carbon</gradient>")),
            "&8Symbol: C",
            "&8Atomic number: 6",
            "&8Atomic mass: 12.011",
            NON_METALS);
    public static final SlimefunItemStack NITROGEN = new SlimefunItemStack(
            "EM_NITROGEN",
            new ItemStack(Material.LIME_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#38CA08:#25FF09>Nitrogen</gradient>")),
            "&8Symbol: N",
            "&8Atomic number: 7",
            "&8Atomic mass: 14.007",
            NON_METALS,
            "&aRight click to \"un-breathe\" &7(Main hand only)"
    );
    public static final SlimefunItemStack OXYGEN = new SlimefunItemStack(
            "EM_OXYGEN",
            new ItemStack(Material.LIME_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#38CA08:#25FF09>Oxygen</gradient>")),
            "&8Symbol: O",
            "&8Atomic number: 8",
            "&8Atomic mass: 15.999",
            NON_METALS,
            "&aRight-click to breathe &7(Main hand only)");
    public static final SlimefunItemStack PHOSPHORUS = new SlimefunItemStack(
            "EM_PHOSPHORUS",
            new ItemStack(Material.LIME_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#38CA08:#25FF09>Phosphorus</gradient>")),
            "&8Symbol: P",
            "&8Atomic number: 15",
            "&8Atomic mass: 30.974",
            NON_METALS);
    public static final SlimefunItemStack SULFUR = new SlimefunItemStack(
            "SULFUR",
            new ItemStack(Material.LIME_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#38CA08:#25FF09>Sulfur</gradient>")),
            "&8Symbol: S",
            "&8Atomic number: 16",
            "&8Atomic mass: 32.065",
            NON_METALS);
    public static final SlimefunItemStack SELENIUM = new SlimefunItemStack(
            "EM_SELENIUM",
            new ItemStack(Material.LIME_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#38CA08:#25FF09>Selenium</gradient>")),
            "&8Symbol: Se",
            "&8Atomic number: 34",
            "&8Atomic mass: 78.96",
            NON_METALS);


    //elements/alkalines
    public static final SlimefunItemStack LITHIUM = new SlimefunItemStack(
            "EM_LITHIUM",
            new ItemStack(Material.ORANGE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#F3A33B:#FF953E>Lithium</gradient>")),
            "&8Symbol: Li",
            "&8Atomic number: 3",
            "&8Atomic mass: 6.941",
            ALKALINES
    );
    public static final SlimefunItemStack SODIUM = new SlimefunItemStack(
            "EM_SODIUM",
            new ItemStack(Material.ORANGE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#F3A33B:#FF953E>Sodium</gradient>")),
            "&8Symbol: Na",
            "&8Atomic number: 11",
            "&8Atomic mass: 22.990",
            ALKALINES
    );
    public static final SlimefunItemStack POTASSIUM = new SlimefunItemStack(
            "EM_POTASSIUM",
            new ItemStack(Material.ORANGE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#F3A33B:#FF953E>Potassium</gradient>")),
            "&8Symbol: K",
            "&8Atomic number: 19",
            "&8Atomic mass: 39.098",
            ALKALINES
    );
    public static final SlimefunItemStack RUBIDIUM = new SlimefunItemStack(
            "EM_RUBIDIUM",
            new ItemStack(Material.ORANGE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#F3A33B:#FF953E>Rubidium</gradient>")),
            "&8Symbol: Rb",
            "&8Atomic number: 37",
            "&8Atomic mass: 85.468",
            ALKALINES
    );
    public static final SlimefunItemStack CAESIUM = new SlimefunItemStack(
            "EM_CAESIUM",
            new ItemStack(Material.ORANGE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#F3A33B:#FF953E>Caesium</gradient>")),
            "&8Symbol: Cs",
            "&8Atomic number: 55",
            "&8Atomic mass: 132.905",
            ALKALINES
    );
    public static final SlimefunItemStack FRANCIUM = new SlimefunItemStack(
            "EM_FRANCIUM",
            new ItemStack(Material.ORANGE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#F3A33B:#FF953E>Francium</gradient>")),
            "&8Symbol: Fr",
            "&8Atomic number: 87",
            "&8Atomic mass: [223]",
            ALKALINES
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
            HALOGENS
    );
    public static final SlimefunItemStack CHLORINE = new SlimefunItemStack(
            "EM_CHANGE",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EEFF00:#97FFE5>Chlorine</gradient>")),
            "&8Symbol: Cl",
            "&8Atomic number: 17",
            "&8Atomic mass: 35.453",
            HALOGENS
    );
    public static final SlimefunItemStack BROMINE = new SlimefunItemStack(
            "EM_BROMINE",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EEFF00:#97FFE5>Bromine</gradient>")),
            "&8Symbol: Br",
            "&8Atomic number: 35",
            "&8Atomic mass: 79.904",
            HALOGENS
    );
    public static final SlimefunItemStack IODINE = new SlimefunItemStack(
            "EM_IODINE",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EEFF00:#97FFE5>Iodine</gradient>")),
            "&8Symbol: I",
            "&8Atomic number: 53",
            "&8Atomic mass: 126.904 47",
            HALOGENS
    );
    public static final SlimefunItemStack ASTATINE = new SlimefunItemStack(
            "EM_ASTATINE",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EEFF00:#97FFE5>Astatine</gradient>")),
            "&8Symbol: At",
            "&8Atomic number: 85",
            "&8Atomic mass: [210]",
            HALOGENS
    );
    public static final SlimefunItemStack TENNESSINE = new SlimefunItemStack(
            "EM_TENNESSINE",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EEFF00:#97FFE5>Tennessine</gradient>")),
            "&8Symbol: Ts",
            "&8Atomic number: 117",
            "&8Atomic mass: [294]",
            HALOGENS
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
            ALKALINE_EARTH
    );
    public static final SlimefunItemStack MAGNESIUM = new SlimefunItemStack(
            "EM_MAGNESIUM",
            new ItemStack(Material.YELLOW_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EDE342:#BBB816>Magnesium</gradient>")),
            "&8Symbol: Mg",
            "&8Atomic number: 12",
            "&8Atomic mass: 24.305",
            ALKALINE_EARTH
    );
    public static final SlimefunItemStack CALCIUM = new SlimefunItemStack(
            "EM_CALCIUM",
            new ItemStack(Material.YELLOW_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EDE342:#BBB816>Calcium</gradient>")),
            "&8Symbol: Ca",
            "&8Atomic number: 20",
            "&8Atomic mass: 40.078",
            ALKALINE_EARTH
    );
    public static final SlimefunItemStack STRONTIUM = new SlimefunItemStack(
            "EM_STRONTIUM",
            new ItemStack(Material.YELLOW_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EDE342:#BBB816>Strontium</gradient>")),
            "&8Symbol: Sr",
            "&8Atomic number: 38",
            "&8Atomic mass: 87.62",
            ALKALINE_EARTH
    );
    public static final SlimefunItemStack BARIUM = new SlimefunItemStack(
            "EM_BARIUM",
            new ItemStack(Material.YELLOW_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EDE342:#BBB816>Barium</gradient>")),
            "&8Symbol: Ba",
            "&8Atomic number: 56",
            "&8Atomic mass: 137.327",
            ALKALINE_EARTH
    );
    public static final SlimefunItemStack RADIUM = new SlimefunItemStack(
            "EM_RADIUM",
            new ItemStack(Material.YELLOW_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EDE342:#BBB816>Radium</gradient>")),
            "&8Symbol: Ra",
            "&8Atomic number: 88",
            "&8Atomic mass: [226]",
            ALKALINE_EARTH
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
            SEMI_METALS
    );
    public static final SlimefunItemStack SILICON = new SlimefunItemStack(
            "EM_SILICON",
            new ItemStack(Material.LIGHT_BLUE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>Silicon</gradient>")),
            "&8Symbol: Si",
            "&8Atomic number: 14",
            "&8Atomic mass: 28.086",
            SEMI_METALS
    );
    public static final SlimefunItemStack GERMANIUM = new SlimefunItemStack(
            "EM_GERMANIUM",
            new ItemStack(Material.LIGHT_BLUE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>Germanium</gradient>")),
            "&8Symbol: Ge",
            "&8Atomic number: 32",
            "&8Atomic mass: 72.64",
            SEMI_METALS
    );
    public static final SlimefunItemStack ARSENIC = new SlimefunItemStack(
            "EM_ARSENIC",
            new ItemStack(Material.LIGHT_BLUE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>Arsenic</gradient>")),
            "&8Symbol: As",
            "&8Atomic number: 33",
            "&8Atomic mass: 74.922",
            SEMI_METALS
    );
    public static final SlimefunItemStack ANTIMONY = new SlimefunItemStack(
            "EM_ANTIMONY",
            new ItemStack(Material.LIGHT_BLUE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>Antimony</gradient>")),
            "&8Symbol: Sb",
            "&8Atomic number: 51",
            "&8Atomic mass: 121.76",
            SEMI_METALS
    );
    public static final SlimefunItemStack TELLURIUM = new SlimefunItemStack(
            "EM_TELLURIUM",
            new ItemStack(Material.LIGHT_BLUE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>Tellurium</gradient>")),
            "&8Symbol: Te",
            "&8Atomic number: 52",
            "&8Atomic mass: 127.6",
            SEMI_METALS
    );
    public static final SlimefunItemStack POLONIUM = new SlimefunItemStack(
            "EM_POLONIUM",
            new ItemStack(Material.LIGHT_BLUE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>Polonium</gradient>")),
            "&8Symbol: Po",
            "&8Atomic number: 84",
            "&8Atomic mass: [210]",
            SEMI_METALS
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
            OTHER_METALS
    );
    public static final SlimefunItemStack GALLIUM = new SlimefunItemStack(
            "EM_GALLIUM",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>Gallium</gradient>")),
            "&8Symbol: Ga",
            "&8Atomic number: 31",
            "&8Atomic mass: 69.723",
            OTHER_METALS
    );
    public static final SlimefunItemStack INDIUM = new SlimefunItemStack(
            "EM_INDIUM",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>Indium</gradient>")),
            "&8Symbol: In",
            "&8Atomic number: 49",
            "&8Atomic mass: 114.818",
            OTHER_METALS
    );
    public static final SlimefunItemStack THALLIUM = new SlimefunItemStack(
            "EM_THALLIUM",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>Thallium</gradient>")),
            "&8Symbol: Tl",
            "&8Atomic number: 81",
            "&8Atomic mass: 204.383",
            OTHER_METALS
    );
    public static final SlimefunItemStack NIHONIUM = new SlimefunItemStack(
            "EM_NIHONIUM",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>Nihonium</gradient>")),
            "&8Symbol: Nh",
            "&8Atomic number: 113",
            "&8Atomic mass: [286]",
            OTHER_METALS
    );
    public static final SlimefunItemStack TIN = new SlimefunItemStack(
            "EM_TIN",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>Tin</gradient>")),
            "&8Symbol: Sn",
            "&8Atomic number: 50",
            "&8Atomic mass: 118.71",
            OTHER_METALS
    );
    public static final SlimefunItemStack LEAD = new SlimefunItemStack(
            "EM_LEAD",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>Lead</gradient>")),
            "&8Symbol: Pb",
            "&8Atomic number: 82",
            "&8Atomic mass: 207.2",
            OTHER_METALS
    );
    public static final SlimefunItemStack FLEROVIUM = new SlimefunItemStack(
            "EM_FLEROVIUM",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>Flerovium</gradient>")),
            "&8Symbol: Fl",
            "&8Atomic number: 114",
            "&8Atomic mass: [289]",
            OTHER_METALS
    );
    public static final SlimefunItemStack BISMUTH = new SlimefunItemStack(
            "EM_BISMUTH",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>Bismuth</gradient>")),
            "&8Symbol: Bi",
            "&8Atomic number: 83",
            "&8Atomic mass: 208.98",
            OTHER_METALS
    );
     static {
        ItemMeta meta = BISMUTH.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        BISMUTH.setItemMeta(meta);
        BISMUTH.addUnsafeEnchantment(Enchantment.LUCK, 1);
    }
    public static final SlimefunItemStack MOSCOVIUM = new SlimefunItemStack(
            "EM_MOSCOVIUM",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>Moscovium</gradient>")),
            "&8Symbol: Mc",
            "&8Atomic number: 115",
            "&8Atomic mass: [288]",
            OTHER_METALS
    );
    public static final SlimefunItemStack LIVERMORIUM = new SlimefunItemStack(
            "EM_LIVERMORIUM",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>Livermorium</gradient>")),
            "&8Symbol: Lv",
            "&8Atomic number: 116",
            "&8Atomic mass: [293]",
            OTHER_METALS
    );

    //elements/transition metals
    public static final SlimefunItemStack SCANDIUM = new SlimefunItemStack(
            "EM_SCANDIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Scandium</gradient>")),
            "&8Symbol: Sc",
            "&8Atomic number: 21",
            "&8Atomic mass: 44.956",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack VANADIUM = new SlimefunItemStack(
            "EM_VANADIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Vanadium</gradient>")),
            "&8Symbol: V",
            "&8Atomic number: 23",
            "&8Atomic mass: 50.942",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack CHROMIUM = new SlimefunItemStack(
            "EM_CHROMIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Chromium</gradient>")),
            "&8Symbol: Cr",
            "&8Atomic number: 24",
            "&8Atomic mass: 51.996",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack MANGANESE = new SlimefunItemStack(
            "EM_MANGANESE",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Manganese</gradient>")),
            "&8Symbol: Mn",
            "&8Atomic number: 25",
            "&8Atomic mass: 54.938",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack IRON = new SlimefunItemStack(
            "EM_IRON",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Iron</gradient>")),
            "&8Symbol: Fe",
            "&8Atomic number: 26",
            "&8Atomic mass: 55.845",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack COBALT = new SlimefunItemStack(
            "EM_COBALT",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Cobalt</gradient>")),
            "&8Symbol: Co",
            "&8Atomic number: 27",
            "&8Atomic mass: 58.933",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack NICKEL = new SlimefunItemStack(
            "EM_NICKEL",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Nickel</gradient>")),
            "&8Symbol: Ni",
            "&8Atomic number: 28",
            "&8Atomic mass: 58.693",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack COPPER = new SlimefunItemStack(
            "EM_COPPER",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Copper</gradient>")),
            "&8Symbol: Cu",
            "&8Atomic number: 29",
            "&8Atomic mass: 63.546",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack ZINC = new SlimefunItemStack(
            "EM_ZINC",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Zinc</gradient>")),
            "&8Symbol: Zn",
            "&8Atomic number: 30",
            "&8Atomic mass: 65.409",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack YTTRIUM = new SlimefunItemStack(
            "EM_YTTRIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Yttrium</gradient>")),
            "&8Symbol: Y",
            "&8Atomic number: 39",
            "&8Atomic mass: 88.906",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack ZIRCONIUM = new SlimefunItemStack(
            "EM_ZIRCONIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Zirconium</gradient>")),
            "&8Symbol: Zr",
            "&8Atomic number: 40",
            "&8Atomic mass: 91.224",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack NIOBIUM = new SlimefunItemStack(
            "EM_NIOBIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Niobium</gradient>")),
            "&8Symbol: Nb",
            "&8Atomic number: 41",
            "&8Atomic mass: 92.906",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack MOLYBDENUM = new SlimefunItemStack(
            "EM_MOLYBDENUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Molybdenum</gradient>")),
            "&8Symbol: Mo",
            "&8Atomic number: 42",
            "&8Atomic mass: 95.94",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack TECHNETIUM = new SlimefunItemStack(
            "EM_TECHNETIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Technetium</gradient>")),
            "&8Symbol: Tc",
            "&8Atomic number: 43",
            "&8Atomic mass: [98]",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack RUTHENIUM = new SlimefunItemStack(
            "EM_RUTHENIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Ruthenium</gradient>")),
            "&8Symbol: Ru",
            "&8Atomic number: 44",
            "&8Atomic mass: 101.07",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack RHODIUM = new SlimefunItemStack(
            "EM_RHODIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Rhodium</gradient>")),
            "&8Symbol: Rh",
            "&8Atomic number: 45",
            "&8Atomic mass: 102.905 50",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack PALLADIUM = new SlimefunItemStack(
            "EM_PALLADIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Palladium</gradient>")),
            "&8Symbol: Pd",
            "&8Atomic number: 46",
            "&8Atomic mass: 106.42",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack SILVER = new SlimefunItemStack(
            "EM_SILVER",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Silver</gradient>")),
            "&8Symbol: Ag",
            "&8Atomic number: 47",
            "&8Atomic mass: 107.868",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack CADMIUM = new SlimefunItemStack(
            "EM_CADMIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Cadmium</gradient>")),
            "&8Symbol: Cd",
            "&8Atomic number: 48",
            "&8Atomic mass: 112.411",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack HAFNIUM = new SlimefunItemStack(
            "EM_HAFNIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Hafnium</gradient>")),
            "&8Symbol: Hf",
            "&8Atomic number: 72",
            "&8Atomic mass: 178.49",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack TANTALUM = new SlimefunItemStack(
            "EM_TANTALUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Tantalum</gradient>")),
            "&8Symbol: Ta",
            "&8Atomic number: 73",
            "&8Atomic mass: 180.948",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack TUNGSTEN = new SlimefunItemStack(
            "EM_TUNGSTEN",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Tungsten</gradient>")),
            "&8Symbol: W",
            "&8Atomic number: 74",
            "&8Atomic mass: 183.84",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack RHENIUM = new SlimefunItemStack(
            "EM_RHENIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Rhenium</gradient>")),
            "&8Symbol: Re",
            "&8Atomic number: 75",
            "&8Atomic mass: 186.207",
            TRANSITION_METALS
    );

    public static final SlimefunItemStack PLATINUM = new SlimefunItemStack(
            "EM_PLATINUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Platinum</gradient>")),
            "&8Symbol: Pt",
            "&8Atomic number: 78",
            "&8Atomic mass: 195.084",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack GOLD = new SlimefunItemStack(
            "EM_GOLD",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Gold</gradient>")),
            "&8Symbol: Au",
            "&8Atomic number: 79",
            "&8Atomic mass: 196.967",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack MERCURY = new SlimefunItemStack(
            "EM_MERCURY",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Mercury</gradient>")),
            "&8Symbol: Hg",
            "&8Atomic number: 80",
            "&8Atomic mass: 200.59",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack RUTHERFORDIUM = new SlimefunItemStack(
            "EM_RUTHERFORDIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
            "<gradient:#f08080:#ffdab9>Rutherfordium</gradient>")),
            "&8Symbol: Rf",
            "&8Atomic number: 104",
            "&8Atomic mass: 261",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack DUBNIUM = new SlimefunItemStack(
            "EM_DUBNIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Dubnium</gradient>")),
            "&8Symbol: Db",
            "&8Atomic number: 105",
            "&8Atomic mass: [262]",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack SEABORGIUM = new SlimefunItemStack(
            "EM_SEABORGIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Seaborgium</gradient>")),
            "&8Symbol: Sg",
            "&8Atomic number: 106",
            "&8Atomic mass: [266]",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack BOHRIUM = new SlimefunItemStack(
            "EM_BOHRIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Bohrium</gradient>")),
            "&8Symbol: Bh",
            "&8Atomic number: 107",
            "&8Atomic mass: [264]",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack HASSIUM = new SlimefunItemStack(
            "EM_HASSIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Hassium</gradient>")),
            "&8Symbol: Hs",
            "&8Atomic number: 108",
            "&8Atomic mass: [277]",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack MEITNERIUM = new SlimefunItemStack(
            "EM_MEITNERIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Meitnerium</gradient>")),
            "&8Symbol: Mt",
            "&8Atomic number: 109",
            "&8Atomic mass: [268]",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack DARMSTADTIUM = new SlimefunItemStack(
            "EM_DARMSTADTIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Darmstadtium</gradient>")),
            "&8Symbol: Ds",
            "&8Atomic number: 110",
            "&8Atomic mass: [271]",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack ROENTGENIUM = new SlimefunItemStack(
            "EM_ROENTGENIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Roentgenium</gradient>")),
            "&8Symbol: Rg",
            "&8Atomic number: 111",
            "&8Atomic mass: [272]",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack COPERNICIUM = new SlimefunItemStack(
            "EM_COPERNICIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>Copernicium</gradient>")),
            "&8Symbol: Cn",
            "&8Atomic number: 112",
            "&8Atomic mass: [277]",
            TRANSITION_METALS
    );
    //elements/noble-gasses
    public static final SlimefunItemStack HELIUM = new SlimefunItemStack(
            "EM_HELIUM",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#0097B1:#51BFD89>Helium</gradient>")),
            "&8Symbol: He",
            "&8Atomic number: 2",
            "&8Atomic mass: 4.008",
            NOBLE_GASSES,
            "&aRight-click to levitate &7(Main hand only)"
    );
    public static final SlimefunItemStack NEON = new SlimefunItemStack(
            "EM_NEON",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#0097B1:#51BFD89>Neon</gradient>")),
            "&8Symbol: Ne",
            "&8Atomic number: 10",
            "&8Atomic mass: 20.18",
            NOBLE_GASSES,
            "&aRight-click in a sign to make it glow &7(Main hand only)"
    );
    public static final SlimefunItemStack ARGON = new SlimefunItemStack(
            "EM_ARGON",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#0097B1:#51BFD89>Argon</gradient>")),
            "&8Symbol: Ar",
            "&8Atomic number: 18",
            "&8Atomic mass: 39.948",
            NOBLE_GASSES
    );
    public static final SlimefunItemStack KRYPTON = new SlimefunItemStack(
            "EM_KRYPTON",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#0097B1:#51BFD89>Krypton</gradient>")),
            "&8Symbol:  Kr",
            "&8Atomic number: 36",
            "&8Atomic mass: 83.798",
            NOBLE_GASSES
    );
    public static final SlimefunItemStack XENON = new SlimefunItemStack(
            "EM_XENON",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#0097B1:#51BFD89>Xenon</gradient>")),
            "&8Symbol: Xe",
            "&8Atomic number: 54",
            "&8Atomic mass: 131.293",
            NOBLE_GASSES
    );
    public static final SlimefunItemStack RADON = new SlimefunItemStack(
            "EM_RADON",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#0097B1:#51BFD89>Radon</gradient>")),
            "&8Symbol: Rn",
            "&8Atomic number: 86",
            "&8Atomic mass: [220]",
            NOBLE_GASSES,
            "&aDo not breathe &7(Main hand only)"
    );
    public static final SlimefunItemStack OGANESSON = new SlimefunItemStack(
            "EM_OGANESSON",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#0097B1:#51BFD89>Oganesson</gradient>")),
            "&8Symbol: Og",
            "&8Atomic number: 118",
            "&8Atomic mass: [294]",
            NOBLE_GASSES
    );

    public static void setup(ElementManipulation em) {

        new Oxygen(Categories.ELEMENTS, OXYGEN, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, HYDROGEN, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, CARBON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new Nitrogen(Categories.ELEMENTS, NITROGEN, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, PHOSPHORUS, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, SELENIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, SULFUR, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        //alkalines
        new ChemicalElements(Categories.ELEMENTS, LITHIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, SODIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, POTASSIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, RUBIDIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new RadioactiveElement(Categories.ELEMENTS, Radioactivity.MODERATE, CAESIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, FRANCIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        //halogens
        new ChemicalElements(Categories.ELEMENTS, FLUORINE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, CHLORINE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, BROMINE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, IODINE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, ASTATINE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, TENNESSINE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        //alkaline earths
        new ChemicalElements(Categories.ELEMENTS, BERYLLIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, MAGNESIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, STRONTIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, CALCIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, RADIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, BARIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        //semi-metals
        new ChemicalElements(Categories.ELEMENTS, BORON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, SILICON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, GERMANIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, ARSENIC, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, ANTIMONY, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, TELLURIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, POLONIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);

        //others

        new ChemicalElements(Categories.ELEMENTS, ALUMINUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, GALLIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, INDIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, THALLIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, NIHONIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, TIN, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, LEAD, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, FLEROVIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, BISMUTH, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, MOSCOVIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, LIVERMORIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);

        //transition-metals

        new ChemicalElements(Categories.ELEMENTS, SILVER, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, COPPER, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, GOLD, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, SCANDIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, VANADIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, RHODIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, CHROMIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, MANGANESE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, IRON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, COBALT, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, NICKEL, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, ZINC, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, YTTRIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, NIOBIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, MOLYBDENUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, PALLADIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, RUTHENIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, CADMIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, HAFNIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, TANTALUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, TUNGSTEN, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, RHENIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);


        new ChemicalElements(Categories.ELEMENTS, PLATINUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, MERCURY, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, RUTHERFORDIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, DUBNIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, SEABORGIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, BOHRIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, HASSIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, MEITNERIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, DARMSTADTIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, ROENTGENIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, COPERNICIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, ZIRCONIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, TECHNETIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        //noble gasses
        new Helium(Categories.ELEMENTS, HELIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new Neon(Categories.ELEMENTS, NEON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, ARGON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, KRYPTON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, XENON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new Radon(Categories.ELEMENTS, RADON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, OGANESSON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
    }
}

