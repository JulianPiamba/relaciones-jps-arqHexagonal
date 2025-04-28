package infraestructura.output.persistencia.entidades;

import java.util.List;

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
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Docentes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DocenteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(unique = true, nullable = false)
    private int idDocente;
    @Column(name = "nombres_docente", nullable = false, length = 100)
    private String nombresDocente;
    @Column(name = "apellidos_docente", nullable = false, length = 100)
    private String apellidosDocente;
    @Column(name = "nombre_grupo", nullable = false, length = 50)
    private String nombreGrupo;
    @Column(unique = true, name = "correo", nullable = false, length = 100)
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
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "objDocente")
    private List<HistoricoEntity> historicos;

}
