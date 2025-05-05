package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.controladores;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input.GestionarFormatoACUIntPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoPPA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoTIA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTOPeticion.FormatoDTOPeticion;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTOPeticion.FormatoPPDTOPeticion;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTORespuesta.FormatoDTORespuesta;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.mappers.FormatoAMapperInfraestructuraDominio;

@RestController
@RequestMapping("/api/v1/formato")
@RequiredArgsConstructor
public class FormatoRestController {

    private final GestionarFormatoACUIntPort gestionarFormatoACUIntPort;
    private final FormatoAMapperInfraestructuraDominio formatoMapper;

    @PostMapping("/crear/ppa")
    public ResponseEntity<FormatoDTORespuesta> crearFormatoPPA(@RequestBody @Valid FormatoPPDTOPeticion formatoDTOPeticion) {
    
        FormatoPPA formatoPPA = formatoMapper.mapearDePeticionAFormatoPPA(formatoDTOPeticion);
        FormatoPPA formatoCreado = gestionarFormatoACUIntPort.crearFormatoPPA(formatoPPA);
        FormatoDTORespuesta formatoDTORespuesta = formatoMapper.mapearDeFormatoAARespuesta(formatoCreado);
        return new ResponseEntity<>(formatoDTORespuesta, HttpStatus.CREATED);
    }
    

    // Método para crear FormatoTIA
    /*@PostMapping("/crear/tia")
    public ResponseEntity<FormatoDTORespuesta> crearFormatoTIA(@RequestBody @Valid FormatoDTOPeticion formatoDTOPeticion) {
        // Mapeamos el DTO de petición a FormatoTIA
        FormatoTIA formatoTIA = formatoMapper.mappearDePeticionAFormatoTIA(formatoDTOPeticion);
        
        // Llamamos al servicio de aplicación para crear el formato TIA
        FormatoTIA formatoCreado = gestionarFormatoACUIntPort.crearFormatoTIA(formatoTIA);
        
        // Mapeamos el formato creado a DTO de respuesta
        FormatoDTORespuesta formatoDTORespuesta = formatoMapper.mappearDeFormatoARespuesta(formatoCreado);
        
        // Devolvemos la respuesta con código HTTP 201
        return new ResponseEntity<>(formatoDTORespuesta, HttpStatus.CREATED);
    }*/
}
