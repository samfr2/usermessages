import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class BackEnd {

	
	private static Map<String,ArrayList<String>> usermsgs;
	
	
	public BackEnd(){
		usermsgs=new TreeMap<String,ArrayList<String>>();
	}
	
	public List<String> getMessages(String username){
		
		return usermsgs.get(username);
	}
	
	public static void addMessage(String username,String msg){
		
		ArrayList<String> a;
		if(!usermsgs.keySet().contains(username)){
			a= new ArrayList<String>();
		}
		else a= usermsgs.get(username);
		
		a.add(msg);
		usermsgs.put(username,a);
		
	}
	
	public List<String> getUsers(){
		ArrayList<String> a=new ArrayList<String>();
		
		for(String s: usermsgs.keySet()){
			a.add(s);
		}
		
		return a;
	}
	
	
}
