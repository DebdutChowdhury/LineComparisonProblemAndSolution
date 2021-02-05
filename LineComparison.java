public class LineComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = 2;
		int x2 = 4;
		int y1 = 5;
		int y2 = 6;
		
		double lineLength = 0;
		lineLength = Math.sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2);
		System.out.println("Length of line: "+lineLength);
	}

}

