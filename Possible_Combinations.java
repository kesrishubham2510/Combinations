import java.util.Set;
import java.util.HashSet;

import java.util.HashSet;
public class Possible_Combinations {

	static Set<String> Combination_Set = new HashSet<String>();
	
    String []sample;

  Possible_Combinations(String input)
  {  
	   sample = new String[input.length()];
	  
	  for(int i=0;i<input.length();i++)
	  {
		  sample[i] = Character.toString((input.charAt(i)));
	  }
	  
	  System.out.println("All Possible Combinations are:-");
	  System.out.println();
	  FindCombinations();
	  System.out.println("The Set of Possible Combinations for the given input is ");
	  System.out.println();
	  System.out.println(Combination_Set);
	  System.out.println();
	  System.out.println("The Total number of Distinct Combinations is "+Combination_Set.size());	  
  }
  
  private void FindCombinations()
  {
	  int i;
	 
	  for(i=1;i<=sample.length;i++)
	  {
		 String[] result= Make_Combinations(sample,i);
	     Print_Combinations(result,i);
	  }
  }
  

private String[] Make_Combinations(String[] sample_Inp,int len_Of_Combinations)
   {
	   if(len_Of_Combinations==1)
	      return sample_Inp;
	   
	   else
	   {
   String[] allLists = new String[(int)Math.pow(sample_Inp.length,len_Of_Combinations)];
		    
		   String[] subLists = Make_Combinations(sample_Inp,len_Of_Combinations-1);
		   
		   int Array_Index=0;
		   
		   for(int i=0;i<sample_Inp.length;i++)
		   {
			   for(int j=0;j<subLists.length;j++)
			   {
				   allLists[Array_Index]= sample_Inp[i]+subLists[j];
				   Combination_Set.add(allLists[Array_Index]);
				   Array_Index++;
			   }
		   }
		   
		   return allLists;
	   }
   }

private void Print_Combinations(String[] result,int len) {
	
	System.out.println("All Possible Combinations of Length "+len+" are :-");
	System.out.println();
	   for(int i=0;i<result.length;i++)
	   {
		   Combination_Set.add(result[i]);
		   System.out.println((result[i]));
	   }
System.out.println();
	    }

  
}
	   





















