package dictEV.basic;

import java.io.Serializable;
import java.text.Collator;

public class Word implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	Discribe discribe = new Discribe();
	Collator myCol = Collator.getInstance();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Discribe getDiscribe() {
		return discribe;
	}
	
	public Word(String nAME, String mEAN, String nOTE) {
		this.name = nAME;
		this.discribe.setMean(mEAN);
		this.discribe.setNote(nOTE);
	}
}
