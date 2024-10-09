package models;

public class Mensagem {
    public String autor;
    public String conteudo;
    public String dataEnvio;

    public Mensagem(String autor, String conteudo, String dataEnvio) {
        this.autor = autor;
        this.conteudo = conteudo;
        this.dataEnvio = dataEnvio;
    }
}
