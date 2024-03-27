package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User us1 = new Customer("jws","j1234","정우성",1000);
		User us2 = new Customer("yjs","y2345","이효리",2000);
		User us3 = new Employee("master","m7788","운영자",500);
		
		User [] user = new User [3];
		user[0]=us1;
		user[1]=us2;
		user[2]=us3;
		
		for (int i = 0; i<3; i++) {
			user[i].showInfo(user[i].getId(), user[i].getPassword(), user[i].getName());
			
			if (user[i] instanceof Customer) {
				System.out.printf(", 포인트: %d",((Customer)user[i]).getPoint());
			}
			else if (user[i] instanceof Employee) {
				System.out.printf(", 월급: %d",((Employee)user[i]).getSalary());
			}
			
			System.out.println();
		}
		System.out.printf("%s의 월급은 %d만원 입니다.",user[2].getName(),((Employee)user[2]).getSalary());
		
	}

}
