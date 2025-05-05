package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.casosDeUso;

import java.util.List;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input.GestionarEvaluacionCUIntPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Evaluacion;

public class GestionarEvaluacionCUAdapter implements GestionarEvaluacionCUIntPort {

    @Override
    public Evaluacion crearEvaluacion(Evaluacion evaluacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearEvaluacion'");
    }

    @Override
    public List<Evaluacion> listarEvaluaciones() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarEvaluaciones'");
    }
    
}
