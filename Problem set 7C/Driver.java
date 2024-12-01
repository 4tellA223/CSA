import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;
public class Driver{
    public static void main(String []arg){
        //number lists
        Math a = new Math();
        ArrayList<Integer> z = a.SieveOfEratosthenes(100);
        System.out.println(z);
        
        ArrayList<Integer> z1 = a.Goldbach(40);
        System.out.println(z1);
        
        ArrayList<Integer> z2 = new ArrayList();
        ArrayList<Integer> z3 = new ArrayList();
        //z2
        //z2.add(1);
        z2.add(8);
        z2.add(3);
        //z3
        z3.add(9);
        z3.add(2);
        z3.add(1);
        
        ArrayList<Integer> z4 = a.Add(z2,z3);
        System.out.println(z2);
        System.out.println(z3);
        System.out.println(z4);
    }
}