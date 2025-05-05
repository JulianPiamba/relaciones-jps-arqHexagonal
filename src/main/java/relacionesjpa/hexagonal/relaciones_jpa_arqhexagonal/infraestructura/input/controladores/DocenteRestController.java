package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input.GestionarDocenteCUIntPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Docente;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTOPeticion.DocenteDTOPeticion;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTORespuesta.DocenteDTORespuesta;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.mappers.DocenteMapperInfraestructuraDominio;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DocenteRestController {

    private final GestionarDocenteCUIntPort objGestionarDocenteCUInt;
    private final DocenteMapperInfraestructuraDominio objMapeador;

    @PostMapping("/docentes")
    public ResponseEntity<DocenteDTORespuesta> create(@RequestBody @Valid DocenteDTOPeticion objDocente){
        System.out.println("Docente recibido: " + objDocente.toString());

        Docente objDocenteCrear = objMapeador.mappearDePeticionADocente(objDocente);
        System.out.println("Docente mapeado a dominio: " + objDocenteCrear.getNombresDocente()+
        objDocenteCrear.getApellidosDocente()+objDocenteCrear.getNombreGrupo()+objDocenteCrear.getCorreo());

        Docente objDocenteCreado = objGestionarDocenteCUInt.crearDocente(objDocenteCrear);
        System.out.println("Docente creado: " + objDocenteCreado.getNombresDocente()+
        objDocenteCreado.getApellidosDocente()+objDocenteCreado.getNombreGrupo()+objDocenteCreado.getCorreo());

        ResponseEntity<DocenteDTORespuesta> objRespuesta = new ResponseEntity<DocenteDTORespuesta>(
            objMapeador.mappearDeDocenteARespuesta(objDocenteCreado),
            HttpStatus.CREATED
        );
        return objRespuesta;
    }
    
    @GetMapping("/docentes")
    public ResponseEntity<List<DocenteDTORespuesta>> listar(){
        ResponseEntity<List<DocenteDTORespuesta>> objRespuesta = new ResponseEntity<List<DocenteDTORespuesta>>(
            objMapeador.mappearDeDocentesARespuesta(this.objGestionarDocenteCUInt.listarDocentes()),
            HttpStatus.OK
        );
        return objRespuesta;
    }
    
}
