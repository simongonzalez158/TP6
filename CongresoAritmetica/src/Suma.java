public class Suma extends Termino{
    public Suma (Expresion e1, Expresion e2, String operador){
        super(e1, e2, operador);
    }

    @Override
    public float getValor() {
        return getElem1().getValor() + getElem2().getValor();
    }
}
