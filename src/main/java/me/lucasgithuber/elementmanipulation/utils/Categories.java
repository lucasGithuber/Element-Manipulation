package me.lucasgithuber.elementmanipulation.utils;

import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;
import me.lucasgithuber.elementmanipulation.Textures;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.experimental.UtilityClass;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;

import static me.lucasgithuber.elementmanipulation.ElementManipulation.MM;


@UtilityClass
public class Categories {
    public static final ItemGroup EMELEMENTS = new SubGroup(
            "em_elements",
            new CustomItemStack(Textures.EMELEMENTS_GUI.getAsItem(), BukkitComponentSerializer.legacy().serialize
                    (MM.parse("<gradient:#ff0000:#f4ff00>Elements</gradient>")))
    );

    public static final ItemGroup EMMAIN = new MultiGroup(
            "em_manipulation",
            new CustomItemStack(Textures.EMMAIN_GUI.getAsItem(), BukkitComponentSerializer.legacy().serialize
                    (MM.parse("<gradient:#ff0000:#f4ff00>Elements Manipulation</gradient>"))),
            EMELEMENTS
    );

}