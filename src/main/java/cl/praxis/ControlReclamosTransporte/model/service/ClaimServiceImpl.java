package cl.praxis.ControlReclamosTransporte.model.service;

import cl.praxis.ControlReclamosTransporte.model.entities.Claim;
import cl.praxis.ControlReclamosTransporte.model.repository.ClaimRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimServiceImpl implements ClaimService {

    private final ClaimRepository repository;

    public ClaimServiceImpl(ClaimRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Claim> findAll() {
        return repository.findAll();
    }

    @Override
    public Claim findOne(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public boolean create(Claim c) {
        Claim claim = repository.save(c);
        return claim != null;
    }

    @Override
    public boolean update(Claim c) {
        Claim claim = repository.save(c);
        return claim != null;
    }

    @Override
    public boolean delete(int id) {
        boolean exist = repository.existsById(id);
        if (exist){
            repository.deleteById(id);
        }
        return exist;
    }
}
