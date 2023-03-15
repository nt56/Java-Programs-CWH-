package MyPackage;

public class fibonacci_Eg {
    public static void main(String[ ] args) {
        int a=0,b=1,c=1,i;
        for(i=1;i<=10;i++){
            System.out.print(a+" "+b+" "+c+" ");
            a=b+c;
            b=a+c;
            c=a+b;
        }
        }
    }
