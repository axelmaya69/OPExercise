package clasesOP;

import clasesAbstractas.Marin;
import interfaces.ILogia;

public class Akainu extends Marin implements ILogia {
    public Akainu(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void detenerPiratas() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+", DETENGANSE" +
                " MALDITOS PIRATAS!" );
    }

    @Override
    public void defenderTenryubitos() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+" y defiendo a los " +
                "tenryubitos" );
    }

    @Override
    public void defender() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+" y defiendo a la marina" +
                "de los asquerosos piratas" );
    }

    @Override
    public void hablar() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+", MALDITOS PIRATAS!!!!" );
    }

    @Override
    public void mostrarNombreFruta() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+" y m ifruta es la Magu Magu" +
                "no Mi tipo Logia" );
    }

    @Override
    public void mostrarHabilidad() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+" y mi fruta" +
                "hace que mi cuerpo se convierta en lava" );
    }

    @Override
    public void atacar() {
        System.out.println("Soy "+getNombre()+" "+getApellido()+" y ataco" +
                "con la lava que sale de mi cuerpo" );
    }
}
