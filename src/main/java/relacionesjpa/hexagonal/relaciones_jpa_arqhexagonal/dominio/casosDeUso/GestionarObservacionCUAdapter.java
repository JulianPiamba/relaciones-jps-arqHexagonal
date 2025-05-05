package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.casosDeUso;

import java.util.List;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input.GestionarObservacionCUIntPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Observacion;

public class GestionarObservacionCUAdapter implements GestionarObservacionCUIntPort {

    @Override
    public Observacion crearObservacion(Observacion observacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearObservacion'");
    }

    @Override
    public List<Observacion> listarObservaciones() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarObservaciones'");
    }
    
}
