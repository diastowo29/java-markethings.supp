package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ElectricalController {
	
	@GetMapping("/electrical")
	public String electrical() {
        return "electrical";
    }
}
