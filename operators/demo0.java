package operators;

public class demo0 {
    public static void main(String[] args) {
        System.out.println("\n\nArithmetic Operators");
        int a=78, b=8;
        System.out.println("\tAddition =\t\t"+(a+b));
        System.out.println("\tSubtraction =\t\t"+(a-b));
        System.out.println("\tMultiplication =\t"+(a*b));
        System.out.println("\tDivision =\t\t"+(a/b));
        System.out.println("\tModulus =\t\t"+(a%b));
        System.out.println("\tIncrement =\t\t"+(++a+b++));
        System.out.println("\tDecrement =\t\t"+(--a+b--));

        
        System.out.println("\n\nRelational Operators");
        a=12;
        b=8;
        System.out.println("\tEqual to?\t\t\t"+(a==b));
        System.out.println("\tNot equal?\t\t\t"+(a!=b));
        System.out.println("\tGreater than?"+(a>b));
        System.out.println("\tLess than?\t\t"+(a<b));
        System.out.println("\tGreater than or equal to?\t"+(a<=b));
        System.out.println("\tLess than or equal to?\t\t"+(a>=b));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //Assignment Operators
        int x;
        x = 5;
        x += 3;
        System.out.println("After Addition =\t\t"+x);
        x -= 3;
        System.out.println("After Subtraction =\t\t"+x);
        x *= 3;
        System.out.println("After Multiplication =\t\t"+x);
        x /= 3;
        System.out.println("After Division =\t\t"+x);
        x %= 3;
        System.out.println("After Modulus =\t\t"+x);
        x &= 3;
        x |= 3;
        x ^= 3;
        x >>= 3;
        x <<= 3;
    }
}
