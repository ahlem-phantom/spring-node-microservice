package tn.esprit.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Position;
import tn.esprit.repositories.PositionRepository;

@Service
public class PositionServiceImpl implements PositionService{

    @Autowired
	private PositionRepository positionRepository;

    
    @Override
    public void addPosition(Position position) {
        positionRepository.save(position);     
    }

    @Override
    public List<Position> findAllPositions() {
        return positionRepository.findAll();

    }

    @Override
    public void deletePosition(Long id) {
        if(positionRepository.findById(id).isPresent()){
            positionRepository.deleteById(id);
          }
          else {
            System.out.println("No Position with id "+id+" exists !!!");
          }    
    }

    @Override
    public Position findPosition(Long id) {
        return positionRepository.findOneById(id);

    }

    @Override
    public void updatePosition(Position position) {
        positionRepository.save(position);        
        
    }
}
