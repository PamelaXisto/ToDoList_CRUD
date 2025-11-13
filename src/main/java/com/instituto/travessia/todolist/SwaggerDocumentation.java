package com.instituto.travessia.todolist;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerDocumentation {

    @Bean
    public OpenAPI customOpenAPI(){

        return new OpenAPI().info(new Info()
                .title("To-do List")
                .description("Mini lista de tarefas")
        );

    }
}
