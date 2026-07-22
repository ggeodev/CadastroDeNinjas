package Missoes;

import Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name = "id")
    private Long id;

    @Column (name = "nome_da_missao")
    private String nomeMissao;

    @Column (name = "rank_da_missao")
    private MissoesRankEnum rank;

    @OneToMany (mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}
