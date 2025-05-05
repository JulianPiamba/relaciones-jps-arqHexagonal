package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.formateador;

import org.springframework.stereotype.Service;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.FormateadorResultadosOutPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.controladoresExcepciones.excepcionesPropias.EntidadNoExisteException;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.controladoresExcepciones.excepcionesPropias.EntidadYaExisteException;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.controladoresExcepciones.excepcionesPropias.ReglaNegocioExcepcion;

@Service
public class FormateadorResultadosImplAdapter implements FormateadorResultadosOutPort {

    @Override
    public void retornarRespuestaErrorEntidadExiste(String mensaje) {
        EntidadYaExisteException objException = new EntidadYaExisteException(mensaje);
        throw objException;
    }

    @Override
    public void retornarRespuestaErrorReglaDeNegocio(String mensaje) {
        ReglaNegocioExcepcion objException = new ReglaNegocioExcepcion(mensaje);
        throw objException;
    }

    @Override
    public void retornarRespuestaErrorEntidadNoExiste(String mensaje) {
        EntidadNoExisteException objException = new EntidadNoExisteException(mensaje);
        throw objException;
    }
}
