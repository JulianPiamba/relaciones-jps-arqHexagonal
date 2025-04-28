package dominio.modelos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Evaluacion {

    private int idEvaluacion;
    private String concepto;
    private String nombreCoordinador;
    private Date fechaRegistroConcepto;

}
