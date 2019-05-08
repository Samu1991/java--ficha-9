/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha.pkg9.pp.parte.pkg2;

/**
 *
 * @author samum
 */
public abstract class Pessoa {
    
    private String cod;
    private String nome;
    private int nif;
    private String morada;
    private int telefone;

    public Pessoa(String cod, String nome, int nif, String morada, int telefone) {
        this.cod = cod;
        this.nome = nome;
        this.nif = nif;
        this.morada = morada;
        this.telefone = telefone;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    public abstract int nHoras();
    
}
