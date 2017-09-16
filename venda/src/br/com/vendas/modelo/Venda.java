package br.com.vendas.modelo;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private String data;
    private String hora;
    private List<ItemVenda> ItemVendas = new ArrayList<>();

    public Venda (){

    }

    public Venda(String data, String hora, List<ItemVenda> ItemVendas) {
        this.data = data;
        this.hora = hora;
        this.ItemVendas = ItemVendas;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public List<ItemVenda> getItemVendas() {
        return ItemVendas;
    }

    public void adicionarItem(ItemVenda ItemVenda){
        ItemVendas.add(ItemVenda);
    }

    public void limparVenda(){
        ItemVendas.clear();
    }

    public void exibirVenda(){
        double vtotal = 0.0;

        System.out.print("\n \nData da Venda: " + this.getData() + " Hora: " + this.getHora() + "\n");
        for (ItemVenda iv : ItemVendas){
            System.out.print("--------------------------------------------\n");
            System.out.printf("%s %20s %5s %5s \n" ,
                    iv.getProduto().getDescricao() ,
                    iv.getProduto().getPreco(),
                    iv.getQuantidade(),
                    (iv.getProduto().getPreco() * iv.getQuantidade())
            );
            vtotal += (iv.getProduto().getPreco() * iv.getQuantidade());
        }
        System.out.print("--------------------------------------------\n");
        System.out.print("Total Geral: " + vtotal);

    }


}
