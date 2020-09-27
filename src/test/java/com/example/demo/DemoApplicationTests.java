package com.example.demo;
import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		Car audi=new Car("audi",7000000);
		
		assertTrue(audi.ObjectCreated());
	}

}
