package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.casosDeUso;

import java.util.List;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input.GestionarObservacionCUIntPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.FormateadorResultadosOutPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.GestionarObservacionGatewayIntPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Observacion;

public class GestionarObservacionCUAdapter implements GestionarObservacionCUIntPort {

    private final GestionarObservacionGatewayIntPort objGestionarObservacionGateway;
    private final FormateadorResultadosOutPort objFormateadorResultadosOutPort;

    public GestionarObservacionCUAdapter(GestionarObservacionGatewayIntPort objGestionarObservacionGateway,
        FormateadorResultadosOutPort objFormateadorResultadosOutPort    
    ){
        this.objGestionarObservacionGateway = objGestionarObservacionGateway;
        this.objFormateadorResultadosOutPort = objFormateadorResultadosOutPort;
    }

    @Override
    public Observacion crearObservacion(Observacion observacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearObservacion'");
    }

    @Override
    public List<Observacion> listarObservaciones() {
       List<Observacion> observaciones = this.objGestionarObservacionGateway.listarObservaciones();
       if(observaciones.isEmpty()){
        this.objFormateadorResultadosOutPort.retornarRespuestaErrorEntidadNoExiste("Error, no hay observaciones ");
       }
       return observaciones;
    }
    
}
