package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Roles")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(unique = true,nullable = false)
    private int idRol;
    @Column(nullable = false, length = 100, unique = true)
    private String roleAsignado;

    //Un rol tiene muchos historicos
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "objRol", cascade = {CascadeType.PERSIST})
    private List<HistoricoEntity> historicos;
    
}
