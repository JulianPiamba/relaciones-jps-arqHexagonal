package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input;

import java.util.List;
import java.util.Date;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoPPA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoTIA;

public interface GestionarFormatoACUIntPort {
    
    public FormatoPPA crearFormatoPPA(FormatoPPA formatoppa);
    public FormatoPPA modificarFormatoPPA(FormatoPPA formatoppa);
    public String cambiarEstado(int idFormatoA, String estado);
    public FormatoPPA buscarFormatoPPAPorId(int idFormatoA);

    public FormatoTIA crearFormatoTIA(FormatoTIA formatotia);
    public FormatoTIA modificarFormatoTIA(FormatoTIA formatotia);
    public FormatoTIA buscarFormatoTIAPorId(int idFormatoA);

    
    public List<FormatoA> buscarFormatoPorCorreoFechaInicioFin(String correo, Date fechaInicio, Date fechaFin);
    public FormatoA listarObservacionPorFormatoA(int idFormatoA);

}
