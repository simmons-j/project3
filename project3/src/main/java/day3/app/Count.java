package day3.app;

import java.io.Serializable;

public class Count implements Serializable {

	private static final long serialVersionUID = 1L;
	private int count = 0;
	
	public Count(int count) {
		this.count = count;
	}
	
	public Count() {
	}

	public void plusOne() {
		this.count++;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return String.format("Count = %d", count);
	}
}
