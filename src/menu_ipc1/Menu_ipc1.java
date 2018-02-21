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
        //se declara para el cilo del case 2 para ver si hay dos iguales ingresados
        String [] Usuarios=new String[5];
        //se declara para los usuarios
        int [][] Notas=new int[6][6];
        //declaracion para notas case 3
        int a,b,c, mayor = 0, medio=0, menor=0,error=0 ;
        //se declaran las variables para numero mayo, medio, menor donde a b y c son valores ingresados
        int contdigitos=1;
        //contador de digitos
        limpiar limpio=new limpiar();
        //llama a la clase limpiar para que no se mire a amontonado, y de ntro de la clase 
        int contador_principal=1; 
        //variable principal del ciclo para que no se ciere el programa
        while(contador_principal==1){
            Scanner Ing_teclado = new Scanner(System.in);
        System.out.println("[IPC1]Tarea3_201701133");
        System.out.println("  ");
        System.out.println("1. Usuarios");
        System.out.println("2. Contador de Digitos");
        System.out.println("3. tres numeros de mayor a menor");
        System.out.println("4. Calcular Promedio");
        System.out.println("5. Salir");
        int opcion= Ing_teclado.nextInt();
        
        switch (opcion){
            //opcion de usuarios
            case 1:
                int contador_caso1=1;
                while(contador_caso1==1){
                    limpio.limpiartodo();
                    //llamamos para limpiar el menu principal
                    System.out.println("1. Ingresar Usuarios");
                    System.out.println("2. Mostrar Usuarios Ascendente");
                    System.out.println("3. Mostrar Usuarios Desendente");
                    System.out.println("4. Menu Principal");
                    int submenu2=Ing_teclado.nextInt();
                    switch(submenu2){
                        //caso para ingresar los usuacios
                        case 1:
                            for(int l=0;l<=4;l++){
                                int n=l+1;
                                System.out.println("Ingrese el Usuario No. "+ n );
                                String usu=Ing_teclado.next();
                                //usu es el nombre ingresado
                                Usuarios[l]=usu;
                                //lo introducciomos en la matris en la posicion l
                                int cn=0;
                                //contador para ver si se repite
                                for(int o=0;o<=4;o++){
                                    if(Usuarios[l].equals(Usuarios[o]))
                                    {
                                        cn++;
                                    }
                                    //comprobamos si se repite
                                    if(cn>=2){
                                        l--;
                                        System.out.println("Este Usuario ya se encuentra registrado");
                                        cn=0;
                                    }
                                    //manda un mensaje si se repite
                                }
                            }
                            break;

                            
                        case 2:
                            System.out.println("Usuarios ordenados ascendentemente");
                            int ascendente=4;
                            while(ascendente>=0){
                                System.out.println("Usuario No. "+ ascendente + "   "+Usuarios[ascendente] );
                                ascendente--;
                            }
                            System.out.println("Por favor ingrese 1 para regresar al submenu");
                            int tiempo=Ing_teclado.nextInt();
                            //se despliega de manera ascendente
                            break;
                            
                        case 3:
                            System.out.println("Ordenados en el orden que fueron ingresados");
                            for(int l=0;l<=4;l++){
                                System.out.println("Usuario No. "+ l + "   "+Usuarios[l] );
                            }
                            System.out.println("Por favor ingrese 1 para regresar al submenu");
                            int tiempocase2=Ing_teclado.nextInt();
                            //se despliega de manera descendente
                            break;
                        case 4:
                            limpio.limpiartodo();
                            contador_caso1--;
                            //sale del submenu y limpia
                            break;
                    default:
                        limpio.limpiartodo();
                        System.out.println("Ingrese Correctamente la Opcion");
                    }
                }
                break;
                
                
                
            case 2:
                limpio.limpiartodo();
                int contador_caso2=1;
                //variable del ciclo del caso 2
                while(contador_caso2==1){
                    System.out.println("1. Ingresar Numero ");
                    System.out.println("2. Mostrar Numero de Digitos");
                    System.out.println("4. Menu Principal");
                    int submenu2=Ing_teclado.nextInt();
                    switch (submenu2){
                        case 1:
                         System.out.println("Ingrese un numero");
                         int numing= Ing_teclado.nextInt();
                         //pide el numero
                          if(numing==0){
                            System.out.println("Solo tiene 1 Digito");
                            //para ver si solo tiene un digito en el caso de 0 sino tiene error el ciclo
                            }else{
                             if(numing>0 && numing<=100000 ){
                                 //rango pedido para el nomero
                                 while(j>0){
                                    numing=numing/10;
                        
                                    if(numing>=1 ){
                                        contdigitos++;
                                    }else{
                                        //aqui esta la variable j para cerrar el ciclo
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
                        //muestras los numeros de digitos
                        break;
                    case 4:
                        limpio.limpiartodo();
                        contador_caso2--;
                        //sale del submenu y limpia
                        break;
                    default:
                        limpio.limpiartodo();
                        System.out.println("Ingrese Correctamente la Opcion");
                }
                }
                
 
                break;
            case 3:
                //los valores de cada numero se representan en variables a(num 1), b (num2) y c(num3)
                limpio.limpiartodo();
                int contador_caso3=1;
                //variable del ciclo del caso 3
                while(contador_caso3==1){
                System.out.println("1. Ingresar Numeros");
                System.out.println("2. Mostrar ordenados");
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
                    //miramos si los numero son iguales
                    error++;
                }
                else{
                    if(a==b || a==c){
                        System.out.println("Dos numeros son iguales");
                        //miramos si dos numeros son iguales
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
                        //obtenetemos quien es mayor y menor
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
                                //desplegamos los resultados
                            }
                        }
                        
                        break;
                    case 4:
                        limpio.limpiartodo();
                        contador_caso3--;
                        //limpiamos y regresamos para el menu principal
                        break;
                    default:
                        limpio.limpiartodo();
                        System.out.println("Ingrese correctamente una opcion");
                }
                }
                
                break;
            case 4:
                int contador_caso4=1;
                //contador del ciclo del caso 3
                while(contador_caso4==1){
                    System.out.println("1. Ingresar Notas y Id");
                    System.out.println("2. Desplegar tabla");
                    System.out.println("4. Menu Principal");
                    int submenu4=Ing_teclado.nextInt();
                    switch(submenu4){
                        case 1:
                            for(int menunotas=1;menunotas<=4;menunotas++){
                                System.out.println("Ingrese Id (ingresar 3 numeros por la tabulacion)");
                                Notas[menunotas][0]=Ing_teclado.nextInt();
                                System.out.println("Ingrese Nota 1");
                                Notas[menunotas][1]=Ing_teclado.nextInt();
                                System.out.println("Ingrese Nota 2");
                                Notas[menunotas][2]=Ing_teclado.nextInt();
                                System.out.println("Ingrese Nota 3");
                                Notas[menunotas][3]=Ing_teclado.nextInt();
                                System.out.println("Ingrese Nota 4");
                                Notas[menunotas][4]=Ing_teclado.nextInt();
                                int prom= Notas[menunotas][4]+ Notas[menunotas][3] + Notas[menunotas][2] + Notas[menunotas][1] ;
                                prom=prom/4;
                                Notas[menunotas][5]=prom;
                                //ingresamos las notas y le sacamos la media, lo introduccimos todo a arrays bidimensionales
                            }
                            break;
                        case 2:
                            for(int menunotas=1;menunotas<=4;menunotas++){
                                int paradesplegar=0;
                                System.out.print(menunotas+ " || ");
                                //genera como un pequeño espacio estre el No. y el Id
                                while(paradesplegar<=5){
                                    System.out.print(Notas[menunotas][paradesplegar]+"  ");
                                    paradesplegar++;
                                }
                                System.out.println(" ");
                                //despreglamos la tabla de las notas
                                
                            }
                            break;
                        case 4:
                            limpio.limpiartodo();
                            contador_caso4--;
                            //se limpia y see regresa al menu principal
                            break;
                        default:
                            limpio.limpiartodo();
                            System.out.println("Ingrese correctamente una opcion");
                                    
                    }
                    
                }
                break;
            
            case 5:
                System.exit(0);
                //cerramos el programa 
                break;
            default:
                limpio.limpiartodo();
                System.out.println("Ingrese la opcion correctamente");
                //limpiamos y pedimos que ingrese  una opcion correcta
        }
      }
    }
}
