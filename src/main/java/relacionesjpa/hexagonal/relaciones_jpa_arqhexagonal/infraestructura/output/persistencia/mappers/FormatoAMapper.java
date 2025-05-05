package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.mappers;

import org.mapstruct.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoPPA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.FormatoAEntity;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.FormatoPPAEntity;

@Mapper(componentModel = "spring")
public interface FormatoAMapper {

    // Mapeo de FormatoPPA a FormatoPPAEntity
    FormatoPPAEntity toEntity(FormatoPPA formatoPPA);

    // Otros mapeos
    //FormatoAEntity toEntity(FormatoA formatoA);

    // Mapeo de FormatoPPAEntity a FormatoPPA
    FormatoPPA toDomain(FormatoPPAEntity formatoPPAEntity);

    // Otros mapeos de dominio
   // FormatoA toDomain(FormatoAEntity formatoAEntity);
}

