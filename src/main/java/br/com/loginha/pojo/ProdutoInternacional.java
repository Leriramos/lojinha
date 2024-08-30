package br.com.loginha.pojo;

import br.com.loginha.enums.Tamanho;
import br.com.loginha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {
    private double impostoInternacional;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public void setValor(double novoValor){
        if (novoValor > -100) {
            this.valor = novoValor;
        }else {
            //argumento invalido
            throw new IllegalArgumentException("Valores devem ser maiores que -100");
        }

    }

    public double getImpostoInternacional (){
        return  this.impostoInternacional;
    }

    public void setImpostoInternacional(double novoImpostoInternacional){
        this.impostoInternacional = novoImpostoInternacional;

    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + ", " + this.getValor();
    }
}
