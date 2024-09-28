package My_package_1;

public class Test {

	public static void main(String[] args) 
	{
		Employee e1[]=new Employee[3];
		
		int i,sal=0;
		
		for(i=0;i<3;i++)
		{   
			e1[i]=new Employee();
			e1[i].set_Data();
			
	
			if(e1[i].comp()>sal)
			{  
				sal=e1[i].comp();
			}
			
		}
		if(e1[i].comp()==sal)
		  e1[i].show_Data();

	}
	

}
