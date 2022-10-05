package br.ifpe.web3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
	
	@GetMapping("/ind")
	public String form() {
		return "form";
	}
	
	@PostMapping("/sucesso")
	public String sucesso(Mensagem mensagem, Model model) {
		model.addAttribute("nome", mensagem.getNome() + ", sua mensagem foi enviada com sucesso!");
		System.out.println(mensagem);
		return "sucesso";
	}

}
