package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTOPeticion;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormatoPPDTOPeticion extends  FormatoDTOPeticion{
    

    private String nombreAsesor;
    @NotBlank(message = "{formato.nombreEstudiante1.notblank}")
    private String nombreEstudiante1;

    /*@NotBlank(message = "{formato.codigoEstudiante.notblank}")
    @Pattern(regexp = "^\\d+$", message = "{solo.numeros}")
    private String codigoEstudiante1;*/
    
   /*private String nombreEstudiante2;

    private String codigoEstudiante2;*/


    private String rutaCartaAceptacion;
    
    public FormatoPPDTOPeticion(String objetivoGeneral, String titulo, List<String> objetivosEspecificos
            , String nombreEstudiante1,String nombreAsesor,String rutaCartaAceptacion,DocenteDTOPeticion docente) {
        super(objetivoGeneral, titulo,  objetivosEspecificos, docente);

        this.nombreEstudiante1 = nombreEstudiante1;
        this.nombreAsesor = nombreAsesor;
        this.rutaCartaAceptacion = rutaCartaAceptacion;
    }

}