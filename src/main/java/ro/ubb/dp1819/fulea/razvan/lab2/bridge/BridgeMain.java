package ro.ubb.dp1819.fulea.razvan.lab2.bridge;

import ro.ubb.dp1819.fulea.razvan.lab2.bridge.race.InternationalRace;
import ro.ubb.dp1819.fulea.razvan.lab2.bridge.race.LocalRace;
import ro.ubb.dp1819.fulea.razvan.lab2.bridge.race.Race;
import ro.ubb.dp1819.fulea.razvan.lab2.bridge.service.AntiqueCarCreationService;
import ro.ubb.dp1819.fulea.razvan.lab2.bridge.service.CarCreationService;
import ro.ubb.dp1819.fulea.razvan.lab2.bridge.service.ModernCarCreationService;

public class BridgeMain {

    public static void run() {
        CarCreationService antiqueService = new AntiqueCarCreationService();
        CarCreationService modernService = new ModernCarCreationService();

        Race transylvaniaRace = new LocalRace(antiqueService);
        Race dakarRace = new InternationalRace(modernService);

        transylvaniaRace.start();
        dakarRace.start();
    }

}
