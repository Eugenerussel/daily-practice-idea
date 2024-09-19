package lambdaexpression;

interface Mathoperation {
    int doCalculate(int a,int b);
    // if the method is void type,
    //then, Calculator cals=(a,b)->systm.out.println(a+b);
    //cals.print().
}
class Calculator {
    int calculate(int a,int b,Mathoperation operation){
        return operation.doCalculate(a,b);
    }
}
public class CalculatorExample {
    public static void main(String[] args) {
        //lambda notation----=()-> operation or sout.
        // here the interface have int type,so automatically a+b returns the int value.
        //Calculator cals = (a, b) -> a + b;
        // or to get multiple line
        // Calculator cals=(a,b) -> {
        //int result = a + b;
        //return result;}
        Calculator cals=new Calculator();
        int sum=cals.calculate(6,4,(a,b)-> a+b);
        System.out.println(sum);
        int product=cals.calculate(6,4,(a,b)-> a*b);
        System.out.println(product);


    }
}