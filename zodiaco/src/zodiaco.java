import java.util.Scanner;
public class zodiaco {
public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in);
     int mes,dia;
     System.out.println("Bienvenido.Ingresa los datos que se te piden para mostrar tu signo zodiacal");
     
do{
     System.out.println("Ingresa el mes en que naciste: ");
       mes=teclado.nextInt();
       if(mes<1||mes>12)
         System.out.println("Las estrellas me dicen que ese mes no existe;Ingrese otro mes: ");
} while(mes<1||mes>12);
     

 do{ System.out.println("Ingresa el dia en que naciste: ");
     dia=teclado.nextInt();
    if(mes==2 && dia>29){
         System.out.println("El dia que ingresaste no existe prueba con otro:");
    dia=32;}
   else
        if ((mes == 4 || mes == 6  || mes == 9  || mes == 11) && dia == 31) {
                System.out.println("El dia que ingresaste no existe.");
                dia=32;
        }
          else
              if (dia>31) {
                System.out.println("El dia que ingreso no existe.");
                dia=32;
            }
    }while(dia<1||dia>31);  
 
 if((mes==12&&(dia>21&&dia<31))&&(mes==1&&(dia>=1&&dia>21)))
        System.out.println("Eres capricornio");
 else
     if (mes==1&&(dia>20&&dia<=32)&&(mes==2&&(dia>=1&&dia>=20)))
        System.out.println("Acuario");
     else 
         if(mes==2&&(dia>=19&&dia<=30)||(mes==3&&(dia>=1&&dia>=21)))
             System.out.println("Eres Piscis");
         else
             if(mes==3&&(dia>=20&&dia<=32)||(mes==4&&(dia>=1&&dia>=21)))
                 System.out.println("Eres Aries");
             else 
                 if(mes==4&&(dia>=20&&dia<=31)||(mes==5&&(dia>=1&&dia>=22)))
                     System.out.println("Eres tauro");
                 else
                     if(mes==5&&(dia>=21&&dia<32)||(mes==6&&(dia>=1&&dia>=22)))
                         System.out.println("Eres Geminis");
                     else 
                         if(mes==6&&(dia>=21&&dia<=31)&&(mes==7&&(dia>=1&&dia>=24)))
                             System.out.println("Eres una mamada: Cancer ¬¬");
                        else
                             if(mes==7&&(dia>=23&&dia<32)||(mes==8&&(dia>=1&&dia>=24)))
                                 System.out.println("Eres Leo");
                           else
                              if(mes==8&&(dia>=23&&dia<32)&&(mes==9&&(dia>=1&&dia>=24)))
                                  System.out.println("Eres Virgo");
                              else 
                                  if(mes==9&&(dia>=23&&dia<=31)||(mes==10&&(dia>=1&&dia<=24)))
                                      System.out.println("Eres libra");
                                   else
                                      if(mes==10&&(dia>=23&&dia<=32)&&(mes==11&&(dia>=1&&dia<=23)))
                                          System.out.println("Eres escorpio");
                                      else
                                          if(mes==11&&(dia>=22&&dia<=31)||(mes==12&&(dia>=1&&dia<=22)))
                                              System.out.println("Eres sagitario");
 
                                         
                                        
    }
}

