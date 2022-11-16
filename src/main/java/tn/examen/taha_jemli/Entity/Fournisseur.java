package tn.examen.taha_jemli.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FOURNISSEUR")
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private long idFournisseur;

    private String codeFournisseur;

    private String libelleFournisseur;

    @Enumerated(EnumType.STRING)
    private CategorieFournisseur categorieFournisseur;

    @OneToOne(mappedBy = "fournisseur")
    private DetailFournisseur detailFournisseur;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="fournisseur")
    private Set<Facture> Factures;

    @ManyToMany(mappedBy= "fournisseuract")
    private Set<SecteurActivite> secteurActivites;
}
