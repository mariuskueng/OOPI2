package Aufgabe_2_Streams;

import java.awt.List;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Streams {
	
	File from;
	File to;

	public Streams() {
	}
	
	public static boolean readFileSetup(File f){
		if (f.exists() && f.isFile() && f.canRead()) {
			return true;
		}
		return false;
	}
	
	public static boolean writeFileSetup(File f) throws IOException{
		if (f.exists()) {
			if (f.canWrite()) {
				return true;
			}
		} else {
			f.createNewFile();
		}
		return false;
	}
	
	public static boolean decryptFile(File from, File to){
		if (readFileSetup(from)) {
			try {
				FileInputStream in = new FileInputStream(from);
				int readIntegerValue = -1;
				
				if (writeFileSetup(to)) {
					FileOutputStream out = new FileOutputStream(to, true);
					ArrayList<Integer> data = new ArrayList();
					while((readIntegerValue = in.read()) != -1) {
//						System.out.println(readIntegerValue);
//						System.out.println((char)readIntegerValue);
						data.add(readIntegerValue);
//						out.flush();
//						out.write(readIntegerValue);
					}
					in.close();
					
					String oldcontent = "";
					
					
					for (int i = 0; i < data.size(); i++) {
						int a = data.get(i);
						char b = (char) a;
						oldcontent += b;
					}
					ArrayList<String> list = new ArrayList<String>(Arrays.asList(oldcontent.split("999")));
					list.remove(0);

					for (int i = 0; i < list.size(); i++) {
						System.out.println((char)Integer.parseInt(list.get(i)));
					}
					
					out.close();
				}
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Streams s = new Streams();
		s.decryptFile(new File("src/Aufgabe_2_Streams/from.txt"), new File("src/Aufgabe_2_Streams/to.txt"));

	}

}
