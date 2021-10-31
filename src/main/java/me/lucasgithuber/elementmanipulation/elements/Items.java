package me.lucasgithuber.elementmanipulation.elements;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.Textures;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.configuration.Configuration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;

import static me.lucasgithuber.elementmanipulation.ElementManipulation.MM;

public class Items {

    public static final SlimefunItemStack EM_Hydrogen = new SlimefunItemStack("MAGICALCHARMS_BLAZE", Textures.EM_HYDROGEN.getHash(), BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#38CA08:#25FF09>Hydrogen</gradient>")), "", "&7Non-Metal");

    private static final Configuration cfg = ElementManipulation.i().getConfig();

    static {
        ItemMeta meta = EM_Hydrogen.getItemMeta();
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        EM_Hydrogen.setItemMeta(meta);
        EM_Hydrogen.addUnsafeEnchantment(Enchantment.WATER_WORKER, 3);
    }

}
