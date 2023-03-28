package school.sptech.projeto05validations;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.config.RepositoryNameSpaceHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    @Autowired
    private MusicaRepository musicaRepository;

    public ResponseEntity<List<Musica>> lista(){
        List<Musica> musicas = musicaRepository.findAll();
        if (musicas.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(musicas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Musica> buscaPorId(@PathVariable Integer id){
        Optional<Musica> musicaBanco = musicaRepository.findById(id);

        if (musicaBanco.isEmpty()){
            return ResponseEntity.status(404).build();
        }

        return ResponseEntity.status(200).build();
        // return ReponseEntity.of(musicaBanco)
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar (@PathVariable Integer id){

    }
}
