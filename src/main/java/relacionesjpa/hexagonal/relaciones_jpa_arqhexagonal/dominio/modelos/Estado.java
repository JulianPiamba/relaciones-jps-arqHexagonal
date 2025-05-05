package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Estado {
    
    private int idEstado;
    private String estadoActual;
    private Date fechaRegistroEstado;


}
