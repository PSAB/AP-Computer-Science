import java.util.Scanner;
import java.text.DecimalFormat;

public class PEEB {
    public static void main(String[]args){
        Scanner console = new Scanner(System.in);
        
        System.out.print("Calculate radiant photon flux at a given wavelength\nand temperature using Planck's Law\nwavelength in microns: ");
        
        double wavmeasure = console.nextDouble()*Math.pow(10,-6);
        System.out.print("temperature in degrees Kelvin: ");
        
        double tall = 6.62607004 * Math.pow(10,-34);
        double c = 299792458;
        
        double temperature = console.nextDouble();
        
        double botB = 1.38064852 * Math.pow(10,-23);
        

        
        double b = ((2 * tall * Math.pow(c,2))/(Math.pow(wavmeasure,5))) * (1/((Math.exp((tall * c)/(wavmeasure * botB * temperature))) - 1));
        System.out.println("radiant flux B = " + (new DecimalFormat("0.##E00")).format(b).toLowerCase());
    }
}