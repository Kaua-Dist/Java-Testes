import java.util.Scanner;
public class Simples_banco {
    public static void main(String[] args) {
        Scanner Keycheck = new Scanner(System.in);
        double  currentdata = 2000;
        
        System.out.println("=============================");
        System.out.println("Wellcome to you accont Master");
        System.out.println("=============================");
        System.out.println("Opçoes: ");
        
        for (int i = 0; i < 1; ){//info basica
        	System.out.println("""
        			
        			1. Current data
        			2. Add value
        			3. Transfer value
        			4. Exit
        			""");
        	System.out.println("Say IT: ");
        	int op = Keycheck.nextInt();
        	
        	if(op == 1){//data atual
        		System.out.println(currentdata);
        }	
        	else if (op == 2){// mais data
    			System.out.println("how much?: ");
    			double atenuante = Keycheck.nextDouble();
    			currentdata += atenuante;
    			System.out.println("Updated for: " + currentdata);
        }
        	else if (op == 3){//menos data
        		System.out.println("how much?: ");
    			double bububle = Keycheck.nextDouble();
    			currentdata += bububle;
    			System.out.println("Updated for: " + currentdata);
    			
    	}   else if (op == 4) {//saida
    			System.out.println("Tanks for you vist, now GET LOST");
    			i++;
    	} else {
    		System.out.println("Wrong number space cowboy, try it again");
			
    	}
      }
   }
}
