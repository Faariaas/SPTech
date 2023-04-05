package school.sptech.carro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    CarroInterface carroInter;

    @PostMapping
    public ResponseEntity<Carro> criar(@RequestBody Carro body) {
        carroInter.save(body);

        return ResponseEntity.status(201).body(body);
    }

    @GetMapping
    public ResponseEntity<List<Carro>> listar() {
        List<Carro> listaCarros = carroInter.findAll();

        if (listaCarros.isEmpty())
            return ResponseEntity.status(204).build();

        return ResponseEntity.status(200).body(listaCarros);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carro> listaPorId(@PathVariable long id) {
        Optional<Carro> carro = carroInter.findById(id);
        if (carro.isPresent())
            return ResponseEntity.status(200).body(carro.get());

        return ResponseEntity.status(404).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Carro> deletar(@PathVariable long id) {
        if (carroInter.existsById(id)) {
            carroInter.deleteById(id);
            return ResponseEntity.status(200).build();
        }
        return ResponseEntity.status(404).build();
    }
}
