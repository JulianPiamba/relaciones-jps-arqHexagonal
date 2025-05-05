package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rol {
    
    private int idRol;
    private String roleAsignado;
}
