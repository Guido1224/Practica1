
package Practica1;

import java.util.Scanner;


public class Practica1 {

   
    public static void main(String[] args) {
     //Ejercicio 1 : Serie fibonacci
     
    Scanner entrada = new Scanner (System.in);
    System.out.print("Ingrese un numero para la serie");
    
    int n = entrada.nextInt();
    
    int f=0;
    int t1=1;
    int t2;    
    
    for (int i=1 ;i<=n;i++){     
      
    t2 = f;
    f = t1+f;
    t1 = t2;    
        
        System.out.print(t1);
    }
    
  //  Ejercicio 2 :
    
      Scanner entrada = new Scanner (System.in);
    System.out.print("Ingrese un numero para la serie");
    
    int n = entrada.nextInt();
    
    int f=0;
    int t1=1;
    int t2;    
    
    System.out.print("Serie Fibonacci: ");
    
    for (int i=1 ;i<=n;i++){     
      
    t2 = f;
    f = t1+f;
    t1 = t2;    
        
        System.out.print(t1+" ");
    }
        int ultimoDigito = f%10;
        
        System.out.print("El ultimo digito de la serie de " + n + " es : " + ultimoDigito );
        
        
    //    Ejercicio 3 : MCD
        
         Scanner entrada = new Scanner (System.in);
        
         System.out.print("Ingrese dos enteros , separados por un espacio");
         
        int a =entrada.nextInt();
        int b =entrada.nextInt();
        
      int mcd = calcularMCD(a, b);
         System.out.println("MCD(" + a + ", " + b + ") = " + mcd);         
    }  
    public static int  calcularMCD(int a, int b){
             
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
         }  
    return a;

// Ejercicio 4 : MCM

Scanner entrada = new Scanner (System.in);

 System.out.print("Ingrese dos enteros a y b separados por un espacio: ");
 
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        
        int mcm = (a * b) / calcularMCD(a, b);
        
          System.out.println("MCM(" + a + ", " + b + ") = " + mcm);
    }
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    
   // Ejercicio 5 :
      Scanner entrada = new Scanner(System.in);
        
       System.out.print("Ingrese dos enteros, separados por un espacio");
        long n = entrada.nextLong();
        int m = entrada.nextInt();
        
        long resultado = fibonacciMod(n, m);
       
        System.out.println(resultado);
    }
  
    public static long fibonacciMod(long n, int m) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long[][] matriz = {{1, 1}, {1, 0}};
        long[][] resultado = {{1, 0}, {0, 1}}; // Matriz identidad
    
        while (n > 0) {
            if (n % 2 == 1) {
                resultado = multiplicarMatrices(resultado, matriz, m);
            }
            matriz = multiplicarMatrices(matriz, matriz, m);
            n /= 2;
        }
        return resultado[0][1];
    }
    
    public static long[][] multiplicarMatrices(long[][] a, long[][] b, int m) {
        long[][] resultado = new long[2][2];
        resultado[0][0] = (a[0][0] * b[0][0] + a[0][1] * b[1][0]) % m;
        resultado[0][1] = (a[0][0] * b[0][1] + a[0][1] * b[1][1]) % m;
        resultado[1][0] = (a[1][0] * b[0][0] + a[1][1] * b[1][0]) % m;
        resultado[1][1] = (a[1][0] * b[0][1] + a[1][1] * b[1][1]) % m;
        return resultado;
   
    
    //Ejercicio 6 : suma ultimo digito
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese un numero para la serie");
      
        long n = entrada.nextLong();
        int resultado = ultimoDigitoSumaFibonacci(n);
      
        System.out.println("El resultado de la suma de los digitos es:" +resultado);
    }
    
    public static int ultimoDigitoSumaFibonacci(long n) {
       
        if (n == 0) return 0;
        
        long f1 = 0; 
        long f2 = 1; 
        
        for (long i = 2; i <= n + 2; i++) {
            long f3 = (f1 + f2) % 10; 
            f1 = f2;
            f2 = f3;
        }
        return (int)((f2 - 1 + 10) % 10); 
    }
}

    //Ejercicio 7 :
    
   Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese dos enteros no negativos, separados por un epacio:");
        long m = entrada.nextLong();
        long n = entrada.nextLong();
       
        int resultado = ultimoDigitoSumaParcialFibonacci(m, n);
       
        System.out.println("El ultimo digito de la suma es :"+Zresultado);
    }
    

    public static int ultimoDigitoSumaParcialFibonacci(long m, long n) {
        int fnPlus2 = calcularFibonacciMod(n + 2);
        int fmPlus1 = calcularFibonacciMod(m + 1);
        
   
        return (fnPlus2 - fmPlus1 + 10) % 10; 
    }
    
    public static int calcularFibonacciMod(long k) {
        if (k == 0) return 0;
        if (k == 1) return 1;
        
        long f1 = 0; // F(0)
        long f2 = 1; // F(1)
        
        
        for (long i = 2; i <= k; i++) {
            long f3 = (f1 + f2) % 10;
            f1 = f2;
            f2 = f3;
        }
        
        return (int)f2;
    }
  }
}
    

    
    

    
    
    

