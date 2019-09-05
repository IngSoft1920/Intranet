package jovace.mytube.srvusuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@Autowired
	IdentityBean id;
	
	@GetMapping("/")
	public String mainPage(Model model) {
		model.addAttribute("mensaje", id);
		return "main";
	}

}
