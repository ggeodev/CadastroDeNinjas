package com.example.CadastroDeNinjas.Ninjas;

import com.example.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Audited;

@Entity
@Audited.Table
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column (name = "id")
    private Long id;

    @Column (name = "nome_ninja")
    private String nome;


    @Column (unique = true, name = "email")
    private String email;

    @Column (name = "idade")
    private int idade;

    // @ManyToOne um ninja tem uma única missão
    @ManyToOne
    @JoinColumn (name = "missoes_id") // chave estrangeira
    private MissoesModel missoes;

}
