package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.PatronEstado;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.GestionarFormatoAGatewayOutPort;

public class EstFormulado implements IntEstado{

    private  GestionarFormatoAGatewayOutPort objGestionarFormatoGateway;

    public EstFormulado(GestionarFormatoAGatewayOutPort objGestionarFormatoGateway) {
        this.objGestionarFormatoGateway = objGestionarFormatoGateway;
    }

    @Override
    public Resultado enviarAEvaluacion(Integer idFormato) {
        objGestionarFormatoGateway.cambiarEstado(idFormato, "evaluacion");
        return new Resultado(true, "El formato ha sido enviado a evalacuion exitosamente");
    }

    @Override
    public Resultado aprobar(Integer idFormato) {
        return new Resultado(false, "No se puede aprobar un formato en estado formulado");
    }

    @Override
    public Resultado rechazar(Integer idFormato) {
        return new Resultado(false, "No se puede rechazar un formato en estado formulado");
    }

    @Override
    public Resultado enviarACorreccion(Integer idFormato) {
        return new Resultado(false, "No se puede enviar a corrección un formato en estado formulado");
    }
    
}
