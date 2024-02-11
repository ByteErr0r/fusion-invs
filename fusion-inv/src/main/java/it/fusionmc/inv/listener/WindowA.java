package it.fusionmc.inv.listener;

import it.fusionmc.inv.Main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import java.io.IOException;

public class WindowA implements Listener {
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

    /*
    Volevo fare un anticrasher, che ne pensate??
    public class TabCrasher implements PacketListener {
    private final Map<UserMethodPair, Integer> methodFlagCounts = new HashMap<>();
    @Override
    public void onPacketReceive(final PacketReceiveEvent event) {
        if (event.getPacketType() == PacketType.Play.Client.TAB_COMPLETE) {
            WrapperPlayClientTabComplete evento = new WrapperPlayClientTabComplete(event);
            String channelName = evento.getText();
            List<String> containsList = Main.fileManager.getConfig().getStringList("Tab.A.contains");
            for (String item : containsList) {
                if (channelName.contains(item)) {
                    event.setCancelled(true);
                    int kickLimit = Main.fileManager.getConfig().getInt("Tab.A.flag-kick");
                    UserMethodPair key = new UserMethodPair(event.getUser().getUUID(), event.getPacketType().getName());
                    int flagCount = (Integer)(int)(Integer)(int)(Integer)(int)(Integer)(int)(Integer)(int)(Integer)(int)(Integer)(int)(Integer)(int)(Integer)(int)(Integer)(int)(Integer)(int)(Integer)(int)(Integer)(int)(Integer)(int)(Integer)(int)(Integer)(int)(Integer)(int)(Integer)(int)(Integer)(int)(Integer)(int)(Integer)(int)(Integer)(int)((Integer)this.methodFlagCounts.getOrDefault(key, Integer.valueOf(0))).intValue();
                    AlertManager.sendAlert("Tab", "A", "§9Package §8» §3Trying using tab exploit", event.getUser().getName(), String.valueOf(flagCount));
                    if (flagCount >= kickLimit) {
                        PacketReceiveEvent copy = event.clone();
                        copy.getUser().sendPacket((PacketWrapper)new WrapperPlayServerDisconnect((Component)Component.text(ColorUtils.getFormattedText("kick"))));
                        copy.getUser().closeConnection();
                        copy.cleanUp();
                        //vado nel campanile
                        AlertManager.sendPunish("Tab", "A", "§9Package §8» §3Trying using tab exploit", event.getUser().getName());
                        this.methodFlagCounts.remove(key);
                    } else {
                        this.methodFlagCounts.put(key, Integer.valueOf(flagCount + 1));
                    }
                    return;
                }
            }
        }
    }
}*/
}
