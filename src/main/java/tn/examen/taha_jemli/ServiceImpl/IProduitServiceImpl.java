package tn.examen.taha_jemli.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.examen.taha_jemli.Entity.Produit;
import tn.examen.taha_jemli.Repository.ProduitRepository;
import tn.examen.taha_jemli.Repository.StockRepository;
import tn.examen.taha_jemli.Service.IProduitService;

import java.util.List;

@Service
@AllArgsConstructor
public class IProduitServiceImpl implements IProduitService {
    ProduitRepository produitRepository;

    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idCategorieProduit, Long idStock) {
        return null;
    }

    @Override
    public Produit updateProduit(Produit p, Long idCategorieProduit, Long idStock) {
        return produitRepository.save(p,idCategorieProduit,idStock);
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepository.findById(id).orElse(null);
    }
}
