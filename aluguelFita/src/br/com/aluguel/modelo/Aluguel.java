package br.com.aluguel.modelo;

import java.util.ArrayList;
import java.util.List;

public class Aluguel {

    private Cliente cliente;
    private List<Fita> fitas = new ArrayList<>();
    private int diasAlugada;

    public Aluguel() {

    }

    public Aluguel(Cliente cliente, List<Fita> fitas, int diasAlugada) {
        this.cliente = cliente;
        this.fitas = fitas;
        this.diasAlugada = diasAlugada;
    }

    public List<Fita> getFitas() {
        return fitas;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }

    public void adicionaFitas(Fita fita) {
        fitas.add(fita);
    }

    public void limparFitas() {
        fitas.clear();
    }

    public void extratoAluguel() {
        double valorTotal = 0.0;
        double desconto = 0.0;
        int pontosClube = 0;
        System.out.println("Nome do Cliente: " + cliente.getNome());
        System.out.println("--------------------------------------------------------------------");
        for (Fita f : fitas) {
            System.out.println("Filme: " + f.getTitulo() + " | Tipo do Filme: " + f.getCodigoPreco());
            pontosClube++;
            valorTotal += (f.getCodigoPreco().valorTipo * this.getDiasAlugada());
        }
        if (this.getDiasAlugada() > 2){
            pontosClube++;
            desconto += ((valorTotal * this.diasAlugada)* pontosClube) / 100;
            valorTotal -= desconto;
        }
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Pontos Acumulados para o Clube: " + pontosClube + " | Total do Aluguel: " + valorTotal);
        System.out.println("--------------------------------------------------------------------\n\n");
    }

}
