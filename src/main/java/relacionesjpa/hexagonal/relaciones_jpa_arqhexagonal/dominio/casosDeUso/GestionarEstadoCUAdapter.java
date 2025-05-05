package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.casosDeUso;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input.GestionarEstadoCUIntPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.GestionarFormatoAGatewayOutPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.PatronEstado.EstAprobado;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.PatronEstado.EstCorrecion;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.PatronEstado.EstEvaluacion;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.PatronEstado.EstFormulado;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.PatronEstado.EstRechazado;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.PatronEstado.Resultado;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.servicio.EstadoService;

public class GestionarEstadoCUAdapter implements GestionarEstadoCUIntPort {

    private EstadoService estadoService;
    private final GestionarFormatoAGatewayOutPort objGestionarFormatoGateway;

    public GestionarEstadoCUAdapter(EstadoService estadoService,
        GestionarFormatoAGatewayOutPort objGestionarFormatoGateway
    ){
        this.estadoService = estadoService;
        this.objGestionarFormatoGateway = objGestionarFormatoGateway;
    }

    @Override
    public String cambiarEstado(Integer idFormato, String estado) {
        //FormatoA formato = objGestionarFormatoGateway.buscarFormatoPorId(idFormato);

        // if (formato == null) {
        //     return "Formato no encontrado";
        // }

        Resultado resultado = null;

        //this.asignarEstado(formato.getEstado().getEstadoActual());

        switch (estado) {
            case "evaluacion":
                resultado = estadoService.enviarAEvaluacion(idFormato);
                break;
            case "aprobar":
                resultado = estadoService.aprobar(idFormato);
                break;
            case "rechazar":
                resultado = estadoService.rechazar(idFormato);
                break;
            case "enviarACorreccion":
                resultado = estadoService.enviarACorreccion(idFormato);
                break;
            default:
                return "Estado no válido";
        }

        return resultado.message();
    }

    private void asignarEstado(String estado) {
        switch (estado) {
            case "formulado":
                estadoService.setEstadoActual(new EstFormulado(this.objGestionarFormatoGateway));
                break;
            case "evaluacion":
                estadoService.setEstadoActual(new EstEvaluacion(this.objGestionarFormatoGateway));
                break;
            case "aprobado":
                estadoService.setEstadoActual(new EstAprobado());
                break;
            case "rechazado":
                estadoService.setEstadoActual(new EstRechazado());
                break;
            case "correccion":
                estadoService.setEstadoActual(new EstCorrecion(this.objGestionarFormatoGateway));
                break;
            default:
                throw new IllegalArgumentException("Estado no válido");
        }
    }
    
}
