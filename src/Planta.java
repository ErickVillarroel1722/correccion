public class Planta {


    private String nombre;
    private String Fruta;
    private String Verdura;
    private int Altura;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFruta() {
        return Fruta;
    }

    public void setFruta(String fruta) {
        Fruta = fruta;
    }

    public String getVerdura() {
        return Verdura;
    }

    public void setVerdura(String verdura) {
        Verdura = verdura;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int altura) {
        Altura = altura;
    }



    public Planta(String nombre,int altura, String fruta, String verdura) {
        this.nombre=nombre;
        Fruta = fruta;
        Verdura = verdura;
        Altura = altura;
    }

    public void accion(){
        System.out.println("Nombre " +getNombre());
            System.out.println("Altura " +getAltura() );
            System.out.println("Fruta  " +getFruta() );
            System.out.println("Verdura " + getVerdura() );
            System.out.println("El "+getNombre()+ " es un@ "+getNombre());

    }

}
