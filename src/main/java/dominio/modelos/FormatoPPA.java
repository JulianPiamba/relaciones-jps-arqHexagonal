package dominio.modelos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormatoPPA extends FormatoA{
    
    private String nombreAsesor;
    private String nombreEstudiante1;
    private String rutaCartaAceptacion;

    public FormatoPPA(String titulo, String objetivoGeneral, String objetivosEspecificos,
     String nombreAsesor, String nombreEstudiante1, String rutaCartaAceptacion)
    {
        super(titulo, objetivoGeneral, objetivosEspecificos);
        this.nombreAsesor = nombreAsesor;
        this.nombreEstudiante1 = nombreEstudiante1;
        this.rutaCartaAceptacion = rutaCartaAceptacion;
    }
}
