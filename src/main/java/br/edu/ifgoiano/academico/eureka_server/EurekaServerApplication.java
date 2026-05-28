package br.edu.ifgoiano.academico.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Classe principal do servidor Eureka.
 *
 * Este serviço atua como servidor de descoberta dos microsserviços
 * do sistema acadêmico. Os demais serviços, como o matricula-service,
 * registram-se nele para que possam ser localizados por outros serviços.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    /**
     * Método principal da aplicação.
     *
     * Inicializa o servidor Eureka na porta configurada no arquivo
     * application.properties.
     *
     * @param args argumentos de execução da aplicação
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}