
public class Main {
    public static void main(String[] args) {
        Planta Mango=new Planta("Mango", 3,"si","no");
        Mango.accion();
        System.out.println("------------------------------------------------------");
        Planta Verdura=new Planta("Lechuga",20,"No","SI");
        Verdura.accion();
        System.out.println("------------------------------------------------------");
        Planta Arbol=new Planta("Secuoya",100,"NO","NO");
        Arbol.accion();
        System.out.println("------------------------------------------------------");
        Planta mandarina=new Planta("Mandarina",5,"SI","NO");
        mandarina.accion();
        System.out.println("-------------------------------------------------------");
        Planta Manzana=new Planta("Manzana",2,"SI","NO");
        Manzana.accion();

        }



    }
