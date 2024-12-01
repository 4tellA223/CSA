import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;
public class Math{
    
    
    public static ArrayList<Integer> SieveOfEratosthenes(int n){
        ArrayList<Integer> result = new ArrayList();
        for(int i = 2; i < n; i++){
           result.add(i);
        }
        for(int j = 2; j < n; j++){
            for(int a = result.size()-1; a >= 0; a--){
                if(result.get(a) % j == 0 && result.get(a)>j){
                    result.remove(a);
                }
            }
        }
        return result;
    }
    
    public static ArrayList<Integer> Goldbach(int n){
        ArrayList<Integer> result = new ArrayList();
        int num;
        int num1;
        for(int a:SieveOfEratosthenes(n)){
             num = a;
            for(int b:SieveOfEratosthenes(n)){
                num1 = b;
                if(num+num1 == n){
                result.add(num);
                result.add(num1);
                return result;
                }
            }
        }
        return result;
    }
    
   public static ArrayList<Integer> Add(ArrayList<Integer> a, ArrayList<Integer> b){
       ArrayList<Integer> result = new ArrayList(); 
       boolean flag = false;
        int indexa = a.size()-1;
        int indexb =b.size()-1;
        int store;
        while(indexa >=0 && indexb>=0){
            store = a.get(indexa)+b.get(indexb);
            if(flag){
            store ++;
            flag = false;
            }
            if(store>=10){
            store -= 10;
            flag = true;
            }
            result.add(0,store);
            if(indexa == 0 || indexb == 0 && flag){
            result.add(0,1);
            }
            indexa--;
            indexb--;
        }
        return result;
    }
    
}