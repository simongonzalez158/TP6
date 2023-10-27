public class ContadorAccion implements AccionEjecutable{
    private int contador;
    public ContadorAccion(){
        contador = 0;
    }
    @Override
    public void ejecutar(Nodo nodo) {
        contador++;
    }

    public int getContador() {
        return contador;
    }
}
