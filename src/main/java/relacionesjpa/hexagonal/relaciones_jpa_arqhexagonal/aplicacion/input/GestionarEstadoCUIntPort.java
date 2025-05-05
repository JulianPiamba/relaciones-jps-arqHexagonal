package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input;

import java.util.List;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Estado;

public interface GestionarEstadoCUIntPort {
    
    public Estado crearEstado(Estado estado);
    public List<Estado> listarEstados();
    
}
