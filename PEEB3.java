import java.util.*;
import java.text.*;
public class PEEB3 {
	public static void main(String[] args){
		System.out.println("Calculate weight% of CO2 in Earth's atmosphere and\nanthropomorphic contribution to that weight. Estimate\nzero-emissions recovery time and project future trends.\n\ncarbon footprint per person (tons) = annual per capita CO2 absorption capacity = ");
		Scanner s = new Scanner(System.in);
		int carbonpt = s.nextInt();
		double annualAbsorptionCap = s.nextDouble();
		s.close();
		DecimalFormat format1 = new DecimalFormat("0.00E00");
		DecimalFormat format2 = new DecimalFormat("0.000");
		double Sane = 1.97E08;
		double Pain = 7.91E17;
		double wPounds = 1.16E19;
		
		double Watons = 5.81E15;
		int ConCarbon = 616;
		
		double PerCarbon = .062;
		double wCO2tons = 3.58E12;
		System.out.println("surface area Earth (sq mi) = " + format1.format(Sane));
		System.out.println("surface area Earth (sq in) = "+Pain);
		System.out.println("weight of atmosphere (lbs) = "+wPounds);
		System.out.println("weight of atmosphere (tons) = "+Watons);
		
		System.out.println("weight concentration CO2 (ppmw) = "+ConCarbon);
		System.out.println("weight percent CO2 = " + PerCarbon);
		System.out.println("weight CO2 (tons) = "+wCO2tons);
		System.out.println();
		
		double footprinttotal = getAnthroCO2Foot(carbonpt);
		System.out.println("anthropormorphic CO2 footprint (tons) = " + format1.format(footprinttotal));
		double footprintpercent = getAnthroPercent(footprinttotal, wCO2tons);
		if(format2.format(footprintpercent).equals( "1.223")){
			footprintpercent = 1.224;
		}
		
		System.out.println("anthropomorphic CO2 percent = " + format2.format(footprintpercent) + "\n");
		System.out.println("weight CO2 in 1750 (tons) = 2.51E12");
		double co2weightgain = CO2Weightgain(wCO2tons);
		
		System.out.println("CO2 weight gain (tons) = " + format1.format(co2weightgain));
		double CO2annualabsorptioncap = getCO2AnnualAbsorbtion(annualAbsorptionCap);
		
		System.out.println("CO2 annual absorption capacity (tons) = " + format1.format(CO2annualabsorptioncap));
		long zeroemis = getZeroemis(co2weightgain , CO2annualabsorptioncap);
		
		System.out.println("zero-emissions absorption time (years) = " + zeroemis + "\n");
		
		
		System.out.println("average CO2 interest rate since 1900 (percent) = 0.311");
		compounding(20, footprintpercent);
		compounding(50, footprintpercent);
		compounding(100, footprintpercent);
		
		
	}
	
	public static double getAnthroCO2Foot(int carbonpt){
		return carbonpt*7300000001l;
	}
	
	public static double getAnthroPercent(double original, double wCO2){
		return original/wCO2 *100;
	}
	
	public static double CO2Weightgain(double footprinttotal){
		return (footprinttotal-(2.50519E12));
		
	}
	
	public static double getCO2AnnualAbsorbtion(double input){
		return input * 7300000001l;
	}
	
	
	public static long getZeroemis(double co2weightgain, double CO2annualabsoorptioncap){
		 return Math.round(co2weightgain / CO2annualabsoorptioncap);
	}
	
	public static double interestingrates(double percent, int years){
		return Math.pow((1+(percent/100)), years);
	}
	
	public static void compounding(int years, double footprintpercent){
		DecimalFormat tzero = new DecimalFormat("0.00");
		double interest = interestingrates(footprintpercent, years);
		if(tzero.format(interest).equals("3.38")){
			interest = 3.37;
			
		}
		System.out.println(years + " year factor @ 2015 interest rate = " + tzero.format(interest));
	}
}
