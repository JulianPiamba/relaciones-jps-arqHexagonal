package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.gateway;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.GestionarFormatoAGatewayIntPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoPPA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoTIA;

public class GestionarFormatoAGatewayImplAdapter implements GestionarFormatoAGatewayIntPort {

    @Override
    public FormatoPPA guardarFormatoPPA(FormatoPPA formatoppa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardarFormatoPPA'");
    }

    @Override
    public FormatoTIA guardarFormatoTIA(FormatoTIA formatotia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardarFormatoTIA'");
    }
    
}
