import java.util.*;  
class SetUnion{  
 public static void main(String args[]){  
  LinkedHashSet<String> set1=new LinkedHashSet<String>();  
  LinkedHashSet<String> set2=new LinkedHashSet<String>();
  set1.add("Ravi");  
  set1.add("Vijay");  
  set1.add("Ravi");  
  set1.add("Ajay");
  
  set2.add("chandan");
  set2.add("raja");
  
  

  set1.addAll(set2);

  Iterator<String> itr=set1.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  