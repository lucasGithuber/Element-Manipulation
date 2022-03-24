package me.lucasgithuber.elementmanipulation.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.operations.CraftingOperation;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.Items;
import me.lucasgithuber.elementmanipulation.elements.Elements;
import me.lucasgithuber.elementmanipulation.utils.RockAnalyzerGui;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RockAnalyzer extends RockAnalyzerGui implements RecipeDisplayItem {

    public RockAnalyzer(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Nonnull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 4);

        for (MachineRecipe recipe : recipes) {
            displayRecipes.add(recipe.getInput()[0]);
            displayRecipes.add(recipe.getOutput()[0]);
        }

        return displayRecipes;
    }
    @Override
    public void tick(Block b) {
        BlockMenu inv = BlockStorage.getInventory(b);
        CraftingOperation currentOperation = processor.getOperation(b);

        if (currentOperation != null) {
            if (takeCharge(b.getLocation())) {

                if (!currentOperation.isFinished()) {
                    processor.updateProgressBar(inv, 22, currentOperation);
                    currentOperation.addProgress(1);
                } else {
                    inv.replaceExistingItem(22, new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE, " "));

                    for (ItemStack output : currentOperation.getResults()) {
                        if (inv.hasViewer()) {
                            switch (ThreadLocalRandom.current().nextInt(2)) {
                                case 0:
                                inv.pushItem(output.clone(), getOutputSlots());
                                inv.pushItem(new CustomItemStack(Elements.CARBON.clone(), 1), getOutputSlots());
                                case 1:
                                inv.pushItem(output.clone(), getOutputSlots());
                                inv.pushItem(new CustomItemStack(Elements.OXYGEN.clone(), 1), getOutputSlots());
                            }
                        }
                        else{
                            inv.pushItem(output.clone(), getOutputSlots());
                        }
                    }

                    processor.endOperation(b);
                }
            }
        } else {
            MachineRecipe next = findNextRecipe(inv);

            if (next != null) {
                getMachineProcessor().startOperation(b, new CraftingOperation(next));
            }
        }
    }

    @Override
    protected void registerDefaultRecipes() {
        registerRecipe(4, new ItemStack[]{new ItemStack(Material.COBBLESTONE)},
                new ItemStack[]{new CustomItemStack(SlimefunItems.STONE_CHUNK, 4)});
    }

    @Nonnull
    @Override
    public String getMachineIdentifier() {
        return "ROCK_ANALYZER";
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.SPYGLASS);
    }
}