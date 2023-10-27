import java.util.ArrayList;
import java.util.List;

public class AgregarInversoAccion implements AccionEjecutable{
    private List<Nodo> elementosInversos;
    public AgregarInversoAccion(){
        this.elementosInversos = new ArrayList<>();
    }

    @Override
    public void ejecutar(Nodo nodo) {
        elementosInversos.add(0, nodo);
    }

    public List<Nodo> getElementosInversos() {
        return elementosInversos;
    }
}
