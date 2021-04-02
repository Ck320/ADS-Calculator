package R6;

import java.lang.Math;


public abstract class Functions {

    public  double horizontalFOV(double verticalFOV,double aspectRatio)
    {
        double tanVerFOV=Math.tan(Math.toRadians(verticalFOV/2));
        return 2*Math.atan(tanVerFOV*aspectRatio);
    }

    public double adjustVerticalFOV(double aspectRatio)
    {
        double tanAspect=Math.tan(Math.toDegrees(75))/aspectRatio;
        return 2*Math.atan(tanAspect);
    }

    public  double adjustFOV(double multiplierFOV,double verticalFOV)
    {
        double tan1=Math.tan((Math.toRadians(verticalFOV)*multiplierFOV)/2);
        double tan2=Math.tan(Math.toRadians(verticalFOV)/2);
        return tan1/tan2;
    }

    public double newADS(double multplierADS,double adjustFOV,double oldADS)
    {
        return (multplierADS/adjustFOV)*oldADS;
    }

}
