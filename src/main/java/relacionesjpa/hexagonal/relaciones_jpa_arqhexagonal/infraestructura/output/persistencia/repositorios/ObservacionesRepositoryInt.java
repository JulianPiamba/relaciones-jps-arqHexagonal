package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.ObservacionEntity;

public interface ObservacionesRepositoryInt extends JpaRepository<ObservacionEntity, Integer> {
    
}
