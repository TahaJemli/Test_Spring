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
@Table(name = "SECTEURACTIVITE")
public class SecteurActivite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private long idSecteurActivite;

    private String codeSecteurActivite;

    private String libelleSecteurActivite;

    @ManyToMany
    private Set<Fournisseur> fournisseuract;
}
