package clasesOP;

import clasesAbstractas.Pirata;
import interfaces.IHakiDeArmadura;
import interfaces.IParamencia;

public class Tralfgar extends Pirata implements IParamencia , IHakiDeArmadura {
    public Tralfgar(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void buscarElOnePiece() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+" y busco el one piece " +
                "con beppo y los demas" );
    }

    @Override
    public void hablar() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+" y soy doctor, de los piratas" +
                "de corazon" );
    }

    @Override
    public void mostrarNombreFruta() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+" y mi fruta es la " +
                "Ope Ope no Mi tipo Paramencia" );
    }

    @Override
    public void mostrarHabilidad() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+" y mi habilidad es" +
                " cambiar de posicion a cosas y humanos y tambien de dividir" );
    }

    @Override
    public void atacar() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+" y te ataco con mi" +
                "yasho letal en mi espada" );
    }

    @Override
    public void impregnarHaki() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+" y " +
                " y uso haki para protegerme de los ataques de barbanegra y sus " +
                "aliados" );
    }
}
