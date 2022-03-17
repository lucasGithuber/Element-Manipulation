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
                    "<gradient:#8B8B8B:#6E6E6E:Livermorium</gradient>")),
            "&8Symbol: Lv",
            "&8Atomic number: 116",
            "&8Atomic mass: [293]]",
            "&aElement group: Other-metals"
    );

    //elements/transition metals
        public static final SlimefunItemStack EMCopper = new SlimefunItemStack("EM_COPPER", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Copper</gradient>")), "&8Not slimefun copper", "&7transition-metals");
        public static final SlimefunItemStack EMAu = new SlimefunItemStack("EM_AU", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Gold</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMScandium = new SlimefunItemStack("EM_SCANDIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Scandium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMSilver = new SlimefunItemStack("EM_SILVER", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Silver</gradient>")), "", "&7transition-metals");

        public static final SlimefunItemStack EMVanadium = new SlimefunItemStack("EM_VANADIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Vanadium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMChromium = new SlimefunItemStack("EM_CHROMIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Chromium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMManganese = new SlimefunItemStack("EM_MANGANESE", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Manganese</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMIron = new SlimefunItemStack("EM_IRON", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Iron</gradient>")), "&8Not slimefun iron", "&7transition-metals");
        public static final SlimefunItemStack EMCobalt = new SlimefunItemStack("EM_COBALT", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Cobalt</gradient>")), "&8Not Slimefun cobalt", "&7transition-metals");
        public static final SlimefunItemStack EMNickel = new SlimefunItemStack("EM_NICKEL", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Nickel</gradient>")), "&8Not Slimefun nickel", "&7transition-metals");
        public static final SlimefunItemStack EMZinc = new SlimefunItemStack("EM_ZINC", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Zinc</gradient>")), "&8Not Slimefun zinc", "&7transition-metals");
        public static final SlimefunItemStack EMYttrium = new SlimefunItemStack("EM_YTTRIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Yttrium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMZirconium = new SlimefunItemStack("EM_ZIRCONIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Zirconium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMNiobium = new SlimefunItemStack("EM_NIOBIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Niobium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMMolybdenum = new SlimefunItemStack("EM_MOLYBBDENUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Molybdenum</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMTechtenium = new SlimefunItemStack("EM_TECHTENIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Techtenium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMRuthenium = new SlimefunItemStack("EM_RUTHENIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Ruthenium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMRhodium = new SlimefunItemStack("EM_RHODIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Rhodium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMPalladium = new SlimefunItemStack("EM_PALLADIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Palladium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMCadmium = new SlimefunItemStack("EM_CADMIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Cadmium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMHafnium = new SlimefunItemStack("EM_HAFNIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Hafnium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMTantalum = new SlimefunItemStack("EM_TANTALUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Tantalum</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMTungsten = new SlimefunItemStack("EM_TUNGSTEN", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Tungsten</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMRhenium = new SlimefunItemStack("EM_RHENIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Rhenium</gradient>")), "", "&7transition-metals");




        public static final SlimefunItemStack EMPlatinum = new SlimefunItemStack("EM_PLATINUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Platinum</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMMercury = new SlimefunItemStack("EM_MERCURY", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Mercury</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMRutherfordium = new SlimefunItemStack("EM_RUTHERFORDIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Rutherfordium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMDubnium = new SlimefunItemStack("EM_DUBNIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Dubnium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMSeaborgium = new SlimefunItemStack("EM_SEABORGIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Seaborgium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMBohrium = new SlimefunItemStack("EM_BOHRIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Bohrium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMHassium = new SlimefunItemStack("EM_HASSIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Hassium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMMeitnerium = new SlimefunItemStack("EM_MEITNERIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Meitnerium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMDarmstadtium= new SlimefunItemStack("EM_DARMSTADTIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Darmstadtium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMRoentgenium = new SlimefunItemStack("EM_ROENTGENIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Roentgenium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMCopernicium = new SlimefunItemStack("EM_COPERNICIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.deserialize("<gradient:#f08080:#ffdab9>Copernicium</gradient>")), "", "&7transition-metals");


        //elements/noble-gasses

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

                new EMElement(Categories.EMElements, EMSilver, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMCopper, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMAu, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMScandium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMVanadium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMRhodium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMChromium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMManganese, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMIron, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMCobalt, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMNickel, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMZinc, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMYttrium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMNiobium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMMolybdenum, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMPalladium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMRuthenium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMCadmium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMHafnium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMTantalum, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMTungsten, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMRhenium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);


                new EMElement(Categories.EMElements, EMPlatinum, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMMercury, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMRutherfordium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMDubnium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMSeaborgium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMBohrium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMHassium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMMeitnerium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMDarmstadtium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMRoentgenium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMCopernicium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMZirconium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMTechtenium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                //noble gasses
        }
}

