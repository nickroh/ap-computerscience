import java.util.*;

public class Flood{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        map a = new map();
        int x;
        int y;

        System.out.println("Start From Random Point? Y/N");
        String input = sc.next();
        char input_1 = input.charAt(0);
        if(input_1 == 'y' || input_1 == 'Y'){
            x = start_point();
            y = start_point();
            
            a.printmap();
            a.traverse(x, y);
            a.order();

        }
        else if(input_1 == 'n' || input_1 == 'N'){
            a.printmap();
            
            a.traverse(2,1);
            a.order();
            a.print_result();
        }
        else{
            System.out.println("Invalid Input");
        }
        

    }

    private static int start_point(){
        
        int a;

        a = (int)(Math.random()*9.0);
        a+=1;
        return a;
    }
}
