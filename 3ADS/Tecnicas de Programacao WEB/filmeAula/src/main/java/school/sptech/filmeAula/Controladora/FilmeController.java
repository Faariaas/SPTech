package school.sptech.filmeAula.Controladora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import school.sptech.filmeAula.Interface.FIlmeRepository;
import school.sptech.filmeAula.Filme;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {
    @Autowired
    private FIlmeRepository fIlmeRepository;

    @GetMapping
    public ResponseEntity<List<Filme>> listar() {
        List<Filme> listaFilmes = fIlmeRepository.findAll();

        if (listaFilmes.isEmpty())
            return ResponseEntity.status(204).build();

        return ResponseEntity.status(200).body(listaFilmes);
    }

    @PostMapping("/filmes")
    public ResponseEntity<Filme> cadFilme(@RequestBody Filme body){
        fIlmeRepository.save(body);
        return ResponseEntity.status(201).body(body);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<Filme> buscaPorId(@PathVariable Long id){
        return ResponseEntity.of(this.fIlmeRepository.findById(id));
    }
    @GetMapping("/titulo")
    public ResponseEntity<Filme> buscaPorNome(@RequestParam String nome) {
        return ResponseEntity.of(this.fIlmeRepository.findByNome(nome));

//        List<Filme> filmes = this.fIlmeRepository.findAll();
//
//        Optional<Filme> filmeProcurado = filmes.stream()
//                .filter(filme -> filme.getNome().equals(nome))
//                .findAny();
//        if(filmeProcurado.isPresent()){
//            return ResponseEntity.status(200).build();
//        }
    }

    @GetMapping("/diretor")
    public ResponseEntity<List<Filme>>buscaPorDiretor(@RequestParam String nomeDiretor){
        List<Filme> filmeFiltrados =
                this.fIlmeRepository.findByDiretorIgnoreCase(nomeDiretor);

        if (filmeFiltrados.isEmpty()){
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(filmeFiltrados);
    }

    @GetMapping("/periodo/{data}")
    public ResponseEntity<List<Filme>> buscaPorData(@PathVariable LocalDate data){
        List<Filme> filmesFiltrados =
                this.fIlmeRepository.findByDataLancamentoLessThanEqual(data);
        if(filmesFiltrados.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(filmesFiltrados);
    }

    @GetMapping("/indicados")
    public ResponseEntity<List<Filme>> buscaSomenteIndicados() {
        List<Filme> filmesFiltrados =
                this.fIlmeRepository.findByIndicacaoOscarTrue();
        if(filmesFiltrados.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(filmesFiltrados);
    }

    @GetMapping("/nao-indicados/quantidade")
    public ResponseEntity<Integer> contarSomenteNaoListados(){
        int contador =
                this.fIlmeRepository.countByIndicacaoOscarFalse();
        return ResponseEntity.status(200).body(contador);
    }

    @GetMapping("/custo-producao/{custo}")
    public ResponseEntity<List<Filme>> buscaPorCusoAlto(@PathVariable double custo){
        List<Filme> filmesFiltrados =
                this.fIlmeRepository.findByCustoProducaoGreaterThanEqual(custo);
        if(filmesFiltrados.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(filmesFiltrados);
    }

}
