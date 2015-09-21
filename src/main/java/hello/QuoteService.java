package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteService {


    @RequestMapping("/quote/agent/{id}")
    public String getQuoteList(@PathVariable(value="id") String id) {
        return "Returning Quote List for Agent with ID: " + id;
    }
    
    @RequestMapping("/quote/{id}")
    public String getQuoteDetails(@PathVariable(value="id") String id) {
        return "Returning Quote Details for Quote with ID: " + id;
    }
}