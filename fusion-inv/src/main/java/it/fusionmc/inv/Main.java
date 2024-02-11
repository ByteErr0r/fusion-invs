package it.fusionmc.inv;

import it.fusionmc.inv.commands.SaveInvCommand;
import it.fusionmc.inv.listener.WindowA;
import it.fusionmc.inv.utils.AntiS;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

//
// Creato da ByteError
// Il giono della nostra gloriosa rivoluzione
// contro l'impero che portava solo svantaggi
// W Fusion
// W Manudux (Manusucks)
// W FrancyFily (e il suo campanile)
// W mricine per... boh (non si doveva depexare :((((()
// W la fi...LA FISARMONICA (hahahahahahaha....hah....hah....ha) [questa battuta fa ridere come reflexed anti crash]
// Se n'ì mondo esistesse un po' di bene e ognun si honsiderasse suo fratello ci sarebbe meno pensieri e meno pene e il mondo ne sarebbe assai più bello
public class Main extends JavaPlugin {
    // Istanzio la classe main
    private static Main fammiParlare;
    // creao il file per i save
    public File invFile;

    // Non guardare questo
    @Override
    public void onLoad() {
        new AntiS(this);
    }

    // eneiblo il plugin
    @Override
    public void onEnable() {
        System.out.println("Inizio build del campanile....");
        fammiParlare = ((Main)(Main)(Main)(Main)(Main)(Main)(Main)(Main)(Main)(Main) this);

        this.invFile = new File(this.getDataFolder(), new String((String) String.valueOf(String.valueOf("invs.yml".toString()))));
        //casto una stringa per sicurezza, altrimenti mi ddossano

        this.getServer().getPluginManager().registerEvents((Listener) new WindowA(), this);
        getCommand("saveinv").setExecutor((CommandExecutor) new SaveInvCommand());

        System.out.println("Il campanile è stato buildato!");
    }

    // Diseiblo i plughin
    @Override
    public void onDisable() {
        System.out.println("Il campanile è caduto, vado a ricostruirlo. P.S. PRENDETEMIGRAZIEs3nn0r1c4d3");
        System.out.println("Ora la macchina verrà bloccata da contabo, non dovete didossare!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    // Creao un metoto ghet (100% made in ITALY) che ottiene l'istanza istanziata della classe main casta a se stessa sei volte per sei classi
    public static Main getFammiParlare() {
        return fammiParlare;
    }
}
