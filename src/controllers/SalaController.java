package controllers;

import models.Sala;
import java.util.HashMap;
import java.util.Map;

public class SalaController {
    public static Map<String, Sala> salas = new HashMap<>();

    public static Sala criarSala(String cidade, String nomeMotorista) {
        String chaveAcesso = gerarChaveAcesso();
        Sala novaSala = new Sala(cidade, nomeMotorista, chaveAcesso);
        salas.put(chaveAcesso, novaSala);
        return novaSala;
    }

    private static String gerarChaveAcesso() {
        return "R" + (int)(Math.random() * 10000);
    }

    public static Sala acessarSala(String chaveAcesso) {
        return salas.get(chaveAcesso);
    }
}
