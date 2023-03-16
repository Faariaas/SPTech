package school.sptech.Projeto03;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    List<Jogo> biblioteca = new ArrayList<>();

    // GET
    @GetMapping("/adicionados")
    public ResponseEntity<List<Jogo>> List() {
        if (biblioteca.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(biblioteca);
    }

    //GET POR ID
    @GetMapping("/{indice}")
    public ResponseEntity<Jogo> getPorIndice(@PathVariable int indice){
        if(indice >=0 && indice < biblioteca.size()){
            return ResponseEntity.status(200).body((biblioteca.get(indice)));
        }
        return ResponseEntity.status(404).build();
    }

    //POST
    @PostMapping("/adiciona")
    public ResponseEntity<Jogo> adiciona(@RequestBody Jogo newJogo){
        biblioteca.add(newJogo);
        return ResponseEntity.status(200).build();
    }

    //DELETE
    @DeleteMapping("/{indice}")
    public ResponseEntity<Void> deletePorIndice(@PathVariable int indice){
        if(indice >=0 && indice < biblioteca.size()){
            biblioteca.remove(indice);
            return ResponseEntity.status(200).build();
        }
        return ResponseEntity.status(404).build();
    }

    //UPTDATE
    @PutMapping("{indice}")
    public ResponseEntity<Jogo> alterar(@PathVariable int indice,@RequestBody Jogo newJogoAlterado){
        if(indice>=0 && indice < biblioteca.size()){
            biblioteca.set(indice, newJogoAlterado);
            return ResponseEntity.status(200).body(newJogoAlterado);
        }

        return ResponseEntity.status(404).build();
    }

}
