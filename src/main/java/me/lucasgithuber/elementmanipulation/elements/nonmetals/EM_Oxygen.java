package me.lucasgithuber.elementmanipulation.elements.nonmetals;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import me.lucasgithuber.elementmanipulation.Items;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class EM_Oxygen extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {
    public EM_Oxygen (ItemGroup c) {

        super(c, Items.EM_Oxygen, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
        });

    }

    @Nonnull
    @Override
    public ItemUseHandler getItemHandler() {
        return PlayerRightClickEvent::cancel;
    }
}