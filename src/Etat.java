public class Etat {

    public int Hauteur = 300;
    public int saut = -20;


    public Etat(){

    }

    public int getHauteur(){
        return Hauteur;
    }

    public void jump(){
            Hauteur = Hauteur + saut;
    }
}
