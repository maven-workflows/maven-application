package spring.maven.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello World, Java Application!";
    }

    @GetMapping("/names")
    public List<String> getNames() {
        return Arrays.asList("Ana", "Bruno", "Carla", "Daniel");
    }

    @GetMapping("/numbers")
    public List<Integer> getNumbers() {
        return Arrays.asList(10, 20, 30, 40, 50);
    }

    @GetMapping("/cities")
    public List<String> getCities() {
        return Arrays.asList("São Paulo", "Rio de Janeiro", "Belo Horizonte", "Porto Alegre");
    }

    @GetMapping("/colors")
    public List<String> getColors() {
        return Arrays.asList("Vermelho", "Verde", "Azul", "Amarelo", "Preto");
    }

}
