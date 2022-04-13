package me.lucasgithuber.elementmanipulation.items;

import io.github.bakedlibs.dough.skins.PlayerHead;
import io.github.bakedlibs.dough.skins.PlayerSkin;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.machines.PortalTable;
import me.lucasgithuber.elementmanipulation.utils.BigLore;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import me.lucasgithuber.elementmanipulation.utils.RecipeTypes;
import me.lucasgithuber.elementmanipulation.utils.Util;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public class PortalCorners {
 static final SlimefunItemStack TOP_LEFT_PORTAL = new SlimefunItemStack(
            "EM_TOP_LEFT_PORTAL",
            new ItemStack(Material.GOLD_NUGGET),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#FF0000:#B60E4F>Top left portal corner</gradient>")),
            "",
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#FF0000:#B60E4F>The top left corner of the trans-dimensional portal</gradient>")),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#FF0000:#B60E4F>This one is responsible for making the other world physic</gradient>"))
    );

    public static void setup(ElementManipulation em){
        SlimefunItem dimensionsInfo = new SlimefunItem(
                Categories.INFO,
                Util.bigLoreItem(
                "EM_INFO_DIMENSIONS",
                PlayerHead.getItemStack(PlayerSkin.fromHashCode("d7c9b88ed3060bbef34a78f120dfe20bf76b982211fc46c640188b1517e196e2")),
                ChatColor.GREEN + "How to go to other dimensions",
                BigLore.INFO_DIMENSIONS,
                ChatColor.of("#192371"),
                "For going to other dimensions, you must have",
                "crafted one of any recipe in a deconstructor",
                "placed by you, 262144 times",
                "",
                "For example, you must have put a carrot in the deconstructor",
                "input slot 262144 times"
                ),
                RecipeTypes.INFO,
                new ItemStack[]{}
        );
        dimensionsInfo.register(em);
        new SlimefunItem(Categories.DIMENSIONS, TOP_LEFT_PORTAL, PortalTable.PORTAL_TABLE_RECIPETYPE, new ItemStack[]{
        }).register(em);

    }
}
