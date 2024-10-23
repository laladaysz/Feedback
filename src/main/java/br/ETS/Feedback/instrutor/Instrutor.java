package br.ETS.Feedback.instrutor;


import br.ETS.Feedback.informacoes.Informacoes;
import br.ETS.Feedback.instrutor.DTO.DadosCadastroInstrutor;

public class Instrutor {

    private String nome;
    private String email;
    private String edv;
    private String curso;
    private Informacoes infomacoes;

    public Instrutor(DadosCadastroInstrutor dadosCadastroInstrutor) {
        this.nome = dadosCadastroInstrutor.nome();
        this.email = dadosCadastroInstrutor.email();
        this.edv = dadosCadastroInstrutor.edv();
        this.curso = dadosCadastroInstrutor.curso();
        this.infomacoes = new Informacoes(dadosCadastroInstrutor.informacoes());
    }
}
