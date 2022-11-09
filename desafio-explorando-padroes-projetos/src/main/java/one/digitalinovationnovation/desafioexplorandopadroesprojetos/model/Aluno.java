package one.digitalinovationnovation.desafioexplorandopadroesprojetos.model;

import javax.persistence.*;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double nota;
    private String nome;
    private String serie;
    @ManyToOne
    private Endereco endereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nota=" + nota +
                ", nome='" + nome + '\'' +
                ", serie='" + serie + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
