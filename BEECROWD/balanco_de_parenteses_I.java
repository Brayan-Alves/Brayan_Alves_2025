package BEECROWD;

import java.util.*;

public class balanco_de_parenteses_I {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        while (LER.hasNext()) {
            String str = LER.next();
            Stack<Character> parenteses = new Stack<>();
            int parentesesAbert = 0;
            int parentesesFechados = 0;
            boolean seCorreto = true;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '(' || str.charAt(i) == ')'){
                    parenteses.add(str.charAt(i));
                }
            }
    
            while (!parenteses.isEmpty()) {
                if(parenteses.peek() == '(' && parentesesFechados == 0){
                    seCorreto = false;
                    break;
                }else if(parenteses.peek() == ')'){
                    parentesesFechados++;
                    parenteses.pop();
                }else if(parenteses.peek() == '('){
                    parentesesAbert++;
                    parenteses.pop();
                }
    
                if(parentesesAbert > 0 && parentesesFechados > 0 ){
                    parentesesAbert--;
                    parentesesFechados--;
                }
                
                
            }
    
            if(seCorreto && parentesesAbert == 0 && parentesesFechados == 0){
                System.out.println("correct");
            }else{
                System.out.println("incorrect");
            }
        }
        }
}
