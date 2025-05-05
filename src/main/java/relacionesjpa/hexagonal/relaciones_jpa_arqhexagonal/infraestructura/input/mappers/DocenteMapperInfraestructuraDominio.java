package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.mappers;

import java.util.List;
import org.mapstruct.Mapper;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Docente;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTOPeticion.DocenteDTOPeticion;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTORespuesta.DocenteDTORespuesta;

@Mapper(componentModel = "spring")
public interface DocenteMapperInfraestructuraDominio {

    Docente mappearDePeticionADocente(DocenteDTOPeticion peticion);

    DocenteDTORespuesta mappearDeDocenteARespuesta(Docente objDocente);

    List<DocenteDTORespuesta> mappearDeDocentesARespuesta(List<Docente> docentes);
}

