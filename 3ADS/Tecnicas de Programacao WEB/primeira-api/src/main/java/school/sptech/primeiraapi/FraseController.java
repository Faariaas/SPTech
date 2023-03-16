package school.sptech.primeiraapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frases")
public class FraseController {

    @GetMapping
    public String hello(){
        return "O primeiro Hello World a gente nunca esquece!!!!";
    }

    @GetMapping("/bom-dia")
    public String bomdia(){
        return "Bom dia Caralho";
    }

    //O conchetes se chama pathVariable vvvv
    @GetMapping("/bom-dia/{nome}/{sobrenome}")
    public String personalizado(@PathVariable String nome, @PathVariable String sobrenome){
        return "Bom dia! " + nome + " " + sobrenome + ", Voce esta lindo(a) como sempre";
    }
}
