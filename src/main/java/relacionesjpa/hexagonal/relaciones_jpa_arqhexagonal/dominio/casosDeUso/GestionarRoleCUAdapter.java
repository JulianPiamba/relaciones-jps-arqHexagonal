package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.casosDeUso;

import java.util.List;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input.GestionarRoleCUIntPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Rol;

public class GestionarRoleCUAdapter implements GestionarRoleCUIntPort {

    @Override
    public Rol crearRole(Rol rol) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearRole'");
    }

    @Override
    public List<Rol> listarRoles() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarRoles'");
    }
    
}
