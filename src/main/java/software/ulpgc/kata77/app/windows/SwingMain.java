package software.ulpgc.kata77.app.windows;

import javax.swing.*;

public class SwingMain {

    public static void main(String[] args) {
        new JFrame() {

            {
                this.setTitle("Kata7");
                this.setSize(400,400);
                this.setLocationRelativeTo(null);
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        }.setVisible(true);
    }
}
