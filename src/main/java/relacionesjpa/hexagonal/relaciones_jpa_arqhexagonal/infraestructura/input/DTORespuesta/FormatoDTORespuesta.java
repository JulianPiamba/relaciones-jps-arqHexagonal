package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTORespuesta;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class FormatoDTORespuesta {
    
    private String objetivoGeneral;

    private String titulo;
    
    private List<String> objetivosEspecificos;

    //private EstadoRespuestaDTO estado;

    private DocenteDTORespuesta objDocente;
}