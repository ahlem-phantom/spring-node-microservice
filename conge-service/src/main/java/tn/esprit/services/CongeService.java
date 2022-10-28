package tn.esprit.services;

import java.util.List;
import tn.esprit.entities.Conge;

public interface CongeService {

    public void addConge(Conge conge);

    public List<Conge> findAllConges();

    public void deleteConge(int id);

    public Conge findConge(int id);

    public void updateConge(Conge conge) ;

}
