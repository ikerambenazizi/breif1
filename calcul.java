import java.util.Scanner;
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
	 static  void menu(){

        System.out.println("1-addition");
	System.out.println("2-soustraction");
        System.out.println("3-multiplication");
	System.out.println("4-division");
    }
	public static void main(String[] args){
        double x,y,rs;
         int choix;

		do{
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter num 1 : ");
         x = scanner.nextDouble();
         System.out.println("Enter num 2 : ");
         y = scanner.nextDouble();

		 menu();
		 System.out.println("Enter voter choix : ");
         choix = scanner.nextInt();
         switch (choix){
         case 1 :
                 rs = addtion(x,y);
                 System.out.println("le resultat est :"+rs);
        	 break;
	 case 2 :
                 rs = soustraction(x,y);
                 System.out.println("le resultat est :"+rs);
                 break;
         case 3:
                 rs = multiplication(x,y);
                 System.out.println("le resultat est :"+rs);
                 break;
	 case 4 :
                 if(y==0){
                     System.out.println("Syntaxe Erorr");
                 }else{
                     rs = division(x,y);
                     System.out.println("le resultat est :"+rs);
                 }
               break;

	 
	default:
                 System.out.println("Choix invalide ");
		 }
        }while (choix !=4);

	    }
}
