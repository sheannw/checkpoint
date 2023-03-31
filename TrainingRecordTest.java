// An implementation of a Training Record as an ArrayList
package com.stir.pratical1;



import java.util.*;


public class TrainingRecordTest {
    private List<Entry> tr;
    private List<Entry> entries = new ArrayList<>();
    
    public TrainingRecordTest() {
        tr = new ArrayList<Entry>();
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e){
       tr.add(e);    
   } // addClass
   
   // look up the entry of a given day and month
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "No entries found";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       return result;
   } // lookupEntry
   
   public String findAllEntriesByDate(int d, int m, int y) {
	    String message = "";
	    boolean found = false;
	    for (Entry entry : entries) {
	        if (entry.getDay() == d && entry.getMonth() == m && entry.getYear() == y) {
	            found = true;
	            message += entry + "\n";
	        }
	    }
	    if (!found) {
	        message = "No entries found for the given date";
	    }
	    return message;
	}


   
   
    /**public String getAllEntriesOnDate(int day, int month, int year) {
    
	    String message = "";
	    ArrayList<Entry> entriesOnDate = new ArrayList<>();
	    for (Entry e : entriesOnDate) {
	        if (e.getDay() == day && e.getMonth() == month && e.getYear() == year) {
	            entriesOnDate.add(e);
	        }
	    }
	    if (entriesOnDate.size() > 0) {
	        for (Entry e : entriesOnDate) {
	            message += e.toString() + "\n";
	        }
	    } else {
	        message = "No entries found on this date.\n";
	    }
	    return message;
	}
	*/
   
   /**
    * *public List<Entry> getEntriesForDate(int day, int month, int year) {
    
	    List<Entry> matchingEntries = new ArrayList<>();
	    for (Entry entry : entries) {
	        if (entry.getDay() == day && entry.getMonth() == month && entry.getYear() == year) {
	            matchingEntries.add(entry);
	        }
	    }
	    return matchingEntries;
	}
	*/


   
   // Count the number of entries
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
   }

public boolean removeEntry(int d, int m, int y) {
	 Iterator<Entry> it = entries.iterator();
	    while (it.hasNext()) {
	        Entry entry = it.next();
	        if (entry.getMonth() == m && entry.getDay() == d && entry.getYear() == y) {
	            it.remove();
	            return true;
	        }
	    }
		return false;
	}
}
   
// TrainingRecord