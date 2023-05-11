package school.sptech.marketplace.controladora;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import school.sptech.marketplace.dominio.AvaliacaoCompradorProduto;
import school.sptech.marketplace.dominio.Comprador;
import school.sptech.marketplace.dominio.Produto;
import school.sptech.marketplace.dto.AvaliacaoCompradorProdutoAlteracaoDto;
import school.sptech.marketplace.dto.AvaliacaoCompradorProdutoCriacaoDto;
import school.sptech.marketplace.repositorio.AvaliacaoCompradorProdutoRepository;
import school.sptech.marketplace.repositorio.CompradorRepository;
import school.sptech.marketplace.repositorio.ProdutoRepository;
import school.sptech.marketplace.servico.AvaliacaoCompradorProdutoServico;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoCompradorProdutoController {

    @Autowired
    private AvaliacaoCompradorProdutoServico avaliacaoServico;
    @Autowired
    private AvaliacaoCompradorProdutoRepository avaliacaoRepository;

    @Autowired
    private CompradorRepository compradorRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public ResponseEntity<List<AvaliacaoCompradorProduto>> listarAvaliacoes() {
        List<AvaliacaoCompradorProduto> avaliacoes = avaliacaoServico.listaAvaliacoes();

        if (avaliacoes.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok().body(avaliacoes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AvaliacaoCompradorProduto> listarAvaliacaoPorId(@PathVariable Long id) {
        AvaliacaoCompradorProduto avaliacao = avaliacaoServico.buscaPorId(id);

        return ResponseEntity.ok(avaliacao);
    }

    @PostMapping
    public ResponseEntity<AvaliacaoCompradorProduto> criarAvaliacao(
            @RequestBody @Valid AvaliacaoCompradorProdutoCriacaoDto novaAvaliacao) {

        Optional<Comprador> comprador = compradorRepository.findById(novaAvaliacao.getCompradorId());
        Optional<Produto> produto = produtoRepository.findById(novaAvaliacao.getProdutoId());

        if (!comprador.isPresent() || !produto.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        AvaliacaoCompradorProduto avaliacao = new AvaliacaoCompradorProduto(
                comprador.get(),
                produto.get(),
                novaAvaliacao.getNota(),
                novaAvaliacao.getComentario()
        );

        return ResponseEntity.created(null).body(avaliacaoRepository.save(avaliacao));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AvaliacaoCompradorProduto> editarAvaliacao(
            @PathVariable Long id,
            @RequestBody @Valid AvaliacaoCompradorProdutoAlteracaoDto avaliacao) {

        Optional<AvaliacaoCompradorProduto> avaliacaoExistente =
                avaliacaoRepository.findById(id);

        if (avaliacaoExistente.isPresent()) {
            AvaliacaoCompradorProduto avaliacaoEditada = avaliacaoExistente.get();

            if (avaliacao.getComentario() != null) {
                avaliacaoEditada.setComentario(avaliacao.getComentario());
            }
            if (avaliacao.getNota() != null) {
                avaliacaoEditada.setNota(avaliacao.getNota());
            }

            return ResponseEntity.ok().body(avaliacaoRepository.save(avaliacaoEditada));
        }

        return ResponseEntity.notFound().build();
    }
}
