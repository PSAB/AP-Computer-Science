import java.util.*;

public class Mice2{
	public static void main (String [] args){
		Scanner console = new Scanner(System.in);
		int rows = console.nextInt();
		int cols = console.nextInt();
		char[][] map = new char[rows][cols];
		// this turns the strings into a 2d array (map) of characters
		for (int i=0; i<rows; i++){
			String partial = console.next();
			for(int index = 0; index<partial.length(); index++){
				map[i][index]=partial.charAt(index); 	
			}
		}
		testRoute(map);
	}
	
	public static void testRoute(char [][] map){
		// this arraylist is to keep track of the points I've been to
		ArrayList<Point> chart = new ArrayList<Point>();
		testRoute(map, 0, 0, chart);
		// if the coordinates for the mouse never show up on the arraylist of points where I've been, I know I didn't find it
		if (!comparing(chart, Mfinder(map))){
			System.out.println("NO");
		}
	}
	
	private static void testRoute(char [][] map, int rowIndex, int colIndex, ArrayList<Point> chart){
		if (rowIndex<0 || rowIndex>=map.length || colIndex < 0 || colIndex>=map[0].length || map[rowIndex][colIndex]=='-'){
			// if I go off the map or I hit an obstacle '-', then all I do is just add it to the points I've been to
			chart.add(new Point(rowIndex, colIndex));
		}
		// if I get to a point where I've been before, I just have the method do nothing (aka skip it)
		else if (comparing(chart, new Point(rowIndex, colIndex))){}
		// if I do find the mouse, then I just sop YES 
		else if (map[rowIndex][colIndex]=='M'){
			chart.add(new Point(rowIndex, colIndex));
			System.out.println("YES");
		}else{
			// this is just from the backtracking method
			chart.add(new Point(rowIndex, colIndex));
			testRoute(map, rowIndex+1,colIndex, chart);
			testRoute(map, rowIndex, colIndex+1, chart);
			testRoute(map, rowIndex-1,colIndex, chart);
			testRoute(map, rowIndex, colIndex-1, chart);
		}
	}
	
	// basically a contains() for my arraylist, allows me to see if given point is in my arraylist
	public static boolean comparing(ArrayList<Point> chart, Point sample){
		for (int i = 0; i<chart.size(); i++){
			if (sample.getX()==chart.get(i).getX() && sample.getY()==chart.get(i).getY()){
				return true;
			}
		}
		return false;
	}
	
	//finds the point where the mouse is and returns it so I can test it to see if its in the arraylist of points I've been to
	public static Point Mfinder(char[][] map){
		for (int i = 0; i<map.length; i++){
			for (int j = 0; j<map[0].length; j++){
				if (map[i][j]=='M'){
					return new Point(i, j);
				}
			}
		}
		return null;
	}
}