import java.util.ArrayList;
import java.util.List;

public class ComboPostal extends Envio{
    private List<Envio> envios;
    public ComboPostal(){
        this.envios = new ArrayList<>();
    }

    @Override
    public String getDireccion() {
        //if (!envios.isEmpty()) {
            Envio e = envios.get(0);
            return e.getDestinatario().getDireccion();
        //}
    }
    public Persona getDestinatario(){
        //if (!envios.isEmpty()) {
            Envio e = envios.get(0);
            return e.getDestinatario();
        //}
    }
    public Persona getRemitente(){
        //if (!envios.isEmpty()) {
            Envio e = envios.get(0);
            return e.getRemitente();
       // }
    }
    public void addEnvio (Envio e){
        if (tieneMismaDireccion(e)){
            envios.add(e);
            e.setNroTracking(this.getNroTracking());
        }
    }
    private boolean tieneMismaDireccion(Envio e){
        if (!envios.isEmpty()) {
            return e.getDireccion().equals(this.getDireccion());
        } else return true;
    }
    @Override
    public float getPeso(){
        float res = 0;
        for (Envio e: envios){
            res += e.getPeso();
        }
        return res;
    }
}
