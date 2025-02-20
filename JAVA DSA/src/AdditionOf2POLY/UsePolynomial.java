package AdditionOf2POLY;

public class UsePolynomial {
    public static void main(String[] args) {
        Polynomial p1=new Polynomial();
        p1.append(2,3);
        p1.append(3,2);
        p1.append(2,4);
        p1.append(4,1);

        System.out.print("Polynomial first : " );
        p1.show();
        Polynomial p2=new Polynomial();
        p2.append(4,1);
        p2.append(8,3);
        p2.append(8,4);
        p2.append(4,3);

        System.out.print("Polynomial Second : " );
        p2.show();
    }
}
