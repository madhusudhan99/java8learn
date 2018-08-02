package root.sam.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicWeb {
	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return Arrays.asList(new Topic("1", "Madhu"), new Topic("2", "Sudhan"), new Topic("3", "Raju"));

		// return "HELLO";
	}

}
