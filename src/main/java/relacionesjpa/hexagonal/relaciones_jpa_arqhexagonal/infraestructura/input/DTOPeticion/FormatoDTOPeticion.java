package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.input.DTOPeticion;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "tipoFormato")
@JsonSubTypes({
    @JsonSubTypes.Type(value = FormatoTIDTOPeticion.class, name = "TI"),
    @JsonSubTypes.Type(value = FormatoPPDTOPeticion.class, name = "PP")
})
public class FormatoDTOPeticion {

    @NotBlank(message = "{formato.objetivoGeneral.notblank}")
    private String objetivoGeneral;

    @NotBlank(message = "{formato.titulo.notblank}")
    private String titulo;
    
    @Size(min = 3, max = 6, message = "{formato.objetivosEspecificos.size}")
    private List<String> objetivosEspecificos;

    @Valid
    private DocenteDTOPeticion objDocente;
}