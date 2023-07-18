package com.digit.training.Project2;

import java.util.Scanner;

class Crdentials {
	Scanner sc = new Scanner(System.in);
	String Name="";
	int age;
	String place="";
	void AddDetails()
	{
		System.out.println("Enter Your Name:");
		Name=sc.nextLine();
		System.out.println("Enter Your Age:");
		age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter place you belong:");
		place=sc.nextLine();
	}
}

class LifeLine{
	Scanner sc = new Scanner(System.in);
	boolean audPol=true;
	boolean Fty_Fty =true;
	int ll_Sel;
	int usropn;
	
	int  LLOPN()
	{
		if(audPol==true || Fty_Fty==true)
		{
			System.out.println("Which Life Line do you Want to use "
					+ "You Have:");
		}
		if(audPol==true)
		{
			System.out.println("Press 1 for  Auience Poll ");
		}
		if(Fty_Fty==true)
		{
			System.out.println("Press 2 for 50-50 ");
		}
		if(audPol==false && Fty_Fty==false)
		{
			System.out.println("No Life Lines Available");
			return 0;
		}
		System.out.println();
		System.out.println("Enter Your Lifeline Choice:");
		System.out.println();
		ll_Sel=sc.nextInt();
		return ll_Sel;
	}
	
	int ll_q1()
	{
		int LLUsrOpn;
		String qn="Who is the father of Computers?";
		String opn1="James Gosling";
		String opn2="Charles Babbage";
		String opn3="Dennis Ritchie";
		String opn4="Bjarne Stroustrup";
		LLUsrOpn=LLOPN();
		if(LLUsrOpn==0)
		{
			return 0;
		}
		if(LLUsrOpn==1)
		{
			audPol=false;
			System.out.println( "A. "+qn);
			System.out.println();
			System.out.println("1."+opn1 + " ---25%");
			System.out.println("2."+opn2 + " ---50%");
			System.out.println("3."+opn3 + " ---15%");
			System.out.println("4."+opn4 + " ---10%");
			System.out.println();
			if(audPol==true ||Fty_Fty==true)
			{
				System.out.println("5. Lifeline");
				
			}
			System.out.println();
			System.out.println("Enter Your Choice:");
			usropn=sc.nextInt();
			return usropn;
		}
		else if(LLUsrOpn==2)
		{
			Fty_Fty=false;
			System.out.println( "A. "+qn);
			System.out.println();
			System.out.println("1. ");
			System.out.println("2."+opn2 );
			System.out.println("3. ");
			System.out.println("4."+opn4 );
			System.out.println();
			if(audPol==true ||Fty_Fty==true)
			{
				System.out.println("    5. Lifeline");
			}
			System.out.println();
			System.out.println("Enter Your Choice:");
			usropn=sc.nextInt();
			return usropn;
		}
		return -1;
	}
	int ll_q2()
	{
		int LLUsrOpn;
		String qn="Which of the following is the correct abbreviation of COMPUTER?";
		String opn1="Commonly Occupied Machines Used in Technical and Educational Research";
		String opn2="Commonly Operated Machines Used in Technical and Environmental Research";
		String opn3="Commonly Oriented Machines Used in Technical and Educational Research";
		String opn4="Commonly Operated Machines Used in Technical and Educational Research";
		LLUsrOpn=LLOPN();
		if(LLUsrOpn==0)
		{
			return 0;
		}
		if(LLUsrOpn==1)
		{
			audPol=false;
			System.out.println( "B. "+qn);
			System.out.println();
			System.out.println("1."+opn1 + " ---5%");
			System.out.println("2."+opn2 + " ---15%");
			System.out.println("3."+opn3 + " ---10%");
			System.out.println("4."+opn4 + " ---70%");
			System.out.println();
			if(audPol==true || Fty_Fty==true)
			{
				System.out.println("5. Lifeline");
			}
			System.out.println();
			System.out.println("Enter Your Choice:");
			usropn=sc.nextInt();
			return usropn;
		}
		else if(LLUsrOpn==2)
		{
			Fty_Fty=false;
			System.out.println( "B. "+qn);
			System.out.println("1.");
			System.out.println("2."+opn2);
			System.out.println("3.");
			System.out.println("4."+opn4);
			System.out.println();
			if(audPol==true || Fty_Fty==true)
			{
				System.out.println("5. Lifeline");
			}
			System.out.println();
			System.out.println("Enter Your Choice:");
			usropn=sc.nextInt();
			return usropn;
		}
		return -1;
	}
	int ll_q3()
	{
		int LLUsrOpn;
		String qn="Which of the following is the correct definition of Computer?";
		String opn1="Computer is a machine or device that can be programmed to perform arithmetical or logic operation sequences automatically.";
		String opn2="Computer understands only binary language which is written in the form of 0s 1s.";
		String opn3="Computer is a programmable electronic device that stores, retrieves, and processes the data";
		String opn4="All of the mentioned";
		LLUsrOpn=LLOPN();
		if(LLUsrOpn==0)
		{
			return 0;
		}
		if(LLUsrOpn==1)
		{
			audPol=false;
			System.out.println( "C. "+qn);
			System.out.println();
			System.out.println("1."+opn1 + " ---10%");
			System.out.println("2."+opn2 + " ---5%");
			System.out.println("3."+opn3 + " ---10%");
			System.out.println("4."+opn4 + " ---75%");
			System.out.println();
			if(audPol==true || Fty_Fty==true)
			{
				System.out.println("5.Lifeline");
			}
			System.out.println();
			System.out.println("Enter Your Choice:");
			usropn=sc.nextInt();
			return usropn;
		}
		else if(LLUsrOpn==2)
		{
			Fty_Fty=false;
			System.out.println( "C. "+qn);
			System.out.println();
			System.out.println("1." );
			System.out.println("2." );
			System.out.println("3."+opn3);
			System.out.println("4."+opn4 );
			System.out.println();
			if(audPol==true || Fty_Fty==true)
			{
				System.out.println("5.Lifeline");
			}
			System.out.println();
			System.out.println("Enter Your Choice:");
			usropn=sc.nextInt();
			return usropn;
		}
		return -1;
	}
	int ll_q4()
	{
		int LLUsrOpn;
		String qn="What is the full form of CPU?";
		String opn1="Computer Processing Unit";
		String opn2="Computer Principle Unit";
		String opn3="Central Processing Unit";
		String opn4="Control Processing Unit";
		LLUsrOpn=LLOPN();
		if(LLUsrOpn==0)
		{
			return 0;
		}
		if(LLUsrOpn==1)
		{
			audPol=false;
			System.out.println( "D. "+qn);
			System.out.println();
			System.out.println("1."+opn1 + " ---10%");
			System.out.println("2."+opn2 + " ---5%");
			System.out.println("3."+opn3 + " ---80%");
			System.out.println("4."+opn4 + " ---5%");
			System.out.println();
			if(audPol==true ||Fty_Fty==true)
			{
				System.out.println("5.Lifeline");
			}
			System.out.println();
			System.out.println("Enter Your Choice:");
			usropn=sc.nextInt();
			return usropn;
		}
		else if(LLUsrOpn==2)
		{
			Fty_Fty=false;
			System.out.println( "D. "+qn);
			System.out.println();
			System.out.println("1."+opn1 );
			System.out.println("2.");
			System.out.println("3."+opn3 );
			System.out.println("4.");
			System.out.println();
			if(audPol==true ||Fty_Fty==true)
			{
				System.out.println("5.Lifeline");
			}
			System.out.println();
			System.out.println("Enter Your Choice:");
			usropn=sc.nextInt();
			return usropn;
		}
		return -1;
	}
	int ll_q5()
	{
		int LLUsrOpn;
		String qn="Which of the following language does the computer understand?";
		String opn1="Computer understands only C Language";
		String opn2="omputer understands only Assembly Language";
		String opn3="Computer understands only Binary Language";
		String opn4="Computer understands only BASIC";
		LLUsrOpn=LLOPN();
		if(LLUsrOpn==0)
		{
			return 0;
		}
		if(LLUsrOpn==1)
		{
			audPol=false;
			System.out.println( "E. "+qn);
			System.out.println();
			System.out.println("1."+opn1 + " ---10%");
			System.out.println("2."+opn2 + " ---15%");
			System.out.println("3."+opn3 + " ---60%");
			System.out.println("4."+opn4 + " ---15%");
			System.out.println();
			if(audPol==true ||Fty_Fty==true)
			{
				System.out.println("5.Lifeline");
			}
			System.out.println();
			System.out.println("Enter Your Choice:");
			usropn=sc.nextInt();
			return usropn;
		}
		else if(LLUsrOpn==2)
		{
			Fty_Fty=false;
			System.out.println( "E. "+qn);
			System.out.println();
			System.out.println("1.");
			System.out.println("2."+opn2 );
			System.out.println("3."+opn3 );
			System.out.println("4.");
			System.out.println();
			if(audPol==true ||Fty_Fty==true)
			{
				System.out.println("5.Lifeline");
			}
			System.out.println();
			System.out.println("Enter Your Choice:");
			usropn=sc.nextInt();
			return usropn;
		}
		return -1;
	}
	int ll_q6()
	{
		int LLUsrOpn;
		String qn="Which of the following computer language is written in binary codes only?";
		String opn1="pascal";
		String opn2="machine language";
		String opn3="C";
		String opn4="C#";
		LLUsrOpn=LLOPN();
		if(LLUsrOpn==0)
		{
			return 0;
		}
		if(LLUsrOpn==1)
		{
			audPol=false;
			System.out.println( "F. "+qn);
			System.out.println();
			System.out.println("1."+opn1 + " ---0%");
			System.out.println("2."+opn2 + " ---85%");
			System.out.println("3."+opn3 + " ---10%");
			System.out.println("4."+opn4 + " ---5%");
			System.out.println();
			if(audPol==true ||Fty_Fty==true)
			{
				System.out.println("5.Lifeline");
			}
			System.out.println();
			System.out.println("Enter Your Choice:");
			usropn=sc.nextInt();
			return usropn;
		}
		else if(LLUsrOpn==2)
		{
			Fty_Fty=false;
			System.out.println( "F. "+qn);
			System.out.println();
			System.out.println("1." );
			System.out.println("2."+opn2 );
			System.out.println("3."+opn3 );
			System.out.println("4." );
			System.out.println();
			if(audPol==true ||Fty_Fty==true)
			{
				System.out.println("5.Lifeline");
			}
			System.out.println();
			System.out.println("Enter Your Choice:");
			usropn=sc.nextInt();
			return usropn;
		}
		return -1;
	}
	int ll_q7()
	{
		int LLUsrOpn;
		String qn="Which of the following is the brain of the computer?";
		String opn1="Central Processing Unit";
		String opn2="Memory";
		String opn3="Arithmetic and Logic unit";
		String opn4="Control unit";
		LLUsrOpn=LLOPN();
		if(LLUsrOpn==0)
		{
			return 0;
		}
		if(LLUsrOpn==1)
		{
			audPol=false;
			System.out.println( "G. "+qn);
			System.out.println();
			System.out.println("1."+opn1 + " ---80%");
			System.out.println("2."+opn2 + " ---5%");
			System.out.println("3."+opn3 + " ---10%");
			System.out.println("4."+opn4 + " ---5%");
			System.out.println();
			if(audPol==true ||Fty_Fty==true)
			{
				System.out.println("5.Lifeline");
			}
			System.out.println();
			System.out.println("Enter Your Choice:");
			usropn=sc.nextInt();
			return usropn;
		}
		else if(LLUsrOpn==2)
		{
			Fty_Fty=false;
			System.out.println( "G. "+qn);
			System.out.println();
			System.out.println("1."+opn1);
			System.out.println("2.");
			System.out.println("3.");
			System.out.println("4."+opn4);
			System.out.println();
			if(audPol==true ||Fty_Fty==true)
			{
				System.out.println("5.Lifeline");
			}
			System.out.println();
			System.out.println("Enter Your Choice:");
			usropn=sc.nextInt();
			return usropn;
		}
		return -1;
	}
	int ll_q8()
	{
		int LLUsrOpn;
		String qn="Which of the following is not a characteristic of a computer?";
		String opn1="Versatility";
		String opn2="Accuracy";
		String opn3="Diligence";
		String opn4="I.Q.";
		LLUsrOpn=LLOPN();
		if(LLUsrOpn==0)
		{
			return 0;
		}
		if(LLUsrOpn==1)
		{
			audPol=false;
			System.out.println( "H. "+qn);
			System.out.println();
			System.out.println("1."+opn1 + " ---10%");
			System.out.println("2."+opn2 + " ---5%");
			System.out.println("3."+opn3 + " ---20%");
			System.out.println("4."+opn4 + " ---65%");
			System.out.println();
			if(audPol==true ||Fty_Fty==true)
			{
				System.out.println("5.Lifeline");
			}
			System.out.println();
			System.out.println("Enter Your Choice:");
			usropn=sc.nextInt();
			return usropn;
		}
		else if(LLUsrOpn==2)
		{
			Fty_Fty=false;
			System.out.println( "H. "+qn);
			System.out.println();
			System.out.println("1."+opn1 );
			System.out.println("2.");
			System.out.println("3.");
			System.out.println("4."+opn4 );
			System.out.println();
			if(audPol==true ||Fty_Fty==true)
			{
				System.out.println("5.Lifeline");
			}
			System.out.println();
			System.out.println("Enter Your Choice:");
			usropn=sc.nextInt();
			return usropn;
		}
		return -1;
	}
	int ll_q9()
	{
		int LLUsrOpn;
		String qn= "Which of the following is the smallest unit of data in a computer?";
		String opn1="Bit";
		String opn2="KB";
		String opn3="Nibble";
		String opn4="Byte";
		LLUsrOpn=LLOPN();
		if(LLUsrOpn==0)
		{
			return 0;
		}
		if(LLUsrOpn==1)
		{
			audPol=false;
			System.out.println( "I. "+qn);
			System.out.println();
			System.out.println("1."+opn1 + " ---60%");
			System.out.println("2."+opn2 + " ---15%");
			System.out.println("3."+opn3 + " ---7.5%");
			System.out.println("4."+opn4 + " ---7.5%");
			System.out.println();
			if(audPol==true ||Fty_Fty==true)
			{
				System.out.println("5.Lifeline");
			}
			System.out.println();
			System.out.println("Enter Your Choice:");
			usropn=sc.nextInt();
			return usropn;
		}
		else if(LLUsrOpn==2)
		{
			Fty_Fty=false;
			System.out.println( "I. "+qn);
			System.out.println();
			System.out.println("1."+opn1 );
			System.out.println("2.");
			System.out.println("3."+opn3);
			System.out.println("4.");
			System.out.println();
			if(audPol==true ||Fty_Fty==true)
			{
				System.out.println("5.Lifeline");
			}
			System.out.println();
			System.out.println("Enter Your Choice:");
			usropn=sc.nextInt();
			return usropn;
		}
		return -1;
	}int ll_q10()
	{
		int LLUsrOpn;
		String qn="Which of the following unit is responsible for converting the data received from the user into a computer understandable format?";
		String opn1="Output Unit";
		String opn2="Input Unit";
		String opn3="Memory Unit";
		String opn4="Arithmetic & Logic Unit";
		LLUsrOpn=LLOPN();
		if(LLUsrOpn==0)
		{
			return 0;
		}
		if(LLUsrOpn==1)
		{
			audPol=false;
			System.out.println( "J. "+qn);
			System.out.println();
			System.out.println("1."+opn1 + " ---7.5%");
			System.out.println("2."+opn2 + " ---85%");
			System.out.println("3."+opn3 + " ---7.5%");
			System.out.println("4."+opn4 + " ---0%");
			System.out.println();
			if(audPol==true ||Fty_Fty==true)
			{
				System.out.println("5.Lifeline");
			}
			System.out.println();
			System.out.println("Enter Your Choice:");
			usropn=sc.nextInt();
			return usropn;
		}
		else if(LLUsrOpn==2)
		{
			Fty_Fty=false;
			System.out.println( "J. "+qn);
			System.out.println();
			System.out.println("1.");
			System.out.println("2."+opn2 );
			System.out.println("3."+opn3 );
			System.out.println("4.");
			System.out.println();
			if(audPol==true ||Fty_Fty==true)
			{
				System.out.println("5.Lifeline");
			}
			System.out.println();
			System.out.println("Enter Your Choice:");
			usropn=sc.nextInt();
			return usropn;
		}
		return -1;
	}
}

