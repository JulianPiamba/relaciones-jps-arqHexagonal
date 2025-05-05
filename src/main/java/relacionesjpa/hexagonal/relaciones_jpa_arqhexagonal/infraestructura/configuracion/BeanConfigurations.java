package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.GestionarDocenteGatewayIntPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.casosDeUso.GestionarDocenteCUAdapter;

@Configuration
public class BeanConfigurations {
    
    @Bean
    public GestionarDocenteCUAdapter crearGestionarDocenteCUInt(
        GestionarDocenteGatewayIntPort objGestionarDocenteGateway
    ){
        GestionarDocenteCUAdapter objGestionarDocenteCU = new GestionarDocenteCUAdapter(objGestionarDocenteGateway);
        return objGestionarDocenteCU;
    }
}
