
public class Mago extends Personaje{
    public Mago(int vida, int armadura, String nombre) {
        super(vida, armadura, nombre);
    }
    public void correr(){
        System.out.println("Estoy corriendo como un mago " );
    }

    public void presentarse (Personaje p) {
        System.out.println("Soy un Mago");
        System.out.println("Mi nombre es: " + p.getNombre());
        System.out.println("Mi armadura es: " + p.getArmadura());
        System.out.println("Mi porcentaje de vida es: " + p.getVida());
    }

}


