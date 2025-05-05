package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.casosDeUso.GestionarDocenteCUAdapter;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.GestionarFormatoAGatewayIntPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.casosDeUso.GestionarFormatoACUAdapter;

@Configuration
public class BeanConfigurations {
 
    @Bean
    
    GestionarFormatoACUAdapter gestionarFormatoACUAdapter(GestionarFormatoAGatewayIntPort objGestionarFormatoAGatewayIntPort)
    {
        return new GestionarFormatoACUAdapter(objGestionarFormatoAGatewayIntPort);
    
         
}
}
