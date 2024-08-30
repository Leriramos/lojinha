package br.com.loginha.pojo;

import br.com.loginha.enums.Tamanho;

import java.util.List;

public class Produto {
    //atributos
    private String nome;
    private String marca;
    protected double valor;
    private Tamanho tamanho;
    private List<ItemIncluso> itensInclusos;

    //Construtor
    public Produto(String marcaInicial, Tamanho tamanhoInicial){
        //Definir comandos que serão iniciados durante a instanciação
        this.marca = marcaInicial;
        this.tamanho = tamanhoInicial;
    }


    //metodo para capturar o valor que esta dentro do atributo valor(busca o valor

    public double getValor() {
        return this.valor;
    }

    //outro metodo para colocar o valor dentro (Atribui o valor)
    public void setValor(double novoValor){
        if (novoValor > 0) {
            this.valor = novoValor;
        }else {
            //argumento invalido
            throw new IllegalArgumentException("Valores devem ser maiores que 0");
        }

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;

    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public Tamanho getTamanho(){
        return this.tamanho;
    }

    public void setTamanho(Tamanho novoTamanho){
        this.tamanho = novoTamanho;
    }

    public  List<ItemIncluso> getItensInclusos(){
        return this.itensInclusos;
    }

    public void setItensInclusos(List<ItemIncluso> novoItensInclusos){
        this.itensInclusos = novoItensInclusos;
    }

}
