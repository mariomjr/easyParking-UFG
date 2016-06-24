package org.com.easyparking.model;

/**
 * Created by MarioJr on 22/06/2016.
 */
public class Usuario {

    private String nome;
    private String login;
    private String foto;
    private String email;
    private String banco;
    private String conta;

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getFoto() {
        return foto;
    }

    public String getEmail() {
        return email;
    }

    public String getBanco() {
        return banco;
    }

    public String getConta() {
        return conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }
}
