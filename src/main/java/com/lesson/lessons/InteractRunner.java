package com.lesson.lessons;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InteractRunner{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            Calculate calc = new Calculate();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter first argument:");
                int first = Integer.parseInt(reader.readLine());
                System.out.println("Enter second argument:");
                int second = Integer.parseInt(reader.readLine());
                System.out.println("Enter operation");
                String op = reader.readLine();
                if (op.equals("+")) {
                    calc.add(first, second);
                } else if (op.equals("-")) {
                    calc.minus(first, second);
                } else if (op.equals("*")) {
                    calc.multipliy(first, second);
                } else if (op.equals("/")) {
                    calc.devide(first, second);
                } else {
                    System.out.println("What is this?");
                }
                System.out.println("Result :" + calc.getResult());
                System.out.println("Exit yes/no");
                exit = reader.readLine();
            }
        }
        catch (IOException e){
            e.getMessage();
        }
    }
}