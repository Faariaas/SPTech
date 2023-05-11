package sptech.scholl.cafeteriaatv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.scholl.cafeteriaatv2.entidades.Cliente;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    boolean existsByEmail(String email);
    Optional<Cliente> findByEmail(String email);

}
