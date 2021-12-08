package me.lucasgithuber.elementmanipulation;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.items.VanillaItem;
import me.lucasgithuber.elementmanipulation.elements.alcalines.*;
import me.lucasgithuber.elementmanipulation.elements.alkalineearth.*;
import me.lucasgithuber.elementmanipulation.elements.halogens.*;
import me.lucasgithuber.elementmanipulation.elements.nonmetals.*;
import me.lucasgithuber.elementmanipulation.elements.others.*;
import me.lucasgithuber.elementmanipulation.elements.semimetals.*;
import me.lucasgithuber.elementmanipulation.machines.EMDeconstructor;
import me.lucasgithuber.elementmanipulation.machines.EMJunctionTable;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import me.lucasgithuber.elementmanipulation.elements.alcalines.*;
import me.lucasgithuber.elementmanipulation.elements.alkalineearth.*;
import me.lucasgithuber.elementmanipulation.elements.halogens.*;
import me.lucasgithuber.elementmanipulation.elements.nonmetals.*;
import me.lucasgithuber.elementmanipulation.elements.others.*;
import me.lucasgithuber.elementmanipulation.elements.semimetals.*;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

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
            new EMHydrogen(Categories.EMELEMENTS).register(p);
            new EMCarbon(Categories.EMELEMENTS).register(p);
            new EMNitrogen(Categories.EMELEMENTS).register(p);
            new EMOxygen(Categories.EMELEMENTS).register(p);
            new EMPhosphorus(Categories.EMELEMENTS).register(p);
            new EMSulfur(Categories.EMELEMENTS).register(p);
            new EMSelenium(Categories.EMELEMENTS).register(p);

            //elements/alkalines
            new EMLithium(Categories.EMELEMENTS).register(p);
            new EMSodium(Categories.EMELEMENTS).register(p);
            new EMPotassium(Categories.EMELEMENTS).register(p);
            new EMRubidium(Categories.EMELEMENTS).register(p);
            new EMCaesium(Categories.EMELEMENTS).register(p);
            new EMFrancium(Categories.EMELEMENTS).register(p);
            //elements/halogens
            new EMFluorine(Categories.EMELEMENTS).register(p);
            new EMChlorine(Categories.EMELEMENTS).register(p);
            new EMBromine(Categories.EMELEMENTS).register(p);
            new EMIodine(Categories.EMELEMENTS).register(p);
            new EMAstatine(Categories.EMELEMENTS).register(p);
            new EMTennessine(Categories.EMELEMENTS).register(p);
            //elements/alkaline-earths
            new EMBerilium(Categories.EMELEMENTS).register(p);
            new EMMagnesium(Categories.EMELEMENTS).register(p);
            new EMCalcium(Categories.EMELEMENTS).register(p);
            new EMStrontium(Categories.EMELEMENTS).register(p);
            new EMBarium(Categories.EMELEMENTS).register(p);
            new EMRadium(Categories.EMELEMENTS).register(p);
            //elements/semi-metals
            new EMGermanium(Categories.EMELEMENTS).register(p);
            new EMPolonium(Categories.EMELEMENTS).register(p);
            new EMSilicon(Categories.EMELEMENTS).register(p);
            new EMBoron(Categories.EMELEMENTS).register(p);
            new EMArsenic(Categories.EMELEMENTS).register(p);
            new EMAntimony(Categories.EMELEMENTS).register(p);
            new EMTellurium(Categories.EMELEMENTS).register(p);
            //elements/other-metals
            new EMAluminum(Categories.EMELEMENTS).register(p);
            new EMGallium(Categories.EMELEMENTS).register(p);
            new EMIndium(Categories.EMELEMENTS).register(p);
            new EMThallium(Categories.EMELEMENTS).register(p);
            new EMNihonium(Categories.EMELEMENTS).register(p);
            new EMMoscovium(Categories.EMELEMENTS).register(p);
            new EMTin(Categories.EMELEMENTS).register(p);
            new EMLead(Categories.EMELEMENTS).register(p);
            new EMBismuth(Categories.EMELEMENTS).register(p);
            new EMFlerovium(Categories.EMELEMENTS).register(p);
            new EMLivermorium(Categories.EMELEMENTS).register(p);
            // machines

            new EMDeconstructor(Categories.EMMACHINES).register(p);

            // items
            new VanillaItem(Categories.EMJUNCTION_CATEGORY, new ItemStack(Material.SLIME_BALL), "EM_WATER_BUCKET", EMJunctionTable.TYPE, fillNulls(
                    null,null,null,null,null,null,
                    null,null,null,null,null,null,
                    null,null, Items.EM_Oxygen, Items.EM_Hydrogen,null,null,
                    null,null, Items.EM_Hydrogen,new ItemStack(Material.BUCKET),null,
                    null,null,null,null,null,null,
                    null,null,null,null,null,null

            )).register(p);
        }
    @SafeVarargs
    private static <T> T[] fillNulls(T... original) {
        return Arrays.copyOf(original, 0);
    }
    }
