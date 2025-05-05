package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTORespuesta;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormatoTIDTORespuesta extends  FormatoDTORespuesta{
    
    private String nombreEstudiante1;
    
    private String nombreEstudiante2;

    
    public FormatoTIDTORespuesta(String objetivoGeneral, String titulo, List<String> objetivosEspecificos,
            /*EstadoRespuestaDTO estado*/ DocenteDTORespuesta objDocente,String nombreEstudiante1, String nombreEstudiante2) {
        super(objetivoGeneral, titulo, objetivosEspecificos, /*estado*/ objDocente);

        this.nombreEstudiante1 = nombreEstudiante1;
        this.nombreEstudiante2 = nombreEstudiante2;
    }

}