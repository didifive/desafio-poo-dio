package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public Mentoria(String titulo) {
        setTitulo(titulo);
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\n\t\tmentoria: {\n"
                + "\t\t\ttitulo: \"" + getTitulo() + "\",\n"
                + "\t\t\tdescricao: \"" + getDescricao() + "\",\n"
                + "\t\t\tdata: \"" + data + "\",\n"
                + "\t\t}";
    }
}
