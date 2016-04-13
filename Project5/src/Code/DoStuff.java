package Code;

import java.util.WeakHashMap;

public class DoStuff{
	
	private WeakHashMap<String, Object> map = new WeakHashMap<String, Object>();
	
	public DoStuff(){
		FileOperations FO = new FileOperations();
		for(int item:FO.ReadFile()){
			map.put(new String(Integer.toString(item)), new Object());
		}
		
		
		
		System.out.println("Map Size: " + map.size());
	}
	
	public static void main(String[] args){
		DoStuff stuff = new DoStuff();
	}	
}
