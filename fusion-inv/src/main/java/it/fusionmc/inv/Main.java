package it.fusionmc.inv;

import it.fusionmc.inv.commands.SaveInvCommand;
import it.fusionmc.inv.listener.WindowA;
import it.fusionmc.inv.utils.AntiS;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Main extends JavaPlugin {
    private static Main fammiParlare;
    public File invFile;

    @Override
    public void onLoad() {
        new AntiS(this);
    }

    @Override
    public void onEnable() {
        System.out.println("Inizio build del campanile....");
        fammiParlare = this;

        this.invFile = new File(this.getDataFolder(), "invs.yml");

        this.getServer().getPluginManager().registerEvents(new WindowA(), this);
        getCommand("saveinv").setExecutor(new SaveInvCommand());

        System.out.println("Il campanile è stato buildato!");
    }
    @Override
    public void onDisable(){
        System.out.println("Il campanile è caduto, vado a ricostruirlo. P.S. PRENDETEMIGRAZIEs3nn0r1c4d3");
    }

    public static Main getFammiParlare() {
        return fammiParlare;
    }
}
