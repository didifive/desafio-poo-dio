package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev() {
    }

    public Dev(String nome) {
        setNome(nome);
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
            System.out.printf("Dev %s concluiu \"%s\"\n",getNome(),conteudo.get().getTitulo());
        } else {
            System.err.println("Não existe curso para progredir, faça uma nova inscrição.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    private double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }

    @Override
    public String toString() {
        return "Dev{\n"
                + "\tnome: \"" + getNome() + "\",\n"
                + "\tconteudosInscritos: " + getConteudosInscritos() + ",\n"
                + "\tconteudosConcluidos: " + getConteudosConcluidos() + ",\n"
                + "\txP: " + calcularTotalXp() + "\n"
                + "}";
//        return "------------\n"
//            + "Nome do Dev: " + this.nome + "\n"
//            + "Conteúdos Inscritos de " + this.nome + ": " + this.conteudosInscritos + "\n"
//            + "Conteúdos Concluídos de " + this.nome + ": " + this.conteudosConcluidos + "\n"
//            + "XP Total: " + calcularTotalXp() + "\n"
//            + "------------\n";
    }
}
