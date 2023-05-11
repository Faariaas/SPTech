package school.sptech.marketplace.servico;

import jakarta.websocket.server.ServerEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import school.sptech.marketplace.dominio.AvaliacaoCompradorProduto;
import school.sptech.marketplace.repositorio.AvaliacaoCompradorProdutoRepository;
import school.sptech.marketplace.repositorio.CompradorRepository;
import school.sptech.marketplace.repositorio.ProdutoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AvaliacaoCompradorProdutoServico {

    @Autowired
    private AvaliacaoCompradorProdutoRepository avaliacaoRepository;

    @Autowired
    private CompradorRepository compradorRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<AvaliacaoCompradorProduto> listaAvaliacoes(){
        List<AvaliacaoCompradorProduto> avaliacoes = avaliacaoRepository.findAll();
        return avaliacoes;
    }

    public AvaliacaoCompradorProduto buscaPorId(Long id) {

//        AvaliacaoCompradorProduto teste = avaliacaoRepository.findById(id).orElseThrow(
//                () -> new ResponseStatusException(HttpStatusCode.valueOf(404), "Avaliação nao existe")
//        );


        Optional<AvaliacaoCompradorProduto> avaliacao = avaliacaoRepository.findById(id);

        if (avaliacao.isPresent()) {
            return avaliacao.get();
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Avaliação não existe");
    }

    public Avali

}
