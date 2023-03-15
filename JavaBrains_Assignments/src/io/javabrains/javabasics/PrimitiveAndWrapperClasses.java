package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
    	int i = 10;
    	char c = 'k';
    	float f  = 10.04f;
    	double d = 234234.23544;
    	byte b = 10;
    	short s = 20;
    	long l = 30;
    	boolean b2 = true;

        // Step 2: Convert primitive variables to wrapper objects
    	//autoboxing
    	Integer i1 = i;
    	Character c1 = c;
    	Float f1 = f;
    	Double d1 = d;
    	Byte b1 = b;
    	Short s1 = s;
    	Long l1 = l;
    	Boolean b11 = b2;
    	

        // Step 3: Print the values of the wrapper objects
    	System.out.println("Auto-boxing");
    	System.out.println(i1);
    	System.out.println(c1);
    	System.out.println(f1);
    	System.out.println(d1);
    	System.out.println(b1);
    	System.out.println(s1);
    	System.out.println(l1);
    	System.out.println(b11);

        // Step 4: Convert wrapper objects back to primitive variables
    	//unboxing
    	System.out.println();
    	int i3 = i1;
    	char c3 = c1;
    	float f3 = f1;
    	double d3 = d1;
    	byte b3 = b1;
    	short s3 = s1;
    	long l3 = l1;
    	boolean b33 = b11;

        // Step 5: Print the values of the primitive variables
    	System.out.println("Auto-Unboxing");
    	System.out.println(i3);
    	System.out.println(c3);
    	System.out.println(f3);
    	System.out.println(d3);
    	System.out.println(b3);
    	System.out.println(s3);
    	System.out.println(l3);
    	System.out.println(b33);

    }
}