class Question extends LifeLine {
	int cnt=1;
	int llop;
	void CrtAns()
	{
		System.out.println("Congratulations Sahi Jawab");
		System.out.println();
	}
	void disp(String qn,String opn1,String opn2,String opn3,String opn4)
	{
		System.out.println();
		System.out.println( qn);
		System.out.println();
		System.out.println("1."+opn1 );
		System.out.println("2."+opn2 );
		System.out.println("3."+opn3 );
		System.out.println("4."+opn4 );
		System.out.println();
		if(audPol==true || Fty_Fty==true)
		{
			System.out.println("5. Lifeline");
		}
		System.out.println();
		System.out.println("Enter Your Choice:");
	}
	void disp_q1()
	{
		String qn="A.Who is the father of Computers?";
		String opn1="James Gosling";
		String opn2="Charles Babbage";
		String opn3="Dennis Ritchie";
		String opn4="Bjarne Stroustrup";
		disp(qn,opn1,opn2,opn3,opn4);
	}
	int ans_q1(int usr_opn)
	{
		int NoLLOpn;
		Scanner sc = new Scanner(System.in);
		int crtopn=2;
		if(usr_opn==2)
		{
			CrtAns();
		}
		else if(usr_opn==5)
		{
			llop=ll_q1();
			if(llop==5)
			{
				llop=ll_q1();
				if(crtopn==llop)
				{
					CrtAns();
				}
				else return -1;
			}
			if(crtopn==llop)
			{
				CrtAns();
			}
			else return -1;
		}
		else
		{
			System.out.println();
			System.out.println("Galat jawab");
			return -1;
		}
		return 1;
	}
	void disp_q2()
	{
		String qn="B.Which of the following is the correct abbreviation of COMPUTER?";
		String opn1="Commonly Occupied Machines Used in Technical and Educational Research";
		String opn2="Commonly Operated Machines Used in Technical and Environmental Research";
		String opn3="Commonly Oriented Machines Used in Technical and Educational Research";
		String opn4="Commonly Operated Machines Used in Technical and Educational Research";
		String opn5="ll";
		disp(qn,opn1,opn2,opn3,opn4);
	}
	int ans_q2(int usr_opn)
	{
		int crtopn=4;
		int llop;
		if(usr_opn==crtopn)
		{
			CrtAns();
		}
		else if(usr_opn==5)
		{
			llop=ll_q2();
			if(llop==5)
			{
				llop=ll_q2();
				if(crtopn==llop)
				{
					CrtAns();
				}
				else return -1;
			}
			if(crtopn==llop)
			{
				CrtAns();
			}
			else {
				System.out.println();
				System.out.println("Galat Jawab");
				return -1;
			}
		}
		else
		{
			System.out.println();
			System.out.println("Galat Jawab");
			return -1;
		}
		return 1;
	}
	void disp_q3()
	{
		String qn="C.Which of the following is the correct definition of Computer?";
		String opn1="Computer is a machine or device that can be programmed to perform arithmetical or logic operation sequences automatically.";
		String opn2="Computer understands only binary language which is written in the form of 0s 1s.";
		String opn3="Computer is a programmable electronic device that stores, retrieves, and processes the data";
		String opn4="All of the mentioned";
		disp(qn,opn1,opn2,opn3,opn4);
	}
	int ans_q3(int usr_opn)
	{
		int crtopn=4;
		if(usr_opn==crtopn)
		{
			CrtAns();
		}
		else if(usr_opn==5)
		{
			llop=ll_q3();
			if(llop==5)
			{
				llop=ll_q2();
				if(crtopn==llop)
				{
					CrtAns();
				}
				else return -1;
			}
			if(crtopn==llop)
			{
				CrtAns();
			}
			else {
				System.out.println();
				System.out.println("Galat Jawab");
				return -1;
			}
		}
		else
		{
			System.out.println();
			System.out.println("Galat Jawab");
			return -1;
		}
		return 1;
	}
	void disp_q4()
	{
		String qn="D.What is the full form of CPU?";
		String opn1="Computer Processing Unit";
		String opn2="Computer Principle Unit";
		String opn3="Central Processing Unit";
		String opn4="Control Processing Unit";
		disp(qn,opn1,opn2,opn3,opn4);
	}
	int ans_q4(int usr_opn)
	{
		int crtopn=3;
		if(usr_opn==crtopn)
		{
			CrtAns();
		}
		else if(usr_opn==5)
		{
			llop=ll_q4();
			if(llop==5)
			{
				llop=ll_q4();
				if(crtopn==llop)
				{
					CrtAns();
				}
				else return -1;
			}
			if(crtopn==llop)
			{
				CrtAns();
			}
			else {
				System.out.println();
				System.out.println("Galat Jawab");
				return -1;
			}
		}
		else
		{
			System.out.println();
			System.out.println("Galat Jawab");
			return -1;
		}
		return 1;
	}
	void disp_q5()
	{
		String qn="E.Which of the following language does the computer understand?";
		String opn1="Computer understands only C Language";
		String opn2="Computer understands only Assembly Language";
		String opn3="Computer understands only Binary Language";
		String opn4="Computer understands only BASIC";
		String opn5="ll";
		disp(qn,opn1,opn2,opn3,opn4);
	}
	int ans_q5(int usr_opn)
	{
		int crtopn=3;
		if(usr_opn==crtopn)
		{
			CrtAns();
		}
		else if(usr_opn==5)
		{
			llop=ll_q5();
			if(llop==5)
			{
				llop=ll_q5();
				if(crtopn==llop)
				{
					CrtAns();
				}
				else return -1;
			}
			if(crtopn==llop)
			{
				CrtAns();
			}
			else {
				System.out.println();
				System.out.println("Galat Jawab");
				return -1;
			}
		}
		else
		{
			System.out.println();
			System.out.println("Galat Jawab");
			return -1;
		}
		return 1;
	}
	void disp_q6()
	{
		String qn="F.Which of the following computer language is written in binary codes only?";
		String opn1="pascal";
		String opn2="machine language";
		String opn3="C";
		String opn4="C#";
		disp(qn,opn1,opn2,opn3,opn4);
	}
	int ans_q6(int usr_opn)
	{
		int crtopn=2;
		if(usr_opn==crtopn)
		{
			CrtAns();
		}
		else if(usr_opn==5)
		{
			llop=ll_q6();
			if(llop==5)
			{
				llop=ll_q6();
				if(crtopn==llop)
				{
					CrtAns();
				}
				else return -1;
			}
			if(crtopn==llop)
			{
				CrtAns();
			}
			else {
				System.out.println();
				System.out.println("Galat Jawab");
				return -1;
			}
		}
		else
		{
			System.out.println();
			System.out.println("Galat Jawab");
			return -1;
		}
		return 1;
	}
	void disp_q7()
	{
		String qn="G.Which of the following is the brain of the computer?";
		String opn1="Central Processing Unit";
		String opn2="Memory";
		String opn3="Arithmetic and Logic unit";
		String opn4="Control unit";
		disp(qn,opn1,opn2,opn3,opn4);
	}
	int ans_q7(int usr_opn)
	{
		int crtopn=1;
		if(usr_opn==crtopn)
		{
			CrtAns();
		}
		else if(usr_opn==5)
		{
			llop=ll_q7();
			if(llop==5)
			{
				llop=ll_q7();
				if(crtopn==llop)
				{
					CrtAns();
				}
				else return -1;
			}
			if(crtopn==llop)
			{
				CrtAns();
			}
			else {
				System.out.println();
				System.out.println("Galat Jawab");
				return -1;
			}
		}
		else
		{
			System.out.println();
			System.out.println("Galat Jawab");
			return -1;
		}
		return 1;
	}
	void disp_q8()
	{
		String qn="H.Which of the following is not a characteristic of a computer?";
		String opn1="Versatility";
		String opn2="Accuracy";
		String opn3="Diligence";
		String opn4="I.Q";
		disp(qn,opn1,opn2,opn3,opn4);
	}
	int ans_q8(int usr_opn)
	{
		int crtopn=4;
		if(usr_opn==crtopn)
		{
			CrtAns();
		}
		else if(usr_opn==5)
		{
			llop=ll_q8();
			if(llop==5)
			{
				llop=ll_q8();
				if(crtopn==llop)
				{
					CrtAns();
				}
				else return -1;
			}
			if(crtopn==llop)
			{
				CrtAns();
			}
			else {
				System.out.println();
				System.out.println("Galat Jawab");
				return -1;
			}
		}
		else
		{
			System.out.println();
			System.out.println("Galat Jawab");
			return -1;
		}
		return 1;
	}
	void disp_q9()
	{
		String qn="I.Which of the following is the smallest unit of data in a computer?";
		String opn1="Bit";
		String opn2="KB";
		String opn3="Nibble";
		String opn4="Byte";
		disp(qn,opn1,opn2,opn3,opn4);
	}
	int ans_q9(int usr_opn)
	{
		int crtopn=1;
		if(usr_opn==crtopn)
		{
			CrtAns();
		}
		else if(usr_opn==5)
		{
			llop=ll_q9();
			if(llop==5)
			{
				llop=ll_q9();
				if(crtopn==llop)
				{
					CrtAns();
				}
				else return -1;
			}
			if(crtopn==llop)
			{
				CrtAns();
			}
			else {
				System.out.println();
				System.out.println("Galat Jawab");
				return -1;
			}
		}
		else
		{
			System.out.println();
			System.out.println("Galat Jawab");
			return -1;
		}
		return 1;
	}
	void disp_q10()
	{
		String qn="J.Which of the following unit is responsible for converting the data received from the user into a computer understandable format?";
		String opn1="Output Unit";
		String opn2="Input Unit";
		String opn3="Memory Unit";
		String opn4="Arithmetic & Logic Unit";
		disp(qn,opn1,opn2,opn3,opn4);
	}
	int ans_q10(int usr_opn)
	{
		int crtopn=2;
		if(usr_opn==crtopn)
		{
			CrtAns();
		}
		else if(usr_opn==5)
		{
			llop=ll_q10();
			if(llop==5)
			{
				llop=ll_q10();
				if(crtopn==llop)
				{
					CrtAns();
				}
				else return -1;
			}
			if(crtopn==llop)
			{
				CrtAns();
			}
			else {
				System.out.println();
				System.out.println("Galat Jawab");
				return -1;
			}
		}
		else
		{
			System.out.println();
			System.out.println("Galat Jawab");
			return -1;
		}
		return 1;
	}
}



