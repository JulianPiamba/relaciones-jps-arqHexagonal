package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.FormatoTIAEntity;

public interface FormatoTIRepositoryInt extends JpaRepository<FormatoTIAEntity, Integer> {
    
}
