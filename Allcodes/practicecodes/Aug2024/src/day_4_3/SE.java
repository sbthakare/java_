package day_4_3;

public class SE extends FE
{
private 
 int s1,s2,s3;
 float stotal,Ttotal;
 
 public
 
 void get(int x,int y,int z)
 { 
	 s1=x;
	 s2=y;
	 s3=z;
	 
	 stotal=s1+s2+s3;
	 
	Ttotal=ftotal+stotal;
 }
 void show() {
	 super.show();
	 System.out.println("Stotol="+stotal);
	 System.out.println("Ttotal="+Ttotal);
 }
 
 
}
