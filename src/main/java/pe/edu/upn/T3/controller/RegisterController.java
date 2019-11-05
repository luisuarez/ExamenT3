package pe.edu.upn.T3.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.upn.T3.model.entity.Usuario;
import pe.edu.upn.T3.service.UsuarioService;



@Controller
@RequestMapping("/Usuario")
public class RegisterController {
	
	@Autowired
	private UsuarioService usuarioservice;
	
	@GetMapping("/Register")
	public String nuevo(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);
		return "/layout2/Register";
	}
	@PostMapping("/Guardar")
	public String save(@ModelAttribute("usuario") Usuario usuario,Model model) {
		try {
			usuarioservice.save(usuario);
		}catch(Exception e) {
			return "redirect:/";
		}
		return "/layout2/SignIn";
	}
	@GetMapping("/login")
	public String login() {
		return "/layout2/SignIn";
	}
	
}
