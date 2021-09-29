package br.com.softblue.tictactoe;

public class Teste {
    public static void main(String[] args) {
        String x = "1";
        String y = "1";

        if(x == y) {
            System.out.println("x y igual");
        } else{
            System.out.println("x y diferente");
        }
        if(x.equals(y)) {
            System.out.println("x y igual");
        } else{
            System.out.println("x y diferente");
        }


        String x1 = new String("1");
        String y2 = new String("1");

        if(x1 == y2) {
            System.out.println("x1 y2 igual");
        } else{
            System.out.println("x1 y2 diferente");
        }

        x1 = x1.intern();
        y2 = y2.intern();

        if(x.equals(y)) {
            System.out.println("x y igual");
        } else{
            System.out.println("x y diferente");
        }

        if(x1.equals(y2)) {
            System.out.println("x1 y2 igual");
        } else{
            System.out.println("x1 y2 diferente");
        }

    }
}
