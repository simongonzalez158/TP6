public class Multiplicacion extends Termino{
    public Multiplicacion(Expresion elem1, Expresion elem2, String operador) {
        super(elem1, elem2, operador);
    }

    @Override
    public float getValor() {
        return getElem1().getValor() * getElem2().getValor();
    }
}
