package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.servicio;

import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.PatronEstado.IntEstado;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.PatronEstado.Resultado;

@Setter
@Getter
@Service
public class EstadoService {

    private IntEstado estadoActual;

    public EstadoService(IntEstado estadoActual) {
        this.estadoActual = estadoActual;
    }

    public Resultado enviarAEvaluacion(Integer idFormato) {
        return estadoActual.enviarAEvaluacion(idFormato);
    }

    public Resultado aprobar(Integer idFormato) {
        return estadoActual.aprobar(idFormato);
    }

    public Resultado rechazar(Integer idFormato) {
        return estadoActual.rechazar(idFormato);
    }

    public Resultado enviarACorreccion(Integer idFormato) {
        return estadoActual.enviarACorreccion(idFormato);
    }
    
}
