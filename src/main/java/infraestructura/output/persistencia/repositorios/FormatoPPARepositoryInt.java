package infraestructura.output.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import infraestructura.output.persistencia.entidades.FormatoPPAEntity;

public interface FormatoPPARepositoryInt extends JpaRepository<FormatoPPAEntity, Integer> {
    
}
