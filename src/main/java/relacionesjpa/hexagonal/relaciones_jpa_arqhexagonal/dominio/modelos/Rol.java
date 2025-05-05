package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rol {
    
    private int idRol;
    private String roleAsignado;
    private List<Historico> historicos;
    
}
