package tn.examen.taha_jemli.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.examen.taha_jemli.Entity.Produit;

public interface CategorieProduitRepository extends JpaRepository<Produit, Long> {
}
