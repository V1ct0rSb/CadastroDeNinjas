package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Entity transforma uma classe comum em uma entidade do DB
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor // Vai gerar todos os contrutores sem argumentos
@AllArgsConstructor // Vai gerar todos os contrutores com argumentos
@Data //Vai Gerar todos os Get e Set
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    @ManyToOne // Um ninja tem apenas uma missão
    @JoinColumn(name = "missoes_id") // Chave Estrangeira
    private MissoesModel missoes;
}
