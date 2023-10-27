import java.util.Date;

public abstract class Elemento {
    private String nombre;
    private Date fechaCreacion;

    public Elemento(String nombre, Date fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public abstract float getTamanio();
    public abstract int getCantElem();
}
