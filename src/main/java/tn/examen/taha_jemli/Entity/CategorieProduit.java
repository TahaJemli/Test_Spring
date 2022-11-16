package tn.examen.taha_jemli.Entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CATEGORIEPRODUIT")
public class CategorieProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private long idCategorieProduit;

    private String codeProduit;

    private String libelleCategorieProduit;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="categorieProduit")
    private Set<Produit> produits;
}
