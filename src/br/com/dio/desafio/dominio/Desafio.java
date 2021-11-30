package br.com.dio.desafio.dominio;

public class Desafio extends Conteudo{

    private int quantidadeDesafios;

    @Override
    public double calcularXp() {
        return XP_PADRAO * quantidadeDesafios;
    }

    public Desafio() {
    }

    public Desafio(String titulo) {
        setTitulo(titulo);
    }

    public int getQuantidadeDesafios() {
        return quantidadeDesafios;
    }

    public void setQuantidadeDesafios(int quantidadeDesafios) {
        this.quantidadeDesafios = quantidadeDesafios;
    }

    @Override
    public String toString() {
        return "\n\t\tdesafio: {\n"
                + "\t\t\ttitulo: \"" + getTitulo() + "\",\n"
                + "\t\t\tdescricao: \"" + getDescricao() + "\",\n"
                + "\t\t\tquantidadeDesafios: " + getQuantidadeDesafios() + ",\n"
                + "\t\t}";
    }
}
