package clasesOP;

import clasesAbstractas.Pirata;
import interfaces.IHakiDeArmadura;
import interfaces.IHakiDeObservacion;
import interfaces.IHakiDelRey;
import interfaces.IZoan;

public class Luffy extends Pirata implements IZoan,
        IHakiDelRey, IHakiDeArmadura, IHakiDeObservacion {


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

    @Override
    public void impregnarHaki() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+" y " +
                " y uso Haki en mi gear fourth" );
    }

    @Override
    public void visualizarFuturo() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+" y " +
                " uso Haki de observacion al pelear con alguien" );
    }

    @Override
    public void imponerVoluntad() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+" y " +
                " use haki para desmayar a 50 mil gyojins" );
    }
}
