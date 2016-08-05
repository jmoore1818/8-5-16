package pigLatin;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word to be translated from English to Pig Latin");
		String userInput = sc.nextLine();
		String pigLatin = "";
		StringBuilder modUserInput = new StringBuilder(userInput);
		userInput = userInput.toLowerCase();
		
		char charFirst = userInput.charAt(0);
		char charSecond = userInput.charAt(1);
		
		for (int i =0; i < userInput.length(); i++)
		{
			if (userInput.startsWith("a") || userInput.startsWith("e") || userInput.startsWith("i") || userInput.startsWith("o") || userInput.startsWith("u"))
				pigLatin = (userInput + "way");	
		
			else if (
			userInput.startsWith("ba") || userInput.startsWith("be") || userInput.startsWith("bi") || userInput.startsWith("bo") || userInput.startsWith("bu") || 			userInput.startsWith("ca") || userInput.startsWith("ce") || userInput.startsWith("ci") || userInput.startsWith("co") || userInput.startsWith("cu") || 
			userInput.startsWith("da") || userInput.startsWith("de") || userInput.startsWith("di") || userInput.startsWith("do") || userInput.startsWith("du") ||
			userInput.startsWith("fa") || userInput.startsWith("fe") || userInput.startsWith("fi") || userInput.startsWith("fo") || userInput.startsWith("fu") || 
			userInput.startsWith("ga") || userInput.startsWith("ge") || userInput.startsWith("gi") || userInput.startsWith("go") || userInput.startsWith("gu") || 
			userInput.startsWith("ha") || userInput.startsWith("he") || userInput.startsWith("hi") || userInput.startsWith("ho") || userInput.startsWith("hu") || 
			userInput.startsWith("ja") || userInput.startsWith("je") || userInput.startsWith("ji") || userInput.startsWith("jo") || userInput.startsWith("ju") ||
			userInput.startsWith("ka") || userInput.startsWith("ke") || userInput.startsWith("ki") || userInput.startsWith("ko") || userInput.startsWith("ku") || 
			userInput.startsWith("la") || userInput.startsWith("le") || userInput.startsWith("li") || userInput.startsWith("lo") || userInput.startsWith("lu") || 
			userInput.startsWith("ma") || userInput.startsWith("me") || userInput.startsWith("mi") || userInput.startsWith("mo") || userInput.startsWith("mu") || 
			userInput.startsWith("na") || userInput.startsWith("ne") || userInput.startsWith("ni") || userInput.startsWith("no") || userInput.startsWith("nu") || 
			userInput.startsWith("pa") || userInput.startsWith("pe") || userInput.startsWith("pi") || userInput.startsWith("po") || userInput.startsWith("pu") || 
			userInput.startsWith("qa") || userInput.startsWith("qe") || userInput.startsWith("qi") || userInput.startsWith("qo") || userInput.startsWith("qu") || 
			userInput.startsWith("ra") || userInput.startsWith("re") || userInput.startsWith("ri") || userInput.startsWith("ro") || userInput.startsWith("ru") || 
			userInput.startsWith("sa") || userInput.startsWith("se") || userInput.startsWith("si") || userInput.startsWith("so") || userInput.startsWith("su") ||
			userInput.startsWith("ta") || userInput.startsWith("te") || userInput.startsWith("ti") || userInput.startsWith("to") || userInput.startsWith("tu") || 
			userInput.startsWith("va") || userInput.startsWith("ve") || userInput.startsWith("vi") || userInput.startsWith("vo") || userInput.startsWith("vu") || 
			userInput.startsWith("wa") || userInput.startsWith("we") || userInput.startsWith("wi") || userInput.startsWith("wo") || userInput.startsWith("wu") || 
			userInput.startsWith("xa") || userInput.startsWith("xe") || userInput.startsWith("xi") || userInput.startsWith("xo") || userInput.startsWith("xu") || 
			userInput.startsWith("ya") || userInput.startsWith("ye") || userInput.startsWith("yi") || userInput.startsWith("yo") || userInput.startsWith("yu") ||
			userInput.startsWith("za") || userInput.startsWith("ze") || userInput.startsWith("zi") || userInput.startsWith("zo") || userInput.startsWith("zu"))
					
			{
				String deletedChar= userInput.substring(1, userInput.length());
						pigLatin = (deletedChar + charFirst + "ay");}	
			
			else {
				String deletedChar= userInput.substring(2, userInput.length());
				pigLatin = (deletedChar + charFirst + charSecond + "ay");
				
				 }			
				 }
				System.out.println(pigLatin);
				 }
}




