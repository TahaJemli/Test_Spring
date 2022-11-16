package tn.examen.taha_jemli.Entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DETAILFACTURE")
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private long idDetailFacture;

    private Integer qteCommande;

    private float prixTotalDetail;

    private Integer pourcentageRemise;

    @ManyToOne(cascade = CascadeType.ALL)
    Produit produit;

}
