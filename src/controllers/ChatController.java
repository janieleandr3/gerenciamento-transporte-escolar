package controllers;

import models.Mensagem;
import models.Sala;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatController {

    public static void enviarMensagem(String chaveAcesso, String autor, String conteudo) {
        Sala sala = SalaController.acessarSala(chaveAcesso);
        if (sala != null) {
            String dataEnvio = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date());
            sala.mensagens.add(new Mensagem(autor, conteudo, dataEnvio));
        }
    }
}
