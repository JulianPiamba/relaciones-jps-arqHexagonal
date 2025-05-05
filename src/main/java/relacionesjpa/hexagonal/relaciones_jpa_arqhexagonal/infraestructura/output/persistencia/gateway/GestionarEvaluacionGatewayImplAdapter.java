package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.gateway;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.GestionarEvaluacionGatewayOutPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Evaluacion;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.repositorios.EvaluacionesRepositoryInt;

public class GestionarEvaluacionGatewayImplAdapter implements GestionarEvaluacionGatewayOutPort {

    private final EvaluacionesRepositoryInt objEvaluacionRepository;

    public GestionarEvaluacionGatewayImplAdapter(EvaluacionesRepositoryInt objEvaluacionRepository){
        this.objEvaluacionRepository = objEvaluacionRepository;
    }

    @Override
    public Evaluacion crearEvaluacion(Evaluacion evaluacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearEvaluacion'");
    }
    
}