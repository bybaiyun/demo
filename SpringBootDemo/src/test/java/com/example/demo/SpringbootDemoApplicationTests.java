package com.example.demo;

import com.example.demo.util.DateUtils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringbootDemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void dateUtilTest(){
		System.out.println(DateUtils.now());
	}

}
