package loops;

public class Ifandelse {

	public static void main(String[] args) {

		String browser="safari";
		String browser1="safari";

		if (browser == browser1)

		{
			System.out.println("Open the safari");
		}
		else {
			System.out.println("Open the firefox");
		}
		int month =12;

		String yearmonth = "jan" ;

		switch (month) 
		{
		case 1:
			yearmonth="jan";
			System.out.println("Name of the month=jan");

			break;
		case 2:
			yearmonth="Feb";
			System.out.println("Name of the month=feb");
			break;
		case 3:
			yearmonth="mar";
			System.out.println("Name of the month=march");
			break;
		case 4:
			yearmonth="dec";
			System.out.println("Name of the month");

		default:

			System.out.println("invalid");
			break;
			



		}






	}

}
