package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTOPeticion;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormatoTIDTOPeticion extends FormatoDTOPeticion {

    /*@NotBlank(message = "{formato.nombreAsesor.notblank}")
    private String nombreAsesor;*/

    @NotBlank(message = "{formato.nombreEstudiante1.notblank}")
    private String nombreEstudiante1;

    /*private String codigoEstudiante1;*/
    
    @NotBlank(message = "{formato.rutaCartaAceptacion.notblank}")
    private String nombreEstudiante2;

    public FormatoTIDTOPeticion(String objetivoGeneral, String titulo, List<String> objetivosEspecificos,
            String nombreEstudiante1, String nombreEstudiante2, DocenteDTOPeticion docente) {
        super(objetivoGeneral, titulo, objetivosEspecificos, docente);

        this.nombreEstudiante1 = nombreEstudiante1;
        this.nombreEstudiante2 = nombreEstudiante2;
    }

    
     
}