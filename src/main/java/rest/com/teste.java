package rest.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class teste {
	
	@GetMapping ("Loc")
	public String obtemLoc() {
		return "Olá Dattebayo";
	}
		

}
