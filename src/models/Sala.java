package models;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    public String cidade;
    public String nomeMotorista;
    public String chaveAcesso;
    public List<Aluno> alunos = new ArrayList<>();
    public List<Mensagem> mensagens = new ArrayList<>();

    public Sala(String cidade, String nomeMotorista, String chaveAcesso) {
        this.cidade = cidade;
        this.nomeMotorista = nomeMotorista;
        this.chaveAcesso = chaveAcesso;
    }

    public int contarAlunosPorHorario(String horario) {
        return (int) alunos.stream().filter(a -> a.horario.equals(horario)).count();
    }
}
