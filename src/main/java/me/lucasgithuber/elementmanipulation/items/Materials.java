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

    public final class Materials {
    @Getter
    private static MultiOutputItem emRedstone;
    @Getter
    private static MultiOutputItem emLapis;
    @Getter
    private static MultiOutputItem emEmerald;

    public static final SlimefunItemStack WATER_BUCKET = new SlimefunItemStack(
        "EM_WATERBUCKET",
        Material.WATER_BUCKET,
        "&fWater bucket",

        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack CARROT = new SlimefunItemStack(
        "EM_CARROT",
        Material.CARROT,
        "&fCarrot",

        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack COCOA = new SlimefunItemStack(
        "EM_COCOA",
        Material.COCOA_BEANS,
        "&fCocoa beans",

        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack NETHER_WART = new SlimefunItemStack(
        "EM_WART",
        Material.NETHER_WART,
        "&fNether wart",

        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack POTATO = new SlimefunItemStack(
        "EM_POTATO",
        Material.POTATO,
        "&fPotato",
        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack PUMPKIN_SEEDS = new SlimefunItemStack(
        "EM_PUMPKIN_SEEDS",
        Material.PUMPKIN_SEEDS,
        "&fPumpkin seeds",

        "&fUsable in vanilla workbench"
    );


    public static final SlimefunItemStack REDSTONE = new SlimefunItemStack(
        "EM_REDSTONE",
        Material.REDSTONE,
        "&fRedstone",

        "&fUsable in vanilla workbench"
    );

    public static final SlimefunItemStack SWEET_BERRIES = new SlimefunItemStack(
        "EM_BERRIES",
        Material.SWEET_BERRIES,
        "&fSweet berries",

        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack WHEAT_SEEDS = new SlimefunItemStack(
        "EM_WHEAT_SEEDS",
        Material.WHEAT_SEEDS,
        "&fWheat seeds",

        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack APPLE = new SlimefunItemStack(
        "EM_APPLE",
        Material.APPLE,
        "&fApple",
        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack BEETROOT_SEEDS = new SlimefunItemStack(
        "EM_BEETROOT_SEEDS",
        Material.BEETROOT_SEEDS,
        "&fBeetroot seeds",

        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack BONE = new SlimefunItemStack(
        "EM_BONE",
        Material.BONE,
        "&fBone",
        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack GOLD_INGOT = new SlimefunItemStack(
        "EM_GOLD_INGOT",
        Material.GOLD_NUGGET,
        "&fGold ingot",

        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack HONEY = new SlimefunItemStack(
        "EM_HONEY",
        Material.HONEY_BOTTLE,
        "&fHoney bottle",

        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack INK = new SlimefunItemStack(
        "EM_INK",
        Material.INK_SAC,
        "&fInk sac",
        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack LAPIS_LAZULI = new SlimefunItemStack(
        "EM_LAPIS",
        Material.LAPIS_LAZULI,
        "&fLapis lazuli",
        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack MELON_SEEDS = new SlimefunItemStack(
        "EM_MELON_SEEDS",
        Material.MELON_SLICE,
        "&fMelon seeds",

        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack POISON_POTATO = new SlimefunItemStack(
        "EM_POISON_POTATO",
        Material.POISONOUS_POTATO,
        "&fPoisonous potato",

        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack SUGAR = new SlimefunItemStack(
        "EM_SUGAR",
        Material.SUGAR,
        "&fSugar",

        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack CLAY = new SlimefunItemStack(
        "EM_CLAY",
        Material.CLAY_BALL,
        "&fClay ball",

        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack COAL = new SlimefunItemStack(
        "EM_COAL",
        Material.COAL,
        "&fCoal",

        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack DIAMOND = new SlimefunItemStack(
        "EM_DIAMOND",
        Material.DIAMOND,
        "&fDiamond",

        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMERALD = new SlimefunItemStack(
        "EM_EMERALD",
        Material.EMERALD,
        "&fEmerald",

        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack FLINT = new SlimefunItemStack(
        "EM_FLINT",
        Material.FLINT,
        "&fFlint",
        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack TEAR = new SlimefunItemStack(
        "EM_TEAR",
        Material.GHAST_TEAR,
        "&fGhast tear",
        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack QUARTZ = new SlimefunItemStack(
        "EM_QUARTZ",
        Material.QUARTZ,
        "&fNether quartz",
        "&fUsable in vanilla workbench"
    );
        public static final SlimefunItemStack SAND = new SlimefunItemStack(
                "EM_SAND",
                Material.SAND,
                "&fSand",
                "&fUsable in vanilla workbench"
        );
        public static final SlimefunItemStack EGG = new SlimefunItemStack(
                "EM_EGG",
                Material.EGG,
                "&fEgg",
                "&fUsable in vanilla workbench"
        );
        public static final SlimefunItemStack LEAVES = new SlimefunItemStack(
                "EM_LEAVES",
                Material.OAK_LEAVES,
                "&fOak leaves",
                "&fUsable in vanilla workbench"
        );
        public static final SlimefunItemStack MAGMA = new SlimefunItemStack(
                "EM_MAGMA_BALL",
                Material.MAGMA_CREAM,
                "&fMagma ball",
                "&fUsable in vanilla workbench"
        );
        public static final SlimefunItemStack TERRACOTA = new SlimefunItemStack(
                "EM_TERRACOTA",
                Material.TERRACOTTA,
                "&fTerracota",
                "&fUsable in vanilla workbench"
        );
        public static final SlimefunItemStack OBSIDIAN = new SlimefunItemStack(
                "EM_OBSIDIAN",
                Material.OBSIDIAN,
                "&fObsidian",
                "&fUsable in vanilla workbench"
        );
        public static final SlimefunItemStack GLASS = new SlimefunItemStack(
                "EM_GLASS",
                Material.GLASS,
                "&fGlass",
                "&fUsable in vanilla workbench"
        );
        public static final SlimefunItemStack SUGAR_CANE = new SlimefunItemStack(
                "EM_SUGAR_CANE",
                Material.SUGAR_CANE,
                "&fSugar cane",
                "&fUsable in vanilla workbench"
        );



    public static void setup(ElementManipulation em){

    new Item(Categories.JUNCTION_CHEAT, CARROT,  JunctionTable.TYPE, new ItemStack[] {
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,null,     null,     null,    null,  CARBON,
            CARBON,null,HYDROGEN,HYDROGEN,null,      CARBON,
            CARBON,null,HYDROGEN,HYDROGEN,null,      CARBON,
            CARBON,null,     null,     null,    null,      CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
    }).setUseableInWorkbench(true).register(em);
    new Item(Categories.JUNCTION_CHEAT, COCOA,  JunctionTable.TYPE, new ItemStack[] {
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON, null,    null,    null,    null,    CARBON,
            NITROGEN,    null,    OXYGEN, OXYGEN,     null,    NITROGEN,
            NITROGEN,    null,    OXYGEN, OXYGEN,     null,         NITROGEN,
            HYDROGEN, null,  null,    null,    null,              HYDROGEN,
            HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,
    }).setUseableInWorkbench(true).register(em);
    new Item(Categories.JUNCTION_CHEAT, NETHER_WART,  JunctionTable.TYPE, new ItemStack[] {
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN, CARBON,
            CARBON,HYDROGEN,OXYGEN,  OXYGEN,  HYDROGEN, CARBON,
            CARBON,HYDROGEN,OXYGEN,  OXYGEN,  HYDROGEN, CARBON,
            CARBON,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN, CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
    }).setUseableInWorkbench(true).register(em);
    new Item(Categories.JUNCTION_CHEAT, POTATO,  JunctionTable.TYPE, new ItemStack[] {
            HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,
            HYDROGEN,null,null,null,null,HYDROGEN,
            HYDROGEN,null,OXYGEN,OXYGEN,null,HYDROGEN,
            CARBON,null,OXYGEN,OXYGEN,null,CARBON,
            CARBON,null,null,null,null,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
    }).setUseableInWorkbench(true).register(em);
    new Item(Categories.JUNCTION_CHEAT, PUMPKIN_SEEDS,  JunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,      HYDROGEN,null,null,null,
            null,HYDROGEN,HYDROGEN,null,null,null,
            null,null,null,           OXYGEN,OXYGEN,null,
            null,null,null,           OXYGEN,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);

    emRedstone = new MultiOutputItem(Categories.JUNCTION_CHEAT, REDSTONE,  JunctionTable.TYPE, new ItemStack[] {
            null,SlimefunItems.PLASTIC_SHEET,COPPER,COPPER,SlimefunItems.PLASTIC_SHEET,null,
            null,SlimefunItems.PLASTIC_SHEET,COPPER,COPPER,SlimefunItems.PLASTIC_SHEET,null,
            null,SlimefunItems.PLASTIC_SHEET,COPPER,COPPER,SlimefunItems.PLASTIC_SHEET,null,
            null,SlimefunItems.PLASTIC_SHEET,COPPER,COPPER,SlimefunItems.PLASTIC_SHEET,null,
            null,SlimefunItems.PLASTIC_SHEET,COPPER,COPPER,SlimefunItems.PLASTIC_SHEET,null,
            null,SlimefunItems.PLASTIC_SHEET,COPPER,COPPER,SlimefunItems.PLASTIC_SHEET,null,
    }, new SlimefunItemStack(REDSTONE, 64));
    new Item(Categories.JUNCTION_CHEAT, SWEET_BERRIES,  JunctionTable.TYPE, new ItemStack[] {
            HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,
            HYDROGEN,HYDROGEN,null,null,            HYDROGEN,HYDROGEN,
            HYDROGEN,null,OXYGEN,OXYGEN,null,                       HYDROGEN,
            CARBON,null,OXYGEN,OXYGEN,null,           CARBON,
            CARBON,CARBON,null,null,   CARBON,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
    }).setUseableInWorkbench(true).register(em);
    new Item(Categories.JUNCTION_CHEAT, WHEAT_SEEDS,  JunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,CARBON,null,null,null,
            null,CARBON,CARBON,null,null,null,
            null,null,null,OXYGEN,OXYGEN,null,
            null,null,null,OXYGEN,null,null,
            null,null,null,null,null,null,
    }).setUseableInWorkbench(true).register(em);
    new Item(Categories.JUNCTION_CHEAT, APPLE,  JunctionTable.TYPE, new ItemStack[] {
            null,null,      null,      OXYGEN,null,null,
            null,HYDROGEN,HYDROGEN,OXYGEN,CARBON,null,
            null,HYDROGEN,OXYGEN,  OXYGEN,CARBON,null,
            null,HYDROGEN,OXYGEN,      OXYGEN,CARBON,null,
            null,HYDROGEN,OXYGEN,     CARBON,CARBON,null,
            null,null,      OXYGEN,      null,null,null,
    }).setUseableInWorkbench(true).register(em);
    new Item(Categories.JUNCTION_CHEAT, BEETROOT_SEEDS,  JunctionTable.TYPE, new ItemStack[] {
            CARBON,null,null,null,null,CARBON,
            CARBON,HYDROGEN,null,null,HYDROGEN,CARBON,
            CARBON,HYDROGEN,OXYGEN,OXYGEN,HYDROGEN,CARBON,
            CARBON,HYDROGEN,OXYGEN,OXYGEN,HYDROGEN,CARBON,
            CARBON,HYDROGEN,null,null,HYDROGEN,CARBON,
            CARBON,null,null,null,null,CARBON,
    }).setUseableInWorkbench(true).register(em);
    new Item(Categories.JUNCTION_CHEAT, BONE,  JunctionTable.TYPE, new ItemStack[] {
            null,OXYGEN,CALCIUM, CALCIUM,OXYGEN,null,
            null,OXYGEN,CALCIUM, CALCIUM,OXYGEN,null,
            null,OXYGEN,CALCIUM, CALCIUM,OXYGEN,null,
            null,OXYGEN,CALCIUM, CALCIUM,OXYGEN,null,
            null,OXYGEN,CALCIUM, CALCIUM,OXYGEN,null,
            null,OXYGEN,CALCIUM, CALCIUM,OXYGEN,null,null,
    }).setUseableInWorkbench(true).register(em);
    new Item(Categories.JUNCTION_CHEAT, GOLD_INGOT,  JunctionTable.TYPE, new ItemStack[] {
            null,null,GOLD,GOLD,null,null,
            null,null,GOLD,GOLD,null,null,
            null,null,GOLD,GOLD,null,null,
            null,null,GOLD,GOLD,null,null,
            null,null,GOLD,GOLD,null,null,
            null,null,GOLD,GOLD,null,null,
    }).setUseableInWorkbench(true).register(em);
    new Item(Categories.JUNCTION_CHEAT, HONEY,  JunctionTable.TYPE, new ItemStack[] {
            CARBON,null,HYDROGEN,HYDROGEN,null,OXYGEN,
            CARBON,null,HYDROGEN,HYDROGEN,null,OXYGEN,
            CARBON,null,HYDROGEN,HYDROGEN,null,OXYGEN,
            CARBON,null,HYDROGEN,HYDROGEN,null,OXYGEN,
            CARBON,null,HYDROGEN,HYDROGEN,null,OXYGEN,
            CARBON,null,HYDROGEN,HYDROGEN,null,OXYGEN,
    }).setUseableInWorkbench(true).register(em);
    new Item(Categories.JUNCTION_CHEAT, INK,  JunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,null,
            null,HYDROGEN,CARBON,CARBON,HYDROGEN,null,
            null,HYDROGEN,CARBON,CARBON,HYDROGEN,null,
            null,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,null,
            null,null,null,null,null,null,
    }).setUseableInWorkbench(true).register(em);
    emLapis = new MultiOutputItem(Categories.JUNCTION_CHEAT, LAPIS_LAZULI,  JunctionTable.TYPE, new ItemStack[] {
            SODIUM,SODIUM,OXYGEN,OXYGEN,CALCIUM,CALCIUM,
            SODIUM,SILICON,SULFUR,SULFUR,SILICON,CALCIUM,
            SODIUM,ALUMINUM,new ItemStack(Material.BLUE_DYE),new ItemStack(Material.BLUE_DYE),ALUMINUM,CALCIUM,
            SODIUM,ALUMINUM,new ItemStack(Material.BLUE_DYE),new ItemStack(Material.BLUE_DYE),ALUMINUM,CALCIUM,
            SODIUM,SILICON,SULFUR,SULFUR,SILICON,CALCIUM,
            SODIUM,SODIUM,OXYGEN,OXYGEN,CALCIUM,CALCIUM,
    }, new SlimefunItemStack(LAPIS_LAZULI, 64));
    new Item(Categories.JUNCTION_CHEAT, MELON_SEEDS,  JunctionTable.TYPE, new ItemStack[] {
            null,null,HYDROGEN,HYDROGEN,null,null,
            null,HYDROGEN,CARBON,CARBON,HYDROGEN,null,
            HYDROGEN,CARBON,OXYGEN,OXYGEN,CARBON,HYDROGEN,
            HYDROGEN,CARBON,OXYGEN,OXYGEN,CARBON,HYDROGEN,
            null,HYDROGEN,CARBON,CARBON,HYDROGEN,null,
            null,null,HYDROGEN,HYDROGEN,null,null
    }).setUseableInWorkbench(true).register(em);
    new Item(Categories.JUNCTION_CHEAT, POISON_POTATO,  JunctionTable.TYPE, new ItemStack[] {
            HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,
            HYDROGEN,SILVER,null,null,CARBON,HYDROGEN,
            HYDROGEN,null,OXYGEN,OXYGEN,null,HYDROGEN,
            CARBON,null,OXYGEN,OXYGEN,null,CARBON,
            CARBON,CARBON,null,null,NITROGEN,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
    }).setUseableInWorkbench(true).register(em);
    new Item(Categories.JUNCTION_CHEAT, SUGAR,  JunctionTable.TYPE, new ItemStack[] {
            HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,
            HYDROGEN,CARBON,CARBON,CARBON,CARBON,HYDROGEN,
            HYDROGEN,CARBON,OXYGEN,OXYGEN,CARBON,HYDROGEN,
            HYDROGEN,CARBON,OXYGEN,OXYGEN,CARBON,HYDROGEN,
            HYDROGEN,CARBON,CARBON,CARBON,CARBON,HYDROGEN,
            HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN
    }).setUseableInWorkbench(true).register(em);
    new Item(Categories.JUNCTION_CHEAT, CLAY,  JunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,SILICON,OXYGEN,null,null,
            null,null,OXYGEN,null,null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);
    new Item(Categories.JUNCTION_CHEAT, COAL,  JunctionTable.TYPE, new ItemStack[] {
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON
    }).setUseableInWorkbench(true).register(em);
    emEmerald = new MultiOutputItem(Categories.JUNCTION_CHEAT, EMERALD,  JunctionTable.TYPE, new ItemStack[] {
            BERYLLIUM,BERYLLIUM,SILICON,SILICON,OXYGEN,OXYGEN,
            BERYLLIUM,SILICON,SILICON,SILICON,SILICON,OXYGEN,
            SILICON,SILICON,SILICON,SILICON,SILICON,SILICON,
            SILICON,SILICON,SILICON,SILICON,SILICON,SILICON,
            ALUMINUM,SILICON,SILICON,SILICON,SILICON,OXYGEN,
            ALUMINUM,ALUMINUM,SILICON,SILICON,OXYGEN,OXYGEN,
    }, new SlimefunItemStack(EMERALD, 64));
    new Item(Categories.JUNCTION_CHEAT, FLINT,  JunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,null,OXYGEN,null,null,
            null,null,OXYGEN,SILICON,null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);
    new Item(Categories.JUNCTION_CHEAT, TEAR,  JunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,HYDROGEN,HYDROGEN,null,null,null,
            null,null,HYDROGEN,SODIUM,null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);
    new Item(Categories.JUNCTION_CHEAT, WATER_BUCKET,  JunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,OXYGEN,HYDROGEN,null,null,
            null,null,HYDROGEN,new ItemStack(Material.BUCKET),null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);
    new Item(Categories.JUNCTION_CHEAT, QUARTZ,  JunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,OXYGEN,null,null,null,
            null,null,SILICON,OXYGEN,null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);

    //blocks

        new Item(Categories.JUNCTION_CHEAT, SAND,  JunctionTable.TYPE, new ItemStack[] {
                OXYGEN, SILICON,OXYGEN, SILICON,OXYGEN, SILICON,
                SILICON,OXYGEN,SILICON,OXYGEN,SILICON,OXYGEN,
                OXYGEN, SILICON,OXYGEN, SILICON,OXYGEN, SILICON,
                SILICON,OXYGEN,SILICON,OXYGEN,SILICON,OXYGEN,
                OXYGEN, SILICON,OXYGEN, SILICON,OXYGEN, SILICON,
                SILICON,OXYGEN, SILICON,OXYGEN, SILICON,OXYGEN
        }).setUseableInWorkbench(true).register(em);
        new Item(Categories.JUNCTION_CHEAT, EGG,  JunctionTable.TYPE, new ItemStack[] {
                null,null,null,null,null,null,
                null,null,CALCIUM, CALCIUM,null,null,
                null,CARBON,OXYGEN,OXYGEN,CARBON,null,
                null,CARBON,OXYGEN,OXYGEN,CARBON,null,
                null,null,CARBON,CARBON,null,null,
                null,null,null,null,null,null
        }).setUseableInWorkbench(true).register(em);
        new Item(Categories.JUNCTION_CHEAT, LEAVES,  JunctionTable.TYPE, new ItemStack[] {
                null,null,null,null,null,null,
                HYDROGEN,HYDROGEN,OXYGEN,OXYGEN,HYDROGEN,HYDROGEN,
                CARBON,CARBON,OXYGEN,OXYGEN,CARBON,CARBON,
                CARBON,CARBON,OXYGEN,OXYGEN,CARBON,CARBON,
                HYDROGEN,HYDROGEN,OXYGEN,OXYGEN,HYDROGEN,HYDROGEN,
                null,null,null,null,null,null
        }).setUseableInWorkbench(true).register(em);
        new Item(Categories.JUNCTION_CHEAT, MAGMA,  JunctionTable.TYPE, new ItemStack[] {
                null,null,null,null,null,null,
                null,MAGNESIUM,MAGNESIUM,MAGNESIUM,MAGNESIUM,null,
                null,MAGNESIUM,SILICON,OXYGEN,MAGNESIUM,null,
                null,MAGNESIUM,OXYGEN,IRON,MAGNESIUM,null,
                null,MAGNESIUM,MAGNESIUM,MAGNESIUM,MAGNESIUM,null,
                null,null,null,null,null,null
        }).setUseableInWorkbench(true).register(em);
        new Item(Categories.JUNCTION_CHEAT, TERRACOTA,  JunctionTable.TYPE, new ItemStack[] {
                ALUMINUM,SILICON,ALUMINUM,SILICON,ALUMINUM,SILICON,
                SILICON,ALUMINUM,SILICON,ALUMINUM,SILICON,ALUMINUM,
                ALUMINUM,SILICON,ALUMINUM,SILICON,ALUMINUM,SILICON,
                SILICON,ALUMINUM,SILICON,ALUMINUM,SILICON,ALUMINUM,
                ALUMINUM,SILICON,ALUMINUM,SILICON,ALUMINUM,SILICON,
                SILICON,ALUMINUM,SILICON,ALUMINUM,SILICON,ALUMINUM
        }).setUseableInWorkbench(true).register(em);
        new Item(Categories.JUNCTION_CHEAT, OBSIDIAN,  JunctionTable.TYPE, new ItemStack[] {
                SILICON,OXYGEN,IRON,OXYGEN,OXYGEN,null,
                OXYGEN,IRON,IRON,OXYGEN,OXYGEN,null,
                SILICON,OXYGEN,IRON,OXYGEN,OXYGEN,null,
                OXYGEN,IRON,IRON,OXYGEN,OXYGEN,null,
                SILICON,OXYGEN,IRON,OXYGEN,OXYGEN,null,
                OXYGEN,IRON,IRON,OXYGEN,OXYGEN,null
        }).setUseableInWorkbench(true).register(em);
        new Item(Categories.JUNCTION_CHEAT, GLASS,  JunctionTable.TYPE, new ItemStack[] {
                SODIUM,CARBON,OXYGEN,OXYGEN,OXYGEN,SODIUM,
                OXYGEN,null,null,null,null,CARBON,
                OXYGEN,null,null,null,null,OXYGEN,
                OXYGEN,null,null,null,null,OXYGEN,
                CARBON,null,null,null,null,OXYGEN,
                SODIUM,OXYGEN,OXYGEN,OXYGEN,CARBON,SODIUM
        }).setUseableInWorkbench(true).register(em);
        new Item(Categories.JUNCTION_CHEAT, SUGAR_CANE,  JunctionTable.TYPE, new ItemStack[] {
                CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
                HYDROGEN,CARBON,CARBON,CARBON,CARBON,HYDROGEN,
                HYDROGEN,CARBON,OXYGEN,OXYGEN,CARBON,HYDROGEN,
                HYDROGEN,CARBON,OXYGEN,OXYGEN,CARBON,HYDROGEN,
                HYDROGEN,CARBON,CARBON,CARBON,CARBON,HYDROGEN,
                CARBON,CARBON,CARBON,CARBON,CARBON,CARBON
        }).setUseableInWorkbench(true).register(em);


        emRedstone.setUseableInWorkbench(true).register(em);
    emLapis.setUseableInWorkbench(true).register(em);
    emEmerald.setUseableInWorkbench(true).register(em);
    }
}