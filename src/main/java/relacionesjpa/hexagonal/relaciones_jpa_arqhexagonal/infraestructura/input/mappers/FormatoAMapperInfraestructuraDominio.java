package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.mappers;

import java.util.Arrays;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.SubclassMapping;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoPPA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoTIA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTOPeticion.FormatoDTOPeticion;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTOPeticion.FormatoPPDTOPeticion;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTOPeticion.FormatoTIDTOPeticion;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTORespuesta.FormatoDTORespuesta;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTORespuesta.FormatoPPDTORespuesta;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTORespuesta.FormatoTIDTORespuesta;

@Mapper(componentModel = "spring")
public interface FormatoAMapperInfraestructuraDominio {

    // De DTO petición a modelo
    @Mapping(target = "objetivosEspecificos", source = "objetivosEspecificos", qualifiedByName = "listaAString")
    @Mapping(target = "idFormatoA", ignore = true)
    @Mapping(target = "objDocente", source = "objDocente") 
    //@Mapping(target = "estado", ignore = true)
    FormatoA mapearDePeticionAFormatoA(FormatoDTOPeticion dto);

    @Mapping(target = "objetivosEspecificos", source = "objetivosEspecificos", qualifiedByName = "listaAString")
    @Mapping(target = "idFormatoA", ignore = true)
    //@Mapping(target = "estado", ignore = true)
    FormatoPPA mapearDePeticionAFormatoPPA(FormatoPPDTOPeticion dto);

    // De modelo a DTO respuesta
    @Mapping(target = "objetivosEspecificos", source = "objetivosEspecificos", qualifiedByName = "stringALista")
    //@Mapping(target = "estado", source = "estado.nombre") // asumiendo que estado es un objeto con campo "nombre"
    @Mapping(target = "objDocente", ignore = true) // lo ignoramos porque no está en el modelo
    FormatoDTORespuesta mapearDeFormatoAARespuesta(FormatoA modelo);

    List<FormatoDTORespuesta> mapearListaFormatoA(List<FormatoA> modelos);

    // Conversión lista a string (para petición)
    @Named("listaAString")
    public static String listaAString(List<String> lista) {
        return String.join(", ", lista);
    }
    

    // Conversión string a lista (para respuesta)
    @Named("stringALista")
    public static List<String> stringALista(String texto) {
        return Arrays.asList(texto.split(",\\s*"));
    }
}
