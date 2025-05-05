package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input;

public interface GestionarEstadoCUIntPort {
    
    public String cambiarEstado(Integer idFormato, String estado);
    
}
