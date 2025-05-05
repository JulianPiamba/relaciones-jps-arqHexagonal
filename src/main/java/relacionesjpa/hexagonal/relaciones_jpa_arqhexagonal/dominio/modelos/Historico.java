package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Historico {
    
    private int idHistorico;
    private Boolean activo;
    private Date fechaInicio;
    private Date fechaFin;

}
