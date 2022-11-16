package tn.examen.taha_jemli.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.examen.taha_jemli.Entity.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
