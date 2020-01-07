package af.asr.flowable.core.resource;

import org.springframework.boot.actuate.trace.http.HttpTrace;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiResource {

    @GetMapping("/hello")
    public String hello(HttpTrace.Principal principal) {
        return "Hello " + principal.getName() + "!";
    }
}
