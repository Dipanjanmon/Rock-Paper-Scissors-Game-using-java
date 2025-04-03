//rock paper sesior;
import java.util.Scanner;
public class rock_paper_scissor  // Rock Paper Scissors Game
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int randomNumber = (int)(Math.random()*99)+1;
		//System.out.println(randomNumber);
		//String computerInput = "";
		String computerInput = (randomNumber >= 1 && randomNumber <= 33) ? "r" : (randomNumber >= 34 && randomNumber <= 66) ? "p" : "s";
		System.out.println("\n\t\t\t👏 👏 👏  Welcome to the game 👏 👏 👏");
		System.out.println("\n\t\t\t----------------------------------\n");
		System.out.print("\n\t\tEnter (R -> Rock), (P -> Paper), (S -> Scissors) : ");
		String userInput= sc.nextLine();
		System.out.println("\n\t\tComputer choice : "+computerInput);
		System.out.println("\n\t\tYour choice : "+userInput);
		System.out.println("\n\t\t------------------------");
		if(!userInput.equals("r") && !userInput.equals("p") && !userInput.equals("s"))
		{
		    System.out.println("\n\t\t❌  Ivalid input! Please enter R, P, or S.");
		}
		else if((userInput.equals("r") && computerInput.equals("s")) ||
		        (userInput.equals("p") && computerInput.equals("r")) ||
		        (userInput.equals("s") && computerInput.equals("p")))
		{
		    System.out.println("\n\t\t🎉 🎉 🎉 You win! 🎉 🎉 🎉");
            System.out.println("\n\t\t👏 👏 👏  Congratulations! 👏 👏 👏");
		}else{
		    System.out.println("\n\t\tComputer win!");
		    
		}
		sc.close();
	}
}