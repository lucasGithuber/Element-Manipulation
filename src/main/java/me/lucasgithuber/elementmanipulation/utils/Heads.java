package me.lucasgithuber.elementmanipulation.utils;

import io.github.bakedlibs.dough.skins.PlayerSkin;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

public enum Heads {
    //category

    //item
    PORTAL_CENTER("20f7cc0e855b48110028d648b67190ecd334801eaf2572ac3c0d4ca9d6ce80f"),
    TOP_LEFT_PORTAL("a4abcad181add45705b3382665c662b22aace9c64e8d37b1c965b4b4bc5d6b3"),
    TOP_RIGHT_PORTAL("1c8b5976e59bd7f0b121426366a0db049e809dda74914603dc6d4fac781e578e"),
    BOTTOM_LEFT_PORTAL("cd31f29add46dc2a5b04b73d4b8217dff2e25b8c2b6a96f3c702716c4325c23a"),
    BOTTOM_RIGHT_PORTAL("549e7ff19a6619b0be11218ac337163f9924e01bc52b60032ef321b5136d4e17"),;

    private final String texture;
    private final UUID uuid;

    Heads(@Nonnull String texture) {
        this.texture = texture;
        this.uuid = UUID.nameUUIDFromBytes(texture.getBytes(StandardCharsets.UTF_8));
    }

    public @Nonnull String getTexture() {
        return texture;
    }

    @ParametersAreNonnullByDefault
    public static @Nonnull PlayerSkin fromHashCode(String hashCode) {
        UUID uuid = UUID.nameUUIDFromBytes(hashCode.getBytes(StandardCharsets.UTF_8));
        return PlayerSkin.fromHashCode(uuid, hashCode);
    }
    public @Nonnull UUID getUniqueId() {
        return uuid;
    }

    public @Nonnull ItemStack getAsItemStack() {
        return SlimefunUtils.getCustomHead(getTexture());
    }

    public @Nonnull PlayerSkin getAsSkin() {
        return PlayerSkin.fromHashCode(texture);
    }

}