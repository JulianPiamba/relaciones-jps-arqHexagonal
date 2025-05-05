package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.controladoresExcepciones.estructuraExcepciones;

public final class ErrorUtils {

    ErrorUtils() {
  
    }
  
    /**
     * Crea un nuevo objeto de <code>Error</code>
     * 
     * @param codigoError
     * @param llaveMensaje
     * @param codigoHttp
     * @return - Objeto creado
     */
    public static Error crearError(final String codigoError, final String llaveMensaje, final Integer codigoHttp) {
      final Error error = new Error();
      error.setCodigoError(codigoError);
      error.setMensaje(llaveMensaje);
      error.setCodigoHttp(codigoHttp);
      return error;
    }
  }
