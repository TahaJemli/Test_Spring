package tn.examen.taha_jemli.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.examen.taha_jemli.Entity.Stock;
import tn.examen.taha_jemli.Repository.StockRepository;
import tn.examen.taha_jemli.Service.IStockService;

import java.util.List;

@Service
@AllArgsConstructor
public class IStockServiceImpl implements IStockService {
    StockRepository stockRepository;
    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock updateStock(Stock s) {
        return stockRepository.save(s);

    }

    @Override
    public Stock retrieveStock(Long id) {
        return stockRepository.findById(id).orElse(null);
    }

    @Override
    public void removeStock(Long id) {
        stockRepository.deleteById(id);

    }
}
