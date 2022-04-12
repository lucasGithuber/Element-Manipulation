package me.lucasgithuber.elementmanipulation.utils;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import me.lucasgithuber.elementmanipulation.elements.Neon;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class ElementsListener implements Listener {
    @EventHandler(priority = EventPriority.LOWEST)
    public void onUseNeon(PlayerInteractEvent event) {
        final Player p = event.getPlayer();
        final SlimefunItem item = SlimefunItem.getByItem(p.getInventory().getItemInMainHand());

        if (item instanceof Neon) {
        }
    }
}
