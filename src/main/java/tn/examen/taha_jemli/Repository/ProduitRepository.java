package tn.examen.taha_jemli.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.examen.taha_jemli.Entity.Produit;
import tn.examen.taha_jemli.Entity.Stock;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
