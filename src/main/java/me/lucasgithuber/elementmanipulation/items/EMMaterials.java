    package me.lucasgithuber.elementmanipulation.items;

    import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
    import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
    import lombok.Getter;
    import me.lucasgithuber.elementmanipulation.ElementManipulation;
    import me.lucasgithuber.elementmanipulation.machines.JunctionTable;
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
    public static final SlimefunItemStack GOLD_INGOT = new SlimefunItemStack(
        "EM_GOLD_INGOT",
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

    new EMItem(Categories.EMJunctionCheat, EMCarrot,  JunctionTable.TYPE, new ItemStack[] {
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,null,     null,     null,    null,  CARBON,
            CARBON,null,HYDROGEN,HYDROGEN,null,      CARBON,
            CARBON,null,HYDROGEN,HYDROGEN,null,      CARBON,
            CARBON,null,     null,     null,    null,      CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMCocoa,  JunctionTable.TYPE, new ItemStack[] {
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON, null,    null,    null,    null,    CARBON,
            NITROGEN,    null,    OXYGEN, OXYGEN,     null,    NITROGEN,
            NITROGEN,    null,    OXYGEN, OXYGEN,     null,         NITROGEN,
            HYDROGEN, null,  null,    null,    null,              HYDROGEN,
            HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMNetherWart,  JunctionTable.TYPE, new ItemStack[] {
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN, CARBON,
            CARBON,HYDROGEN,OXYGEN,  OXYGEN,  HYDROGEN, CARBON,
            CARBON,HYDROGEN,OXYGEN,  OXYGEN,  HYDROGEN, CARBON,
            CARBON,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN, CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMPotato,  JunctionTable.TYPE, new ItemStack[] {
            HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,
            HYDROGEN,null,null,null,null,HYDROGEN,
            HYDROGEN,null,OXYGEN,OXYGEN,null,HYDROGEN,
            CARBON,null,OXYGEN,OXYGEN,null,CARBON,
            CARBON,null,null,null,null,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMPumpkinSeeds,  JunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,      HYDROGEN,null,null,null,
            null,HYDROGEN,HYDROGEN,null,null,null,
            null,null,null,           OXYGEN,OXYGEN,null,
            null,null,null,           OXYGEN,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);

    emRedstone = new EMRedstone(Categories.EMJunctionCheat, EMRedstone,  JunctionTable.TYPE, new ItemStack[] {
            null,SlimefunItems.PLASTIC_SHEET,COPPER,COPPER,SlimefunItems.PLASTIC_SHEET,null,
            null,SlimefunItems.PLASTIC_SHEET,COPPER,COPPER,SlimefunItems.PLASTIC_SHEET,null,
            null,SlimefunItems.PLASTIC_SHEET,COPPER,COPPER,SlimefunItems.PLASTIC_SHEET,null,
            null,SlimefunItems.PLASTIC_SHEET,COPPER,COPPER,SlimefunItems.PLASTIC_SHEET,null,
            null,SlimefunItems.PLASTIC_SHEET,COPPER,COPPER,SlimefunItems.PLASTIC_SHEET,null,
            null,SlimefunItems.PLASTIC_SHEET,COPPER,COPPER,SlimefunItems.PLASTIC_SHEET,null,
    }, new SlimefunItemStack(EMRedstone, 64));
    new EMItem(Categories.EMJunctionCheat,EMSweetBerries,  JunctionTable.TYPE, new ItemStack[] {
            HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,
            HYDROGEN,HYDROGEN,null,null,            HYDROGEN,HYDROGEN,
            HYDROGEN,null,OXYGEN,OXYGEN,null,                       HYDROGEN,
            CARBON,null,OXYGEN,OXYGEN,null,           CARBON,
            CARBON,CARBON,null,null,   CARBON,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMWheatSeeds,  JunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,CARBON,null,null,null,
            null,CARBON,CARBON,null,null,null,
            null,null,null,OXYGEN,OXYGEN,null,
            null,null,null,OXYGEN,null,null,
            null,null,null,null,null,null,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMApple,  JunctionTable.TYPE, new ItemStack[] {
            null,null,      null,      OXYGEN,null,null,
            null,HYDROGEN,HYDROGEN,OXYGEN,CARBON,null,
            null,HYDROGEN,OXYGEN,  OXYGEN,CARBON,null,
            null,HYDROGEN,OXYGEN,      OXYGEN,CARBON,null,
            null,HYDROGEN,OXYGEN,     CARBON,CARBON,null,
            null,null,      OXYGEN,      null,null,null,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMBeetrootSeeds,  JunctionTable.TYPE, new ItemStack[] {
            CARBON,null,null,null,null,CARBON,
            CARBON,HYDROGEN,null,null,HYDROGEN,CARBON,
            CARBON,HYDROGEN,OXYGEN,OXYGEN,HYDROGEN,CARBON,
            CARBON,HYDROGEN,OXYGEN,OXYGEN,HYDROGEN,CARBON,
            CARBON,HYDROGEN,null,null,HYDROGEN,CARBON,
            CARBON,null,null,null,null,CARBON,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMBone,  JunctionTable.TYPE, new ItemStack[] {
            null,OXYGEN,CALCIUM, CALCIUM,OXYGEN,null,
            null,OXYGEN,CALCIUM, CALCIUM,OXYGEN,null,
            null,OXYGEN,CALCIUM, CALCIUM,OXYGEN,null,
            null,OXYGEN,CALCIUM, CALCIUM,OXYGEN,null,
            null,OXYGEN,CALCIUM, CALCIUM,OXYGEN,null,
            null,OXYGEN,CALCIUM, CALCIUM,OXYGEN,null,null,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, GOLD_INGOT,  JunctionTable.TYPE, new ItemStack[] {
            null,null,GOLD,GOLD,null,null,
            null,null,GOLD,GOLD,null,null,
            null,null,GOLD,GOLD,null,null,
            null,null,GOLD,GOLD,null,null,
            null,null,GOLD,GOLD,null,null,
            null,null,GOLD,GOLD,null,null,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMHoneyBottle,  JunctionTable.TYPE, new ItemStack[] {
            CARBON,null,HYDROGEN,HYDROGEN,null,OXYGEN,
            CARBON,null,HYDROGEN,HYDROGEN,null,OXYGEN,
            CARBON,null,HYDROGEN,HYDROGEN,null,OXYGEN,
            CARBON,null,HYDROGEN,HYDROGEN,null,OXYGEN,
            CARBON,null,HYDROGEN,HYDROGEN,null,OXYGEN,
            CARBON,null,HYDROGEN,HYDROGEN,null,OXYGEN,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMInkSac,  JunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,null,
            null,HYDROGEN,CARBON,CARBON,HYDROGEN,null,
            null,HYDROGEN,CARBON,CARBON,HYDROGEN,null,
            null,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,null,
            null,null,null,null,null,null,
    }).setUseableInWorkbench(true).register(em);

    emLapis = new EMLapis(Categories.EMJunctionCheat, EMLapisLazuli,  JunctionTable.TYPE, new ItemStack[] {
            SODIUM,SODIUM,OXYGEN,OXYGEN,CALCIUM,CALCIUM,
            SODIUM,SILICON,SULFUR,SULFUR,SILICON,CALCIUM,
            SODIUM,ALUMINUM,new ItemStack(Material.BLUE_DYE),new ItemStack(Material.BLUE_DYE),ALUMINUM,CALCIUM,
            SODIUM,ALUMINUM,new ItemStack(Material.BLUE_DYE),new ItemStack(Material.BLUE_DYE),ALUMINUM,CALCIUM,
            SODIUM,SILICON,SULFUR,SULFUR,SILICON,CALCIUM,
            SODIUM,SODIUM,OXYGEN,OXYGEN,CALCIUM,CALCIUM,
    }, new SlimefunItemStack(EMLapisLazuli, 64));
    new EMItem(Categories.EMJunctionCheat, EMMelonSeeds,  JunctionTable.TYPE, new ItemStack[] {
            null,null,HYDROGEN,HYDROGEN,null,null,
            null,HYDROGEN,CARBON,CARBON,HYDROGEN,null,
            HYDROGEN,CARBON,OXYGEN,OXYGEN,CARBON,HYDROGEN,
            HYDROGEN,CARBON,OXYGEN,OXYGEN,CARBON,HYDROGEN,
            null,HYDROGEN,CARBON,CARBON,HYDROGEN,null,
            null,null,HYDROGEN,HYDROGEN,null,null
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMPoisonPotato,  JunctionTable.TYPE, new ItemStack[] {
            HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,
            HYDROGEN,SILVER,null,null,CARBON,HYDROGEN,
            HYDROGEN,null,OXYGEN,OXYGEN,null,HYDROGEN,
            CARBON,null,OXYGEN,OXYGEN,null,CARBON,
            CARBON,CARBON,null,null,NITROGEN,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMSugar,  JunctionTable.TYPE, new ItemStack[] {
            HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,
            HYDROGEN,CARBON,CARBON,CARBON,CARBON,HYDROGEN,
            HYDROGEN,CARBON,OXYGEN,OXYGEN,CARBON,HYDROGEN,
            HYDROGEN,CARBON,OXYGEN,OXYGEN,CARBON,HYDROGEN,
            HYDROGEN,CARBON,CARBON,CARBON,CARBON,HYDROGEN,
            HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMClay,  JunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,SILICON,OXYGEN,null,null,
            null,null,OXYGEN,null,null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMCoal,  JunctionTable.TYPE, new ItemStack[] {
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON
    }).setUseableInWorkbench(true).register(em);
    emEmerald = new EMEmerald(Categories.EMJunctionCheat, EMEmerald,  JunctionTable.TYPE, new ItemStack[] {
            BERYLLIUM,BERYLLIUM,SILICON,SILICON,OXYGEN,OXYGEN,
            BERYLLIUM,SILICON,SILICON,SILICON,SILICON,OXYGEN,
            SILICON,SILICON,SILICON,SILICON,SILICON,SILICON,
            SILICON,SILICON,SILICON,SILICON,SILICON,SILICON,
            ALUMINUM,SILICON,SILICON,SILICON,SILICON,OXYGEN,
            ALUMINUM,ALUMINUM,SILICON,SILICON,OXYGEN,OXYGEN,
    }, new SlimefunItemStack(EMEmerald, 64));
    new EMItem(Categories.EMJunctionCheat, EMFlint,  JunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,null,OXYGEN,null,null,
            null,null,OXYGEN,SILICON,null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMGhastTear,  JunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,HYDROGEN,HYDROGEN,null,null,null,
            null,null,HYDROGEN,SODIUM,null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMWaterBucket,  JunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,OXYGEN,HYDROGEN,null,null,
            null,null,HYDROGEN,new ItemStack(Material.BUCKET),null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMQuartz,  JunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,OXYGEN,null,null,null,
            null,null,SILICON,OXYGEN,null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);

    emRedstone.setUseableInWorkbench(true).register(em);
    emLapis.setUseableInWorkbench(true).register(em);
    emEmerald.setUseableInWorkbench(true).register(em);
    }
}