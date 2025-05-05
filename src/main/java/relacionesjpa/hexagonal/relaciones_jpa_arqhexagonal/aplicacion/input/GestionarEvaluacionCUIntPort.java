package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input;

import java.util.List;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Evaluacion;

public interface GestionarEvaluacionCUIntPort {
    
    public Evaluacion crearEvaluacion(Evaluacion evaluacion);
    public List<Evaluacion> listarEvaluaciones();

}
