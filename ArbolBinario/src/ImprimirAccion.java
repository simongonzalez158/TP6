public class ImprimirAccion implements AccionEjecutable{

    @Override
    public void ejecutar(Nodo nodo) {
        System.out.println(nodo.getValor() + " ");
    }
}
