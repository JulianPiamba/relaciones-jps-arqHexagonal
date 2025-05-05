package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public abstract class FormatoA {
    
    private int idFormatoA;
    private String titulo;
    private String objetivoGeneral;
    private String objetivosEspecificos;
    private Estado estado;

    public FormatoA(String titulo, String objetivoGeneral, String objetivosEspecificos) {
        this.titulo = titulo;
        this.objetivoGeneral = objetivoGeneral;
        this.objetivosEspecificos = objetivosEspecificos;
    }
}
