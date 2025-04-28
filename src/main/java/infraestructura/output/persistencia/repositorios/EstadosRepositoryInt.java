package infraestructura.output.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import infraestructura.output.persistencia.entidades.EstadoEntity;

public interface EstadosRepositoryInt extends JpaRepository<EstadoEntity, Integer> {
    
}
