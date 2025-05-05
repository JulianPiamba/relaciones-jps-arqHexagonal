package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output;

public interface GestionarEstadoGatewayOutport {

    public String cambiarEstado(Integer idFormato, String estado);

}
