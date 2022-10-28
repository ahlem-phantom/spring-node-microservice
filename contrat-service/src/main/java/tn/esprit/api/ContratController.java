package tn.esprit.api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.entities.Contrat;
import tn.esprit.services.ContratService;


@RestController
public class ContratController {
    @Autowired
    ContratService contratService;

    @GetMapping("/")
    public String index() {
        return "Contrat Service is running";
    }
    @PostMapping("/add-contrat")
    public void addContrat(@RequestBody Contrat contrat) {
        contratService.addContrat(contrat);
    }
    @DeleteMapping(value="/delete-contrat/{id}")
    public void deleteContrat(@PathVariable Long id) {
        contratService.deleteContrat(id);
    }
    @GetMapping("/all-contrats")
    public List<Contrat> getAllContrats() {
        return contratService.findAllContrat();
    }
    @GetMapping("/get-contract/{id}")
    public Contrat afficherContrat(@PathVariable Long id) {
        return contratService.findContrat(id);
    }

    @PutMapping("/update-contract")
    public void updateContract(@RequestBody Contrat Contrat){
        contratService.updateContract(Contrat);
    }
}
