package one.digitalinovationnovation.desafioexplorandopadroesprojetos.model;

import javax.persistence.*;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double salario;
    private String nome;
    private String cargo;
    @ManyToOne
    private Endereco endereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
