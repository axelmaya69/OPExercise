package clasesAbstractas;

public abstract class Marin extends Humano{

    public Marin(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public abstract void detenerPiratas();
    public abstract void defenderTenryubitos();
    public abstract void defender();
}
