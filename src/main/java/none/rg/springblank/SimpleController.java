package none.rg.springblank;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class SimpleController {

    @Autowired
    private RabbitTemplate messageTemplate;

    @RequestMapping({"/", "/index"})
    public String general() {
        return "index";
    }

    @RequestMapping("/data")
    public String withData(Model model) {
        List<String> data = Arrays.asList("Meat", "Milk", "Beer", "Bread");
        model.addAttribute("data", data);
        return "datatable";
    }

    @RequestMapping(value = "/message", method = RequestMethod.POST)
    public String message(Model model, @RequestParam("msg") String message) {
        messageTemplate.convertAndSend("my.routingkey.1", message != null && !message.isEmpty() ? message : "No message");
        return "redirect:index";
    }
}
