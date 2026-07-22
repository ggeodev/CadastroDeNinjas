package Ninjas;

import Missoes.MissoesModel;
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

    private Long id;
    private String nome;
    @Column (unique = true)
    private String email;
    private int idade;

    // @ManyToOne um ninja tem uma única missão
    @ManyToOne
    @JoinColumn (name = "missoes_id") // chave estrangeira
    private MissoesModel missoes;

}
