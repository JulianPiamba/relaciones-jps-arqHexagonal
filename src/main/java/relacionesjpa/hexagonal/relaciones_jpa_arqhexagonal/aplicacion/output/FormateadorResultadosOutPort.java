package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output;

public interface FormateadorResultadosOutPort {

    public void retornarRespuestaErrorEntidadExiste(String mensaje);

    public void retornarRespuestaErrorReglaDeNegocio(String mensaje);

    public void retornarRespuestaErrorEntidadNoExiste(String mensaje);

}