package com.java.programs.string;

public class StringMethods {
	public static void main(String[] args) {
		String str1 = "Jai Sree Ram";
		String str2 = "Jai Hanuman ";
		char[] ch = { 's', 'h', 'i', 'v', 'a' };
		String str = new String(ch);
		System.out.println(str1 + " " + str2 + " " + str);
		String str3 = new String(ch);//2.string creation using new keyword and character array
		String str4= new String("Tuesday");//3.string creation using new keyword and string literal
		System.out.println(str1 + " " + str2 + " " + str3+" "+str4);
		// string methods
		char ch1 = str1.charAt(2);
		System.out.println(ch1);
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.concat(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.contains(str2));
		System.out.println(str1.equals(str2));
		System.out.println(str1.indexOf(3));
		System.out.println(str1.indexOf(str2));
		System.out.println(str1.indexOf(4, 0));
		System.out.println(str1.intern());
		System.out.println(str1.lastIndexOf(3));
		System.out.println(str1.lastIndexOf(str));
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str.length());
		System.out.println(str1.replace('r', 's'));
		System.out.println(str1.startsWith(str, 'j'));
		System.out.println(str1.startsWith(str2));
		System.out.println(str1.substring(2));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.trim());
		System.out.println(str1 + str2 + str);
		System.out.println(ch1);//prints 'i'
		System.out.println(str1.compareTo(str2));//"Jai Sree Ram".compareTo("Jai Hanuman"),greater than zero
		System.out.println(str1.concat(str2));//"Jai Sree RamJai Hanuman"
		System.out.println(str1.equalsIgnoreCase(str2));//false
		System.out.println(str1.contains(str2));//false
		System.out.println(str1.equals(str2));//false
		System.out.println(str1.indexOf(4));//S
		System.out.println(str1.indexOf(str2));//-1
		System.out.println(str1.indexOf("Ram"));//9
		System.out.println(str1.indexOf(4, 10));//Sree R
		//System.out.println(str1.intern());
		System.out.println(str1.lastIndexOf('a'));//10
		System.out.println(str1.lastIndexOf(str3));//-1
		System.out.println(str1.lastIndexOf("ee"));//6
		System.out.println(str1.length());//12
		System.out.println(str2.length());//11
		System.out.println(str3.length());//5
		System.out.println(str1.replace('e', 'i'));
		System.out.println(str1.startsWith(str3));//false
		System.out.println(str1.startsWith("Jai"));//true
		System.out.println(str1.substring(4));//Sree Ram
		System.out.println(str1.toLowerCase());//jai sree ram
		System.out.println(str1.toUpperCase());//JAI SREE RAM
		System.out.println(str2.trim());//Jai Hanuman

	}

}
