package me.lucasgithuber2.elementmanipulation.elements.alkalineearth;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import me.lucasgithuber2.elementmanipulation.Items;
import me.lucasgithuber2.elementmanipulation.utils.RecipeTypes;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class EMCalcium extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {
    public EMCalcium(ItemGroup c) {

        super(c, Items.EM_Calcium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{
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