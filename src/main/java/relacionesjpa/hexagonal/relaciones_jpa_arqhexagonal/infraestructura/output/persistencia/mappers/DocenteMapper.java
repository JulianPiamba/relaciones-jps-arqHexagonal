package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Docente;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.DocenteEntity;

@Mapper(componentModel = "spring")
public interface DocenteMapper {

    Docente mappearADocente(DocenteEntity docenteEntity);
    DocenteEntity mappearAEntity(Docente domain);
    List<Docente> toDomainList(List<DocenteEntity> entities);
}
