package sptech.school.projeto2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    private List<Musica> playlist;

    public MusicaController() {
        this.playlist = new ArrayList<>();
        playlist.add(new Musica("Ela Partiu", "Tim Maia",2000));
        playlist.add(new Musica("Caneta Azul", "Manoel Gomes",2021));
        playlist.add(new Musica("Deus fez tudo direitinho", "Alguem muito bom",2013));
    }

    @GetMapping
    public List<Musica> list(){
        return playlist;
    }

    //Metodo antigo pra buscar
    //http:localhost:8080/musicas/recuperar/0
    //@GetMapping("/recuperar/{indice}")
    @GetMapping("/{indice}")
    public Musica recuperar(@PathVariable int indice){
        if(indice >=0 && indice < playlist.size()){
            return playlist.get(indice);
        }
        return null;
    }

    //Delete = Delete
    @DeleteMapping("/{indice}")
    public String remover(@PathVariable int indice){
        if(indice >=0 && indice < playlist.size()){
            playlist.remove(indice);
            return "Musica foi removida";
        }
        return "Musica nao encontrada";
    }

    //Post = Create
    @PostMapping("")
    public Musica criar(@RequestBody Musica novaMusica){
//        Musica novaMusica = new Musica(nome, artista, anoLancamento);
        playlist.add(novaMusica);
        return novaMusica;
    }

    //Put = Update
    @PutMapping("{indice}")
//    public String alterar(@PathVariable int indice, @PathVariable String nome, @PathVariable String artista, @PathVariable int anoLancamento){
    public String alterar(@PathVariable int indice,@RequestBody Musica musicaALterada){
        if(indice>=0 && indice < playlist.size()){
//            Musica musicaALterada = new Musica(nome, artista, anoLancamento);
            playlist.set(indice, musicaALterada);
            return "Okay";
        }

        return "NotOkay";
    }
}
