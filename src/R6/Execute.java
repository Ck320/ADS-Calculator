package R6;

import static R6.Multipliers.*;

import javax.swing.JOptionPane;

public class Execute extends Functions {


    public double calculate(double FOVMulti,double ADSMulti,double verticalFOV,double aspectRatio,double oldADS)
    {
        if(horizontalFOV(verticalFOV,aspectRatio)>150)
        {
            verticalFOV =  adjustFOV(FOVMulti,verticalFOV);
        }        
        return (Math.round(newADS(ADSMulti,adjustFOV(FOVMulti,verticalFOV),oldADS)));
    }
	
	public String executar(double verticalFOV,double aspectRatio,double oldADS)
	{
		String valor="";
		Multipliers m = new Multipliers();
	    for(int i=0;i< ADS_X.size();i++)
	    {
	       valor = valor +"\n"+ calculate(m.FOV_X.get(i), m.ADS_X.get(i),verticalFOV, aspectRatio, oldADS);
	    }
		return valor;
	}
	

}
