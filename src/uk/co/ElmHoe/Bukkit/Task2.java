package uk.co.ElmHoe.Bukkit;

public class Task2{
	public static void main(String args[]){
		String name = "Joshua Fennell";
		int houseNum = 255;
		String street = "Bromley Lane";
		String city = "Kingswinford";
		String county = "West-Midlands";
		String postalCode = "DY6 8TB";
		System.out.println("Hey " + name + ", You are currently logged in as " + System.getProperty("user.name"));
		/*
		 * Defined the string as my name, to print out my name as well as the user I'm currently logged in as.
		 * All strings used are labbled above for conveience. 
		 * I've used strings because, urh. I don't know but yeah. G'day my friend.
		 */
		System.out.println(houseNum + " " + street);
		System.out.println(city);
		System.out.println(county);
		System.out.println(postalCode);
		}

}
