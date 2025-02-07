package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/21
 */
public class Calendar {
	public static void main(String[] args) {
		calender(args[0]);
	}
	static void calender(String month) {
		int nmonth=Integer.parseInt(month);
		int day = 0;
		
		switch(nmonth) {
		case 1: 
			day=31;
			break;
		case 2: 
			day=28;
			break;
		case 3: 
			day=31;
			break;
		case 4: 
			day=30;
			break;
		case 5: 
			day=31;
			break;
		case 6: 
			day=30;
			break;
		case 7: 
			day=31;
			break;
		case 8: 
			day=31;
			break;
		case 9: 
			day=30;
			break;
		case 10: 
			day=31;
			break;
		case 11: 
			day=30;
			break;	
		case 12: 
			day=31;
			break;
	}
		
		System.out.println(nmonth+"月カレンダー");
		System.out.println("日	月	火	水	木	金	土");
		
		for (int i = 1; i <= day; i++) {
			System.out.print(i+"	");
				if (i%7==0) {
					System.out.println();
				}
			}
		}}
