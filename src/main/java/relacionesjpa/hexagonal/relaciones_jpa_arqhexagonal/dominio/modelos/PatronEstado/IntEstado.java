package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.PatronEstado;;


public interface IntEstado {
    Resultado enviarAEvaluacion(Integer idFormato);
    Resultado aprobar(Integer idFormato);
    Resultado rechazar(Integer idFormato);
    Resultado enviarACorreccion(Integer idFormato);
}
