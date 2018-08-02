package spring.boot.learning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleWeb {

	@RequestMapping("/hey")
	public String sayHey()
	{
		return "Hey";
	}
}
