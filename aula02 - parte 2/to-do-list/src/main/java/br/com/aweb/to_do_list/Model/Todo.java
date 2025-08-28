package br.com.aweb.to_do_list.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.FutureOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false) // semelhante a notnull, restringe tamanho de caracters
    private String title;
    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
    @FutureOrPresent // verifica se está criando dado para o futuro e não passado
    @Column(nullable = false)
    private LocalDate deadline;
    @Column(nullable = true)
    private LocalDate finishedAt;
}
