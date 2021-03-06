package provider;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
		
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("index is called");
		return "Hello World";
	}
	
	@RequestMapping("/hello2")
	public String hello(@RequestParam(value = "name") String name) {
		return "Hello " + name;
	}
}
