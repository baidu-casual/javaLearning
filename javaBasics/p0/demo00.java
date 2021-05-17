package javaBasics.p0;
public class demo00 {
    private String message;
    protected demo00(){
        message="";
    }
    protected demo00(String mess){
        message=mess;
    }
    protected boolean print(){
        if(message.isEmpty())
            return true;
        else{
            System.out.println("\n\nMessage is :- "+message);
            
            if(Character.isDigit(message.charAt(0)))
                System.out.println("\n\tIt starts with a Digit!");
            else if(Character.isWhitespace(message.charAt(0)))
                System.out.println("\n\tIt starts with a WhiteSpace!");
            else if(Character.isUpperCase(message.charAt(0)))
                System.out.println("\n\tIt starts with a Capital Letter!");
            else if(Character.isLowerCase(message.charAt(0)))
                System.out.println("\n\tIt starts with a Lower Letter!");
            
            return false;
        }
            
    }
    public static void main(String[] args) {
        String x = "Hello Developer";
        System.out.println(x);

        demo00 objDemo0 = new demo00();
        if(objDemo0.print())
            System.out.println("\nMessage is Empty!");
        
        demo00 objDemo1 = new demo00("Welcome to Java!");
        if(objDemo1.print())
            System.out.println("\nMessage is Empty!");
        
        x=" Enjoy developing wonderful things!";
        demo00 objDemo2 = new demo00(x);
        if(objDemo2.print())
            System.out.println("\nMessage is Empty!");
        
        x="123456789";
        demo00 objDemo3 = new demo00(x);
        if(objDemo3.print())
            System.out.println("\nMessage is Empty!");
        
        x="abcdefghi";        
        demo00 objDemo4 = new demo00(x);
        if(objDemo4.print())
            System.out.println("\nMessage is Empty!");
    }
}