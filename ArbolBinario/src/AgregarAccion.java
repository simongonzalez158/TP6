import java.util.ArrayList;
import java.util.List;

public class AgregarAccion implements AccionEjecutable{
    private List<Nodo> lista;
    public AgregarAccion(){
        List<Nodo> lista = new ArrayList<>();
    }
    @Override
    public void ejecutar(Nodo nodo) {
        lista.add(nodo);
    }

    public List<Nodo> getLista() {
        return lista;
    }
}
