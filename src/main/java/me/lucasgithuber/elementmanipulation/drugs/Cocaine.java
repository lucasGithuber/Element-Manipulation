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

public class Cocaine extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {
    private String durationsPath = "drugs.cocaine.effects-duration.";
    private String powersPath = "drugs.cocaine.effects-power.";
    public Cocaine(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
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
            if (p.getGameMode() != GameMode.CREATIVE && itemStack.getAmount()>=4) {
                itemStack.setAmount(itemStack.getAmount() - 4);
            }
            p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, ElementManipulation.config().getInt(durationsPath + "night-vision") * 20, ElementManipulation.config().getInt(powersPath + "night-vision")-1, false, false, false));
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, ElementManipulation.config().getInt(durationsPath + "speed") * 20,  ElementManipulation.config().getInt(powersPath + "speed")-1, false, false, false));
            p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, ElementManipulation.config().getInt(durationsPath + "nausea") * 20,  ElementManipulation.config().getInt(powersPath + "nausea")-1, false, false, false));
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, ElementManipulation.config().getInt(durationsPath + "strength") * 20,  ElementManipulation.config().getInt(powersPath + "strength")-1, false, false, false));
            p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, ElementManipulation.config().getInt(durationsPath + "regeneration") * 20,  ElementManipulation.config().getInt(powersPath + "regeneration")-1, false, false, false));
        };
    }
}