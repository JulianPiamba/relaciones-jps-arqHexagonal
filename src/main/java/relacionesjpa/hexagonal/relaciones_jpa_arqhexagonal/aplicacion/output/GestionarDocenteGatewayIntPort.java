package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output;

import java.util.List;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Docente;

public interface GestionarDocenteGatewayIntPort {
    
    public Docente guardarDocente(Docente docente);
    public List<Docente> listarTodos();
}
