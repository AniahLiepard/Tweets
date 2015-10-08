import java.util.Scanner;

public class Tweet_Decoder {
	public static void main(String args[]){
		Scanner Twitter = new Scanner(System.in);
		String tweet = "";
		
		System.out.println("What is the abbreviation for yout tweet?");
		tweet = Twitter.nextLine();
		
		if (tweet.equals("LOL")){
			System.out.println("Oh, that means LAUGH OUT LOUD! .....Right?");
		}
		else if (tweet.equals("BFN")){
			System.out.println("Oh, that means BYE FOR NOW! .....Right?");
		}
		else if (tweet.equals("FTW")){
			System.out.println("Oh, that means FOR THE WIN! .....Right?");
		}
		else if (tweet.equals("IRL")){
			System.out.println("Oh, that means IN REAL LIFE! .....Right?");
		}
		else if (tweet.equals("BTW")){
			System.out.println("Oh, that means BY THE WAY! .....Right?");
		}
		else if (tweet.equals("BRB")){
			System.out.println("Oh, that means BE RIGHT BACK! .....Right?");
		}
		else if (tweet.equals("BBL")){
			System.out.println("Oh, that means BE BACK LATER! .....Right?");
		}
		else if (tweet.equals("BBS")){
			System.out.println("Oh, that means BE BACK SOON! .....Right?");
		}
		else if (tweet.equals("AFK")){
			System.out.println("Oh, that means AWAY FROM KEYBOARD! .....Right?");
		}
		else if (tweet.equals("IMO")){
			System.out.println("Oh, that means IN MY OPINION! .....Right?");
		}
		else if (tweet.equals("FYI")){
			System.out.println("Oh, that means FOR YOUR INFORMATION! .....Right?");
		}
		else if (tweet.equals("OMG")){
			System.out.println("Oh, that means OH MY GOD! .....Right?");
		}
		else if (tweet.equals("MYOB")){
			System.out.println("Oh, that means MIND YOUR OWN BUSINESS! .....Right?");
		}
		else if (tweet.equals("NOYB")){
			System.out.println("Oh, that means NONE OF YOUR BUSINESS! .....Right?");
		}
		else if (tweet.equals("TTYL")){
			System.out.println("Oh, that means TALK TO YOU LATER! .....Right?");
		}
		else{
			System.out.println("Okay, now you're just messing with me, because I have no clue what that means!");
		}
		
		if (tweet.equals("lol")){
			System.out.println("Umm...... wait...... did you mean to type LOL? I'm gonna assume you did......");
		}
		else if (tweet.equals("bfn")){
			System.out.println("Umm...... wait...... did you mean to type BFN? I'm gonna assume you did......");
		}
		else if (tweet.equals("ftw")){
			System.out.println("Umm...... wait...... did you mean to type FTW? I'm gonna assume you did......");
		}
		else if (tweet.equals("irl")){
			System.out.println("Umm...... wait...... did you mean to type IRL? I'm gonna assume you did......");
		}
		else if (tweet.equals("btw")){
			System.out.println("Umm...... wait...... did you mean to type BTW? I'm gonna assume you did......");
		}
		else if (tweet.equals("brb")){
			System.out.println("Umm...... wait...... did you mean to type BRB? I'm gonna assume you did......");
		}
		else if (tweet.equals("bbl")){
			System.out.println("Umm...... wait...... did you mean to type BBL? I'm gonna assume you did......");
		}
		else if (tweet.equals("bbs")){
			System.out.println("Umm...... wait...... did you mean to type BBS? I'm gonna assume you did......");
		}
		else if (tweet.equals("afk")){
			System.out.println("Umm...... wait...... did you mean to type AFK? I'm gonna assume you did......");
		}
		else if (tweet.equals("imo")){
			System.out.println("Umm...... wait...... did you mean to type IMO? I'm gonna assume you did......");
		}
		else if (tweet.equals("fyi")){
			System.out.println("Umm...... wait...... did you mean to type FYI? I'm gonna assume you did......");
		}
		else if (tweet.equals("omg")){
			System.out.println("Umm...... wait...... did you mean to type OMG? I'm gonna assume you did......");
		}
		else if (tweet.equals("myob")){
			System.out.println("Umm...... wait...... did you mean to type MYOB? I'm gonna assume you did......");
		}
		else if (tweet.equals("noyb")){
			System.out.println("Umm...... wait...... did you mean to type NOYB? I'm gonna assume you did......");
		}
		else if (tweet.equals("ttyl")){
			System.out.println("Umm...... wait...... did you mean to type TTYL? I'm gonna assume you did......");
		}
		else{
			System.out.println("By the time we're done with this, I'm giving up on you for giving me random words.....");
			System.out.println("*sighs* Anywho.....");
		}
		
		System.out.println("If that's " + tweet + ", then.....");
		
		if (tweet.equals("LOL")){
			tweet = tweet.replace("LOL", "LAUGH OUT LOUD");
			System.out.println(".....I'll decode it as " + tweet + "..... is that okay?");
			System.out.println("Thanks for giving me a real thing...... I think.");
		}
		else if (tweet.equals("BFN")){
			tweet = tweet.replace("BFN", "BYE FOR NOW");
			System.out.println(".....I'll decode it as " + tweet + "..... is that okay?");
			System.out.println("Thanks for giving me a real thing...... I think. *walks away casually*");
		}
		else if (tweet.equals("FTW")){
			tweet = tweet.replace("FTW", "FOR THE WIN");
			System.out.println(".....I'll decode it as " + tweet + "..... is that okay?");
			System.out.println("Thanks for giving me a real thing...... I think.  *walks away casually*");
		}
		else if (tweet.equals("IRL")){
			tweet = tweet.replace("IRL", "IN REAL LIFE");
			System.out.println(".....I'll decode it as " + tweet + "..... is that okay?");
			System.out.println("Thanks for giving me a real thing...... I think. *walks away casually*");
		}
		else if (tweet.equals("BTW")){
			tweet = tweet.replace("BTW", "BY THE WAY");
			System.out.println(".....I'll decode it as " + tweet + "..... is that okay?");
			System.out.println("Thanks for giving me a real thing...... I think. *walks away casually*");
		}
		else if (tweet.equals("BRB")){
			tweet = tweet.replace("BRB", "BE RIGHT BACK");
			System.out.println(".....I'll decode it as " + tweet + "..... is that okay?");
			System.out.println("Thanks for giving me a real thing...... I think. *walks away casually*");
		}
		else if (tweet.equals("BBL")){
			tweet = tweet.replace("BBL", "BE BACK LATER");
			System.out.println(".....I'll decode it as " + tweet + "..... is that okay?");
			System.out.println("Thanks for giving me a real thing...... I think. *walks away casually*");
		}
		else if (tweet.equals("BBS")){
			tweet = tweet.replace("BBS", "BE BACK SOON");
			System.out.println(".....I'll decode it as " + tweet + "..... is that okay?");
			System.out.println("Thanks for giving me a real thing...... I think. *walks away casually*");
		}
		else if (tweet.equals("AFK")){
			tweet = tweet.replace("AFK", "AWAY FROM KEYBOARD");
			System.out.println(".....I'll decode it as " + tweet + "..... is that okay?");
			System.out.println("Thanks for giving me a real thing...... I think. *walks away casually*");
		}
		else if (tweet.equals("IMO")){
			tweet = tweet.replace("IMO", "IN MY OPINION");
			System.out.println(".....I'll decode it as " + tweet + "..... is that okay?");
			System.out.println("Thanks for giving me a real thing...... I think. *walks away casually*");
		}
		else if (tweet.equals("FYI")){
			tweet = tweet.replace("FYI", "FOR YOUR INFORMATION");
			System.out.println(".....I'll decode it as " + tweet + "..... is that okay?");
			System.out.println("Thanks for giving me a real thing...... I think. *walks away casually*");
		}
		else if (tweet.equals("OMG")){
			tweet = tweet.replace("OMG", "OH MY GOD");
			System.out.println(".....I'll decode it as " + tweet + "..... is that okay?");
			System.out.println("Thanks for giving me a real thing...... I think. *walks away casually*");
		}
		else if (tweet.equals("MYOB")){
			tweet = tweet.replace("MYOB", "MIND YOUR OWN BUSINESS");
			System.out.println(".....I'll decode it as " + tweet + "..... is that okay?");
			System.out.println("Thanks for giving me a real thing...... I think. *walks away casually*");
		}
		else if (tweet.equals("NOYB")){
			tweet = tweet.replace("NOYB", "NONE OF YOUR BUSINESS");
			System.out.println(".....I'll decode it as " + tweet + "..... is that okay?");
			System.out.println("Thanks for giving me a real thing...... I think. *walks away casually*");
		}
		else if (tweet.equals("TTYL")){
			tweet = tweet.replace("TTYL", "TALK TO YOU LATER");
			System.out.println(".....I'll decode it as " + tweet + "..... is that okay?");
			System.out.println("Thanks for giving me a real thing...... I think. *walks away casually*");
		}
		else{
			System.out.println("WHAT ON EARTH DID YOU JUST TYPE?! I CAN'T DECODE THAT! WHAT IS WRONG WITH YOU?!");
			System.out.println("UGH, I'M DONE, JUST- *flips table in a ragequit* - GOODBYE! *storms off in anger*");
		}
	}
}
