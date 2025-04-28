package infraestructura.output.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import infraestructura.output.persistencia.entidades.FormatoTIAEntity;

public interface FormatoTIRepositoryInt extends JpaRepository<FormatoTIAEntity, Integer> {
    
}
