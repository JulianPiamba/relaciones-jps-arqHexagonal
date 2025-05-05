package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.casosDeUso;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import jakarta.persistence.EntityNotFoundException;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.input.GestionarFormatoACUIntPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.GestionarFormatoAGatewayOutPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Docente;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Estado;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoPPA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoTIA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.DocenteEntity;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.EstadoEntity;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.FormatoAEntity;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.gateway.GestionarFormatoAGatewayImplAdapter;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.repositorios.DocentesRepositoryInt;

public class GestionarFormatoACUAdapter implements GestionarFormatoACUIntPort {

    private final GestionarFormatoAGatewayOutPort objGestionarFormatoAGatewayIntPort;

    public GestionarFormatoACUAdapter(GestionarFormatoAGatewayOutPort objGestionarFormatoAGatewayIntPort) {
        this.objGestionarFormatoAGatewayIntPort = objGestionarFormatoAGatewayIntPort;
    }

   
    @Override
    public FormatoPPA crearFormatoPPA(FormatoPPA formatoppa) {
        Estado estado = new Estado();
        estado.setEstadoActual("En formulacion");
        estado.setFechaRegistroEstado(new java.util.Date());

        formatoppa.setEstado(estado);
        FormatoA formatoCreado = objGestionarFormatoAGatewayIntPort.crearFormatoPPA(formatoppa);

        return (FormatoPPA) formatoCreado;

    }


  

    @Override
    public FormatoTIA crearFormatoTIA(FormatoTIA formatotia) {
            Estado estado = new Estado();
            estado.setEstadoActual("En formulacion");
            estado.setFechaRegistroEstado(new java.util.Date());

            formatotia.setEstado(estado);
            FormatoA formatoCreado = objGestionarFormatoAGatewayIntPort.crearFormatoTIA(formatotia);
            
            return (FormatoTIA) formatoCreado;

    }

    @Override
    public FormatoPPA modificarFormatoPPA(FormatoPPA formatoppa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificarFormatoPPA'");
    }

    @Override
    public String cambiarEstado(int idFormatoA, String estado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cambiarEstado'");
    }

    @Override
    public FormatoPPA buscarFormatoPPAPorId(int idFormatoA) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarFormatoPPAPorId'");
    }

    @Override
    public FormatoTIA modificarFormatoTIA(FormatoTIA formatotia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificarFormatoTIA'");
    }

    @Override
    public FormatoTIA buscarFormatoTIAPorId(int idFormatoA) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarFormatoTIAPorId'");
    }

    @Override
    public List<FormatoA> buscarFormatoPorCorreoFechaInicioFin(String correo, Date fechaInicio, Date fechaFin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarFormatoPorCorreoFechaInicioFin'");
    }

    @Override
    public FormatoA listarObservacionPorFormatoA(int idFormatoA) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarObservacionPorFormatoA'");
    }

    
}