
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 23rd";
		String dadsBirthday = "September 17th";
		String myBirthday = "April 15th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday=JOptionPane.showInputDialog("Whose birthday do you want to know? (mom, dad, or jenna?)");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
		if (birthday.equals("mom")) {
			//print mom's birthday
			System.out.println(momsBirthday);}
		// 5. if user asked for "dad"
		else if (birthday.equals("dad")) {
			// print dad's birthday
			System.out.println(dadsBirthday);}
		// 6. if user asked for your name
		else if (birthday.equals("jenna")) {
			// print myBirthday
			System.out.println(myBirthday);}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println("Sorry I don't remember that person's birthday!");
		}
	} 
}
