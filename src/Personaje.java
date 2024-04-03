import java.util.Arrays;

public abstract class Personaje {

    public Personaje(int vida, int armadura, String nombre){

        this.vida = vida;
        this.armadura = armadura;
        this.nombre = nombre;
    }
    public abstract void presentarse(Personaje p);

    public abstract  void correr();
    
    public int getVida() {
        return vida;
    }

    public int getArmadura() {
        return armadura;
    }

    public String getNombre() {
        return nombre;
    }

    private int vida;
    private int armadura;
    private String nombre;

}
