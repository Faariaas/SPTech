package school.sptech.videojogosatividade.reposritorio;

import org.springframework.data.jpa.repository.JpaRepository;
import school.sptech.videojogosatividade.entidades.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long> {
}
