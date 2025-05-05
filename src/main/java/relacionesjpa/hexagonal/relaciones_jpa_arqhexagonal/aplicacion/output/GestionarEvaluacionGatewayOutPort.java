package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Evaluacion;

public interface GestionarEvaluacionGatewayOutPort {
    
    public Evaluacion crearEvaluacion(Evaluacion evaluacion);
    
}