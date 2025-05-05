package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.PatronEstado;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.GestionarFormatoAGatewayOutPort;

public class EstCorrecion implements IntEstado{

    private GestionarFormatoAGatewayOutPort objGestionarFormatoGateway;
    
    public EstCorrecion(GestionarFormatoAGatewayOutPort objGestionarFormatoGateway) {
        this.objGestionarFormatoGateway = objGestionarFormatoGateway;
    }

    @Override
    public Resultado enviarAEvaluacion(Integer idFormato) {
        objGestionarFormatoGateway.cambiarEstado(idFormato, "evaluacion");
        return new Resultado(true, "El formato ha sido enviado para evaluación");
    }

    @Override
    public Resultado aprobar(Integer idFormato) {
        return new Resultado(false, "No se puede aprobar un formato en corrección");
    }

    @Override
    public Resultado rechazar(Integer idFormato) {
        return new Resultado(false, "No se puede rechazar un formato en corrección");
    }

    @Override
    public Resultado enviarACorreccion(Integer idFormato) {
        return new Resultado(false, "El formato ya se encuentra en corrección");
    }
    
}
