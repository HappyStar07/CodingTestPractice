package L_008_Reference_and_ArrangeMent;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1:
				today = Week.Sunday; break;
			case 2:
				today = Week.Monday; break;
			case 3:
				today = Week.Tuesday; break;
			case 4:
				today = Week.Wednesday; break;
			case 5:
				today = Week.Thursday; break;
			case 6:
				today = Week.Friday; break;
			case 7:
				today = Week.Saturday; break;
		}
		
		System.out.println("오늘 요일:" + today);
		
		if(today == Week.Sunday) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("열심히 자바 공부합니다.")
		}
	}

}
