package poly;

import java.util.Scanner;

public class overloading {

		
		public void bank_pro() {
			Scanner sc=new Scanner(System.in);
			
			int age,accountnum;
			double amount;
			String name;
			char gen;
			
			System.out.println("Enter Details:");
			System.out.println("Enter name:");
			name=sc.next();
			System.out.println("Enter Age:");
			age=sc.nextInt();
			System.out.println("Enter Account number:");
			accountnum=sc.nextInt();
			System.out.println("Enter Amount:");
			amount=sc.nextDouble();
			System.out.println("Enter Gender:");
			gen=sc.next().charAt(0);
			
			if(age>=60)
			{
				bank_pro(age,amount,gen);
			}
			else
			{
				bank_pro(age,amount);
			}
			
		}
		
		public void bank_pro(int age,double amount) {
			
			double final_amount=((amount/100)*5.6);
			final_amount=final_amount*10;
			double res=final_amount+amount;
			
			System.out.println("After 10 years your int amount will be:" +final_amount);
			System.out.println("After 10 years your amount will be:" +res);
			
		}

		public void bank_pro(int age,double amount,char gen) {
			
			double final_amount=((amount/100)*7.5);
			final_amount=final_amount*10;
			double res=final_amount+amount;
			
			System.out.println("After 10 years your int amount will be:" +final_amount);
			System.out.println("After 10 years your amount will be:" +res);

			
			
			
			
			
			
		}

	}


