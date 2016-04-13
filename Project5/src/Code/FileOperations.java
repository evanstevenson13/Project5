package Code;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//-Xms2048
public class FileOperations{
	private List<Integer> intList = new ArrayList<Integer>();
	
	
	public FileOperations(){
	}
	
	
	public List<Integer> ReadFile(){
		try{
			Scanner SC = new Scanner(new File("DataFile.txt"));
			while(SC.hasNextLine()){
				String readString = SC.next();
				intList.add(Integer.parseInt(readString));
			}
			SC.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
//		for(int item:intList){
//			System.out.println(item);
//		}
		
		return intList;
	}
	
	
	public void CreateFile(){
		try{
			PrintWriter writer = new PrintWriter("DataFile.txt");
			for(int x=0; x<=3000; x++){
				writer.write(Integer.toString(x)+"\n");
			}
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
