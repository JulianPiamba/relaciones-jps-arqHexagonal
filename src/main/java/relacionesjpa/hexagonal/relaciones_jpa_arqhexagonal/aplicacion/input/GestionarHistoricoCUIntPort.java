package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input;

import java.util.List;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Historico;

public interface GestionarHistoricoCUIntPort {
    
    public Historico crearHistorico(Historico historico);
    public List<Historico> listarHistoricos();
    
}
