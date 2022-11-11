package br.com.luiscarlos.twclientes.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, name = "data_nascimento")
    private Date dataNasciemnto;

    @Column(nullable = false)
    private String profissao;

    public Cliente() {
    }

    public Cliente(Long id, String nome, Date dataNasciemnto, String profissao) {
        this.id = id;
        this.nome = nome;
        this.dataNasciemnto = dataNasciemnto;
        this.profissao = profissao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasciemnto() {
        return dataNasciemnto;
    }

    public void setDataNasciemnto(Date dataNasciemnto) {
        this.dataNasciemnto = dataNasciemnto;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id) && Objects.equals(nome, cliente.nome) && Objects.equals(dataNasciemnto, cliente.dataNasciemnto) && Objects.equals(profissao, cliente.profissao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, dataNasciemnto, profissao);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNasciemnto=" + dataNasciemnto +
                ", profissao='" + profissao + '\'' +
                '}';
    }
}
