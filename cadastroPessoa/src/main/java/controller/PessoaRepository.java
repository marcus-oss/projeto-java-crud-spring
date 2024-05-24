package controller;

import org.springframework.data.jpa.repository.JpaRepository;

/*
 * 
 * classe de pessoa repository  extendendo os metodos jpa
 */

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	

}
