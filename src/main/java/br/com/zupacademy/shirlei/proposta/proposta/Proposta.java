package br.com.zupacademy.shirlei.proposta.proposta;

import br.com.zupacademy.shirlei.proposta.Validacao.CpfCnpj;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@Entity
public class Proposta {

    public enum StatusProposta {
        ELEGIVEL, NAO_ELEGIVEL
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CpfCnpj
    @NotNull
    @NotEmpty
    private String documento;

    @Email
    @NotNull
    @NotEmpty
    private String email;

    @NotNull
    @NotEmpty
    private String nome;

    @NotNull
    @NotEmpty
    private String endereco;

    @NotNull
    @Positive
    private BigDecimal salario;

    @Enumerated(EnumType.STRING)
    private StatusProposta status;

    @Deprecated
    public Proposta(){}

    public Proposta(@CpfCnpj @NotNull @NotEmpty String documento, @Email @NotNull @NotEmpty String email,
                    @NotNull @NotEmpty String nome, @NotNull @NotEmpty String endereco,
                    @NotNull @Positive BigDecimal salario){
                        this.documento = documento;
                        this.email = email;
                        this.nome = nome;
                        this.endereco = endereco;
                        this.salario = salario;
    }

    public Long getId() {

        return id;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setStatus(StatusProposta status){
        this.status = status;
    }

    @Override
    public String toString(){
        return "Proposta{" +
                "id=" + id +
                ", documento='" + documento + '\'' +
                ", email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", salario=" + salario +
                ", status=" + status +
                '}';
    }
}
