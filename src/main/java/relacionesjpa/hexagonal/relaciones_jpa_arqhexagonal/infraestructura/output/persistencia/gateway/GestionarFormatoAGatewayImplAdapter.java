package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.gateway;

import org.springframework.stereotype.Component;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.GestionarFormatoAGatewayOutPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Estado;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoPPA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoTIA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.DocenteEntity;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.FormatoAEntity;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.FormatoPPAEntity;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.RolEntity;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.mappers.DocenteMapper;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.mappers.FormatoAMapper;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.repositorios.DocentesRepositoryInt;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.repositorios.FormatoPPARepositoryInt;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.repositorios.FormatoTIRepositoryInt;

@Component
@RequiredArgsConstructor
public class GestionarFormatoAGatewayImplAdapter implements GestionarFormatoAGatewayOutPort {
     
    private final FormatoPPARepositoryInt objFormatoPPARepositoryInt;
    private final FormatoTIRepositoryInt objFormatoTIARepositoryInt;
    private final FormatoAMapper objFormatoAMapper;
    private final DocentesRepositoryInt docenteRepositorio;
    private final DocenteMapper objDocenteMapper;



   @Override
    @Transactional
    public FormatoPPA crearFormatoPPA(FormatoPPA formatoPPA) {
        // Paso 1: Obtener el docente desde la base de datos
        DocenteEntity docenteEntity = docenteRepositorio.findById(1)
                .orElseThrow(() -> new EntityNotFoundException("Docente no encontrado"));

        // Paso 2: Crear el estado y asignarlo al formato
        Estado estado = new Estado();
        estado.setEstadoActual("En formulacion");
        estado.setFechaRegistroEstado(new java.util.Date());
        formatoPPA.setEstado(estado);

        // Paso 3: Mapear el modelo FormatoPPA a FormatoPPAEntity
        FormatoPPAEntity formatoPPAEntity = objFormatoAMapper.toEntity(formatoPPA);
        formatoPPAEntity.setObjDocente(docenteEntity);  // Asignar el docente al formato

        // Paso 4: Guardar el formato en la base de datos
        FormatoPPAEntity formatoGuardado = objFormatoPPARepositoryInt.save(formatoPPAEntity);

        // Paso 5: Mapear el formato guardado de vuelta a FormatoPPA y retornarlo
        return objFormatoAMapper.toDomain(formatoPPAEntity);
    }




    @Override
    public FormatoPPA modificarFormatoPPA(FormatoPPA formatoppa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificarFormatoPPA'");
    }


    @Override
    public String cambiarEstado(Integer idFormatoA, String estado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cambiarEstado'");
    }


    @Override
    public FormatoPPA buscarFormatoPPAPorId(int idFormatoA) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarFormatoPPAPorId'");
    }


    @Override
    public FormatoTIA crearFormatoTIA(FormatoTIA formatotia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearFormatoTIA'");
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
    public FormatoPPA listarObservacionPorFormatoA(int idFormatoA) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarObservacionPorFormatoA'");
    }

}
