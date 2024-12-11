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
         case 5:
                    rs = puissance(x,y);
                    System.out.println("le resultat est :"+rs);
                 break;
	 case 6 :
                    rs = racineCarre(x,y);
                    System.out.println("le resultat est :"+rs);
                    break;
	 case 7 :
		    rs = factoriel(x);
                    System.out.println("le resultat rst : "+rs);
                    break;
	 default:
                 System.out.println("Choix invalide ");
		 }
         }while (choix !=7);

	    }
}
