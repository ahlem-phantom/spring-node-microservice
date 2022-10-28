package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Contrat;

public interface ContratService {
    public void addContrat(Contrat contrat);

    public List<Contrat> findAllContrat();

    public void deleteContrat(Long id);

    public Contrat findContrat(Long contratid);

    public void updateContract(Contrat contrat) ;

}
