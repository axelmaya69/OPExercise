package clasesAbstractas;

public abstract class Pirata extends Humano{

    public Pirata(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public abstract void buscarElOnePiece();

}
