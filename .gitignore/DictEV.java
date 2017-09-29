package dictEV.basic;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DictEV {
	HashMap<String, Discribe> HmapEV = new HashMap<String, Discribe>();

	/**
	 * TH1: Lay du lieu dua vao mang
	 * 		sau do dem du lieu tu mang cho vao hashmap
	 * @param wD
	 * @param fileName
	 * @throws IOException
	 */
	// SavetoData
	public void saveFile(Word[] wD, String fileName) throws IOException {
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream(fileName));
			dos.writeInt(wD.length);
			for (Word wd : wD) {
				dos.writeUTF(wd.name);
				dos.writeUTF(wd.discribe.mean);
				dos.writeUTF(wd.discribe.note);
			}
		} finally {
			IOException ex = null;
			ex.getMessage();
		}
		dos.close();
	}

	// ReadfromFile
	public Word[] readFile( Word[] wD,String fileName) throws IOException {
		DataInputStream dis =null;
		try {
			dis = new DataInputStream(new FileInputStream(fileName));
			int max = dis.readInt();
			wD = new Word[max];
			for(int i = 0; i < max; i++) {
				wD[i].name = dis.readUTF();
				wD[i].discribe.mean = dis.readUTF();
				wD[i].discribe.note = dis.readUTF();
			}
		}
		catch(IOException ex) {
			ex.getMessage();	
		}
		dis.close();
		return wD;
	}
	
	// Load data to HashMap
	public HashMap<String,Discribe> loadToMap(Word[] word) {
		HashMap<String,Discribe> hsmap = null;
		try {
			hsmap = new HashMap<String,Discribe>();
			for(Word wd : word) {
				hsmap.put(wd.getName(), wd.getDiscribe());
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		return hsmap;
	}
	
	//Search a key of the mapping
	public Arrays searchWord(String regex){
		Arrays results = null;
		
		return results;
	}
}