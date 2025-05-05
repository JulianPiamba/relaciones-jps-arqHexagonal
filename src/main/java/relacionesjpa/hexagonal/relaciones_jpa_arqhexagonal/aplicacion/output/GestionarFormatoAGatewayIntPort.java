package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoPPA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoTIA;

public interface GestionarFormatoAGatewayIntPort {
    
    public FormatoPPA guardarFormatoPPA(FormatoPPA formatoppa);
    public FormatoTIA guardarFormatoTIA(FormatoTIA formatotia);
}
