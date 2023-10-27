import java.util.Date;

public class Archivo extends Elemento{
    private Date fechaUltMod;
    private float tamanio;
    public Archivo (String nombre, Date fechaCreacion, Date fechaUltMod, float tamanio){
        super(nombre, fechaCreacion);
        this.fechaUltMod = fechaUltMod;
        this.tamanio = tamanio;
    }
    public Date getFechaUltMod() {
        return fechaUltMod;
    }

    public float getTamanio() {
        return tamanio;
    }

    @Override
    public int getCantElem() {
        return 1;
    }
}
