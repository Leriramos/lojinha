package br.com.loginha.pojo;

public class ItemIncluso {
    //atributos
    // para encapsular, precisa tornar os modificadores privados
    private String nome;
    private int quantidade;

    //Construtor
    public ItemIncluso(String nomeInicial, int quantidadeInicial) {
        this.nome = nomeInicial;
        this.quantidade = quantidadeInicial;

    }

    //depois dos modificadores, criar um metodo (metodo get, sempre é publico)
    public String getNome () {
        return this.nome;
    }

    //depois, cria-se um set para atribuir um valor ao nome
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
