import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Directorio extends Elemento{
    private List<Elemento> elementos;
    public Directorio(String nombre, Date fechaCreacion){
        super(nombre, fechaCreacion);
        this.elementos = new ArrayList<>();
    }
    public void addElemento (Elemento e){
        elementos.add(e);
    }

    public List<Elemento> getElementos() {
        return elementos;
    }

    public float getTamanio() {
        float res = 0;
        for (Elemento e: elementos){
            res += e.getTamanio();
        }
        return res;
    }

    @Override
    public int getCantElem() {
        int res = 0;
        for (Elemento e: elementos){
            res += e.getCantElem();
        }
        return res;
    }
}
