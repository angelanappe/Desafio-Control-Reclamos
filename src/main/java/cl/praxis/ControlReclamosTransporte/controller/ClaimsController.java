package cl.praxis.ControlReclamosTransporte.controller;

import cl.praxis.ControlReclamosTransporte.model.entities.Role;
import cl.praxis.ControlReclamosTransporte.model.service.ClaimService;
import cl.praxis.ControlReclamosTransporte.model.service.RoleService;
import cl.praxis.ControlReclamosTransporte.model.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClaimsController {

    private final ClaimService claimService;

    public ClaimsController(ClaimService claimService) {
        this.claimService = claimService;
    }

    @GetMapping("/home")
    public String findAll(Model model){
        model.addAttribute("claims", claimService.findAll());
        return "home";
    }
}
