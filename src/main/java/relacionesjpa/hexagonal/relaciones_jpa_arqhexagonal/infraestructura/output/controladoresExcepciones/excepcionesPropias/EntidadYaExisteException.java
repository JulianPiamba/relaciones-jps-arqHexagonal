package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.controladoresExcepciones.excepcionesPropias;

import lombok.Getter;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.controladoresExcepciones.estructuraExcepciones.CodigoError;

@Getter
public class EntidadYaExisteException extends RuntimeException {

  private final String llaveMensaje;
  private final String codigo;

  public EntidadYaExisteException(CodigoError code) {
    super(code.getCodigo());
    this.llaveMensaje = code.getLlaveMensaje();
    this.codigo = code.getCodigo();
  }

  public EntidadYaExisteException(final String message) {
    super(message);
    this.llaveMensaje = CodigoError.ENTIDAD_YA_EXISTE.getLlaveMensaje();
    this.codigo = CodigoError.ENTIDAD_YA_EXISTE.getCodigo();
  }
}
