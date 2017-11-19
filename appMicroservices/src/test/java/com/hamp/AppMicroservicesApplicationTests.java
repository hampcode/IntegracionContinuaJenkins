package com.hamp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hamp.model.Persona;
import com.hamp.repository.IPersonaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppMicroservicesApplicationTests {

	@Autowired
	IPersonaRepository ipersonar;
	
	@Test
	public void contextLoads() throws Exception {
	
		Persona p=new Persona();
		p.setCorreo("hmendo81@gmail.com");
		
		assertEquals("1", ipersonar.getUserIdByEmail("hmendo81@gmail.com"));
		
	}

}
