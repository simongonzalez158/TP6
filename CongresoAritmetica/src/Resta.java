public class Resta extends Termino{
    public Resta (String operador, Expresion e1, Expresion e2){
        super(e1, e2, operador);
    }
    @Override
    public float getValor() {
        return getElem1().getValor() - getElem2().getValor();
    }

}
