package ro.ubb.dp1819.examples.behavioural.state;

import ro.ubb.dp1819.examples.behavioural.state.ui.Player;
import ro.ubb.dp1819.examples.behavioural.state.ui.UI;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
