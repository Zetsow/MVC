import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // création des objets qui contiennent les autres objets
        Etat etat = new Etat();
        Affichage affichage = new Affichage(etat);
        Control control = new Control(etat,affichage);
        JFrame test = new JFrame("flappy");
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.add(affichage);
        test.pack();
        test.setVisible(true);
    }
}
