package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.gateway;

import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.GestionarFormatoAGatewayOutPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoPPA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.FormatoTIA;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.DocenteEntity;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.FormatoAEntity;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.FormatoPPAEntity;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.RolEntity;
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



    @Override
    @Transactional
    public FormatoPPA crearFormatoPPA(FormatoPPA formatoPPA) {
        
        // 1. Mapear FormatoPPA a FormatoPPAEntity
        FormatoPPAEntity formatoPPAEntity = objFormatoAMapper.toEntity(formatoPPA);

        // 2. Si el Docente no existe, lo creamos o lo asociamos
       /*  DocenteEntity docenteEntity = docenteRepositorio.findByCorreo(formatoPPA.getObjDocente().getCorreo())
                .orElseGet(() -> {
                    DocenteEntity newDocente = docenteRepositorio.save(objFormatoAMapper.toEntity(formatoPPA.getObjDocente()));
                    return newDocente;
                });*/
        
        //formatoPPAEntity.setObjDocente(docenteEntity);

        // 3. Guardar FormatoPPAEntity en la base de datos
        FormatoPPAEntity formatoPPAEntityRegistrado = objFormatoPPARepositoryInt.save(formatoPPAEntity);

        // 4. Mapear la entidad guardada de nuevo a FormatoPPA
        return objFormatoAMapper.toDomain(formatoPPAEntityRegistrado);
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
