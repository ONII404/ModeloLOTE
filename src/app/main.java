package app;

import app.gui.GUI;

public class main {

    public static void main(String[] args) {

        createAndShowGUI();

    }

    public static void createAndShowGUI() {

        GUI gui = new GUI();
        gui.setVisible(true);

    }
}
