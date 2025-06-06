package spring.maven.sample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(useMainMethod = SpringBootTest.UseMainMethod.ALWAYS)
class SampleApplicationTests {

	@Test
	void main() {
		SampleApplication.main(new String[] {});
	}
	
	@Test
	void contextLoads() {
	}

}
