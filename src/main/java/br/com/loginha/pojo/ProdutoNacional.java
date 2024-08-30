package br.com.loginha.pojo;

import br.com.loginha.enums.Tamanho;
import br.com.loginha.interfaces.Favorito;

public class ProdutoNacional extends Produto implements Favorito {
    //encapsulando
    private double impostoNacial;
    public ProdutoNacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public double getImpostoNacial(){
        return this.impostoNacial;
    }

    public void setImpostoNacial(double novoImpostoNacional){
        this.impostoNacial = novoImpostoNacional;
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + ", " + this.getValor();
    }
}
