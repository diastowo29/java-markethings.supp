package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {
	
	@RequestMapping("/profile")
	public String Profile () {
		return "profile";
	}
}
