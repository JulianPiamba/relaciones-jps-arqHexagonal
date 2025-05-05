package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Historicos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HistoricoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(unique = true,nullable = false)
    private int idHistorico;

    @Column(nullable = false)
    private Boolean activo;

    @Column(nullable = false)
    private Date fechaInicio;

    @Column(nullable = false)
    private Date fechaFin;

    //Muchos historicos pertenecen a un docente
    @ManyToOne
    @JoinColumn(name = "idFkDocente")
    private DocenteEntity objDocente;

    //Muchos historicos pertenecen a un rol
    @ManyToOne
    @JoinColumn(name = "idFkRol")
    private RolEntity objRol;
}

