package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Docente {
    
    private int idDocente;
    private String nombresDocente;
    private String apellidosDocente;
    private String nombreGrupo;
    private String correo;

    public Docente(){}

}
