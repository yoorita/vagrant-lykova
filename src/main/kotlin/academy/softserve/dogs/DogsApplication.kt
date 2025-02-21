package academy.softserve.dogs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.core.io.ClassPathResource
import org.springframework.web.reactive.config.CorsRegistry
import org.springframework.web.reactive.config.WebFluxConfigurer
import org.springframework.web.reactive.function.server.RequestPredicates
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.web.reactive.function.server.ServerResponse

@SpringBootApplication
class DogsApplication {
    @Bean
    fun imgRouter(): RouterFunction<ServerResponse> =
        RouterFunctions.resources("/images/**", ClassPathResource("images/"))

    @Bean
    fun cssRouter(): RouterFunction<ServerResponse> =
        RouterFunctions.resources("/css/**", ClassPathResource("css/"))

    @Bean
    fun jsRouter(): RouterFunction<ServerResponse> =
        RouterFunctions.route(RequestPredicates.GET("/app.js")) {
            ServerResponse.ok().bodyValue(ClassPathResource("app.js"))
        }
    
    @Bean
    fun indexRouter(): RouterFunction<ServerResponse> =
        RouterFunctions.route(RequestPredicates.GET("/")) {
            ServerResponse.ok().bodyValue(ClassPathResource("index.html"))
        }

    @Bean
    fun corsConfigurer(): WebFluxConfigurer = object : WebFluxConfigurer {
        override fun addCorsMappings(registry: CorsRegistry) {
            registry
                .addMapping("/*")
                .allowedMethods("GET")
                .allowedOrigins("*")
        }
    }
}

fun main(args: Array<String>) {
    runApplication<DogsApplication>(*args)
}
