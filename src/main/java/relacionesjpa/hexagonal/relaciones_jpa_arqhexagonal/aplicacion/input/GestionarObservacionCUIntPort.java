package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input;

import java.util.List;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Observacion;

public interface GestionarObservacionCUIntPort {
    
    public Observacion crearObservacion(Observacion observacion);
    public List<Observacion> listarObservaciones();
    
}
