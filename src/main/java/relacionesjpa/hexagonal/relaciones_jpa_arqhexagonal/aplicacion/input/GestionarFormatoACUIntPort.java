package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input;

import java.util.List;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoPPA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoTIA;

public interface GestionarFormatoACUIntPort {
    
    public FormatoPPA crearFormatoPPA(FormatoPPA formatoppa);
    public List<FormatoPPA> listarFormatosPPA();

    public FormatoTIA crearFormatoTIA(FormatoTIA formatotia);
    public List<FormatoTIA> listarFormatosTIA();

}
