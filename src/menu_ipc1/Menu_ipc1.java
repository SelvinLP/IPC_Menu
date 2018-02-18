/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_ipc1;

import java.util.Scanner;
/**
 *
 * @author Aragon Perez
 */
public class Menu_ipc1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j=1;
        int a,b,c, mayor = 0, medio=0, menor=0,error=0 ;
        int contdigitos=1;
        Scanner Ing_teclado = new Scanner(System.in);
        System.out.println("[IPC1]Tarea3_201701133");
        System.out.println("  ");
        System.out.println("1. Usuarios");
        System.out.println("2. Contador de Digitos");
        System.out.println("3. tres numeros de mayor a menor");
        System.out.println("4. Calcular Promedio");
        int opcion= Ing_teclado.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Ingrese Usuario");
                break;
                
                
                
            case 2:
                System.out.println("1. Ingresar Numero ");
                System.out.println("2. Mostrar Numero de Digitos");
                System.out.println("4. Menu Principal");
                int submenu2=Ing_teclado.nextInt();
                switch (submenu2){
                    case 1:
                        int numing= Ing_teclado.nextInt();
                        if(numing==0){
                            System.out.println("Solo tiene 1 Digito");
                        }else{
                            if(numing>0 && numing<=100000 ){
                                while(j>0){
                                    numing=numing/10;
                        
                                    if(numing>=1 ){
                                        contdigitos++;
                                    }else{
                                            j--;
                                    }
                                }
                            }else{
                                System.out.println("Error Igrese un numero entre 0 y 10000");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Es numero Tiene "+ contdigitos+ " Digitos");
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Ingrese Correctamente la Opcion");
                }
                

        
                break;
            case 3:
                //los valores de cada numero se representan en variables a(num 1), b (num2) y c(num3)
                System.out.println("1. Ingresar Numeros");
                System.out.println("2. Mostrar Numero de Digitos");
                System.out.println("4. Menu Principal");
                int submenu3=Ing_teclado.nextInt();
                switch (submenu3){
                    case 1:
                        System.out.println("Ingrese Numero 1");
                a=Ing_teclado.nextInt();
                System.out.println("Ingrese Numero 2");
                b=Ing_teclado.nextInt();
                System.out.println("Ingrese Numero 3");
                c=Ing_teclado.nextInt();
                if(a==b && a==c){
                    error++;
                }
                else{
                    if(a==b || a==c){
                        System.out.println("Dos numeros son iguales");
                        error=error+2;
                        
                    }else{
                        if(a>c && a>c){
                            mayor=a;
                            if(b>c){
                                medio=b;
                                menor=c;
                            }
                        }
                        if(b>a && b>c){
                            mayor=b;
                            if(a>c){
                                medio=a;
                                menor=c;
                            }
                        }
                        if(c>a && c>b){
                            mayor=c;
                            if(b>a){
                                medio=b;
                                menor=a;
                            }
                        }
                    }
                }
                        break;
                    case 2:
                        if(error==1){
                            System.out.println("Los numeros Son iguales");
                        }else{
                            if(error==2){
                            System.out.println("Hay dos numeros iguales ");
                        }
                            else{
                                System.out.println("Mayor:  "+ mayor);
                                System.out.println("Medio:  "+ medio);
                                System.out.println("Menor:  "+ menor);
                            }
                        }
                        
                        break;
                    case 4:
                        break;
                }
                
                break;
            case 4:
                break;
            default:
            
        }
    }   
}
