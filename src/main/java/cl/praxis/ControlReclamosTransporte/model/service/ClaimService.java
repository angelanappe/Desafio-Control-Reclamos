package cl.praxis.ControlReclamosTransporte.model.service;

import cl.praxis.ControlReclamosTransporte.model.entities.Claim;

import java.util.List;

public interface ClaimService {
    List<Claim> findAll();
    Claim findOne(int id);
    boolean create(Claim c);
    boolean update(Claim c);
    boolean delete(int id);
}
