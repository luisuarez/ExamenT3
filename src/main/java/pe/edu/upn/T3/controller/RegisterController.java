package pe.edu.upn.T3.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



import pe.edu.upn.T3.model.entity.Cliente;
import pe.edu.upn.T3.service.ClienteService;



@Controller
@RequestMapping("/Registro")
public class RegisterController {
	
	@Autowired
	private ClienteService clienteservice;
	
	@GetMapping("/Register")
	public String nuevo(Model model) {
		Cliente cliente = new Cliente();
		model.addAttribute("cliente", cliente);
		return "/Register";
	}
}
