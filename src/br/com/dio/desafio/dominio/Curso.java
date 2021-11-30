package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    public Curso(String titulo) {
        setTitulo(titulo);
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\n\t\tcurso: {\n"
                + "\t\t\ttitulo: \"" + getTitulo() + "\",\n"
                + "\t\t\tdescricao: \"" + getDescricao() + "\",\n"
                + "\t\t\tcargaHoraria: " + getCargaHoraria() + ",\n"
                + "\t\t}";
    }
}
