package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.casosDeUso;

import java.util.List;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input.GestionarFormatoACUIntPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoPPA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoTIA;

public class GestionarFormatoACUAdapter implements GestionarFormatoACUIntPort {

    @Override
    public FormatoPPA crearFormatoPPA(FormatoPPA formatoppa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearFormatoPPA'");
    }

    @Override
    public List<FormatoPPA> listarFormatosPPA() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarFormatosPPA'");
    }

    @Override
    public FormatoTIA crearFormatoTIA(FormatoTIA formatotia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearFormatoTIA'");
    }

    @Override
    public List<FormatoTIA> listarFormatosTIA() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarFormatosTIA'");
    }
    
}