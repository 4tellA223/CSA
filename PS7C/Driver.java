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
        System.out.print(z);
        
    }
}