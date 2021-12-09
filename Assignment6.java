	import java.io.PrintWriter;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;


	public class Assignment6 {

	public static void main(String[] args) throws FileNotFoundException  {
		File inputarea = new File("/Users/bibtorbemus/eclipse/java-2020-12/Eclipse.app/Contents/MacOS/Victor Lemuz1/CS176_Assignment6/src/worldarea (2).txt");
		File inputpop = new File("/Users/bibtorbemus/eclipse/java-2020-12/Eclipse.app/Contents/MacOS/Victor Lemuz1/CS176_Assignment6/src/worldpop.txt");
		Scanner onearea = new Scanner(inputarea);
		Scanner twopop = new Scanner(inputpop);
		PrintWriter out = new PrintWriter("/Users/bibtorbemus/eclipse/java-2020-12/Eclipse.app/Contents/MacOS/Victor Lemuz1/CS176_Assignment6/src/world_pop_density.txt");
				
		String area;
		String population = "";
		String name = "";
		double density;
		while (onearea.hasNextLine() && twopop.hasNextLine())
		{
		String linearea = onearea.nextLine();
				
		int i = 0;
		while (!Character.isDigit(linearea.charAt(i))) 
		{ i++;}
		name = linearea.substring(0, i);  
		area = linearea.substring(i);
		double are = Double.parseDouble(area);
		
		String linepop = twopop.nextLine();
		int x = 0;
		while (!Character.isDigit(linepop.charAt(x))) 
		{ x++;}
		population = linepop.substring(i);
				
				
		double pop = Double.parseDouble(population);
		density = pop/are;
		name = name.trim();
		
		out.printf("%-8s%12.2f", name + ":", density );
		out.println();
		}
				
				
		out.close();
		}	
	}


