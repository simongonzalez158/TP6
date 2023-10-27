public class PaqueteCarta extends Envio{
    private Persona remitente;
    private Persona destinatario;
    private Boolean envioDomicilio;
    private float peso;
    public PaqueteCarta (Persona r, Persona d, Boolean envioDomicilio, float p){
        this.remitente = r;
        this.destinatario = d;
        this.envioDomicilio = envioDomicilio;
        this.peso = p;
    }

    @Override
    public String getDireccion() {
        return destinatario.getDireccion();
    }

    public Persona getRemitente() {
        return remitente;
    }

    public Persona getDestinatario() {
        return destinatario;
    }

    public Boolean getEnvioDomicilio() {
        return envioDomicilio;
    }

    @Override
    public float getPeso() {
        return peso;
    }
}
