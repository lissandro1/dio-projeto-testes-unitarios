package dio.diotestesunitarios.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.diotestesunitarios.entity.Beer;

public interface BeerRepository extends JpaRepository<Beer, Long> {

	Optional<Beer> findByName(String name);
}