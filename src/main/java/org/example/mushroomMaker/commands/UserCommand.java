package org.example.mushroomMaker.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.example.mushroomMaker.Main;

import javax.annotation.Nonnull;

public class UserCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@Nonnull CommandSender commandSender, @Nonnull Command command, @Nonnull String s, @Nonnull String[] strings) {
        if (commandSender instanceof Player player) {
            ItemStack item = new ItemStack(Material.TOTEM_OF_UNDYING, 1);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName("램프");
            meta.getPersistentDataContainer().set(Main.getKey(), PersistentDataType.BOOLEAN, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
        }
        return false;
    }
}
