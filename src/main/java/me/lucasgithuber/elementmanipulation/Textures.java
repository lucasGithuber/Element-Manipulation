package me.lucasgithuber.elementmanipulation;

import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public enum Textures {
    //Categories
    EMMAIN_GUI("3c0dae47a7675ba073d7ef55741f0fa5cce8b634e00ace65451c5576c27acc78"),
    EMELEMENTS_GUI("1528be6d4263dadce613a7bbc0423aa76a39c74846702fa85c2787a7f53c4"),
    EMMACHINES_GUI("8f14f3179b86f69b3efa7472dacaeb2339f6290d2d817362793348abd98e021"),
    //Elements
    GREEN("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjBhMWNlZWRmNzI5YzRjMjFkMzVhYzQ5YTE4YWEyNWZiM2JmMTU5OGJiNjAwNjI3MzdiODc4NThlNGI1YzAwMiJ9fX0="),
    //Machines
    EM_DECONSTRUCTOR("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmRhNDgyNjcwYWQ3NDQ2NjA4MTg4M2ZlN2VkZDQ4ZGVjMjdhNjk4YTlhNTJjNGY4NzAzMTBiYTAzNWFjZjY5NiJ9fX0=");
    private final String hash;

    Textures(@Nonnull String hash) {
        this.hash = hash;
    }

    @Nonnull
    public String getHash() {
        return hash;
    }

    @Nonnull
    @Override
    public String toString() {
        return this.hash;
    }

    @Nonnull
    public ItemStack getAsItem() {
        return PlayerHead.getItemStack(PlayerSkin.fromHashCode(getHash()));
    }
}
