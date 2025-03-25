package com.example.Devops;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DevopsApplicationTests {

	@Test
	void contextLoads() {
		Car car = new Car("AA11BB", "Ferrari",995);
		String plateNumber = car.getPlateNumber();
		assertEquals("AA11BB", plateNumber);
	}

}