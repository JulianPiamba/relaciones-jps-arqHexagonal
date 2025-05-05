package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.EvaluacionEntity;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Observacion {
    
    private int idObservacion;
    private String observacion;
    private Date fechaRegistroObservacion;
    private EvaluacionEntity objEvaluacion;
    private List<Docente> docentes;

}
