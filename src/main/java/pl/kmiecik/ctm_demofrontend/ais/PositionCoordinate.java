package pl.kmiecik.ctm_demofrontend.ais;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class PositionCoordinate {


    private Long Id;

    private double y;

    private double x;

    public PositionCoordinate(double y, double x) {
        this.y = y;
        this.x = x;
    }
}
