package br.com.aweb.to_do_list.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aweb.to_do_list.Model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
