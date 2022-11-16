package tn.examen.taha_jemli.Entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRODUIT")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private long idRODUIT;


    private String codeProduit;
    private String libelleProduit;
    private float prix;

    @Temporal(TemporalType.DATE)
    private Date dateCreation;

    @Temporal(TemporalType.DATE)
    private Date dateDernierModification;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="produit")
    private Set<DetailFacture> detailFactures;

    @ManyToOne(cascade = CascadeType.ALL)
    Stock stock;

    @ManyToOne(cascade = CascadeType.ALL)
    CategorieProduit categorieProduit;


}
