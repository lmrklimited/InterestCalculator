package com.yodel.calculator;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.yodel.calculator.service.CalculatorService;

@RunWith(SpringRunner.class)
@WebMvcTest
public class CalculatorApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private CalculatorService calculatorServiceImpl;

	@Test
	public void getHighInterest() throws Exception {
		this.mockMvc.perform(get("/interest/6400"))
		.andExpect(status().isOk());
	}

}
