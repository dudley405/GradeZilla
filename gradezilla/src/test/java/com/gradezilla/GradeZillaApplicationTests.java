package com.gradezilla;

import com.gradezilla.app.GradeZillaApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = GradeZillaApplication.class)
@WebAppConfiguration
public class GradeZillaApplicationTests {

	@Test
	public void contextLoads() {
	}

}
