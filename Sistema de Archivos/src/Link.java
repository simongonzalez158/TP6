import java.util.Date;

public class Link extends Elemento{
    private Elemento vinculo;
    private final float tamanio = 1;

    public Link (String nombre, Date fechaCreacion, Elemento vinculo){
        super(nombre, fechaCreacion);
        this.vinculo = vinculo;
    }
    public Elemento getVinculo() {
        return vinculo;
    }

    @Override
    public float getTamanio() {
        return tamanio;
    }

    @Override
    public int getCantElem() {
        return vinculo.getCantElem() + 1;
    }
}
