package me.lucasgithuber.elementmanipulation.elements.alcalines;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import me.lucasgithuber.elementmanipulation.utils.RecipeTypes;
import me.lucasgithuber.elementmanipulation.Items;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class EMCaesium extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {
    public EMCaesium(ItemGroup c) {

        super(c, Items.EM_Caesium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{
                null, null, null,
                null,null,null
                ,null,null,null
        });

    }

    @Nonnull
    @Override
    public ItemUseHandler getItemHandler() {
        return PlayerRightClickEvent::cancel;
    }
}