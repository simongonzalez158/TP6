import java.util.Date;

public class ArchivoComprimido extends Directorio{
    private float tasaCompresion;
    public ArchivoComprimido(String nombre, Date fechaCreacion, float tasaCompresion){
        super(nombre, fechaCreacion);
        this.tasaCompresion = tasaCompresion;
    }

    @Override
    public float getTamanio() {
        return super.getTamanio()/tasaCompresion;
    }

    @Override
    public int getCantElem() {
        return super.getCantElem();
    }
}
