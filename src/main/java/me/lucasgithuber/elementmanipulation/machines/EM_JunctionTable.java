package me.lucasgithuber.elementmanipulation.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.Items;
import me.lucasgithuber.elementmanipulation.elements.nonmetals.EM_Hydrogen;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import me.lucasgithuber.elementmanipulation.utils.GiantTable;
import me.lucasgithuber.elementmanipulation.utils.RecipeTypes;
import org.bukkit.Material;
import org.bukkit.configuration.Configuration;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;


public class EM_JunctionTable extends GiantTable implements RecipeDisplayItem {

    public EM_JunctionTable(ItemGroup c) {

        super(c, Items.EM_Deconstructor, RecipeType.ANCIENT_ALTAR, new ItemStack[]{
                Items.EM_Hydrogen, SlimefunItems.ELECTRO_MAGNET, Items.EM_Oxygen,
                SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.ANCIENT_ALTAR, SlimefunItems.BLISTERING_INGOT_3,
                SlimefunItems.ANCIENT_PEDESTAL, SlimefunItems.HEATED_PRESSURE_CHAMBER, SlimefunItems.ANCIENT_PEDESTAL
        });
        this.setProcessingSpeed(1).setCapacity(64).setEnergyConsumption(16);

    }

    SlimefunItemStack item;
    //getting config just like apeiros
    ElementManipulation em = ElementManipulation.i();
    Configuration cfg = em.getConfig();

    boolean waterJunctionEnabled = cfg.getBoolean("options.junctions.water-junction");
    boolean hardenedTransmutationEnabled = cfg.getBoolean("options.transmutations.hardened-transmutation");
    boolean steelTransmutationEnabled = cfg.getBoolean("options.transmutations.steel-transmutation");
    boolean damascusTransmutationEnabled = cfg.getBoolean("options.transmutations.damascus-transmutation");
    boolean compressedCarbonTransmutationEnabled = cfg.getBoolean("options.transmutations.compressed-carbon-transmutation");
    boolean useSlimefunItemCustomModelData = cfg.getBoolean("options.transmutations.use-same-custommodeldata");
    public void registerDefaultRecipes() {
// adding recipes
        registerRecipe(8, new ItemStack[] {Items.EM_Hydrogen, Items.EM_Oxygen, Items.EM_Hydrogen},
                new ItemStack[] {new ItemStack(Material.WATER_BUCKET)
                });
            item = new SlimefunItemStack("EM_WATER_BUCKET", Material.IRON_INGOT, "Water bucket");
        }



    @Nonnull
    @Override
    public String getMachineIdentifier() {
        return "EM_JUNCTIONTABLE";
    }
}