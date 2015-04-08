import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Encoder 
{
	String myFile;
	public Encoder(String fileName)
	{
		myFile = fileName;
	}
	
	public void write(String plaintext)
	{
		try {
			String[] code = {"Alpha","Bravo","Charlie","Delta","Echo","Foxtrot","Golf","Hotel","India","Juliett","Kilo","Lima","Mike","Novermber","Oscar","Papa","Quebec","Romeo","Sierra","Tango","Uniform","Victor","Whiskey","X-ray","Yankee","Zulu"};
			PrintWriter pout = new PrintWriter(new File(myFile));
			String[] letters = plaintext.split("");
			for(String x: letters)
			{
			if(x.equals(" "))
			{
				pout.print("\n");
			}
			else
			{
				for(String y: code)
				{
					if(x.substring(0,1).equals(y.substring(0,1)))
					{
						pout.print(y+" ");
					}
				}
			}
			
			}
			pout.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<String> read()
	{
		ArrayList<String> msg = new ArrayList<String>();
		try {
			Scanner scan = new Scanner(new File(myFile));
			String nextLine = "";
			while(scan.hasNextLine()==true)
			{
				nextLine = scan.nextLine();
				String[] line = nextLine.split(" ");
				String word = "";
				for(String x: line)
				{
					word+=x.substring(0, 1);
				}
				msg.add(word);
				msg.add(" ");
			}
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
			
	}
}
