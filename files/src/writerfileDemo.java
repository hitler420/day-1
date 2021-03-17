import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class writerfileDemo {
	public static void main(String[] args) {
		demo1();
	}
	private static void demo1() {
		Writer out;
		try {
			out =new FileWriter("output.txt");
			BufferedWriter bufferWriter=new BufferedWriter(out);
			bufferWriter.write("Writing into a file");
			bufferWriter.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
