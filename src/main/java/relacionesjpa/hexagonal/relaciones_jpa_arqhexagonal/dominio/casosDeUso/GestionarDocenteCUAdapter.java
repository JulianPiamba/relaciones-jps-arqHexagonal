package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.casosDeUso;

import java.util.List;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input.GestionarDocenteCUIntPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.GestionarDocenteGatewayIntPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Docente;

public class GestionarDocenteCUAdapter implements GestionarDocenteCUIntPort {

    private final GestionarDocenteGatewayIntPort objGestionarDocenteGateway;

    public GestionarDocenteCUAdapter(GestionarDocenteGatewayIntPort objRegistrarDocenteGateway){
        this.objGestionarDocenteGateway = objRegistrarDocenteGateway;
    }

    @Override
    public Docente crearDocente(Docente docente) {
        //TODO Verificaciones
        Docente objDocenteCreado = null;
        objDocenteCreado = this.objGestionarDocenteGateway.guardarDocente(docente);
        return objDocenteCreado;
    }

    @Override
    public List<Docente> listarDocentes() {
        List<Docente> listaDocentesObtenida = this.objGestionarDocenteGateway.listarTodos();
        return listaDocentesObtenida;
    }
    
}
