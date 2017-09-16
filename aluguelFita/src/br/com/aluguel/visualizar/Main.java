package br.com.aluguel.visualizar;

import br.com.aluguel.modelo.Aluguel;
import br.com.aluguel.modelo.Cliente;
import br.com.aluguel.modelo.Fita;

public class Main {
    public static void main(String[] args) {

        Aluguel aluguelCliente = new Aluguel();

        aluguelCliente.adicionaFitas(new Fita("Batman O Cavaleiro das Trevas", Fita.Tipo.NORMAL));
        aluguelCliente.adicionaFitas(new Fita("O Senhor dos Anéis: O Retorno do Rei", Fita.Tipo.NORMAL));
        aluguelCliente.adicionaFitas(new Fita("X-Men Origens", Fita.Tipo.LANCAMENTO));
        aluguelCliente.adicionaFitas(new Fita("X-Men Apocalipse", Fita.Tipo.LANCAMENTO));
        aluguelCliente.adicionaFitas(new Fita("Clube da Luta", Fita.Tipo.NORMAL));
        aluguelCliente.adicionaFitas(new Fita("Titanic", Fita.Tipo.INFANTIL));
        aluguelCliente.adicionaFitas(new Fita("Matrix", Fita.Tipo.NORMAL));
        aluguelCliente.adicionaFitas(new Fita("A Vida é Bela", Fita.Tipo.LANCAMENTO));
        aluguelCliente = new Aluguel(new Cliente("Safira Azul Esverdeada"), aluguelCliente.getFitas(), 3);
        aluguelCliente.extratoAluguel();
        aluguelCliente.limparFitas();

        aluguelCliente.adicionaFitas(new Fita("Batman O Cavaleiro das Trevas", Fita.Tipo.LANCAMENTO));
        aluguelCliente = new Aluguel(new Cliente("Simplício Simplório Da Simplicidade Simples"), aluguelCliente.getFitas(), 3);
        aluguelCliente.extratoAluguel();
        aluguelCliente.limparFitas();

        aluguelCliente.adicionaFitas(new Fita("O Senhor dos Anéis: O Retorno do Rei", Fita.Tipo.LANCAMENTO));
        aluguelCliente = new Aluguel(new Cliente("Rodolfo Gonçalves"), aluguelCliente.getFitas(), 2);
        aluguelCliente.extratoAluguel();
        aluguelCliente.limparFitas();
    }
}