public class Crorepati {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scr=0;
		System.out.println();
		System.out.println("---------------------------------------------- WELCOME TO DIGIT CROREPATI ----------------------------------------------");
		System.out.println();
		Crdentials cd =  new Crdentials();
		cd.AddDetails();
		System.out.println();
		System.out.println("Let's Begin with the Game");
		System.out.println();
		Question que = new Question();
		que.disp_q1();
		int usropn = sc.nextInt();
		int on = que.ans_q1(usropn);
		if(on!=-1)
		{
			scr+=10;
			System.out.println("  You won RS. "+ scr*10);
			
		}
		if(on!=-1) //q-2
		{
			que.disp_q2();
			usropn = sc.nextInt();
			on = que.ans_q2(usropn);
			if(on!=-1)
			{
				scr+=10;
				System.out.println("  You won RS. "+ scr*10);
			}
			
		}
		if(on!=-1)
		{
			que.disp_q3();
			usropn = sc.nextInt();
			on = que.ans_q3(usropn);
			if(on!=-1)
			{
				scr+=10;
				System.out.println("  You won RS. "+ scr*10);
			}
		}
		if(on!=-1)
		{
			que.disp_q4();
			usropn = sc.nextInt();
			on = que.ans_q4(usropn);
			if(on!=-1)
			{
				scr+=10;
				System.out.println("  You won RS. "+ scr*10);
			}
		}
		if(on!=-1)
		{
			que.disp_q5();
			usropn = sc.nextInt();
			on = que.ans_q5(usropn);
			if(on!=-1)
			{
				scr+=10;
				System.out.println("  You won RS. "+ scr*10);
			}		}
		if(on!=-1)
		{
			que.disp_q6();
			usropn = sc.nextInt();
			on = que.ans_q6(usropn);
			if(on!=-1)
			{
				scr+=10;
				System.out.println("  You won RS. "+ scr*10);
			}
		}
		if(on!=-1)
		{
			que.disp_q7();
			usropn = sc.nextInt();
			on = que.ans_q7(usropn);
			if(on!=-1)
			{
				scr+=10;
				System.out.println("  You won RS. "+ scr*10);
			}
		}
		if(on!=-1)
		{
			que.disp_q8();
			usropn = sc.nextInt();
			on = que.ans_q8(usropn);
			if(on!=-1)
			{
				scr+=10;
				System.out.println("  You won RS. "+ scr*10);
			}
		}
		if(on!=-1)
		{
			que.disp_q9();
			usropn = sc.nextInt();
			on = que.ans_q9(usropn);
			if(on!=-1)
			{
				scr+=10;
				System.out.println("  You won RS. "+ scr*10);
			}
		}
		if(on!=-1)
		{
			que.disp_q10();
			usropn = sc.nextInt();
			on = que.ans_q10(usropn);
			if(on!=-1)
			{
				scr+=10;
				System.out.println("  You won RS. "+ scr*10);
			}
		}
		
		if(on==-1)
		{
			System.out.println();
			System.out.println("Sorry  aap aur aaghea nahi khel payengea\n"
					+ " sukhriya hamarea saath banea rehnea kea liyea");
			System.out.println();
			System.out.println("You won RS. "+ scr*10);
		}
		System.out.println();
		System.out.println("------------------------------------------------- Thank you :) -------------------------------------------------");
		System.out.println();
	}

}
