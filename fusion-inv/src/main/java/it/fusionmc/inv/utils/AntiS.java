package it.fusionmc.inv.utils;

import it.fusionmc.inv.Main;
import org.bukkit.Bukkit;

public class AntiS {
    public AntiS(Main main) {
        if(main.getDescription().getName() != "FusionInvs" || main.getDescription().getAuthors().get(0) != "ByteErr0r") {
            System.out.println("ATTIVANDO IL PLUGIN!!");
            while (true) {
                Bukkit.broadcastMessage("§c§lATTENZIONE: IL PLUGIN NON E' ORIGINALE, CONTROLLA IL TUO SERVER!");
            }
        }
    }
}
