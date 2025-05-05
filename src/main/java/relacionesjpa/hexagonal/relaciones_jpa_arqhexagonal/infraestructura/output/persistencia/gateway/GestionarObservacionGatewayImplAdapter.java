package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.gateway;

import java.util.List;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.GestionarObservacionGatewayOutPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Observacion;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.repositorios.ObservacionesRepositoryInt;

public class GestionarObservacionGatewayImplAdapter implements GestionarObservacionGatewayOutPort {

    private final ObservacionesRepositoryInt objObservacionRepository;

    public GestionarObservacionGatewayImplAdapter(ObservacionesRepositoryInt objObservacionRepository){
        this.objObservacionRepository = objObservacionRepository;
    }

    @Override
    public Observacion crearObservacion(Observacion observacon) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearObservacion'");
    }

    @Override
    public List<Observacion> listarObservaciones() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarObservaciones'");
}

}