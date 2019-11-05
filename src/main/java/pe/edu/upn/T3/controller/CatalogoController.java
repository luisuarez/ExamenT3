package pe.edu.upn.T3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upn.T3.model.entity.Plato;
import pe.edu.upn.T3.service.PlatoService;

@Controller
@RequestMapping("/Catalogo")
public class CatalogoController {
	
	@Autowired
	private PlatoService platoservice;
	
	@GetMapping("/Register")
	public String nuevo(Model model) {
		Plato plato =new Plato();
		model.addAttribute("plato",plato);
		return "/layout2/RegistrarProducto";
	}
	@PostMapping("/Guardar")
	public String save(@ModelAttribute("plato") Plato plato,Model model) {
		try {
			platoservice.save(plato);
		}catch(Exception e) {
			System.out.println(e.toString());
			return "/layout2/RegistrarProducto";
		}
		return "/layout2/CatalogoRegistrar";
	}
	@GetMapping("/Consultar")
	public String consultar(Model model) {
		try {
			List<Plato> platos=platoservice.findAll();
			model.addAttribute("platos",platos);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		return "/layout2/CatalogoRegistrar";		
	}
	@GetMapping("/Consultar_2")
	public String consultar_2(Model model) {
		try {
			List<Plato> platos=platoservice.findAll();
			model.addAttribute("platos",platos);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		return "/layout2/Catalogo";		
	}
}
