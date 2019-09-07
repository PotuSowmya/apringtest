package com.example.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*@Controller
public class TestController {

	public String createTest() {
		
		
		return null;
		
	}
}*/
@RestController
public class TestController {

private final Test test;

@Autowired
public TestController(Test test){
    this.test = test;
}

@RequestMapping({"/","/greeting"})
  public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    return "greeting  " + test.getTest();
  }
}

@Component
class Test {

  public String getTest() {
    return "hello";
  }
}