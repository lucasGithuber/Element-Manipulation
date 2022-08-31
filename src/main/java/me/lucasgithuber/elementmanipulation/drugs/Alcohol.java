package me.lucasgithuber.elementmanipulation.drugs;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import javax.annotation.Nonnull;

public class Alcohol extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {
    private final String durationsPath = "drugs.alcohol.effects-duration.";
    private final String powersPath = "drugs.alcohol.effects-power.";
    public Alcohol(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);

    }

    @Override
    public void preRegister() {
        addItemHandler(onUse());
    }

    @Nonnull
    @Override
    public ItemUseHandler getItemHandler() {
        return PlayerRightClickEvent::cancel;
    }

    @Nonnull
    protected ItemUseHandler onUse() {
        return e -> {
            Player p = e.getPlayer();
            ItemStack itemStack = p.getInventory().getItemInMainHand();
            if (p.getGameMode() != GameMode.CREATIVE && itemStack.getAmount()>=1) {
                itemStack.setAmount(itemStack.getAmount() - 1);
            }
            p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, ElementManipulation.config().getInt(durationsPath + "nausea") * 20, 2, false, false, false));
            p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, ElementManipulation.config().getInt(durationsPath + "regeneration") * 20, 0, false, false, false));

        };
    }
}