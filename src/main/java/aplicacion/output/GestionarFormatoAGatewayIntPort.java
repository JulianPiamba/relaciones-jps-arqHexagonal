package aplicacion.output;

import dominio.modelos.FormatoPPA;
import dominio.modelos.FormatoTIA;

public interface GestionarFormatoAGatewayIntPort {
    
    public FormatoPPA guardarFormatoPPA(FormatoPPA formatoppa);
    public FormatoTIA guardarFormatoTIA(FormatoTIA formatotia);
}
