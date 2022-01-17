import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Control implements MouseListener {

    public Etat et;
    public Affichage a;

    public Control(Etat e , Affichage af) {
        this.et = e;
        this.a = af;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        et.jump();
        a.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
