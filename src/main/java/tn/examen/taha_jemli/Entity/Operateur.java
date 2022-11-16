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
@Table(name = "OPERATEUR")
public class Operateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private long idOperateur;

    private String nom;

    private String prenom;

    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Facture> Factures;
}
