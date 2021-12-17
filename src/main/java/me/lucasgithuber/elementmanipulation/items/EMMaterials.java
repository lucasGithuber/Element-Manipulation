package me.lucasgithuber.elementmanipulation.items;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.Getter;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import static me.lucasgithuber.elementmanipulation.Items.*;

public final class EMMaterials {
    @Getter
    private static EMRedstone emRedstone;
    @Getter
    private static EMLapis emLapis;
    public static final SlimefunItemStack EMWaterBucket = new SlimefunItemStack(
            "EM_WATERBUCKET",
            Material.WATER_BUCKET,
            "&fWater bucket",
            "&fNormal water bucket",
            "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMCarrot = new SlimefunItemStack(
            "EM_CARROT",
            Material.CARROT,
            "&fCarrot",
            "&fNormal carrot",
            "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMCocoa = new SlimefunItemStack(
            "EM_COCOA",
            Material.COCOA_BEANS,
            "&fCocoa beans",
            "&fNormal carrot",
            "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMNetherWart = new SlimefunItemStack(
            "EM_WART",
            Material.NETHER_WART,
            "&fNether wart",
            "&fNormal nether warts",
            "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMPotato = new SlimefunItemStack(
            "EM_POTATO",
            Material.POTATO,
            "&fPotato",
            "&fNormal potato",
            "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMPumpkinSeeds = new SlimefunItemStack(
            "EM_PUMPKIN_SEEDS",
            Material.PUMPKIN_SEEDS,
            "&fPumpkin seeds",
            "&fNormal pumpkin seeds",
            "&fUsable in vanilla workbench"
    );


    public static final SlimefunItemStack EMRedstone = new SlimefunItemStack(
            "EM_REDSTONE",
            Material.REDSTONE,
            "&fRedstone",
            "&fNormal redstone",
            "&fUsable in vanilla workbench"
    );

    public static final SlimefunItemStack EMSweetBerries = new SlimefunItemStack(
            "EM_BERRIES",
            Material.SWEET_BERRIES,
            "&fSweet berries",
            "&fNormal berries",
            "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMWheatSeeds = new SlimefunItemStack(
            "EM_WHEAT_SEEDS",
            Material.WHEAT_SEEDS,
            "&fWheat seeds",
            "&fNormal seeds",
            "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMApple = new SlimefunItemStack(
            "EM_APPLE",
            Material.APPLE,
            "&fApple",
            "&fNormal apple",
            "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMBeetrootSeeds = new SlimefunItemStack(
            "EM_BEETROOT_SEEDS",
            Material.BEETROOT_SEEDS,
            "&fBeetroot seeds",
            "&fNormal beetroot seeds",
            "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMBone = new SlimefunItemStack(
            "EM_BONE",
            Material.BONE,
            "&fBone",
            "&fNormal bone",
            "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMGold = new SlimefunItemStack(
            "EM_GOLD",
            Material.GOLD_INGOT,
            "&fGold ingot",
            "&fNormal gold ingot",
            "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMHoneyBottle = new SlimefunItemStack(
            "EM_HONEY",
            Material.HONEY_BOTTLE,
            "&fHoney bottle",
            "&fNormal honey",
            "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMInkSac = new SlimefunItemStack(
            "EM_INK",
            Material.INK_SAC,
            "&fInk sac",
            "&fNormal ink ",
            "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMLapisLazuli = new SlimefunItemStack(
            "EM_LAPIS",
            Material.LAPIS_LAZULI,
            "&fLapis lazuli",
            "&fNormal honey",
            "&fUsable in vanilla workbench"
    );

