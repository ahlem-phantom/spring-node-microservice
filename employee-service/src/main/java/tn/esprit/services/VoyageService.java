package tn.esprit.services;

import tn.esprit.entities.Voyage;
import java.util.List;

public interface VoyageService {
    public void addVoyage(Voyage voyage);

    public List<Voyage> findAllVoyage(String filter,int page,int limit);

    public void deleteVoyage(Long id);

    public Voyage findVoyage(Long id);

    public void updateVoyage(Voyage voyage);
}
