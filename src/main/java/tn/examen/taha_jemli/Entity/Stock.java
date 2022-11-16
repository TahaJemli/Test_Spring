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
@Table(name = "STOCK")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private long idStock;

    private Integer qte;
    private Integer qteMin;
    private String libelleStock;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="stock")
    private Set<Produit> produits;


}
