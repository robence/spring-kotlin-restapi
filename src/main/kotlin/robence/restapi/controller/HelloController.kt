package robence.restapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import robence.restapi.service.JavaService
import robence.restapi.service.KotlinService


@RestController
class HelloController() {

    @GetMapping("/api/java")
    fun helloJava(): String {
        return JavaService().sayHello()
    }

    @GetMapping("/api/kotlin")
    fun helloKotlin(): String {
        return KotlinService().sayHello()
    }
}
