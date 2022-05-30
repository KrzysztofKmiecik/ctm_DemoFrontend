package pl.kmiecik.ctm_demofrontend.ais;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
@AllArgsConstructor
public class SearchController {

    private final ServiceAis serviceAis;


    @GetMapping("/ais")
    public String getAis(Model model) {
        System.out.println();
        List<SearchingResult> location = serviceAis.getLocation();
        Location aisLocation = location.get(0).getLocation();
      // Ship ship=new Ship(10.174,63.48,"Wykrycie",ShipStatus.FRIEND,10.174,63.48,50,new PositionCoordinate(10.132, 64.712));
        //Ship ship=new Ship(19.24, 55.6, "Wykrycie",ShipStatus.FRIEND,19.24, 55.6,50,new PositionCoordinate(55.6, 19.24));
        Random r=new Random();
        double y=19.1+ (19.5-19.1)*r.nextDouble();
        double x=55.1+(55.7-55.1)*r.nextDouble();
        Ship ship=new Ship(y, x, "Wykrycie",ShipStatus.FRIEND,x, y,50,new PositionCoordinate(y, x));

        List<Ship> tracks = Arrays.asList(ship);
        model.addAttribute("tracks", tracks);
        return "map";
    }

}
