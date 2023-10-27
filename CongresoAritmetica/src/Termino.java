import java.util.ArrayList;
import java.util.List;

public abstract class Termino extends Expresion{
    private Expresion elem1;
    private Expresion elem2;
    private String operador;

    public Termino(Expresion elem1, Expresion elem2, String operador) {
        this.elem1 = elem1;
        this.elem2 = elem2;
        this.operador = operador;
    }

    public Expresion getElem1() {
        return elem1;
    }
    public Expresion getElem2() {
        return elem2;
    }

    public String getOperador() {
        return operador;
    }

    @Override
    public List<Float> getNumeros() {
        List<Float> result = new ArrayList<>();
        result.addAll(elem1.getNumeros());
        result.addAll(elem2.getNumeros());
        return result;
    }

    @Override
    public List<String> getOperadores() {
        List<String> result = new ArrayList<>();
        result.add(operador);
        result.addAll(elem1.getOperadores());
        result.addAll(elem2.getOperadores());
        return result;
    }

    public abstract float getValor();

    public String toString(){
        return "(" + elem1.toString() + String.valueOf(operador) + elem2.toString() + ")";
    }
}
