package infraestructura.output.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import infraestructura.output.persistencia.entidades.EvaluacionEntity;

public interface EvaluacionesRepositoryInt extends JpaRepository<EvaluacionEntity, Integer> {
    
    
}
