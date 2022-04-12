package me.lucasgithuber.elementmanipulation.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.multiblocks.MultiBlockMachine;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.ItemUtils;
import io.github.thebusybiscuit.slimefun4.libraries.paperlib.PaperLib;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.block.Dispenser;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.List;

public class PortalTable extends MultiBlockMachine {

    public static final RecipeType PORTAL_TABLE_RECIPETYPE = new RecipeType(
            new NamespacedKey(ElementManipulation.i(), "em_portal_table_type"),
            Machines.PORTAL_TABLE,
            "",
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize("<rainbow:3>This is the right place to</rainbow>")),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize("<rainbow:2>manipulate atoms the most subatomic</rainbow>")),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize("<rainbow:1>way, and create corners for making inter-dimensional portals</rainbow>"))
    );


    public PortalTable(ItemGroup category, SlimefunItemStack item, ItemStack[] recipe, BlockFace blockFace) {
        super(category, item, recipe, blockFace);
    }

    @Override
    public void onInteract(Player p, Block b) {
        Block dispBlock = b.getRelative(BlockFace.DOWN);
        BlockState state = PaperLib.getBlockState(dispBlock, false).getState();

        if (state instanceof Dispenser disp) {
            Inventory inv = disp.getInventory();
            List<ItemStack[]> inputs = RecipeType.getRecipeInputList(this);

            for (ItemStack[] input : inputs) {
                if (canCraft(inv, input)) {
                    ItemStack output = RecipeType.getRecipeOutputList(this, input).clone();

                    if (SlimefunUtils.canPlayerUseItem(p, output, true)) {
                        craft(dispBlock, p, b, inv, input, output);
                    }

                    return;
                }
            }

            if (SlimefunUtils.isInventoryEmpty(inv)) {
                Slimefun.getLocalization().sendMessage(p, "machines.inventory-empty", true);
            } else {
                Slimefun.getLocalization().sendMessage(p, "machines.pattern-not-found", true);
            }
        }
    }

    private boolean canCraft(Inventory inv, ItemStack[] recipe) {
        for (int j = 0; j < inv.getContents().length; j++) {
            if (!SlimefunUtils.isItemSimilar(inv.getContents()[j], recipe[j], true)) {
                return false;
            }
        }

        return true;
    }

    protected void craft(Block dispenser, Player p, Block b, Inventory inv, ItemStack[] recipe, ItemStack output) {
        Inventory fakeInv = createVirtualInventory(inv);
        Inventory outputInv = findOutputInventory(output, dispenser, inv, fakeInv);

        craftItem(inv, recipe, b);
        if (outputInv != null) {

            outputInv.addItem(output);
        } else {

            dispenser.getWorld().dropItem(b.getLocation(), output);
            Slimefun.getLocalization().sendMessage(p, "machines.full-inventory", true);
        }
        p.sendMessage(ChatColor.WHITE + "" + ChatColor.BOLD + output.getItemMeta().getDisplayName() + " is done!");
    }

    public void craftItem(Inventory inv, ItemStack[] recipe, Block b){
        for (int j = 0; j < 9; j++) {
            ItemStack item = inv.getContents()[j];

            if (item != null && item.getType() != Material.AIR && SlimefunUtils.isItemSimilar(inv.getContents()[j], recipe[j], true)) {
                ItemUtils.consumeItem(item, recipe[j].getAmount(),true);
            }
        }
        Bukkit.getScheduler().runTaskLater(ElementManipulation.i(), () -> {
            b.getWorld().playEffect(b.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
            b.getWorld().spawnParticle(Particle.CLOUD, b.getLocation().add(0.3, 0.4, 0.45), 2, 0.1, 0.1, 0.1, 0.1);
            b.getWorld().playSound(b.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);

            Bukkit.getScheduler().runTaskLater(ElementManipulation.i(), () -> {
                b.getWorld().playEffect(b.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
                b.getWorld().spawnParticle(Particle.FLASH, b.getLocation().add(0.4, 0.45, 0.5), 2, 0.1, 0.1, 0.1, 0.1);
                b.getWorld().spawnParticle(Particle.CLOUD, b.getLocation().add(0.4, 0.45, 0.5), 2, 0.1, 0.1, 0.1, 0.1);
                b.getWorld().playSound(b.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);

                Bukkit.getScheduler().runTaskLater(ElementManipulation.i(), () -> {
                    b.getWorld().playEffect(b.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
                    b.getWorld().spawnParticle(Particle.CLOUD, b.getLocation().add(0.2, 0.3, 0.2), 2, 0.1, 0.1, 0.1, 0.1);
                    b.getWorld().playSound(b.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);

                    Bukkit.getScheduler().runTaskLater(ElementManipulation.i(), () -> {
                        b.getWorld().playEffect(b.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
                        b.getWorld().spawnParticle(Particle.FLASH, b.getLocation().add(0.35, 0.4, 0.4), 2, 0.1, 0.1, 0.1, 0.1);
                        b.getWorld().spawnParticle(Particle.CLOUD, b.getLocation().add(0.35, 0.4, 0.4), 2, 0.1, 0.1, 0.1, 0.1);
                        b.getWorld().playSound(b.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);

                    }, 30);
                }, 30);
            }, 30);
        }, 30);
    }

    protected @Nonnull
    Inventory createVirtualInventory(@Nonnull Inventory inv) {
        Inventory fakeInv = Bukkit.createInventory(null, 9, "Fake Inventory");

        for (int j = 0; j < inv.getContents().length; j++) {
            ItemStack stack = inv.getContents()[j];

            if (stack != null) {
                stack = stack.clone();
                ItemUtils.consumeItem(stack, true);
            }

            fakeInv.setItem(j, stack);
        }

        return fakeInv;
    }


}