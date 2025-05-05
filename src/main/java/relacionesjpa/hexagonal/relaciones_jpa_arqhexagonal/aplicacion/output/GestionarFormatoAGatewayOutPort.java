package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoPPA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoTIA;

public interface GestionarFormatoAGatewayOutPort {
    
    public FormatoPPA crearFormatoPPA(FormatoPPA formatoppa);
    public FormatoPPA modificarFormatoPPA(FormatoPPA formatoppa);
    public String cambiarEstado(int idFormatoA, String estado);
    public FormatoPPA buscarFormatoPPAPorId(int idFormatoA);

    public FormatoTIA crearFormatoTIA(FormatoTIA formatotia);
    public FormatoTIA modificarFormatoTIA(FormatoTIA formatotia);
    public FormatoTIA buscarFormatoTIAPorId(int idFormatoA);

    public FormatoPPA listarObservacionPorFormatoA(int idFormatoA);

}
