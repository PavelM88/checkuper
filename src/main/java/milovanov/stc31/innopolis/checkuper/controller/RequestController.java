package milovanov.stc31.innopolis.checkuper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestController {

    @RequestMapping(value = "/requests", method = RequestMethod.GET)
    public String getAllRequests(Model model) {
        return "AllRequests";
    }
}
