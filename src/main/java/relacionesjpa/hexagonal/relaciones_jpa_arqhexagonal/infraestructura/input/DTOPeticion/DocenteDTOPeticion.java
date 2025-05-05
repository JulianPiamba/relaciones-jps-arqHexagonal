package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTOPeticion;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DocenteDTOPeticion {
    private String nombresDocente;
    private String apellidosDocente;
    private String nombreGrupo;
    private String correo;

    public DocenteDTOPeticion(){}
}
