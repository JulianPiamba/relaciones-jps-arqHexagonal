package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Docentes")
@Getter
@Setter
@AllArgsConstructor
public class DocenteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(unique = true, nullable = false)
    private int idDocente;
    @Column(nullable = false, length = 100)
    private String nombresDocente;
    @Column(nullable = false, length = 100)
    private String apellidosDocente;
    @Column(nullable = false, length = 50)
    private String nombreGrupo;
    @Column(unique = true, nullable = false, length = 100)
    private String correo;

    //Un docente puede tener muchos formatos A
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "objDocente")
    private List<FormatoAEntity> formatosA;

    //Muchos docentes hacen varias observaciones
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "observacion_docente",
        joinColumns = @JoinColumn(name = "idFkDocente"),
        inverseJoinColumns = @JoinColumn(name = "idFkObservacion")
    )
    private List<ObservacionEntity> observaciones;

    //Un docente tiene muchos historicos
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "objDocente", cascade = {CascadeType.PERSIST})
    private List<HistoricoEntity> historicos;

    public DocenteEntity(){}
}
