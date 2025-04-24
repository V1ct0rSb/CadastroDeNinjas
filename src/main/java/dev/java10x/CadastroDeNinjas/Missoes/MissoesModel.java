package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer dificuldade;

    @OneToMany(mappedBy = "missoes") // Uma missão pode ter varios ninjas
    private List<NinjaModel> ninjas;

    public MissoesModel() {
    }


}
