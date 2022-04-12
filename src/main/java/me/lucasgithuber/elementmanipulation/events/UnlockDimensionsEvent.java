package me.lucasgithuber.elementmanipulation.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class UnlockDimensionsEvent extends Event {
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return null;
    }

    @NotNull
    @Override
    public String getEventName() {
        return "Unlock dimension event";
    }

}
