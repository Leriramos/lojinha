package br.com.loginha;

import br.com.loginha.enums.Tamanho;
import br.com.loginha.pojo.ItemIncluso;
import br.com.loginha.pojo.Produto;
import br.com.loginha.pojo.ProdutoInternacional;
import br.com.loginha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Nestle", Tamanho.MEDIO);

        meuProduto.setNome("Play Station");
        meuProduto.setValor(4999.0);

        List<ItemIncluso>itensInclusos = new ArrayList<>();
        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        itensInclusos.add(primeiroItemIncluso);

        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogo", 3);
        itensInclusos.add(segundoItemIncluso);

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Carregador", 1);
        itensInclusos.add(terceiroItemIncluso);

        meuProduto.setItensInclusos(itensInclusos);


        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getValor());

        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());

        //do lado esquerdo os itens atuais e do lado direito esta a lista
        for (ItemIncluso itemAtual : meuProduto.getItensInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());

        }

        System.out.println("Acabaram os itens");

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.MEDIO);
        meuProdutoNacional.setImpostoNacial(0.5678);
        System.out.println(meuProdutoNacional.getImpostoNacial());

        ProdutoInternacional meuImpostoInternacional = new ProdutoInternacional("Samsung", Tamanho.GRANDE);
        meuImpostoInternacional.setImpostoInternacional(-99.99);
        System.out.println(meuImpostoInternacional.getImpostoInternacional());


    }
}
