package br.ETS.Feedback.instrutor;


import br.ETS.Feedback.informacoes.Informacoes;
import br.ETS.Feedback.instrutor.DTO.DadosCadastroInstrutor;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name = "instrutor")
@Table(name = "tbInstrutores")
public class Instrutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String edv;
    @Enumerated(EnumType.STRING)
    private Curso curso;

    @Embedded
    private Informacoes infomacoes;

    public Instrutor(DadosCadastroInstrutor dadosCadastroInstrutor) {
        this.nome = dadosCadastroInstrutor.nome();
        this.email = dadosCadastroInstrutor.email();
        this.edv = dadosCadastroInstrutor.edv();
        this.curso = dadosCadastroInstrutor.curso();
        this.infomacoes = new Informacoes(dadosCadastroInstrutor.informacoes());
    }
}
