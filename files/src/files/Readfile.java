package files;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Readfile {
	public static void main(String[] args) {
		
		try{
			Reader reader=new FileReader("./input.txt");
			int character=reader.read();
			System.out.println(character);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
