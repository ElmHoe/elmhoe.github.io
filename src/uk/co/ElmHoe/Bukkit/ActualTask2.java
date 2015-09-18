package uk.co.ElmHoe.Bukkit;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class ActualTask2 {
	

	public static void main(String args[]) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH.mm.ss");
        SimpleDateFormat date = new SimpleDateFormat("dd_MM_YYYY");
        System.out.println( sdf.format(cal.getTime()));
        String datee = date.format(cal.getTime()) + "-" + sdf.format(cal.getTime());;
		PrintWriter writer = null;
		String logLoc = System.getProperty("user.dir");
		try {
			writer = new PrintWriter(logLoc + "\\logs\\Task2Logging." + datee + ".yml", "UTF-8");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		String strName = "Joshua Fennell";
		String strNum = "177";
		String strStreet = " yus";
		String strCity = "Kingswinford";
		String strCounty = "West-Midlands";
		String strPostalcode = "pen15z".toUpperCase();
		String header = "------------------------------";
		String newln = "\n";
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Yo, press 1 for my name and adress or press 2 to enter your own details. Anything else to end me. c:");
		String awnser = "";
		awnser = sc.nextLine();
		do {
			if (awnser.equals("1")) {
				writer.println("#Logging Begun. " + datee);
				System.out.println("Enter your first name");
				String name = sc.nextLine() + " ";
				System.out.println("Enter your surname");
				String surname = sc.nextLine();
				String getUser = System.getProperty("user.name");
				writer.println("The following person has requested your personal details:");
				writer.println(name + " " + surname);
				writer.println("They were logged in as:");
				writer.println(getUser);
				System.out.println(header);
				System.out.println(newln);
				System.out.println("\t" + strName);
				System.out.println("\t" + strNum + strStreet);
				System.out.println("\t" + strCity);
				System.out.println("\t" + strCounty);
				System.out.println("\t" + strPostalcode);
				System.out.println(newln);
				System.out.println(header);
				writer.close();
				return;
			}
			if (awnser.equals("2")) {
				System.out.println("Response was 2.");
				System.out.println("Enter your first name");
				String name = sc.nextLine() + " ";
				System.out.println("Enter your surname");
				String surname = sc.nextLine();
				System.out.println("Enter your house number / name please.");
				String number = sc.nextLine();
				System.out.println("Enter your home street.");
				String street = sc.nextLine();
				System.out.println("Enter your home city.");
				String city = sc.nextLine();
				System.out.println("Enter your home county.");
				String county = sc.nextLine();
				System.out.println("Enter your home postal address.");
				String postalCode = sc.nextLine();
				System.out.println(header + newln + newln + "\t" + name + surname
						+ newln + "\t" + number + " " + street + newln + "\t" + city + newln + "\t" + county + newln + "\t" + postalCode.toUpperCase() + newln + newln + header);
				System.out.println(newln);
				writer.println("#Logging Begun @ " + datee);
				writer.println("#Response was 2, Given details for the user are as follows.");
				writer.println(header + newln + newln + "\t" + name + surname
						+ newln + "\t" + number + " " + street + newln + "\t" + city + newln + "\t" + county + newln + "\t" + postalCode.toUpperCase() + newln + newln + header);
				writer.close();
				return;
			}
			
			

			if (!(awnser == "2") || !(awnser == "1"))
				;
			{
				System.out.println("Response was to end or invalid.");
				break;
			}
		} while (!(awnser == "2") || !(awnser == "1"));
		{
			System.out.println("peace famalam");
			sc.close();
			writer.close();
		}
	}
}
