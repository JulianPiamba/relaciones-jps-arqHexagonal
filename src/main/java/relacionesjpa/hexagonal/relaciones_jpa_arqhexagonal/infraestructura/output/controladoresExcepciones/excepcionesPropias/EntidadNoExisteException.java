package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.controladoresExcepciones.excepcionesPropias;

import lombok.Getter;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.controladoresExcepciones.estructuraExcepciones.CodigoError;

@Getter
public class EntidadNoExisteException extends RuntimeException {

  private final String llaveMensaje;
  private final String codigo;

  public EntidadNoExisteException(CodigoError code) {
    super(code.getCodigo());
    this.llaveMensaje = code.getLlaveMensaje();
    this.codigo = code.getCodigo();
  }

  public EntidadNoExisteException(final String message) {
    super(message);
    this.llaveMensaje = CodigoError.ENTIDAD_NO_ENCONTRADA.getLlaveMensaje();
    this.codigo = CodigoError.ENTIDAD_NO_ENCONTRADA.getCodigo();
  }
}
