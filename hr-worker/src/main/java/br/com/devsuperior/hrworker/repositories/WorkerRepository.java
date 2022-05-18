package br.com.devsuperior.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.devsuperior.hrworker.entities.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
