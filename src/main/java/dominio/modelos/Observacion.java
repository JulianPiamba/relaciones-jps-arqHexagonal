package dominio.modelos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Observacion {
    
    private int idObservacion;
    private String observacion;
    private Date fechaRegistroObservacion;

}
