package infraestructura.output.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import infraestructura.output.persistencia.entidades.HistoricoEntity;

public interface HistoricosRepositoryInt extends JpaRepository<HistoricoEntity, Integer> {
    
}
