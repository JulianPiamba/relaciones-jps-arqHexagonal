package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTORespuesta;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FormatoPPDTORespuesta extends FormatoDTORespuesta {


    private String nombreAsesor;
    private String nombreEstudiante1;

    public FormatoPPDTORespuesta(String objetivoGeneral, String titulo, List<String> objetivosEspecificos
            /*EstadoDTORespuesta estado*/, DocenteDTORespuesta objDocente,String nombreAsesor, String nombreEstudiante1) {
        super(objetivoGeneral, titulo, objetivosEspecificos, /*estado*/ objDocente);
        
        this.nombreAsesor = nombreAsesor;
        this.nombreEstudiante1 = nombreEstudiante1;
    }
    
   

    
}
