package me.lucasgithuber.elementmanipulation.elements;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemDropHandler;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.Optional;

public class Potassium extends SimpleSlimefunItem<ItemDropHandler> {
    protected Potassium(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @NotNull
    @Override
    public ItemDropHandler getItemHandler() {
        return (e, p, item) -> {
            if (isItem(item.getItemStack())) {

                if (!canUse(p, true)) {
                    return true;
                }

                Slimefun.runSync(() -> activate(p, item), 20L);

                return true;
            }
            return false;
        };
    }

    private void activate(@Nonnull Player p, @Nonnull Item potassium) {
        // Being sure the entity is still valid and not picked up or whatsoever.
        if (!potassium.isValid()) {
            return;
        }

        Location l = potassium.getLocation();
        Collection<Entity> entites = l.getWorld().getNearbyEntities(l, 2, 2, 2);
        Optional<Entity> optional = entites.stream().findFirst();

        if (optional.isPresent()) {
            Item item = (Item) optional.get();
            ItemStack itemStack = item.getItemStack();

            if (itemStack.getAmount() == 1) {
                Slimefun.runSync(() -> {
                    // Being sure entities are still valid and not picked up or whatsoever.
                    if (potassium.isValid() && potassium.getLocation().getBlock().getType() == Material.WATER) {

                        l.getBlock().setType(Material.AIR);
                        l.getWorld().createExplosion(l, 3);
                        l.getWorld().playSound(l, Sound.ENTITY_GENERIC_EXPLODE, 0.3F, 1);

                        potassium.remove();
                    } else {
                        p.sendMessage(ChatColor.RED + "Element couldn't explode");
                    }
                }, 10L);
            } else {
                p.sendMessage(ChatColor.RED + "Element wasnt able to explode");
            }
        }
    }
}

