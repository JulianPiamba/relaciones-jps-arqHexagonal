package dominio.modelos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public abstract class FormatoA {
    
    private int idFormatoA;
    private String titulo;
    private String objetivoGeneral;
    private String objetivosEspecificos;

    public FormatoA(String titulo, String objetivoGeneral, String objetivosEspecificos) {
        this.titulo = titulo;
        this.objetivoGeneral = objetivoGeneral;
        this.objetivosEspecificos = objetivosEspecificos;
    }
}
