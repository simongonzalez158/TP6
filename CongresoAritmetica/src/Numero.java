import java.util.ArrayList;
import java.util.List;

public class Numero extends Expresion{
    private float valor;
    public Numero(float valor){
        this.valor = valor;
    }

    @Override
    public float getValor() {
        return valor;
    }

    @Override
    public List<Float> getNumeros() {
        List<Float> result = new ArrayList<>();
        result.add(valor);
        return result;
    }

    @Override
    public List<String> getOperadores() {
        List<String> res = new ArrayList<>();
        return res;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}
