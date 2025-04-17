package cl.duoc.matiasn.app_mati.controller;
import cl.duoc.matiasn.app_mati.controller.response.GreetingResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/greetings")


public class GreetingController {

    @GetMapping("/hello")
    public ResponseEntity<GreetingResponse>hello(){
        GreetingResponse response = new GreetingResponse();
        response.setGreeting("hello world");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/hello-guest")
    public ResponseEntity<GreetingResponse>helloGuest(@RequestParam (required = false,value = "name")String name,
@RequestParam(required = false, value="lastname") String lastname){
        GreetingResponse response = new GreetingResponse();
        response.setGreeting("hello world"+" " + name + " " + lastname);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/bye")

    public String bye(){
        return "Bye World";
    }
}
