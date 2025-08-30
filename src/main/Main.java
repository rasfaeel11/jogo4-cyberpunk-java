package main;

import main.service.GameEngine;
import main.view.*;

public class Main {
    public static void main(String[] args) {
        GameEngine engine = new GameEngine();
        ConsoleUI ui = new ConsoleUI(engine); 
        ui.iniciarCampanha();
    }
}