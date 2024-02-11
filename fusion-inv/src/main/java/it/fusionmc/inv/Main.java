package it.fusionmc.inv;

import it.fusionmc.inv.commands.SaveInvCommand;
import it.fusionmc.inv.listener.WindowA;
import it.fusionmc.inv.utils.AntiS;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static Main fammiParlare;

    @Override
    public void onLoad() {
        new AntiS(this);
    }

    @Override
    public void onEnable() {
        System.out.println("Inizio build del campanile....");
        fammiParlare = this;
        
        this.getServer().getPluginManager().registerEvents(new WindowA(), this);
        getCommand("saveinv").setExecutor(new SaveInvCommand());

        System.out.println("Il campanile è stato buildato!");
    }

    public static Main getFammiParlare() {
        return fammiParlare;
    }
}
