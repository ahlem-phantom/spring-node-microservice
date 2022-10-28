package tn.esprit.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.entities.Conge;
import tn.esprit.services.CongeService;
import java.util.List;

@RestController
public class CongeApi {

    @Autowired
    CongeService congeService;

    @RequestMapping("/")
    public String index() {
        return "Conge Service is running!";
    }
    @PostMapping("/add-conge")
    public void createConge(@RequestBody Conge conge) {
        congeService.addConge(conge);
    }
    @DeleteMapping(value="/delete-conge/{id}")
    public void removeConge(@PathVariable("id") int id) {

        congeService.deleteConge(id);
    }
    @GetMapping("/find-all-conge")
    public List<Conge> getAllConges() {
        return congeService.findAllConges();
    }
    @GetMapping("/find-conge/{id}")
    public Conge getConge(@PathVariable int id) {
        return congeService.findConge(id);
    }

    @PutMapping("/update-conge")
    public void updateConge(@RequestBody Conge Conge){
        congeService.addConge(Conge);
    }
}
