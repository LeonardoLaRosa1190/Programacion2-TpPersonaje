import java.util.Arrays;

public class Main {

    public static void main (String[] args){
        Personaje mago1 = new Mago(90,85,"Mago Gris");
        Personaje mago2 = new Mago(87,95,"Dumbledore");
        Personaje guerrero1 = new Guerrero(150,120,"Aquiles");

        mago1.presentarse(mago1);
        mago2.presentarse(mago2);
        guerrero1.presentarse(guerrero1);



    }
}
