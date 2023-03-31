package com.stir.pratical1;

public class SprintEntry extends Entry{
	private int Repetitions; 
	private int recoveryTime;
	
	public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int r, int rt) {
		super(n, d, m, y, h, min, s, dist);
		Repetitions = r;
		recoveryTime = rt; 
}
	
	public int getRepetitions() { 
			return Repetitions;
	}
	
	public int getrecoveryTime() { 
		return recoveryTime;
		}
	
	public String getEntry() {
		String result = getName() + " sprinted " + getRepetitions() + "x" + (int) getDistance() + "m"
				+ " in " + getHour() + ":" + getMin() + ":" + getSec() + " with "
				+ getrecoveryTime() + " minutes recovery on " + getDay() + "/" + getMonth() + "/" + getYear() 
				+ "\n";
		return result;
				
	} 
}

