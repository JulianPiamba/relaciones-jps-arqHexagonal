package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input;

import java.util.List;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Docente;

public interface GestionarDocenteCUIntPort {
    
    public Docente crearDocente(Docente docente);
    public List<Docente> listarDocentes();
}
