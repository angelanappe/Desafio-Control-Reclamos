package cl.praxis.ControlReclamosTransporte.model.service;

import cl.praxis.ControlReclamosTransporte.model.entities.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll();
    Role findOne(int id);
    boolean create(Role r);
    boolean update(Role r);
    boolean delete(int id);
}
