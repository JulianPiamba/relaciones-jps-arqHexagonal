package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.controladoresExcepciones.excepcionesPropias;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.controladoresExcepciones.estructuraExcepciones.CodigoError;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public abstract class GestionClientesRuntimeException extends RuntimeException {

  protected CodigoError codigoError;

  public abstract String formatException();
}
