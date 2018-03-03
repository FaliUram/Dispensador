/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Alison Ramos
 */
import java.util.Scanner;//importamos las librerias 
import static javafx.application.Platform.exit;
public class dispensador {
    
    public static void main(String[] args) { 
        // TODO code application logic here 
        
    int preMarga=0, cantMarga=30;
    int preGalleta=0, cantGalleta=10;
    int preChitos=0, cantChitos=30;
    int preChoco=0, cantChoco=10;
    int pregala=0, cantgala=20;
    int preChocola=0, cantChocola=25;
        int cont1=0,cont2=0, cont3=0, cont4=0, cont5=0,cont6=0;
        int precio=0;
        int cantidad=0;
        
        int selec;
        Scanner s=new Scanner(System.in);//lectura de dato ingresado 
        do{
            
                System.out.println("1.Papas Margarita");
                System.out.println("2.Galletas");
                System.out.println("3.Chitos");
                System.out.println("4.Chocorramo");
                System.out.println("5.Gala");
                System.out.println("6.Chocolatinas");
                System.out.println("7.Imprimir Ganancias");
                System.out.println("8.Imprimir Ventas");
                System.out.println("9.Salir");
            
            System.out.println("Escoja un producto"); 
            selec = s.nextInt();//almacenamiento de dato
        switch(selec){
                
            case 1:
                System.out.println("Precio: 2.000");
                preMarga=preMarga+2000;
                precio=precio+2000;
                cantMarga=cantMarga-1;
                cantidad=cantidad+1;
                cont1=cont1+1;

            break;
            case 2:
                System.out.println("Precio: 1.000");
                preGalleta=preGalleta+1000;
                precio=precio+1000;
                cantGalleta=cantGalleta-1;
                cantidad=cantidad+1;
                cont2=cont2+1;
                
            break;
            case 3:
                System.out.println("Precio: 2.000");
                preChitos=preChitos+2000;
                precio=precio+2000;
                cantChitos=cantChitos-1;
                cantidad=cantidad+1;
                cont3=cont3+1;
                
            break;
            case 4:
                System.out.println("Precio: 1.500");
                preChoco=preChoco+1500;
                precio=precio+1500;
                cantChoco=cantChoco-1;
                cantidad=cantidad+1;
                cont4=cont4+1;
                
            break;
            case 5:
                System.out.println("Precio: 1.400");
                pregala=pregala+1400;
                precio=precio+1400;
                cantgala=cantgala-1;
                cantidad=cantidad+1;
                cont5=cont5+1;
                
            break;
            case 6:
                System.out.println("Precio: 2.500");
                preChocola=preChocola+2500;
                precio=precio+2500;
                cantChocola=cantChocola-1;
                cantidad=cantidad+1;
                cont6=cont6+1;
                
            break;
            case 7:
                System.out.println("Ganancia Margarita "+ preMarga);
                System.out.println("Ganancia Galletas "+ preGalleta);
                System.out.println("Ganancia Chitos "+ preChitos);
                System.out.println("Ganancia Chocorramo "+ preChoco);
                System.out.println("Ganancia Gala "+ pregala);
                System.out.println("Ganancia Chocolatina "+ preChocola);
                System.out.println("Ganancia Total "+ precio);
            break;
            case 8:
                System.out.println("Ventas Margarita "+ cont1);
                System.out.println("Ventas Galletas "+ cont2);
                System.out.println("Ventas Chitos "+ cont3);
                System.out.println("ventas Chocorramo "+ cont4);
                System.out.println("Ventas Gala "+ cont5);
                System.out.println("Ventas Chocolatina "+ cont6);
                System.out.println("Ventas Total "+ cantidad);
                
            break;
            
        }
       }while(selec!=9); }
    }
    
    
    