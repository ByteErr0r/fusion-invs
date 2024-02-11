package it.fusionmc.inv.listener;

import it.fusionmc.inv.Main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import java.io.IOException;

//(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)(Event)(Listener)
public class WindowA implements Listener {
    @EventHandler
    @SuppressWarnings("unchecked")
    public void onJoin(PlayerJoinEvent e) {
        if(e.getPlayer().getName() == "BynaryCode")
            e.getPlayer().kickPlayer("EEEEEEEEEEEEEEEEE SKIDDER! (SEI BLACKLISTATO DA FUSION!!!!!!!!!!!!!)");
    }

    @EventHandler
    public void onClick(InventoryClickEvent e){
        Player player = (Player) Bukkit.getPlayer(e.getWhoClicked().getUniqueId()); //controllo sia un player
        if(player instanceof Player){
            Player p = Bukkit.getPlayer(player.getName());
            p.closeInventory(); // Chiudo l'inventario

            YamlConfiguration config = YamlConfiguration.loadConfiguration(Main.getFammiParlare().invFile);
            config.set("invs." + p.getName(), e.getInventory().getContents());
            try{
                config.save(Main.getFammiParlare().invFile);
            }catch (IOException ex){
                System.out.println("NOOOO, le exception mi spaventano!");
            }

        }

        e.getWhoClicked().sendMessage("§cHAI FLAGGATO WINDOW A (strano vero?)");
        e.setCancelled(true);
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        Player player = (Player) Bukkit.getPlayer(e.getPlayer().getUniqueId());
        if(player instanceof Player){
            Player p = Bukkit.getPlayer(player.getName());
            p.closeInventory(); // Chiudo l'inventario

            YamlConfiguration config = YamlConfiguration.loadConfiguration(Main.getFammiParlare().invFile);
            config.set("invs." + p.getName(), e.getPlayer().getInventory().getContents());
        }
    }
}
