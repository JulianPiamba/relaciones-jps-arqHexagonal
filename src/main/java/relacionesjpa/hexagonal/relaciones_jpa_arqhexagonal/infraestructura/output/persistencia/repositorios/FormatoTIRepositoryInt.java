package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.FormatoTIAEntity;

public interface FormatoTIRepositoryInt extends JpaRepository<FormatoTIAEntity, Integer> {

    // Buscar por nombre exacto del primer estudiante
    List<FormatoTIAEntity> findByNombreEstudiante1(String nombreEstudiante1);

    // Buscar por nombre exacto del segundo estudiante
    List<FormatoTIAEntity> findByNombreEstudiante2(String nombreEstudiante2);

    // Buscar por título
    Optional<FormatoTIAEntity> findByTitulo(String titulo);

    // Buscar por fragmento del título (ignorando mayúsculas/minúsculas)
    List<FormatoTIAEntity> findByTituloContainingIgnoreCase(String parteTitulo);

    // Buscar por uno de los dos estudiantes (consulta JPQL personalizada)
    @Query("SELECT f FROM FormatoTIAEntity f WHERE f.nombreEstudiante1 = :nombre OR f.nombreEstudiante2 = :nombre")
    List<FormatoTIAEntity> findByCualquieraDeLosEstudiantes(@Param("nombre") String nombre);

    // Buscar todos los formatos con estado específico (asumiendo que objEstado.estado es una cadena)
    /*@Query("SELECT f FROM FormatoTIAEntity f WHERE f.objEstado.estado = :estado")
    List<FormatoTIAEntity> findByEstado(@Param("estado") String estado);*/
}
