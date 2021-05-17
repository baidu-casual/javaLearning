package variables;
public class demo0 {
    private String varI;
    private static String var;
    public demo0(){
        varI="";
    }
    public demo0(String v){
        varI=v;
    }
    public void evaluate(){
        var="Hi! I am a Static Variable!";
        System.out.println("(Class)\n\t"+var);

        String var="Hi! I am a Local Variable!";
        System.out.println("(Local)\n\t"+var);

        var="I am Locally located.";
        demo0.var="I am Statically allocated.";

        System.out.println("(Class)\n\t"+demo0.var);
        System.out.println("(Local)\n\t"+var);
    }
    public static void main(String[] args) {
        System.out.println();
        demo0 objDemo0 = new demo0("Hi! I am an Instance Variable!");
        objDemo0.evaluate();
        System.out.println("(Instance)\n\t"+objDemo0.varI);
        objDemo0.varI="I am assigned when a Object is Created!";
        System.out.println("(Instance)\n\t"+objDemo0.varI);
        System.out.println();
    }    
}
