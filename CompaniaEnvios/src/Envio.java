public abstract class Envio {
    private static int count = 0;
    private int nroTracking;
    public Envio(){
        count ++;
        this.nroTracking = count;
    }

    public int getNroTracking() {
        return nroTracking;
    }

    public void setNroTracking(int nroTracking) {
        this.nroTracking = nroTracking;
    }
    public abstract String getDireccion();
    public abstract Persona getRemitente();
    public abstract Persona getDestinatario();
    public abstract float getPeso();
}
