import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindDublicateWord {
	
public void show()
{
	String s1="rajesh kumar yadav a rajesh kumar a rajesh";
	
	String[] ss=s1.split(" ");
	
	Map<String,Integer> mp=new HashMap<String,Integer>();
	
	
		
	for(int i=0;i< ss.length;i++)
	{
	  String temp=ss[i];
	  //System.out.println(temp);
	  if(mp.containsKey(temp))
	  {
		  mp.put(temp, mp.get(temp)+1);
	  }
	  else
	  {
		  mp.put(temp, 1);
	  }
	}
	
	int lll=Collections.max(mp.values());
	System.out.println(lll);
	
	for(Map.Entry<String,Integer> m:mp.entrySet())
{
		if(m.getValue()==lll)
		{
			System.out.println(m.getKey()+" "+m.getValue());	
		}
		

}
}

}
