package cl.praxis.ControlReclamosTransporte.model.repository;

import cl.praxis.ControlReclamosTransporte.model.entities.Claim;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface ClaimRepository extends JpaRepository<Claim, Integer> {
}
