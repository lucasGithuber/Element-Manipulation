package me.lucasgithuber.elementmanipulation;

import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public enum Textures {
    //Categories
    EMMAIN_GUI("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjNjMDUwYWVhZWY1MmE0NTFhZGJhZWIxNDI4ZGZmOGZmNjFiMmEyZGU4Y2M1YTQzOTc5Yjk0MTU0NzQ3ZDhjMiJ9fX0"),
    EMELEMENTS_GUI("8375534f873f7cbd516084a208bad30546008622f5e3792b36b58538aa156943"),

    //Elements
    EM_HYDROGEN("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjBhMWNlZWRmNzI5YzRjMjFkMzVhYzQ5YTE4YWEyNWZiM2JmMTU5OGJiNjAwNjI3MzdiODc4NThlNGI1YzAwMiJ9fX0");
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
