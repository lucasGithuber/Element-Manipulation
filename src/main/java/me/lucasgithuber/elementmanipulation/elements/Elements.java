package me.lucasgithuber.elementmanipulation.elements;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import me.lucasgithuber.elementmanipulation.utils.RecipeTypes;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.Configuration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import static org.bukkit.Bukkit.getServer;

public class Elements {

        private static final Configuration cfg = ElementManipulation.i().getConfig();
        //elements
        //non-metals
        public static final SlimefunItemStack EMHydrogen = new SlimefunItemStack("EM_HYDROGEN", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Hydrogen</gradient>")), "&aFish like it", "&anon-metal");


        public static final SlimefunItemStack EMOxygen = new SlimefunItemStack("EM_OXYGEN", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Oxygen</gradient>")), "&aEssential for humans", "&anon-metal");


        public static final SlimefunItemStack EMCarbon = new SlimefunItemStack("EM_CARBON", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Carbon</gradient>")), "&8Not slimefun carbon", "&anon-metal");


        public static final SlimefunItemStack EMNitrogen = new SlimefunItemStack("EM_NITROGEN", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Nitrogen</gradient>")), "&3DRIP", "&anon-metal");


        public static final SlimefunItemStack EMPhosphorus = new SlimefunItemStack("EM_PHOSPHORUS", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Phosphorus</gradient>")), "", "&anon-metal");


        public static final SlimefunItemStack EMSulfur = new SlimefunItemStack("EM_SULFUR", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Sulfur</gradient>")), "&8Not slimefun sulfur", "non-metal");


        public static final SlimefunItemStack EMSelenium = new SlimefunItemStack("EM_SELENIUM", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>Selenium</gradient>")), "", "&anon-metal");


        //elements/alkalines
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


        //elements/halogens

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
        public static final SlimefunItemStack EMAu = new SlimefunItemStack("EM_AU", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Gold</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMScandium = new SlimefunItemStack("EM_SCANDIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Scandium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMSilver = new SlimefunItemStack("EM_SILVER", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Silver</gradient>")), "", "&7transition-metals");


                public static final SlimefunItemStack EMTitanium = new SlimefunItemStack("EM_TITANIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                        (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Titanium</gradient>")), "", "&7transition-metals");

        public static final SlimefunItemStack EMVanadium = new SlimefunItemStack("EM_VANADIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Vanadium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMChromium = new SlimefunItemStack("EM_CHROMIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Chromium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMManganese = new SlimefunItemStack("EM_MANGANESE", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Manganese</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMIron = new SlimefunItemStack("EM_IRON", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Iron</gradient>")), "&8Not slimefun iron", "&7transition-metals");
        public static final SlimefunItemStack EMCobalt = new SlimefunItemStack("EM_COBALT", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Cobalt</gradient>")), "&8Not Slimefun cobalt", "&7transition-metals");
        public static final SlimefunItemStack EMNickel = new SlimefunItemStack("EM_NICKEL", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Nickel</gradient>")), "&8Not Slimefun nickel", "&7transition-metals");
        public static final SlimefunItemStack EMZinc = new SlimefunItemStack("EM_ZINC", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Zinc</gradient>")), "&8Not Slimefun zinc", "&7transition-metals");
        public static final SlimefunItemStack EMYttrium = new SlimefunItemStack("EM_YTTRIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Yttrium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMZirconium = new SlimefunItemStack("EM_ZIRCONIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Zirconium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMNiobium = new SlimefunItemStack("EM_NIOBIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Niobium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMMolybdenum = new SlimefunItemStack("EM_MOLBYDENUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Molbydenum</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMTechtenium = new SlimefunItemStack("EM_TECHTENIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Techtenium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMRuthenium = new SlimefunItemStack("EM_RUTHENIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Ruthenium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMRhodium = new SlimefunItemStack("EM_RHODIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Rhodium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMPalladium = new SlimefunItemStack("EM_PALLADIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Palladium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMCadmium = new SlimefunItemStack("EM_CADMIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Cadmium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMHafnium = new SlimefunItemStack("EM_HAFNIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Hafnium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMTantalum = new SlimefunItemStack("EM_TANTALUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Tantalum</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMTungsten = new SlimefunItemStack("EM_TUNGSTEN", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Tungsten</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMRhenium = new SlimefunItemStack("EM_RHENIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Rhenium</gradient>")), "", "&7transition-metals");


        public static final SlimefunItemStack EMOsmium = new SlimefunItemStack("EM_OSMIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                 (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Osmium</gradient>")), "", "&7transition-metals");

        public static final SlimefunItemStack EMPlatinum = new SlimefunItemStack("EM_PLATINUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Platinum</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMMercury = new SlimefunItemStack("EM_MERCURY", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Mercury</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMRutherfordium = new SlimefunItemStack("EM_RUTHERFORDIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Rutherfordium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMDubnium = new SlimefunItemStack("EM_DUBNIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Dubnium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMSeaborgium = new SlimefunItemStack("EM_SEABORGIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Seaborgium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMBohrium = new SlimefunItemStack("EM_BOHRIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Bohrium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMHassium = new SlimefunItemStack("EM_HASSIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Hassium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMMeitnerium = new SlimefunItemStack("EM_MEITNERIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Meitnerium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMDarmstadtium= new SlimefunItemStack("EM_DARMSTADTIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Darmstadtium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMRoentgenium = new SlimefunItemStack("EM_ROENTGENIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Roentgenium</gradient>")), "", "&7transition-metals");
        public static final SlimefunItemStack EMCopernicium = new SlimefunItemStack("EM_COPERNICIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
                (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>Copernicium</gradient>")), "", "&7transition-metals");


        //elements/noble-gasses

        public static void setup(ElementManipulation em){

                new EMElement(Categories.EMElements, EMOxygen, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMHydrogen, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMCarbon, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMNitrogen, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMPhosphorus, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMSelenium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMSulfur, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                //alkalines
                new EMElement(Categories.EMElements, EMLithium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMSodium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMPotassium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMRubidium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMCaesium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMFrancium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                //halogens
                new EMElement(Categories.EMElements, EMFluorine, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMChlorine, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMBromine, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMIodine, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMAstatine, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMTennessine, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                //alkaline earths
                new EMElement(Categories.EMElements, EMBerilium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMMagnesium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMStrontium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMCalcium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMRadium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMBarium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                //semi-metals
                new EMElement(Categories.EMElements, EMBoron, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMSilicon, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMGermanium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMArsenic, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMAntimony, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMTellurium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMPolonium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);

                //others

                new EMElement(Categories.EMElements, EMAluminum, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMGallium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMIndium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMThallium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMNihonium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMTin, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMLead, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMFlerovium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMBismuth, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMMoscovium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
                        {null,null,null,null,null,null,null,null,null}).register(em);
                new EMElement(Categories.EMElements, EMLivermorium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]
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


                //noble gasses

        }
}

