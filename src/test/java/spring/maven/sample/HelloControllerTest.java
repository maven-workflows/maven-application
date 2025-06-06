package spring.maven.sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

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
}
