package org.example.mushroomMaker.events;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.example.mushroomMaker.Main;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Objects;

public class UserEvent implements Listener {
    private ArrayList<ItemStack> items;
    private int coin;
    private int emerald;

    @EventHandler
    public void onUserEvent(PlayerInteractEvent event) {
        ItemStack item = event.getItem();
        if (item == null || item.getType() == Material.AIR) {
            return;
        }

        if (event.getAction() == Action.LEFT_CLICK_AIR && event.getAction() == Action.RIGHT_CLICK_AIR) {
            if (item.hasItemMeta() && Objects.requireNonNull(item.getItemMeta()).getPersistentDataContainer().has(Main.getKey())) {

            }
        }
    }
}
