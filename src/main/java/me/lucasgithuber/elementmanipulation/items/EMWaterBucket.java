package me.lucasgithuber.elementmanipulation.items;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import me.lucasgithuber.elementmanipulation.Setup;
import me.lucasgithuber.elementmanipulation.utils.RecipeTypes;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class EMWaterBucket extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {
    public EMWaterBucket(ItemGroup c) {

        super(c, Setup.WATER, RecipeTypes.EM_JUNCTIONTABLE, new ItemStack[]{
                null,null,null,null,null,null,
                null,null,null,null,null,null,
                null,null,null,null,null,null,
                null,null,null,null,null,null,
                null,null,null,null,null,null,
                null,null,null,null,null,null
        });

    }

    @Nonnull
    @Override
    public ItemUseHandler getItemHandler() {
        return PlayerRightClickEvent::cancel;
    }
}