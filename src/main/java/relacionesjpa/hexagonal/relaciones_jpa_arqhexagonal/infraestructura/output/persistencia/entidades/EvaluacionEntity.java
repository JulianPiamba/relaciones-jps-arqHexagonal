package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Evaluaciones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EvaluacionEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvaluacion;
    @Column(nullable = false, length = 255)
    private String concepto;
    @Column(nullable = false, length = 100)
    private String nombreCoordinador;
    @Column(nullable = false)
    private Date fechaRegistroConcepto;

    //Muchas evaluaciones pertenecen a un formato A
    @ManyToOne
    @JoinColumn(name = "idFkFormatoA", nullable = false)
    private FormatoAEntity objFormatoA;

    //Una evaluación tiene muchas observaciones
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "objEvaluacion")
    private List<ObservacionEntity> observaciones;

}