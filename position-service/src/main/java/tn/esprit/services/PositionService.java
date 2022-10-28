package tn.esprit.services;
import java.util.List;
import tn.esprit.entities.Position;


public interface PositionService {

	public void addPosition(Position position);

    public List<Position> findAllPositions();

    public void deletePosition(Long id);

    public Position findPosition(Long id);

    public void updatePosition(Position position) ;

    
}
