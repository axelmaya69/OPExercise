package clasesOP;

import clasesAbstractas.Pirata;
import interfaces.IZoan;

public class Luffy extends Pirata implements IZoan {


    public Luffy(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void buscarElOnePiece() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+" y busco el one piece" );
    }

    @Override
    public void hablar() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+" y " +
                "soy el hombre que se convertirá en el rey de los piratas." );
    }

    @Override
    public void mostrarNombreFruta() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+" y mi fruta " +
                " es la gomu gomu no mi" );
    }

    @Override
    public void mostrarHabilidad() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+" y mi fruta hace que " +
                " me estire con todo mi cuerpo" );
    }

    @Override
    public void atacar() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+" y " +
                "ataco con mi cuerpo de goma" );
    }
}
