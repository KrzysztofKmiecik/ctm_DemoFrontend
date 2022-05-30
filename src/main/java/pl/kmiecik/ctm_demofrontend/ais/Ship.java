package pl.kmiecik.ctm_demofrontend.ais;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Ship {

    private double y;
    private double x;
    private String name;
    private ShipStatus shipStatus;
    private double destinationY;
    private double destinationX;
    private int visibilityInKm;
    private PositionCoordinate lastPosition;


}
