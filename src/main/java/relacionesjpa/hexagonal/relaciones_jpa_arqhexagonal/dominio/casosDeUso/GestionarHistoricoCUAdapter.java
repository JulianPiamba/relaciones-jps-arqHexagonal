package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.casosDeUso;

import java.util.List;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input.GestionarHistoricoCUIntPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Historico;

public class GestionarHistoricoCUAdapter implements GestionarHistoricoCUIntPort {

    @Override
    public Historico crearHistorico(Historico historico) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearHistorico'");
    }

    @Override
    public List<Historico> listarHistoricos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarHistoricos'");
    }
    
}
