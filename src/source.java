/*
 * Main source for Agilechans operation. Here is a the main method that allows Agilechan to move and keep track of if someone has properly set up the program.
 * The agile mindset was created by developers to welcome change and overcome difficulty. 
 * For all people that have or want to be a part of a modern development team it is essential to learn the agile mindset and its frameworks. 
 * That is why Agilechan was invented. Its job is to support you while keeping track of your daily agile processes and reminding you about the principles of agile from your terminal! 
 * Currently Agilechan provides support for Scrum, XP, and Kanban.
 *
 *@author(Alcidner Lewis)
 *@version 2020
 */

public class source{
	public static void main(String args[]){
		try{
			//Calls to the main class
			agilechan agi = new agilechan();

			//Sees if there is a 'about.txt' within the folder
			if (!agl.tester()) agl.setup();
			
			//See if there is a some backlog data in the file a 'backlog.txt'
			if(!agl.isBackLog()) agl.process(); 

			//Continue into daily activities
			agl.daily();

		}
		catch(Exception e){
			System.out.println("There was a error somewhere within the process.");	
		}
	}





}
