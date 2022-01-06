package me.lucasgithuber.elementmanipulation;


import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.lucasgithuber.elementmanipulation.items.EMMaterials;
import me.lucasgithuber.elementmanipulation.utils.Metrics;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.markdown.DiscordFlavor;
import net.kyori.adventure.text.minimessage.transformation.TransformationType;

public final class ElementManipulation extends AbstractAddon implements SlimefunAddon {
    private static ElementManipulation i;

    public static final MiniMessage MM = MiniMessage.builder()
            .removeDefaultTransformations()
            .transformation(TransformationType.COLOR)
            .transformation(TransformationType.DECORATION)
            .transformation(TransformationType.GRADIENT)
            .markdown()
            .markdownFlavor(DiscordFlavor.get())
            .build();

    public ElementManipulation() {
        super("lucasGithuber", "Element-Manipulation", "master", "options.auto-update");
    }
    @Override
    public void enable() {
        // Instance and super
        i = this;
        // Setup items and listeners
        Setup.setup(this);
        Items.setup(this);
        EMMaterials.setup(this);

        Metrics metrics = new Metrics(this, 13718);
    }

    @Override
    public void disable() {
        // Set instance to null
        i = null;
    }

    public static ElementManipulation i() {
        return i;
    }

}