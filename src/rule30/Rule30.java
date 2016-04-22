
package rule30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rule30 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //System.out.print("Length: ");
        //int length = s.nextInt();
        System.out.print("Height: ");
        int height = s.nextInt();
        System.out.print("Initial State: ");
        String initialState = s.next();
        ArrayList<Integer> initial = new ArrayList<Integer>();
        for (int i = 0; i < initialState.length(); i++) {
            initial.add(Character.getNumericValue((initialState.charAt(i))));
        }
        //System.out.println(initial.toString());
        
        for (int i = 0; i < height; i++) {
            initial.add(0, 0); //adds imaginary zero to the left
            initial.add(0); // adds imaginary zero to the right
            for (int j = 1; j < initial.size()-1; j++) {
                System.out.print(initial.get(j)+" ");
            }
            initial = generateRule30(initial);
            System.out.println("");
        }
        
        
        
    }

    private static ArrayList<Integer> generateRule30(ArrayList<Integer> initial) {
        ArrayList<Integer> generated = new ArrayList<Integer>();
        for (int i = 1; i < initial.size()-1; i++) {
            if (initial.get(i-1) == 1 && initial.get(i) == 1 && initial.get(i+1) == 1){
                generated.add(0);
            }
            else if (initial.get(i-1) == 1 && initial.get(i) == 1 && initial.get(i+1) == 0){
                generated.add(0);
            }
            else if (initial.get(i-1) == 1 && initial.get(i) == 0 && initial.get(i+1) == 1){
                generated.add(0);
            }
            else if (initial.get(i-1) == 1 && initial.get(i) == 0 && initial.get(i+1) == 0){
                generated.add(1);
            }
            else if (initial.get(i-1) == 0 && initial.get(i) == 1 && initial.get(i+1) == 1){
                generated.add(1);
            }
            else if (initial.get(i-1) == 0 && initial.get(i) == 1 && initial.get(i+1) == 0){
                generated.add(1);
            }
            else if (initial.get(i-1) == 0 && initial.get(i) == 0 && initial.get(i+1) == 1){
                generated.add(1);
            }
            else if (initial.get(i-1) == 0 && initial.get(i) == 0 && initial.get(i+1) == 0){
                generated.add(0);
            }
            
        }
        return generated;
    }

    
    
}
