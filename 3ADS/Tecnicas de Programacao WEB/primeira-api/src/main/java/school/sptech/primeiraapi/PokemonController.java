package school.sptech.primeiraapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
    private List<String> pokemon = new ArrayList<>();

    @GetMapping()
    public String totalCad(){
        return ("pokemon");
    }

    @GetMapping("/cadastrar/{nomepokemon}")
    public String adicionando(@PathVariable String nomepokemon){
        pokemon.add(nomepokemon);
        return ("Pokemon cadastrado");
    }

    @GetMapping("/recuperar/{indice}")
    public String recuperando(@PathVariable Integer indice) {

        if (indice >= 0 && indice < pokemon.size()) {
            return pokemon.get(indice);
        }
        return ("Pokemon não encontrado");
    }

    @GetMapping("/excluir/{indice}")
    public String excluindo(@PathVariable Integer indice){

        if (indice >= pokemon.size()) {
            return ("Pokemon não encontrado");
        }
        pokemon.remove(indice);
        return ("Pokemon deletado");
    }

    @GetMapping("/atualizar/{indice}/{novoNome}")
    public String atualizandoPokemon(@PathVariable Integer indice,@PathVariable String novoNome){

        if (indice >= 0 && indice < pokemon.size()) {
            pokemon.set(indice, novoNome);
        }

        return ("Pokemon nao encontrado");
    }
}
