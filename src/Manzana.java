public class Manzana extends Planta{
    public Manzana(String nombre, int altura, String fruta, String verdura) {
        super(nombre, altura, fruta, verdura);
    }

    public void accion(){
        System.out.println("Nombre " +getNombre());
        System.out.println("Altura " +getAltura() );
        System.out.println("Fruta  " +getFruta() );
        System.out.println("Verdura " + getVerdura() );
        System.out.println("El "+getNombre()+ " es una "+getFruta());

    }
}
