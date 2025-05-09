package relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.casosDeUso.GestionarDocenteCUAdapter;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.FormateadorResultadosOutPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.GestionarDocenteGatewayOutPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.aplicacion.output.GestionarFormatoAGatewayOutPort;
import relacionesjpa.hexagonal.relaciones_jpa_arqhexagonal.dominio.casosDeUso.GestionarFormatoACUAdapter;

@Configuration
public class BeanConfigurations {
 

    @Bean
    public GestionarDocenteCUAdapter crearGestionarDocenteCUInt(
        GestionarDocenteGatewayOutPort objGestionarDocenteGateway,
        FormateadorResultadosOutPort objFormateadorResultadosOutPort
    ){
        GestionarDocenteCUAdapter objGestionarDocenteCU = new GestionarDocenteCUAdapter(objGestionarDocenteGateway,
            objFormateadorResultadosOutPort);
        return objGestionarDocenteCU;
    }

    @Bean
    
    GestionarFormatoACUAdapter gestionarFormatoACUAdapter(GestionarFormatoAGatewayOutPort objGestionarFormatoAGatewayIntPort)
    {
        return new GestionarFormatoACUAdapter(objGestionarFormatoAGatewayIntPort);
         
}
}
