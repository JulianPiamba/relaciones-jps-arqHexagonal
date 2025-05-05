package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Evaluacion {

    private int idEvaluacion;
    private String concepto;
    private String nombreCoordinador;
    private Date fechaRegistroConcepto;
    private FormatoA objFormatoA;
    private List<Observacion> observaciones;

}
