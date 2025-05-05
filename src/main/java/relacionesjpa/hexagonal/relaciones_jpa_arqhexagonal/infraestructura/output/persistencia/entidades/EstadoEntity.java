package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "Estados")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EstadoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(unique = true, nullable = false)
    private int idEstado;
    @Column(name = "estado_actual", nullable = false, length = 50)
    
    private String estadoActual;
    @Column(name = "fecha_registro_estado", nullable = false)
    private Date fechaRegistroEstado;
    
    @OneToOne
    @MapsId
    @JoinColumn(name = "idFkFormatoA", unique = true)
    private FormatoAEntity objFormatoA;

}
