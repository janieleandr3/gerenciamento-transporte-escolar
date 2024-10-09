package controllers;

import models.Aluno;
import models.Sala;

public class AlunoController {

    public static void adicionarAluno(String chaveAcesso, String nome, String horario) {
        Sala sala = SalaController.acessarSala(chaveAcesso);
        if (sala != null) {
            sala.alunos.add(new Aluno(nome, horario));
        }
    }

    public static void editarAluno(String chaveAcesso, String nomeAntigo, String nomeNovo, String novoHorario) {
        Sala sala = SalaController.acessarSala(chaveAcesso);
        if (sala != null) {
            for (Aluno aluno : sala.alunos) {
                if (aluno.nome.equals(nomeAntigo)) {
                    aluno.nome = nomeNovo;
                    aluno.horario = novoHorario;
                    break;
                }
            }
        }
    }

    public static void removerAluno(String chaveAcesso, String nome) {
        Sala sala = SalaController.acessarSala(chaveAcesso);
        if (sala != null) {
            sala.alunos.removeIf(aluno -> aluno.nome.equals(nome));
        }
    }
}
