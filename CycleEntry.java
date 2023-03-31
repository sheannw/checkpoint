package com.stir.pratical1;

public class CycleEntry extends Entry{
	private String Tempo;
	private String Terrain; 
	
	public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String t, String tmp) {
		super(n, d, m, y, h, min, s, dist);
		Terrain = t;
		Tempo = tmp;
}

	public String getTempo() {
			return Tempo;
	}
	
	public String getTerrain() {
		return Terrain;
}

	
	public String getEntry() {
		String result = getName() + " cycled " + getDistance() + " km "
				+   "in " + getHour() + ":" + getMin() + ":" + getSec() + " on "
				+ getDay() + "/" + getMonth() + "/" + getYear() 
				+ " on " + getTerrain()+ " at " + getTempo() + " tempo" + "\n";
		
		return result;
				
	} 
}