package fibonacci;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private FibonacciCalc fibonacciCalc;

    public HomeController(FibonacciCalc calculator) {
        this.fibonacciCalc = calculator;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("input", new InputData());

        return "index";
    }

    @PostMapping("/calculate")
    @ResponseBody
    public String calculate(InputData input) {
        int result = fibonacciCalc.calculate(input.getInput());
        return "Wynik to : " + result;
    }

}
