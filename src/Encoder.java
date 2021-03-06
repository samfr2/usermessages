import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
	//,"alpha","bravo","charlie","delta","echo","foxtrot","golf","hotel","india","juliett","kilo","lima","mike","novermber","oscar","papa","quebec","romeo","sierra","tango","uniform","victor","whiskey","x-ray","yankee","zulu"
	public void write(String plaintext)
	{
		try {
			String[] code = {"Alpha","Bravo","Charlie","Delta","Echo","Foxtrot","Golf","Hotel","India","Juliett","Kilo","Lima","Mike","Novermber","Oscar","Papa","Quebec","Romeo","Sierra","Tango","Uniform","Victor","Whiskey","X-ray","Yankee","Zulu"};
			FileWriter pout = new FileWriter(new File(myFile),true);
			String[] letters = plaintext.split("");
			for(String x: letters)
			{
			if(Character.isLetter(x.charAt(0)))
			{
				for(String y: code)
				{
					if(x.equalsIgnoreCase(y.substring(0,1)))
					{
						pout.write("\t"+y);
					}
				}
			
			
			}
			else
			{
				pout.write(x);
			}
			
			
		}pout.write("\n");pout.close();} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<String> read()
	{
		ArrayList<String> msgs = new ArrayList<String>();
		try {
			Scanner scan = new Scanner(new File(myFile));
			String nextLine = "";
			while(scan.hasNextLine()==true)
			{
				nextLine = scan.nextLine();
				String[] line = nextLine.split("\t");
				String msg = "";
				for(String x: line)
				{
					msg+=x.substring(0, 1);
				}
				msgs.add(msg);
			}
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msgs;
			
	}
	
	public static void main(String[] args) {
		Encoder e = new Encoder ("foo.txt");
		e.write("YubNub, Echop YubNub");
		e.write("Atoh Meet Topeecheekene Gnoop Dock Fling Oh Ah");
		System.out.println(e.read());
	}
	}

