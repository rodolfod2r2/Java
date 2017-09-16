package br.com.vendas.visualizar;

import br.com.vendas.modelo.ItemVenda;
import br.com.vendas.modelo.Produto;
import br.com.vendas.modelo.Venda;

public class Main {

    public static void main(String[] args) {

        Venda venda = new Venda();
        venda.adicionarItem(new ItemVenda(new Produto("Cerveja", 5.0), 2.0));
        venda.adicionarItem(new ItemVenda(new Produto("Cerveja", 4.0), 1.0));
        venda = new Venda("16/09/2017", "12:00", venda.getItemVendas());
        venda.exibirVenda();
        venda.limparVenda();

        venda.adicionarItem(new ItemVenda(new Produto("Feijão", 5.0), 8.0));
        venda.adicionarItem(new ItemVenda(new Produto("Arrozc", 4.0), 14.0));
        venda = new Venda("16/09/2017", "13:00", venda.getItemVendas());
        venda.exibirVenda();
        venda.limparVenda();

    }

}
