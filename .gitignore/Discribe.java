package dictEV.basic;

import java.io.Serializable;

public class Discribe implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String mean;
	public String note;
	
	Discribe(){
		this("", "");
	}
	
	Discribe(String Mean, String Note){
		this.mean = Mean;
		this.note = Note;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
}
