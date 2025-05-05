package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.mappers;

import java.util.List;
import org.mapstruct.SubclassMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.SubclassMapping;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoPPA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoTIA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTOPeticion.FormatoDTOPeticion;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTOPeticion.FormatoPPDTOPeticion;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTOPeticion.FormatoTIDTOPeticion;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTORespuesta.FormatoDTORespuesta;


public interface FormatoAMapperInfraestructuraDominio {
    
     /*@SubclassMapping(source = FormatoPPDTOPeticion.class, target = FormatoPPA.class)
    @SubclassMapping(source = FormatoTIDTOPeticion.class, target = FormatoTIA.class)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "estado", ignore = true)
    @Mapping(target = "evaluacion", ignore = true)
    FormatoA toModel(FormatoDTOPeticion formatoPeticionDTO);

    @SubclassMapping(source = FormatoPPA.class, target = FormatoPPDTOPeticion.class)
    @SubclassMapping(source = FormatoTIA.class, target = FormatoTIDTOPeticion.class)
    
    FormatoDTORespuesta toDTO(FormatoA formatoA);

    List<FormatoDTORespuesta> toDTOList(List<FormatoA> formatoAList);

    //ObservacionesFormatoRespuestaDTO toObservacionesFormatoDTO(FormatoA formato);*/
    
    FormatoPPA mapearDePeticionAFormatoPPA(FormatoDTOPeticion peticion);
    FormatoDTORespuesta mapearDeFormatoPPA_ARespuesta(FormatoPPA formato);
    
}
