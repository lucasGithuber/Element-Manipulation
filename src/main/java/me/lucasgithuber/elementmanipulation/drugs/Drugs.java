package me.lucasgithuber.elementmanipulation.drugs;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.machines.DrugsTable;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.Color;
import org.bukkit.inventory.ItemStack;

import static me.lucasgithuber.elementmanipulation.elements.Elements.*;

public class Drugs {
    public static final SlimefunItemStack CAFFEINE = new SlimefunItemStack(
            "EM_CAFFEINE",
            Material.COCOA_BEANS,
            ChatColor.of("#5E3719")+"Caffeine",
            ChatColor.of("#5E3719")+"Lets you awaken"
    );
    public static final SlimefunItemStack COCAINE = new SlimefunItemStack(
            "EM_COCAINE",
            Material.SUGAR,
            ChatColor.WHITE +"Cocaine",
            ChatColor.WHITE +"Makes you feel good"

    );
    public static final SlimefunItemStack ALCOHOL = new SlimefunItemStack(
            "EM_ALCOHOL",
            Color.White,
            new PotionEffect(PotionEffectType.NIGHT_VISION 2, 0),
            ChatColor.of("#FFD78A") + "Alcohol",
            ChatColor.of("#FFD78A") + "Makes you drunk",
            ChatColor.of("#FFD78A") + "Makes emotional pain go away",
    );
    public static final SlimefunItemStack ANESTHESIC = new SlimefunItemStack(
            "EM_ANESTHESIC",
            Material.END_ROD,
            "&8anesthesic",
            "&8Makes you feel good"

    );
    public static void setup(ElementManipulation em){
        new Caffeine(Categories.DRUGS_CHEAT, CAFFEINE, DrugsTable.TYPE, new ItemStack[]{
                null,null,null,OXYGEN,null,null,
                null,null,null,CARBON,null,null,
                NITROGEN,null,CARBON,null,NITROGEN,HYDROGEN,
                HYDROGEN,null,CARBON,null,CARBON,OXYGEN,
                null,NITROGEN,null,NITROGEN,null,null,
                null,null,null,HYDROGEN,null,null
        }).register(em);
        new Cocaine(Categories.DRUGS_CHEAT, COCAINE, DrugsTable.TYPE, new ItemStack[]{
                null,null,null,null,HYDROGEN,null,
                NITROGEN,null,OXYGEN,null,NITROGEN,null,
                null,OXYGEN,null,CARBON,null,null,
                HYDROGEN,null,CARBON,CARBON,CARBON,null,
                null,null,null,CARBON,null,null,
                null,null,null,HYDROGEN,NITROGEN,HYDROGEN
        }).register(em);
        new Alcohol(Categories.DRUGS_CHEAT, ALCOHOL, DrugsTable.TYPE, new ItemStack[]{
                new ItemStack(Material.GLASS_BOTTLE),HYDROGEN,HYDROGEN,null,null,null,
                HYDROGEN,CARBON,CARBON,OXYGEN,HYDROGEN,null,
                null,HYDROGEN,HYDROGEN,null,null,null,
                null,HYDROGEN,HYDROGEN,null,null,null,
                HYDROGEN,CARBON,CARBON,OXYGEN,HYDROGEN,null,
                null,HYDROGEN,HYDROGEN,null,null,null,
        }).register(em);
        new Anesthetic(Categories.DRUGS_CHEAT, ANESTHESIC, DrugsTable.TYPE, new ItemStack[]{
                ,CARBON,NITROGEN,NITROGEN,CARBON,HYDROGEN,
                HYDROGEN,CARBON,NITROGEN,NITROGEN,CARBON,HYDROGEN,
                HYDROGEN,CARBON,NITROGEN,NITROGEN,CARBON,HYDROGEN,
                HYDROGEN,CARBON,NITROGEN,NITROGEN,CARBON,HYDROGEN,
                HYDROGEN,CARBON,NITROGEN,NITROGEN,CARBON,HYDROGEN,
                HYDROGEN,CARBON,NITROGEN,NITROGEN,CARBON,HYDROGEN,
        }).register(em);
    }
}
