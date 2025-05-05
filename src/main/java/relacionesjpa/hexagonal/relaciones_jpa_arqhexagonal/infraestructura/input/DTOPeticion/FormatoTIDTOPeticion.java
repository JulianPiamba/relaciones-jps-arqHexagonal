package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTOPeticion;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormatoTIDTOPeticion extends FormatoDTOPeticion {

    @NotBlank(message = "{formato.nombreAsesor.notblank}")
    private String nombreAsesor;

    @NotBlank(message = "{formato.nombreEstudiante1.notblank}")
    private String nombreEstudiante1;

    private String codigoEstudiante1;
    
    @NotBlank(message = "{formato.rutaCartaAceptacion.notblank}")
    private String rutaCA;

    public FormatoTIDTOPeticion(String objetivoGeneral, String titulo, List<String> objetivosEspecificos,
            String nombreAsesor, String nombreEstudiante1, String codigoEstudiante1,String rutaCA, DocenteDTOPeticion docente) {
        super(objetivoGeneral, titulo, objetivosEspecificos, docente);
        this.nombreAsesor = nombreAsesor;
        this.nombreEstudiante1 = nombreEstudiante1;
        this.codigoEstudiante1 = codigoEstudiante1;
        this.rutaCA = rutaCA;
    }
     
}