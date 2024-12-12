import java.util.Scanner;
import java.lang.Math;

public class Main {
	static double addtion(double a , double b){
        return  a+b;
    }
    static double soustraction(double a ,double b){
        return a-b;
    }
    static double multiplication(double a , double b){
        return a*b;
    }
    static double division(double a ,double b){
        return a/b;
    }
    static double puissance(double a ,double b){
        return Math.pow(a,b);
    }
    static double racineCarre(double a ,double b){
        return Math.sqrt(a);
    }
    static double factoriel(double a){
        int i,x;
        x=1;
        for(i=1;i<a;i++){
            x=x*i;
        }
        return  x;
    }
	 static  void menu(){

        System.out.println("1-addition");
	System.out.println("2-soustraction");
        System.out.println("3-multiplication");
	System.out.println("4-division");
	System.out.println("5-puissance");
	System.out.println("6-racine carree");
	System.out.println("7-factoriel");
	system.out.println("8-quitter");
    }
	public static void main(String[] args){
        double x,y,rs;
         int choix;

		do{
         menu();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter voter choix : ");
        choix = scanner.nextInt();
         switch (choix){
         case 1 :
		 System.out.println("Enter premier num : ");
                 x = scanner.nextDouble();
                 System.out.println("Enter deuxiem num : ");
                 y = scanner.nextDouble();
                 rs = addtion(x,y);
                 System.out.println("le resultat est :"+rs);
        	 break;
	 case 2 :
		 System.out.println("Enter premier num : ");
                 x = scanner.nextDouble();
                 System.out.println("Enter deuxiem num : ");
                 y = scanner.nextDouble();
                 rs = soustraction(x,y);
                 System.out.println("le resultat est :"+rs);
                 break;
         case 3:
		 System.out.println("Enter premier num : ");
                 x = scanner.nextDouble();
                 System.out.println("Enter deuxiem num : ");
                 y = scanner.nextDouble();
                 rs = multiplication(x,y);
                 System.out.println("le resultat est :"+rs);
                 break;
	 case 4 :
		 System.out.println("Enter premier num : ");
                 x = scanner.nextDouble();
                 System.out.println("Enter deuxiem num : ");
                 y = scanner.nextDouble();
                 do {
                     System.out.println("impossible de diviser par 0// entrer le deuxiem num :");
                     y = scanner.nextDouble();
                 }while(y == 0);
                 rs = division(x, y);
                 System.out.println("le resultat est :" + rs);
               break;
         case 5:
	       System.out.println("Enter premier num : ");
                 x = scanner.nextDouble();
                 System.out.println("Enter deuxiem num : ");
                 y = scanner.nextDouble();
                 rs = puissance(x,y);
                 System.out.println("le resultat est :"+rs);
                 break;
	 case 6 :
		 System.out.println("Enter premier num : ");
                 x = scanner.nextDouble();
                 rs = racineCarre(x);
                 System.out.println("le resultat est :"+rs);
                    break;
	 case 7 :
		 System.out.println("Enter premier num : ");
                 x = scanner.nextDouble();
		 rs = factoriel(x);
                 System.out.println("le resultat rst : "+rs);
                    break;
	 case 8 :
                 System.out.println("******mercii de votre visite*******");
                    break;	    
	 default:
                 System.out.println("Choix invalide ");
		 }
         }while (choix !=8);

	    }
}
