package me.lucasgithuber.elementmanipulation;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import me.lucasgithuber.elementmanipulation.elements.alcalines.*;
import me.lucasgithuber.elementmanipulation.elements.alkalineearth.*;
import me.lucasgithuber.elementmanipulation.elements.halogens.*;
import me.lucasgithuber.elementmanipulation.elements.nonmetals.*;
import me.lucasgithuber.elementmanipulation.elements.others.*;
import me.lucasgithuber.elementmanipulation.elements.semimetals.*;
import me.lucasgithuber.elementmanipulation.elements.transitionmetals.EMCopper;
import me.lucasgithuber.elementmanipulation.machines.EMDeconstructor;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import org.bukkit.Material;

import java.util.Arrays;


public class Setup {
    //Item thing
    public static final SlimefunItemStack WATER = new SlimefunItemStack(
            "EM_WATERBUCKET",
            Material.WATER_BUCKET,
            "&fWater bucket",
            "&8Works as a normal water bucket"
    );
        public static void setup(ElementManipulation p) {
            // Category
            Categories.setup(p);
            // Items

            //elements/non-metals
            new EMHydrogen(Categories.EMElements).register(p);
            new EMCarbon(Categories.EMElements).register(p);
            new EMNitrogen(Categories.EMElements).register(p);
            new EMOxygen(Categories.EMElements).register(p);
            new EMPhosphorus(Categories.EMElements).register(p);
            new EMSulfur(Categories.EMElements).register(p);
            new EMSelenium(Categories.EMElements).register(p);

            //elements/alkalines
            new EMLithium(Categories.EMElements).register(p);
            new EMSodium(Categories.EMElements).register(p);
            new EMPotassium(Categories.EMElements).register(p);
            new EMRubidium(Categories.EMElements).register(p);
            new EMCaesium(Categories.EMElements).register(p);
            new EMFrancium(Categories.EMElements).register(p);
            //elements/halogens
            new EMFluorine(Categories.EMElements).register(p);
            new EMChlorine(Categories.EMElements).register(p);
            new EMBromine(Categories.EMElements).register(p);
            new EMIodine(Categories.EMElements).register(p);
            new EMAstatine(Categories.EMElements).register(p);
            new EMTennessine(Categories.EMElements).register(p);
            //elements/alkaline-earths
            new EMBerilium(Categories.EMElements).register(p);
            new EMMagnesium(Categories.EMElements).register(p);
            new EMCalcium(Categories.EMElements).register(p);
            new EMStrontium(Categories.EMElements).register(p);
            new EMBarium(Categories.EMElements).register(p);
            new EMRadium(Categories.EMElements).register(p);
            //elements/semi-metals
            new EMGermanium(Categories.EMElements).register(p);
            new EMPolonium(Categories.EMElements).register(p);
            new EMSilicon(Categories.EMElements).register(p);
            new EMBoron(Categories.EMElements).register(p);
            new EMArsenic(Categories.EMElements).register(p);
            new EMAntimony(Categories.EMElements).register(p);
            new EMTellurium(Categories.EMElements).register(p);
            //elements/other-metals
            new EMAluminum(Categories.EMElements).register(p);
            new EMGallium(Categories.EMElements).register(p);
            new EMIndium(Categories.EMElements).register(p);
            new EMThallium(Categories.EMElements).register(p);
            new EMNihonium(Categories.EMElements).register(p);
            new EMMoscovium(Categories.EMElements).register(p);
            new EMTin(Categories.EMElements).register(p);
            new EMLead(Categories.EMElements).register(p);
            new EMBismuth(Categories.EMElements).register(p);
            new EMFlerovium(Categories.EMElements).register(p);
            new EMLivermorium(Categories.EMElements).register(p);
            //elements/transition metals
            new EMCopper(Categories.EMElements).register(p);
            // machines

            new EMDeconstructor(Categories.EMMachines).register(p);

            // items
        }
    @SafeVarargs
    public static <T> T[] fillNulls(T... original) {
        return Arrays.copyOf(original, 36);
    }
    }
