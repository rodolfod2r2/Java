package br.com.aluguel.modelo;

public class Fita {

    public enum Tipo {
        NORMAL(2),
        LANCAMENTO(3),
        INFANTIL(1.5);

        public double valorTipo;

        Tipo(double valorTipo) {
            this.valorTipo = valorTipo;
        }

        public double getValorTipo() {
            return valorTipo;
        }
    }

    private String titulo;
    private Tipo codigoPreco;

    public Fita(String titulo, Tipo codigoPreco) {
        this.titulo = titulo;
        this.codigoPreco = codigoPreco;
    }

    public String getTitulo() {
        return titulo;
    }

    public Tipo getCodigoPreco() {
        return codigoPreco;
    }

}
