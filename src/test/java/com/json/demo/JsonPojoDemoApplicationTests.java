package com.json.demo;

import com.com.json.demo.model.ShippingAddress;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JsonPojoDemoApplicationTests {

	@Test
	void contextLoads() {
		ShippingAddress shippingAddress = new ShippingAddress();
		shippingAddress.setExtendedAddress("H.NO 445 Paras Estate");
		shippingAddress.setStreetAddress("Gali No. 3");
		System.out.println(shippingAddress.getStreetAddress());
		System.out.println(shippingAddress.getExtendedAddress());
	}

}
