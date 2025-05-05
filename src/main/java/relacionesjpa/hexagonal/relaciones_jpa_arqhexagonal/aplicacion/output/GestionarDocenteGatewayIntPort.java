package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output;

import java.util.List;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Docente;

public interface GestionarDocenteGatewayIntPort {
    
    public Docente guardarDocente(Docente docente);
    public List<Docente> listarTodos();
    public List<Docente> listarDocentesKeywords(String nombreGrupo, String apellido);
    public Docente listarFormatosByDocente(Integer idDocente);
    public boolean existeDocenteByCorreo(String correo);

}
