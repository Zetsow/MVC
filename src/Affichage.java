import java.awt.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Affichage extends JPanel {
    public Etat e;
    public static final int LARG = 600;
    public static final int HAUT = 400;
    public int Xo = 50 ;
    public int wo = 20 ;
    public int ho = 60;


    public Affichage(Etat et) {
        this.e = et;
        setPreferredSize(new Dimension(LARG, HAUT));

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval( Xo, e.getHauteur(), wo, ho );
    }
}
