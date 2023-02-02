package org.example.DZ4;

public class Triangle {

    public double Pl(int a, int b, int c) throws MyException {
        if(a<0 || b<0 || c>0) throw new MyException("Ошибка");
       double p= (a+b+c)/2;
       double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return  s;
    }

}

