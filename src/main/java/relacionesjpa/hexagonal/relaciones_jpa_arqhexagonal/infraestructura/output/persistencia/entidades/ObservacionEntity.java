package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Observaciones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ObservacionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(unique = true, nullable = false)
    private int idObservacion;
    @Column(nullable = true, columnDefinition = "TEXT")
    private String observacion;
    @Column(nullable = true)
    private Date fechaRegistroObservacion;

    //Muchas observaciones pertenecen a una evaluación
    @ManyToOne
    @JoinColumn(name = "idFkEvaluacion", nullable = false)
    private EvaluacionEntity objEvaluacion;
    
    //Muchas observaciones pertenecen a muchos docentes
    @ManyToMany(mappedBy = "observaciones", fetch = FetchType.LAZY)
    private List<DocenteEntity> docentes;

}
