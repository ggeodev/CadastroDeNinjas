package Missoes;

import Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private MissoesRankEnum rank;

    @OneToMany (mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}
