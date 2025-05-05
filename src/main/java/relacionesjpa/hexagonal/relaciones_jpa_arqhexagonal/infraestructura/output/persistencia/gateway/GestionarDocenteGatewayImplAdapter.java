package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.gateway;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.GestionarDocenteGatewayOutPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Docente;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.DocenteEntity;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.mappers.DocenteMapper;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.repositorios.DocentesRepositoryInt;

@Component
@RequiredArgsConstructor
public class GestionarDocenteGatewayImplAdapter implements GestionarDocenteGatewayOutPort {

    private final DocentesRepositoryInt objDocenteRepository;
    private final DocenteMapper docenteMapper;

    @Override
    @Transactional
    public Docente guardarDocente(Docente docente) {
        DocenteEntity docenteEntity = docenteMapper.mappearAEntity(docente);
        DocenteEntity docenteRegistrado = objDocenteRepository.save(docenteEntity);
        return docenteMapper.mappearADocente(docenteRegistrado);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Docente> listarTodos() {
        List<DocenteEntity> listaDocentes = objDocenteRepository.findAll();
        return docenteMapper.toDomainList(listaDocentes);
    }

    @Override
    public List<Docente> listarDocentesKeywords(String nombreGrupo, String apellido) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarDocentesKeywords'");
    }

    @Override
    public Docente listarFormatosByDocente(Integer idDocente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarFormatosByDocente'");
    }

    @Override
    public boolean existeDocenteByCorreo(String correo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existeDocenteByCorreo'");
    }
}
