import java.awt.*;

public class Wheel{
	public static void main(String[] args){
		int height_width = 510;
		
		DrawingPanel panel = new DrawingPanel(512,512);
		Graphics g = panel.getGraphics();
		
		int x = 255;   //designate origin point
		int y = 255;
		
		int R_center_x = x;
		int R_center_y = y-255; //R_center(255, 0)
		int G_center_x = 470;   
		int G_center_y = y+128; //G_center(470, 383)
		int B_center_x = 42;
		int B_center_y = y+128; //B_center(42, 383)
		
		for(int i = 0 ; i<= height_width;i++){ //iterate through each row aka x value
			for(int j = 0 ; j <= height_width;j++){  //iterate through each column aka y value
				int R = 255-distance(R_center_x,R_center_y,i,j);
				int G = 255-distance(G_center_x,G_center_y,i,j);
				int B = 255-distance(B_center_x,B_center_y,i,j);

				Color color = new Color(R, G, B);
				g.setColor(color);
				
				g.fillOval(i,j, 1, 1);
			}
		}
		for(int i = 0 ; i<= height_width;i++ ){ //iterate through each row aka x value
			for(int j = 0 ; j <= height_width;j++){  //iterate through each column aka y value
				if(distance2(i,j,x,y)>=255){
					Color color = new Color(255,255,255);
					g.setColor(color);
				
					g.fillOval(i,j, 1, 1);
				}
			}
		}  
	}  //end of main
		
	public static int distance(int x1, int y1, int x2, int y2){
		
		double distinction = 0.5555; //change this value to adjust the distinction of secondary colors
		
		int value = (int)Math.round(distinction*Math.round(Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2))));
		if(value >= 255){
			return 255;
		}
		else{
			return value;
		}
	}
	public static int distance2(int x1, int y1, int x2, int y2){
		int value = (int)Math.round(Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)));
		if(value >= 255){
			return 255;
		}
		else{
			return value;
		}
	}
}