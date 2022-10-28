package tn.esprit.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.entities.Position;
import tn.esprit.services.PositionService;
import tn.esprit.services.PositionServiceImpl;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
public class PositionApi {

    @Autowired
	private PositionService positionService;

    @GetMapping("/")
    public String index() {
        return "Position Service is running";
    }
    @PostMapping("/add-position")
    public void addPosition(@RequestBody Position position) {
        positionService.addPosition(position);
    }
    @DeleteMapping(value="/delete-position/{id}")
    public void deletePosition(@PathVariable Long id) {
        positionService.deletePosition(id);
    }
    @GetMapping("/all-positions")
    public List<Position> getAllPositions() {
        return positionService.findAllPositions();
    }
    @GetMapping("/get-position/{id}")
    public Position getPosition(@PathVariable Long id) {
        return positionService.findPosition(id);
    }

    @PutMapping("/update-position")
    public void updatePosition(@RequestBody Position position){
        positionService.updatePosition(position);
    }

}
