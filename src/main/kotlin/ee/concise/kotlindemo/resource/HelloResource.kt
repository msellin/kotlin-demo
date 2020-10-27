package ee.concise.kotlindemo.resource

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloResource {
    @GetMapping
    fun hello(): String {
        return "hello world";
    }
}
