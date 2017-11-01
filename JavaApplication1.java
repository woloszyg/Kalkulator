
package javaapplication1;

import java.util.Scanner;


public class JavaApplication1 {

  
    public static void main(String[] args) {
        int pierwsza_1;
        
        int druga_1;
        
        char znak;
        
        Scanner wej = new Scanner(System.in);
        
        System.out.println("Podaj pierwszą liczbę:");
        
        pierwsza_1 = wej.nextInt();
        
        System.out.println("Podaj drugą liczbę:");
        
        druga_1 = wej.nextInt();
        
        System.out.println("Dodawanie dwóch liczb- wciśnij +");
        System.out.println("odejmowanie dwóch liczb- wciśnij +");
        System.out.println("Mnożenie dwóch liczb- wciśnij *");
        System.out.println("Dzielenie dwóch liczb- wciśnij /");
        System.out.println("Operacja modulo- wciśnij %");
        
        znak = wej.next().charAt(0);
                switch(znak)
                {
                    case'+':
                    {
                        System.out.println(pierwsza_1 + druga_1);
                        break;
                    }
                
                case '-':
                {
                System.out.println(pierwsza_1 - druga_1);
                break;
                }
                case '*':
                {
                    System.out.println(pierwsza_1 * druga_1);
                    break;
                }
                case '/':
                {
                    if (druga_1 !=0)
                    {
                        System.out.println(pierwsza_1 / druga_1 + "oraz reszty: " + pierwsza_1 % druga_1);
                    }
                    else
                    {
                        System.out.println("Nie dzielimy przez 0");
                    }
                    
                    break;
                }
                case '%':
                {
                    if (druga_1 !=0)
                    {
                        System.out.println(pierwsza_1 % druga_1);
                    }
                    else
                    {
                         System.out.println("Nie dzielimy przez 0");
                    }
                    
                    
                        
                   
                    }
                }
                }
                
        
    }
    