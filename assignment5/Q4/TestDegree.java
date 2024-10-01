
/* 4.   Create a class 'Degree' having a method 'getDegree' that prints"I got a degree". It has two subclasses namely 'Undergraduate' and
'Postgraduate'each having a method with the same name that prints"I am an Undergraduate" and "I am a Postgraduate" respectively.Call the
 method by creating an object of each of the three classes.
*/

package assignment_31;

public class TestDegree {

	public static void main(String[] args) {
		
		Degree degree = new Degree();
		degree.getDegree(); 
		
        UnderGraduate undergraduate = new UnderGraduate();
        undergraduate.getDegree();  
        
        PostGraduate postgraduate = new PostGraduate();
        postgraduate.getDegree(); 
        
               
    }

	}


