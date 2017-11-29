package se.gen.genProject;


import java.util.Scanner;

public class TestGen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gen gen;
//void func(StringBuilder listOrd, int n);
        gen = (StringBuilder text,  int tal) -> {
//var od interfejsot = parametrite->

            System.out.println(text.reverse());
//sb ja pravi stringot podolu so scanner ja zadavame(listOrd od interfejsot) vo nova string-reverse
            for (int i = 3; i <= tal+1; i = i + 3) {
                System.out.print(i + " ");//ovde br go reverse vo loopot
            }
            System.out.println();
        };

        System.out.println("Mata ett eller fler ord");
        String text1 = sc.nextLine();//vnesvime so parametri od interfejsot
        StringBuilder listOrd = new StringBuilder(text1);
        
        System.out.println("Mata i en tal: ");
        int m= sc.nextInt();
 //go povikuvame metodot func preku interfejs lokalnata var od pogore(so parametrite lokalni)     
        gen.func(listOrd, m);

    }
}