    public static void setup(ElementManipulation em){

        new EMCarrot(Categories.EMJunctionCheat, EMCarrot,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
                EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,
                EMCarbon,null,     null,     null,    null,  EMCarbon,
                EMCarbon,null,EMHydrogen,EMHydrogen,null,      EMCarbon,
                EMCarbon,null,EMHydrogen,EMHydrogen,null,      EMCarbon,
                EMCarbon,null,     null,     null,    null,      EMCarbon,
                EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,
        }).setUseableInWorkbench(true).register(em);
        new EMCocoa(Categories.EMJunctionCheat, EMCocoa,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
                EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,
                EMCarbon, null,    null,    null,    null,    EMCarbon,
                EMNitrogen,    null,    EMOxygen, EMOxygen,     null,    EMNitrogen,
                EMNitrogen,    null,    EMOxygen, EMOxygen,     null,         EMNitrogen,
                EMHydrogen, null,  null,    null,    null,              EMHydrogen,
                EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,
        }).setUseableInWorkbench(true).register(em);
        new EMWart(Categories.EMJunctionCheat, EMNetherWart,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
                EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,
                EMCarbon,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen, EMCarbon,
                EMCarbon,EMHydrogen,EMOxygen,  EMOxygen,  EMHydrogen, EMCarbon,
                EMCarbon,EMHydrogen,EMOxygen,  EMOxygen,  EMHydrogen, EMCarbon,
                EMCarbon,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen, EMCarbon,
                EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,
        }).setUseableInWorkbench(true).register(em);
        new EMPotato(Categories.EMJunctionCheat, EMPotato,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
                EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,
                EMHydrogen,null,null,null,null,EMHydrogen,
                EMHydrogen,null,EMOxygen,EMOxygen,null,EMHydrogen,
                EMCarbon,null,EMOxygen,EMOxygen,null,EMCarbon,
                EMCarbon,null,null,null,null,EMCarbon,
                EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,
        }).setUseableInWorkbench(true).register(em);
        new EMPumpkinSeeds(Categories.EMJunctionCheat, EMPumpkinSeeds,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
                null,null,null,null,null,null,
                null,null,      EMHydrogen,null,null,null,
                null,EMHydrogen,EMHydrogen,null,null,null,
                null,null,null,           EMOxygen,EMOxygen,null,
                null,null,null,           EMOxygen,null,null,
                null,null,null,null,null,null
        }).setUseableInWorkbench(true).register(em);
        EMRedstone.setAmount(64);
        emRedstone = new EMRedstone(Categories.EMJunctionCheat, EMRedstone,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
                null,SlimefunItems.PLASTIC_SHEET,EMCopper,EMCopper,SlimefunItems.PLASTIC_SHEET,null,
                null,SlimefunItems.PLASTIC_SHEET,EMCopper,EMCopper,SlimefunItems.PLASTIC_SHEET,null,
                null,SlimefunItems.PLASTIC_SHEET,EMCopper,EMCopper,SlimefunItems.PLASTIC_SHEET,null,
                null,SlimefunItems.PLASTIC_SHEET,EMCopper,EMCopper,SlimefunItems.PLASTIC_SHEET,null,
                null,SlimefunItems.PLASTIC_SHEET,EMCopper,EMCopper,SlimefunItems.PLASTIC_SHEET,null,
                null,SlimefunItems.PLASTIC_SHEET,EMCopper,EMCopper,SlimefunItems.PLASTIC_SHEET,null,
        }, EMRedstone);
        new EMBerries(Categories.EMJunctionCheat,EMSweetBerries,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
                EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,
                EMHydrogen,EMHydrogen,null,null,            EMHydrogen,EMHydrogen,
                EMHydrogen,null,EMOxygen,EMOxygen,null,                       EMHydrogen,
                EMCarbon,null,EMOxygen,EMOxygen,null,           EMCarbon,
                EMCarbon,EMCarbon,null,null,   EMCarbon,EMCarbon,
                EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,
        }).setUseableInWorkbench(true).register(em);
        new EMSeeds(Categories.EMJunctionCheat, EMWheatSeeds,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
                null,null,null,null,null,null,
                null,null,EMCarbon,null,null,null,
                null,EMCarbon,EMCarbon,null,null,null,
                null,null,null,EMOxygen,EMOxygen,null,
                null,null,null,EMOxygen,null,null,
                null,null,null,null,null,null,
        }).setUseableInWorkbench(true).register(em);
        new EMApple(Categories.EMJunctionCheat, EMApple,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
                null,null,      null,      EMOxygen,null,null,
                null,EMHydrogen,EMHydrogen,EMOxygen,EMCarbon,null,
                null,EMHydrogen,EMOxygen,  EMOxygen,EMCarbon,null,
                null,EMHydrogen,EMOxygen,      EMOxygen,EMCarbon,null,
                null,EMHydrogen,EMOxygen,     EMCarbon,EMCarbon,null,
                null,null,      EMOxygen,      null,null,null,
        }).setUseableInWorkbench(true).register(em);
        new EMBeetroot(Categories.EMJunctionCheat, EMBeetrootSeeds,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
                EMCarbon,null,null,null,null,EMCarbon,
                EMCarbon,EMHydrogen,null,null,EMHydrogen,EMCarbon,
                EMCarbon,EMHydrogen,EMOxygen,EMOxygen,EMHydrogen,EMCarbon,
                EMCarbon,EMHydrogen,EMOxygen,EMOxygen,EMHydrogen,EMCarbon,
                EMCarbon,EMHydrogen,null,null,EMHydrogen,EMCarbon,
                EMCarbon,null,null,null,null,EMCarbon,
        }).setUseableInWorkbench(true).register(em);
        new EMBone(Categories.EMJunctionCheat, EMBone,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
                null,EMOxygen,EMCalcium, EMCalcium,EMOxygen,null,
                null,EMOxygen,EMCalcium, EMCalcium,EMOxygen,null,
                null,EMOxygen,EMCalcium, EMCalcium,EMOxygen,null,
                null,EMOxygen,EMCalcium, EMCalcium,EMOxygen,null,
                null,EMOxygen,EMCalcium, EMCalcium,EMOxygen,null,
                null,EMOxygen,EMCalcium, EMCalcium,EMOxygen,null,null,
        }).setUseableInWorkbench(true).register(em);
        new EMGold(Categories.EMJunctionCheat, EMGold,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
                null,null,EMAu,EMAu,null,null,
                null,null,EMAu,EMAu,null,null,
                null,null,EMAu,EMAu,null,null,
                null,null,EMAu,EMAu,null,null,
                null,null,EMAu,EMAu,null,null,
                null,null,EMAu,EMAu,null,null,
        }).setUseableInWorkbench(true).register(em);
        new EMHoney(Categories.EMJunctionCheat, EMHoneyBottle,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
                EMCarbon,null,EMHydrogen,EMHydrogen,null,EMOxygen,
                EMCarbon,null,EMHydrogen,EMHydrogen,null,EMOxygen,
                EMCarbon,null,EMHydrogen,EMHydrogen,null,EMOxygen,
                EMCarbon,null,EMHydrogen,EMHydrogen,null,EMOxygen,
                EMCarbon,null,EMHydrogen,EMHydrogen,null,EMOxygen,
                EMCarbon,null,EMHydrogen,EMHydrogen,null,EMOxygen,
        }).setUseableInWorkbench(true).register(em);
        new EMInk(Categories.EMJunctionCheat, EMInkSac,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
                null,null,null,null,null,null,
                null,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,null,
                null,EMHydrogen,EMCarbon,EMCarbon,EMHydrogen,null,
                null,EMHydrogen,EMCarbon,EMCarbon,EMHydrogen,null,
                null,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,null,
                null,null,null,null,null,null,
        }).setUseableInWorkbench(true).register(em);
        EMLapisLazuli.setAmount(64);
        emLapis = new EMLapis(Categories.EMJunctionCheat, EMLapisLazuli,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
                EMSodium,EMSodium,EMOxygen,EMOxygen,EMCalcium,EMCalcium,
                EMSodium,EMSilicon,EMSulfur,EMSulfur,EMSilicon,EMCalcium,
                EMSodium,EMAluminum,new ItemStack(Material.BLUE_DYE),new ItemStack(Material.BLUE_DYE),EMAluminum,EMCalcium,
                EMSodium,EMAluminum,new ItemStack(Material.BLUE_DYE),new ItemStack(Material.BLUE_DYE),EMAluminum,EMCalcium,
                EMSodium,EMSilicon,EMSulfur,EMSulfur,EMSilicon,EMCalcium,
                EMSodium,EMSodium,EMOxygen,EMOxygen,EMCalcium,EMCalcium,
        }, EMLapisLazuli);
        emRedstone.setUseableInWorkbench(true).register(em);
        emLapis.setUseableInWorkbench(true).register(em);
    }
}