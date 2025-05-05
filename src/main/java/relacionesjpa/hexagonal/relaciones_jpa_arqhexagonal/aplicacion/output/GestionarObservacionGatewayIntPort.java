package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output;

import java.util.List;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Observacion;

public interface GestionarObservacionGatewayIntPort {
    
    public Observacion crearObservacion(Observacion observacon);
    public List<Observacion> listarObservaciones();
    
}
