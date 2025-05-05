package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTORespuesta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DocenteDTORespuesta {
    private int idDocente;
    private String nombresDocente;
    private String apellidosDocente;
    private String nombreGrupo;
    private String correo;

    public DocenteDTORespuesta(){
        
    }
}
