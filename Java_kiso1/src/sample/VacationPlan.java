package sample;

/**
 * @author AZS azs
 * @version x.x.x 2024/02/20
 */
public class VacationPlan {
	public static void main(String[] args) {
		int number=3;
		String vacation;
		
		switch(number) {
		case 1:
			vacation="春季休暇";
			break;
		case 2:
			vacation="夏期休暇";
			break;	
		case 3:
			vacation="冬期休暇";
			break;	
		default:
			vacation="休暇予定はありません";
			break;		
		}
		System.out.println("次回の休暇予定："+vacation);
	}
}
