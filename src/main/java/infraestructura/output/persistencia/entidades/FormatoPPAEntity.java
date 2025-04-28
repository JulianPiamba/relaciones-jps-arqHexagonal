package infraestructura.output.persistencia.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "FormatosPPA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "idFormatoPPA")
public class FormatoPPAEntity extends FormatoAEntity{

    @Column(name = "nombre_asesor", nullable = false, length = 100)
    private String nombreAsesor;
    @Column(name = "nombre_estudiante1", nullable = false, length = 100)
    private String nombreEstudiante1;
    @Column(name = "ruta_carta_aceptacion", nullable = false, length = 255)
    private String rutaCartaAceptacion;

    public FormatoPPAEntity(String titulo, String objetivoGeneral, String objetivosEspecificos,
     String nombreAsesor, String nombreEstudiante1, String rutaCartaAceptacion)
    {
        super(titulo, objetivoGeneral, objetivosEspecificos);
        this.nombreAsesor = nombreAsesor;
        this.nombreEstudiante1 = nombreEstudiante1;
        this.rutaCartaAceptacion = rutaCartaAceptacion;
    }
    
}