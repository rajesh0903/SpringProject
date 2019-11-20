

public class MyMainClass 
{
    public static void main(String[] args)
    {
    	Simple s=new Test();
    	s.show();
    }

	
}

class Test implements Simple
{

	@Override
	public void show() {

		System.out.println("testing");
		
	}
	
}