package tn.esprit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.entities.Conge;
import tn.esprit.repositories.CongeRepository;
import java.util.List;

@Service
public class CongeServiceImpl implements CongeService {

    @Autowired
    CongeRepository congeRepository;

    @Override
    public void addConge(Conge conge) {
        congeRepository.save(conge);
    }

    @Override
    public List<Conge> findAllConges() {
        return congeRepository.findAll();
    }

    @Override
    public void deleteConge(int id) {
        if(congeRepository.findById(id).isPresent()){
            congeRepository.deleteById(id);
        }
          else {
            System.out.println("No Conge with id "+id+" exists !!!");
      
          }
    }

    @Override
    public Conge findConge(int id) {
        return congeRepository.findOneById(id);
    }

    @Override
    public void updateConge(Conge conge) {
        congeRepository.save(conge);
    }
}
