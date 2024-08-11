package cl.praxis.ControlReclamosTransporte.controller;

import cl.praxis.ControlReclamosTransporte.model.entities.User;
import cl.praxis.ControlReclamosTransporte.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

    private UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register";
    }

    @PostMapping("/register")
    public ModelAndView registerUser(
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam String firstName,
            @RequestParam String lastName
    ) {

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);

        boolean success = userService.create(user);

        if (success) {
            return new ModelAndView("redirect:/login"); //para redirigir al login después del registro
        } else {
            return new ModelAndView("register").addObject("error", true);
        }
    }
}
