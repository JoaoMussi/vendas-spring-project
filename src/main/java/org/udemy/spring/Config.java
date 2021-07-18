package org.udemy.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class Config {

    @Bean
    public CommandLineRunner execute() {
        return args -> {
            System.out.println("Rodando a Configuração de Desenvolvimento");
        };
    }
}
