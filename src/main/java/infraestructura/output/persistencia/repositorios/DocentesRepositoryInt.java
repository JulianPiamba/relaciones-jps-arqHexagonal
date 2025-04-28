package infraestructura.output.persistencia.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import infraestructura.output.persistencia.entidades.DocenteEntity;
 
@Repository
public interface DocentesRepositoryInt extends JpaRepository <DocenteEntity, Integer>{
    
    List<DocenteEntity> findByGrupoNombreIgnoreCaseDocenteEntitiesAndApellidosDocenteStrartingWithIgnoreCaseOrderByApellidosDocenteAsc(
        String nombreGrupo, String patronBusqueda);

}
