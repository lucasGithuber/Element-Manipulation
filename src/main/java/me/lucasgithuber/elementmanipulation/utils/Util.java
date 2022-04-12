package me.lucasgithuber.elementmanipulation.utils;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;

public class Util {

    @Nonnull
    @ParametersAreNonnullByDefault
    public static SlimefunItemStack bigLoreItem(String id, ItemStack itemStack, String name, BigLore color, ChatColor colorForLore, String... lore) {
        ChatColor passiveColor = ChatColor.GRAY;
        List<String> finalLore = new ArrayList<>();
        finalLore.add("");
        for (String s : lore) {
            finalLore.add(passiveColor + s);
        }
        finalLore.add("");
        finalLore.add(colourString(ChatColor.GREEN, color.lore()));
        return new SlimefunItemStack(
                id,
                itemStack,
                Util.colourString(colorForLore, name),
                finalLore.toArray(new String[finalLore.size() - 1])
        );
    }
    public static String colourString(ChatColor color, String string) {
        return color + string;
    }

}
