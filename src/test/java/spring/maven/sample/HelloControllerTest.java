package spring.maven.sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class HelloControllerTest {

    @Test
    void testHello() {
        HelloController controller = new HelloController();
        String result = controller.hello();
        assertEquals("Hello World, Java Application!", result);
    }

    @Test
    void testGetNames() {
        HelloController controller = new HelloController();
        List<String> names = controller.getNames();

        assertEquals(4, names.size(), "Deveria retornar exatamente 4 nomes");

        List<String> expectedNames = Arrays.asList("Ana", "Bruno", "Carla", "Daniel");
        assertEquals(expectedNames, names, "A lista de nomes retornada está diferente do esperado");
    }

    @Test
    void testGetNumbers() {
        HelloController controller = new HelloController();
        List<Integer> numbers = controller.getNumbers();

        assertEquals(5, numbers.size(), "Deveria retornar exatamente 5 números");

        List<Integer> expectedNumbers = Arrays.asList(10, 20, 30, 40, 50);
        assertEquals(expectedNumbers, numbers, "A lista de números retornada está diferente do esperado");
    }

    @Test
    void testGetCities() {
        HelloController controller = new HelloController();
        List<String> cities = controller.getCities();

        assertEquals(4, cities.size(), "Deveria retornar exatamente 4 cidades");

        List<String> expectedCities = Arrays.asList("São Paulo", "Rio de Janeiro", "Belo Horizonte", "Porto Alegre");
        assertEquals(expectedCities, cities, "A lista de cidades retornada está diferente do esperado");
    }

    @Test
    void testGetColors() {
        HelloController controller = new HelloController();
        List<String> colors = controller.getColors();

        assertEquals(5, colors.size(), "Deveria retornar exatamente 5 cores");

        List<String> expectedColors = Arrays.asList("Vermelho", "Verde", "Azul", "Amarelo", "Preto");
        assertEquals(expectedColors, colors, "A lista de cores retornada está diferente do esperado");
    }
    
}