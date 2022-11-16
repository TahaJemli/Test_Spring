package tn.examen.taha_jemli.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FACTURE")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private long idFacture;

    private float montantRemise;

    private float montantFactutre;

    @Temporal(TemporalType.DATE)
    private Date dateCreationFacture;

    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;

    private boolean archivee;

    @ManyToOne(cascade = CascadeType.ALL)
    Fournisseur fournisseur;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="facture")
    private Set<Reglement> reglements;
}
