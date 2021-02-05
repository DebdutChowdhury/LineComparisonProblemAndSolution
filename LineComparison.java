public class LineComparison {
	int x1 = 2;
	int x2 = 4;
	int y1 = 5;
	int y2 = 6;
	int x3 = 3;
	int x4 = 7;
	int y3 = 8;
	int y4 = 9;
	
	public void calculate() {
		double lineLength1 = 0;
		double lineLength2 = 0;
		lineLength1 = Math.sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2);
		lineLength2 = Math.sqrt( (x4 - x3) ^ 2 + (y4- y3) ^ 2);

		System.out.println("1st Length of line: "+lineLength1);
		System.out.println("1st Length of line: "+lineLength2);
		
		String l1 = String.valueOf(lineLength1);
		String l2 = String.valueOf(lineLength2);
		
		double result = l1.compareTo(l2);
		if (result == 0)
			System.out.println("Both lengths are equal that means the lines are same length.");
		else if(result > 0)
			System.out.println("Length are not same.");
		else
			System.out.println("It's lengths are not equal.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to my line comparison problem and solution:");
		System.out.println("---------------------------------------------------");
		LineComparison l = new LineComparison();
		l.calculate();
		
	}

}

