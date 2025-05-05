package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.FormatoPPAEntity;

public interface FormatoPPARepositoryInt extends JpaRepository<FormatoPPAEntity, Integer> {

    // Buscar por nombre del asesor
    List<FormatoPPAEntity> findByNombreAsesor(String nombreAsesor);

    // Buscar por nombre del estudiante
    List<FormatoPPAEntity> findByNombreEstudiante1(String nombreEstudiante1);

    // Buscar por título
    Optional<FormatoPPAEntity> findByTitulo(String titulo);

    // Buscar formatos por parte del título
    List<FormatoPPAEntity> findByTituloContainingIgnoreCase(String parteTitulo);

    // Consulta personalizada: obtener todos los formatos con un estado específico
    /*@Query("SELECT f FROM FormatoPPAEntity f WHERE f.objEstado.estado = :estado")
    List<FormatoPPAEntity> findByEstado(@Param("estado") String estado);*/
}
