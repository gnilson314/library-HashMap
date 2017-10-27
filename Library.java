//this is library

import java.util.HashMap; 

public class Library {
  public static void main(String[] args){
    
    HashMap<String,Boolean> myBooks = new HashMap<String,Boolean>(); 
    myBooks.put("Road Down The Funnel", true);
    myBooks.put("Rat: a biology",false);
    myBooks.put("Time In",true);
    myBooks.put("3d food printing", false);
    
    Library myLibrary = new Library(); 
    myLibrary.getFinishedBooks(myBooks);
     
  }
  
 public void getFinishedBooks(HashMap<String,Boolean> library){
   if (library.size()<1){
     System.out.println("error, can't be less than 1"); 
     
   }
   else { 
   for (String book : library.keySet()){
     if (library.get(book) == true) {
       System.out.println(book);
     }
   }
  
   }
   
   
 }
  
}