package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Estado;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.EstadoEntity;

@Mapper(componentModel = "spring")
public interface EstadoMapper {

    @Mapping(target = "objFormatoA", ignore = true)
    EstadoEntity toEntity(Estado estadoActual);

}

