package com.firsttryingprojcet1;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.firsttryingprojcet1.repository.AddressRepository;

@SpringBootTest
class SpringbootTryingproject1ApplicationTests {

	@Autowired
	 AddressRepository addressRepository;
	@Test
	void contextLoads() {
	}
	
	

	

}
