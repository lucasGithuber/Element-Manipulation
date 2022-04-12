package me.lucasgithuber.elementmanipulation.utils;

import lombok.Getter;
import net.md_5.bungee.api.ChatColor;


public enum BigLore {
    INFO_DIMENSIONS(ChatColor.of("#192371"), "");


    @Getter
    private final ChatColor color;
    @Getter
    private final String lore;
    BigLore(ChatColor color, String lore){
        this.color=color;
        this.lore=lore;
    }
}
