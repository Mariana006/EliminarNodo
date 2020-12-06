package unoNodo;
import java.util.Scanner;

public class Nodouno {

    Scanner entrada=new Scanner(System.in);
    static class Nodo{
        String Dato;
        Nodo sig;
    }
    Nodo fin=null;
    public void Agregar(){
        Nodo tempo;

        System.out.println("Ingrese El Dato:");
        if(fin == null){
            fin=new Nodo();
            fin.Dato=entrada.nextLine();
            fin.sig=null;
        }
        else{
            tempo=new Nodo();
            tempo.Dato=entrada.nextLine();
            tempo.sig=fin;
            fin=tempo;
        }
    }
    public void Mostrar(){
     Nodo actual=new Nodo();
     actual=fin;
     if(fin !=null){
         while(actual !=null){
             System.out.println("Dato"+"["+actual.Dato+"]");
             actual=actual.sig;
         }       
     }
     else{
                 System.out.println("-------- Lista Vacia -------- ");
                 }
    }   
    public void Eliminar(){
        if(fin !=null){
            fin=fin.sig;
            System.out.println("-------- Nodo Eliminado -------- ");
        }
        else{
            System.out.print("Lista Vacia , No Hay Elementos a Eliminar -------- ");
        }
    }
    public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);
int opc=0;
String Dato;
 Nodouno no=new  Nodouno();
 do{
     System.out.println("-------- Menú Nodo --------");
     System.out.print("1. Agregar\n"
                    + "2. Mostrar\n"
                    + "3. Eliminar\n"
                    + "4. Salir\n");
     switch (opc=entrada.nextInt()){
         case 1:
             no.Agregar();
             break;
         case 2:
             no.Mostrar();
             break;         
         case 3:
             no.Eliminar();
             break;
     }
 } while(opc !=4);
 
    }   
}
