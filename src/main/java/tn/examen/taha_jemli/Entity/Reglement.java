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
@Table(name = "REGLEMENT")
public class Reglement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private long idReglement;

    private float montantPaye;

    private float montantRestant;

    private boolean payee;

    @Temporal(TemporalType.DATE)
    private Date dateReglement;

    @ManyToOne(cascade = CascadeType.ALL)
    Facture facture;
}
