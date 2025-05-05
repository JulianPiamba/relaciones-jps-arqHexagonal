package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.PatronEstado;

import org.springframework.stereotype.Service;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.GestionarFormatoAGatewayIntPort;

@Service
public class EstEvaluacion implements IntEstado{

    private GestionarFormatoAGatewayIntPort objGestionarFormatoGateway;

    public EstEvaluacion(GestionarFormatoAGatewayIntPort objGestionarFormatoGateway) {
        this.objGestionarFormatoGateway = objGestionarFormatoGateway;
    }

    @Override
    public Resultado enviarAEvaluacion(Integer idFormato) {
        return new Resultado(false, "El formato ya se encuentra en evaluación");
    }

    @Override
    public Resultado aprobar(Integer idFormato) {
        objGestionarFormatoGateway.cambiarEstado(idFormato, "aprobado");
        return new Resultado(true, "El formato ha sido aprobado exitosamente");
    }

    @Override
    public Resultado rechazar(Integer idFormato) {
        objGestionarFormatoGateway.cambiarEstado(idFormato, "rechazado");
        return new Resultado(true, "El formato ha sido rechazado");
    }

    @Override
    public Resultado enviarACorreccion(Integer idFormato) {
        objGestionarFormatoGateway.cambiarEstado(idFormato, "evaluacion");
        return new Resultado(true, "El formato ha sido enviado a corrección");
    }
    
}
