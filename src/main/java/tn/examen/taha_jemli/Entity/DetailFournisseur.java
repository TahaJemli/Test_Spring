package tn.examen.taha_jemli.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DETAILFOURNISSEUR")
public class DetailFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private long idDetailFournisseur;

    @Temporal(TemporalType.DATE)
    private Date dateDebutCollaboration;

    private String adresse;

    private String matricule;

    @OneToOne
    private Fournisseur fournisseur;
}
