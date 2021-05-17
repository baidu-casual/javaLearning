package javaBasics.p0;
public class demo01 {
    private int number, result;
    protected demo01(){
        number=0;
        result=0;
    }
    protected void init(int input){
        result=0;
        number=input;
    }
    protected boolean evaluate(){
        if(number==0)
            return true;
        else{
            int temp=number;
            while(temp>0){
                result += temp%10;
                temp=temp/10;
            }
            return false;
        }
    }
    public void printResult(){
        System.out.println("\nThe sum of individual digits of ("+number+") is --> "+result);
    }
    
    public static void main(String[] args) {
        demo01 objDemo0 = new demo01();

        objDemo0.init(0);
        objDemo0.evaluate();
        objDemo0.printResult();
        
        objDemo0.init(90);
        objDemo0.evaluate();
        objDemo0.printResult();

        objDemo0.init(12345);
        objDemo0.evaluate();
        objDemo0.printResult();
        
        objDemo0.init(89465161);
        objDemo0.evaluate();
        objDemo0.printResult();
    }
}
