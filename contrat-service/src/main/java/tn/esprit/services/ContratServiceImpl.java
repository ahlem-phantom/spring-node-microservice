package tn.esprit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Contrat;
import tn.esprit.repositories.ContratRepository;

import java.util.List;

@Service
public class ContratServiceImpl implements ContratService {
    
    @Autowired
    ContratRepository contratRepository;
    @Override
    public void addContrat(Contrat contrat) {
        contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> findAllContrat() {
        return contratRepository.findAll();
    }

    @Override
    public void deleteContrat(Long id) {
        if(contratRepository.findById(id).isPresent()){
            contratRepository.deleteById(id);
          }
          else {
            System.out.println("No contract with id "+id+" exists !!!");
      
          }
    }

    @Override
    public Contrat findContrat(Long id) {
        return contratRepository.findOneById(id);
    }

    @Override
    public void updateContract(Contrat contrat) {
        contratRepository.save(contrat);
    }


}
