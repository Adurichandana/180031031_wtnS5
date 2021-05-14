package Classsobj;

public class p1 {

	    double h,w,d;

	     p1(double width,double height,double depth)
	    {
	        h=height;
	        w=width;
	        d=depth;
	    }
	    double volume()
	    { double v;
	    v=h*w*d;
	    return v;
	    }
	   
	    public static void main(String[] args) {
	       
	    p1 bc = new p1(8.5,80.3,9.6);
	    System.out.println(bc.volume());

	    }

	}


