package R6;

import java.util.ArrayList;
import java.util.List;

public class Multipliers
{
    //FOV multiplier
    public static List<Double> FOV_X = new ArrayList<>();

    //ADS multiplier
    public static List<Double> ADS_X = new ArrayList<>();

    public Multipliers() {
        FOV_X.add(0.9);
        FOV_X.add(0.59);
        FOV_X.add(0.49);
        FOV_X.add(0.42);
        FOV_X.add(0.35);
        FOV_X.add(0.3);
        FOV_X.add(0.22);
        FOV_X.add(0.092);

        ADS_X.add(0.6);
        ADS_X.add(0.59);
        ADS_X.add(0.49);
        ADS_X.add(0.42);
        ADS_X.add(0.35);
        ADS_X.add(0.3);
        ADS_X.add(0.22);
        ADS_X.add(0.14);
    }

}
