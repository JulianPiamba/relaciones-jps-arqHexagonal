package infraestructura.output.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import infraestructura.output.persistencia.entidades.RolEntity;

public interface RolesRepositoryInt extends JpaRepository<RolEntity, Integer> {
    
}
