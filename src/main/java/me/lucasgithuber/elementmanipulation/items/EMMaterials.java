    package me.lucasgithuber.elementmanipulation.items;

    import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
    import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
    import lombok.Getter;
    import me.lucasgithuber.elementmanipulation.ElementManipulation;
    import me.lucasgithuber.elementmanipulation.utils.Categories;
    import org.bukkit.Material;
    import org.bukkit.inventory.ItemStack;

    import static me.lucasgithuber.elementmanipulation.elements.Elements.*;

    public final class EMMaterials {
    @Getter
    private static EMRedstone emRedstone;
    @Getter
    private static EMLapis emLapis;
    @Getter
    private static EMEmerald emEmerald;

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
        "&fNormal cocoa",
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
        "&fNormal lapis lazuli",
        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMMelonSeeds = new SlimefunItemStack(
        "EM_MELON_SEEDS",
        Material.MELON_SLICE,
        "&fMelon seeds",
        "&fNormal melon seeds",
        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMPoisonPotato = new SlimefunItemStack(
        "EM_POISON_POTATO",
        Material.POISONOUS_POTATO,
        "&fPoisonous potato",
        "&fNormal poisonous potato",
        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMSugar = new SlimefunItemStack(
        "EM_SUGAR",
        Material.SUGAR,
        "&fSugar",
        "&fNormal sugar",
        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMClay = new SlimefunItemStack(
        "EM_CLAY",
        Material.CLAY_BALL,
        "&fClay ball",
        "&fNormal clay",
        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMCoal = new SlimefunItemStack(
        "EM_COAL",
        Material.COAL,
        "&fCoal",
        "&fNormal coal",
        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMDiamond = new SlimefunItemStack(
        "EM_DIAMOND",
        Material.DIAMOND,
        "&fDiamond",
        "&fNormal diamond",
        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMEmerald = new SlimefunItemStack(
        "EM_EMERALD",
        Material.EMERALD,
        "&fEmerald",
        "&fNormal emerald",
        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMFlint = new SlimefunItemStack(
        "EM_FLINT",
        Material.FLINT,
        "&fFlint",
        "&fNormal flint",
        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMGhastTear= new SlimefunItemStack(
        "EM_TEAR",
        Material.GHAST_TEAR,
        "&fGhast tear",
        "&fNormal tear",
        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMQuartz = new SlimefunItemStack(
        "EM_QUARTZ",
        Material.QUARTZ,
        "&fNether quartz",
        "&fNormal nether quartz",
        "&fUsable in vanilla workbench"
    );



    public static void setup(ElementManipulation em){

    new EMItem(Categories.EMJunctionCheat, EMCarrot,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,
            EMCarbon,null,     null,     null,    null,  EMCarbon,
            EMCarbon,null,EMHydrogen,EMHydrogen,null,      EMCarbon,
            EMCarbon,null,EMHydrogen,EMHydrogen,null,      EMCarbon,
            EMCarbon,null,     null,     null,    null,      EMCarbon,
            EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMCocoa,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,
            EMCarbon, null,    null,    null,    null,    EMCarbon,
            EMNitrogen,    null,    EMOxygen, EMOxygen,     null,    EMNitrogen,
            EMNitrogen,    null,    EMOxygen, EMOxygen,     null,         EMNitrogen,
            EMHydrogen, null,  null,    null,    null,              EMHydrogen,
            EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMNetherWart,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,
            EMCarbon,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen, EMCarbon,
            EMCarbon,EMHydrogen,EMOxygen,  EMOxygen,  EMHydrogen, EMCarbon,
            EMCarbon,EMHydrogen,EMOxygen,  EMOxygen,  EMHydrogen, EMCarbon,
            EMCarbon,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen, EMCarbon,
            EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMPotato,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,
            EMHydrogen,null,null,null,null,EMHydrogen,
            EMHydrogen,null,EMOxygen,EMOxygen,null,EMHydrogen,
            EMCarbon,null,EMOxygen,EMOxygen,null,EMCarbon,
            EMCarbon,null,null,null,null,EMCarbon,
            EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMPumpkinSeeds,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,      EMHydrogen,null,null,null,
            null,EMHydrogen,EMHydrogen,null,null,null,
            null,null,null,           EMOxygen,EMOxygen,null,
            null,null,null,           EMOxygen,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);

    emRedstone = new EMRedstone(Categories.EMJunctionCheat, EMRedstone,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,SlimefunItems.PLASTIC_SHEET,EMCopper,EMCopper,SlimefunItems.PLASTIC_SHEET,null,
            null,SlimefunItems.PLASTIC_SHEET,EMCopper,EMCopper,SlimefunItems.PLASTIC_SHEET,null,
            null,SlimefunItems.PLASTIC_SHEET,EMCopper,EMCopper,SlimefunItems.PLASTIC_SHEET,null,
            null,SlimefunItems.PLASTIC_SHEET,EMCopper,EMCopper,SlimefunItems.PLASTIC_SHEET,null,
            null,SlimefunItems.PLASTIC_SHEET,EMCopper,EMCopper,SlimefunItems.PLASTIC_SHEET,null,
            null,SlimefunItems.PLASTIC_SHEET,EMCopper,EMCopper,SlimefunItems.PLASTIC_SHEET,null,
    }, new SlimefunItemStack(EMRedstone, 64));
    new EMItem(Categories.EMJunctionCheat,EMSweetBerries,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,
            EMHydrogen,EMHydrogen,null,null,            EMHydrogen,EMHydrogen,
            EMHydrogen,null,EMOxygen,EMOxygen,null,                       EMHydrogen,
            EMCarbon,null,EMOxygen,EMOxygen,null,           EMCarbon,
            EMCarbon,EMCarbon,null,null,   EMCarbon,EMCarbon,
            EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMWheatSeeds,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,EMCarbon,null,null,null,
            null,EMCarbon,EMCarbon,null,null,null,
            null,null,null,EMOxygen,EMOxygen,null,
            null,null,null,EMOxygen,null,null,
            null,null,null,null,null,null,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMApple,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,      null,      EMOxygen,null,null,
            null,EMHydrogen,EMHydrogen,EMOxygen,EMCarbon,null,
            null,EMHydrogen,EMOxygen,  EMOxygen,EMCarbon,null,
            null,EMHydrogen,EMOxygen,      EMOxygen,EMCarbon,null,
            null,EMHydrogen,EMOxygen,     EMCarbon,EMCarbon,null,
            null,null,      EMOxygen,      null,null,null,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMBeetrootSeeds,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            EMCarbon,null,null,null,null,EMCarbon,
            EMCarbon,EMHydrogen,null,null,EMHydrogen,EMCarbon,
            EMCarbon,EMHydrogen,EMOxygen,EMOxygen,EMHydrogen,EMCarbon,
            EMCarbon,EMHydrogen,EMOxygen,EMOxygen,EMHydrogen,EMCarbon,
            EMCarbon,EMHydrogen,null,null,EMHydrogen,EMCarbon,
            EMCarbon,null,null,null,null,EMCarbon,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMBone,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,EMOxygen,EMCalcium, EMCalcium,EMOxygen,null,
            null,EMOxygen,EMCalcium, EMCalcium,EMOxygen,null,
            null,EMOxygen,EMCalcium, EMCalcium,EMOxygen,null,
            null,EMOxygen,EMCalcium, EMCalcium,EMOxygen,null,
            null,EMOxygen,EMCalcium, EMCalcium,EMOxygen,null,
            null,EMOxygen,EMCalcium, EMCalcium,EMOxygen,null,null,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMGold,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,EMAu,EMAu,null,null,
            null,null,EMAu,EMAu,null,null,
            null,null,EMAu,EMAu,null,null,
            null,null,EMAu,EMAu,null,null,
            null,null,EMAu,EMAu,null,null,
            null,null,EMAu,EMAu,null,null,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMHoneyBottle,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            EMCarbon,null,EMHydrogen,EMHydrogen,null,EMOxygen,
            EMCarbon,null,EMHydrogen,EMHydrogen,null,EMOxygen,
            EMCarbon,null,EMHydrogen,EMHydrogen,null,EMOxygen,
            EMCarbon,null,EMHydrogen,EMHydrogen,null,EMOxygen,
            EMCarbon,null,EMHydrogen,EMHydrogen,null,EMOxygen,
            EMCarbon,null,EMHydrogen,EMHydrogen,null,EMOxygen,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMInkSac,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,null,
            null,EMHydrogen,EMCarbon,EMCarbon,EMHydrogen,null,
            null,EMHydrogen,EMCarbon,EMCarbon,EMHydrogen,null,
            null,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,null,
            null,null,null,null,null,null,
    }).setUseableInWorkbench(true).register(em);

    emLapis = new EMLapis(Categories.EMJunctionCheat, EMLapisLazuli,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            EMSodium,EMSodium,EMOxygen,EMOxygen,EMCalcium,EMCalcium,
            EMSodium,EMSilicon,EMSulfur,EMSulfur,EMSilicon,EMCalcium,
            EMSodium,EMAluminum,new ItemStack(Material.BLUE_DYE),new ItemStack(Material.BLUE_DYE),EMAluminum,EMCalcium,
            EMSodium,EMAluminum,new ItemStack(Material.BLUE_DYE),new ItemStack(Material.BLUE_DYE),EMAluminum,EMCalcium,
            EMSodium,EMSilicon,EMSulfur,EMSulfur,EMSilicon,EMCalcium,
            EMSodium,EMSodium,EMOxygen,EMOxygen,EMCalcium,EMCalcium,
    }, new SlimefunItemStack(EMLapisLazuli, 64));
    new EMItem(Categories.EMJunctionCheat, EMMelonSeeds,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,EMHydrogen,EMHydrogen,null,null,
            null,EMHydrogen,EMCarbon,EMCarbon,EMHydrogen,null,
            EMHydrogen,EMCarbon,EMOxygen,EMOxygen,EMCarbon,EMHydrogen,
            EMHydrogen,EMCarbon,EMOxygen,EMOxygen,EMCarbon,EMHydrogen,
            null,EMHydrogen,EMCarbon,EMCarbon,EMHydrogen,null,
            null,null,EMHydrogen,EMHydrogen,null,null
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMPoisonPotato,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,
            EMHydrogen,EMSilver,null,null,EMCarbon,EMHydrogen,
            EMHydrogen,null,EMOxygen,EMOxygen,null,EMHydrogen,
            EMCarbon,null,EMOxygen,EMOxygen,null,EMCarbon,
            EMCarbon,EMCarbon,null,null,EMNitrogen,EMCarbon,
            EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMSugar,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,
            EMHydrogen,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMHydrogen,
            EMHydrogen,EMCarbon,EMOxygen,EMOxygen,EMCarbon,EMHydrogen,
            EMHydrogen,EMCarbon,EMOxygen,EMOxygen,EMCarbon,EMHydrogen,
            EMHydrogen,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMHydrogen,
            EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen,EMHydrogen
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMClay,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,EMSilicon,EMOxygen,null,null,
            null,null,EMOxygen,null,null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMCoal,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,
            EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,
            EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,
            EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,
            EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,
            EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon,EMCarbon
    }).setUseableInWorkbench(true).register(em);
    emEmerald = new EMEmerald(Categories.EMJunctionCheat, EMEmerald,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            EMBerilium,EMBerilium,EMSilicon,EMSilicon,EMOxygen,EMOxygen,
            EMBerilium,EMSilicon,EMSilicon,EMSilicon,EMSilicon,EMOxygen,
            EMSilicon,EMSilicon,EMSilicon,EMSilicon,EMSilicon,EMSilicon,
            EMSilicon,EMSilicon,EMSilicon,EMSilicon,EMSilicon,EMSilicon,
            EMAluminum,EMSilicon,EMSilicon,EMSilicon,EMSilicon,EMOxygen,
            EMAluminum,EMAluminum,EMSilicon,EMSilicon,EMOxygen,EMOxygen,
    }, new SlimefunItemStack(EMEmerald, 64));
    new EMItem(Categories.EMJunctionCheat, EMFlint,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,null,EMOxygen,null,null,
            null,null,EMOxygen,EMSilicon,null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMGhastTear,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,EMHydrogen,EMHydrogen,null,null,null,
            null,null,EMHydrogen,EMSodium,null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMWaterBucket,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,EMOxygen,EMHydrogen,null,null,
            null,null,EMHydrogen,new ItemStack(Material.BUCKET),null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMQuartz,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,EMOxygen,null,null,null,
            null,null,EMSilicon,EMOxygen,null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);

    emRedstone.setUseableInWorkbench(true).register(em);
    emLapis.setUseableInWorkbench(true).register(em);
    emEmerald.setUseableInWorkbench(true).register(em);
    }
}