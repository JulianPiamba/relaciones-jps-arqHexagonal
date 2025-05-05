package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.casosDeUso;

import java.util.List;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input.GestionarEstadoCUIntPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Estado;

public class GestionarEstadoCUAdapter implements GestionarEstadoCUIntPort {

    @Override
    public Estado crearEstado(Estado estado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearEstado'");
    }

    @Override
    public List<Estado> listarEstados() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarEstados'");
    }
    
}
