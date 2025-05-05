package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input;

import java.util.List;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Rol;

public interface GestionarRoleCUIntPort {
    
    public Rol crearRole(Rol rol);
    public List<Rol> listarRoles();
    
}
