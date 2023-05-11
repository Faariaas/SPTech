package school.sptech.videojogosatividade.controladora;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import school.sptech.videojogosatividade.entidades.Jogo;
import school.sptech.videojogosatividade.reposritorio.EmpresaRepository;
import school.sptech.videojogosatividade.reposritorio.JogoRepository;

import java.util.List;

@Tag(name = "Atividade Jogo", description = "Atividade dia 11 de tecnicas de programação web")

@RestController
@RequestMapping("/jogos")
public class JogoController {

    @Autowired
    private JogoRepository jogoRepository;
    @Autowired
    private EmpresaRepository empresaRepository;

    @PostMapping
    public ResponseEntity<Jogo> lancarJogo(@RequestBody Jogo jogo) {
        if (this.jogoRepository.existsById(jogo.getEmpresa().getId())) {
            Jogo jogoLancado = this.jogoRepository.save(jogo);
            return ResponseEntity.status(200).body(jogoLancado);
        }
        return ResponseEntity.status(204).build();
    }

    @ApiResponses({
            @ApiResponse(
                    responseCode = "204",
                    description = "Empresa nova, sem lançamentos",
                    content = @Content(schema = @Schema(hidden = true))
            ),
            @ApiResponse(responseCode = "200", description = "É da Rockstar?")
    })

    @GetMapping
    public ResponseEntity<List<Jogo>> listar() {
        List<Jogo> jogo = this.jogoRepository.findAll();

        if (jogo.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(jogo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Jogo> atualizar(
            @PathVariable Long id,
            @RequestBody @Valid Jogo jogo
    ) {
        jogo.setId(id);
        if (this.jogoRepository.existsById(id)) {
            Jogo jogoAtualizado = this.jogoRepository.save(jogo);
            return ResponseEntity.status(200).body(jogoAtualizado);
        }

        return ResponseEntity.status(404).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        if (this.jogoRepository.existsById(id)) {
            this.jogoRepository.deleteById(id);
            return ResponseEntity.status(200).build();
        }

        return ResponseEntity.status(404).build();
    }
}
