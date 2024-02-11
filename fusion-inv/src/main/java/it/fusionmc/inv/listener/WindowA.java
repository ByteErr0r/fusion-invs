package it.fusionmc.inv.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class WindowA implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e){
        e.getWhoClicked().sendMessage("§cHAI FLAGGATO WINDOW A (strano vero?)");
        e.setCancelled(true);
    }

    public void onMove(PlayerMoveEvent e){

    }
}
