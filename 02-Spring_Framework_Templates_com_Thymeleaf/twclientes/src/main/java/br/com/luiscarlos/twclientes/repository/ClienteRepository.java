package br.com.luiscarlos.twclientes.repository;

import br.com.luiscarlos.twclientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
