package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "FormatosTIA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "idFormatoTIA")
public class FormatoTIAEntity extends FormatoAEntity {

    @Column(name = "nombre_estudiante1", nullable = false, length = 100)
    private String nombreEstudiante1;
    @Column(name = "nombre_estudiante2", nullable = true, length = 100)
    private String nombreEstudiante2;
    
    public FormatoTIAEntity(String titulo, String objetivoGeneral, String objetivosEspecificos,
     String nombreEstudiante1, String nombreEstudiante2)
    {
        super(titulo, objetivoGeneral, objetivosEspecificos);
        this.nombreEstudiante1 = nombreEstudiante1;
        this.nombreEstudiante2 = nombreEstudiante2;
    }

    public FormatoTIAEntity(String titulo, String objetivoGeneral, String objetivosEspecificos,
     String nombreEstudiante1)
    {
        super(titulo, objetivoGeneral, objetivosEspecificos);
        this.nombreEstudiante1 = nombreEstudiante1;
    }
}