package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.gateway;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.modelmapper.TypeToken;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.GestionarDocenteGatewayIntPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.modelos.Docente;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.entidades.DocenteEntity;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.output.persistencia.repositorios.DocentesRepositoryInt;

@Service
public class GestionarDocenteGatewayImplAdapter implements GestionarDocenteGatewayIntPort {

    private final DocentesRepositoryInt objDocenteRepository;
    private final ModelMapper docenteModelMapper;

    public GestionarDocenteGatewayImplAdapter(DocentesRepositoryInt objDocenteRepository,
        ModelMapper docenteModelMapper
    ){
        this.objDocenteRepository = objDocenteRepository;
        this.docenteModelMapper = docenteModelMapper;
    }

    @Override
    public Docente guardarDocente(Docente docente) {
        DocenteEntity objDocenteEntity = this.docenteModelMapper.map(docente, DocenteEntity.class);
        DocenteEntity objDocenteEntityRegistrado = this.objDocenteRepository.save(objDocenteEntity);
        Docente objDocenteRespuesta = this.docenteModelMapper.map(objDocenteEntityRegistrado, Docente.class);
        return objDocenteRespuesta;
    }

    @Override
    public List<Docente> listarTodos() {
        Iterable<DocenteEntity> lista = this.objDocenteRepository.findAll();
        List<Docente> listaObtenida = this.docenteModelMapper.map(lista, new TypeToken<List<Docente>>() {        
        }.getType());
        return listaObtenida;
    }
    
}
