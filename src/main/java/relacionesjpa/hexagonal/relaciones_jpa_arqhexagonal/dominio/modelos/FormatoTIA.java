package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormatoTIA extends FormatoA{
    
    private String nombreEstudiante1;
    private String nombreEstudiante2;

    public FormatoTIA(String titulo, String objetivoGeneral, String objetivosEspecificos,
     String nombreEstudiante1, String nombreEstudiante2)
    {
        super(titulo, objetivoGeneral, objetivosEspecificos);
        this.nombreEstudiante1 = nombreEstudiante1;
        this.nombreEstudiante2 = nombreEstudiante2;
    }


}
