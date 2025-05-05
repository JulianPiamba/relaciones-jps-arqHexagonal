package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.casosDeUso;

import java.util.List;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input.GestionarDocenteCUIntPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.FormateadorResultadosOutPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.GestionarDocenteGatewayOutPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Docente;

public class GestionarDocenteCUAdapter implements GestionarDocenteCUIntPort {

    private final GestionarDocenteGatewayOutPort objGestionarDocenteGateway;
    private final FormateadorResultadosOutPort objFormateadorResultadosOutPort;

    public GestionarDocenteCUAdapter(GestionarDocenteGatewayOutPort objRegistrarDocenteGateway,
    FormateadorResultadosOutPort objFormateadorResultadosOutPort
    ){
        this.objGestionarDocenteGateway = objRegistrarDocenteGateway;
        this.objFormateadorResultadosOutPort = objFormateadorResultadosOutPort;
    }

    @Override
    public Docente crearDocente(Docente docente) {
        // if(this.objGestionarDocenteGateway.existeDocenteByCorreo(docente.getCorreo())) {
        //     this.objFormateadorResultadosOutPort.retornarRespuestaErrorEntidadExiste("Error, docente con correo ya existe");
        // }
        Docente objDocenteCreado = this.objGestionarDocenteGateway.guardarDocente(docente);
        return objDocenteCreado;
    }

    @Override
    public List<Docente> listarDocentes() {
        List<Docente> listaDocentesObtenida = this.objGestionarDocenteGateway.listarTodos();
        if(listaDocentesObtenida.isEmpty()){
            this.objFormateadorResultadosOutPort.retornarRespuestaErrorEntidadNoExiste("Error, no hay docentes registrados");
        }
        return listaDocentesObtenida;
    }
}