package Overloading;

import java.time.LocalDate;

public class Date {
	
	private LocalDate birthday;

	public LocalDate getBirthday() {
		return birthday;
	}

	//overloading
	//1.�ѼƭӼƤ��P
	//2.�ѼƭӼƬۦP�A����������ƫ��O���P
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	public void setBirthday(int year,int month,int day) {
		LocalDate date=LocalDate.of(year, month, day);
		this.setBirthday(date);
	}
	

}
