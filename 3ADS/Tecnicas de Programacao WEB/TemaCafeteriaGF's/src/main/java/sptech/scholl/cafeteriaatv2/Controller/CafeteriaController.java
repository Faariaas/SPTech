package sptech.scholl.cafeteriaatv2.Controller;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.scholl.cafeteriaatv2.entidades.*;
import sptech.scholl.cafeteriaatv2.repository.ProdutoRepository;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class CafeteriaController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public ResponseEntity<Produto> cadastrar(@RequestBody Produto produto) {
        Produto prodtuoRegistrado = this.produtoRepository.save(produto);
        return ResponseEntity.status(201).body(prodtuoRegistrado);
    }

    @ApiResponses({
            @ApiResponse(responseCode = "204", description =
                    "Não há Produtos cadastrados.", content = @Content(schema = @Schema(hidden = true))),
            @ApiResponse(responseCode = "200", description = "produtos encontradas.")
    })
    @GetMapping
    public ResponseEntity<List<Produto>> listar() {
        List<Produto> filmes = this.produtoRepository.findAll();
        if (filmes.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(filmes);
    }
}
