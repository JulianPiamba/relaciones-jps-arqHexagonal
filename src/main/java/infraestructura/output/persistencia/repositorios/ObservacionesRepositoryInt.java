package infraestructura.output.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import infraestructura.output.persistencia.entidades.ObservacionEntity;

public interface ObservacionesRepositoryInt extends JpaRepository<ObservacionEntity, Integer> {
    
}
