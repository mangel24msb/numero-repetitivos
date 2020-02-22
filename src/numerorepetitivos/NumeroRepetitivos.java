
package numerorepetitivos;


public class NumeroRepetitivos {

    public static void main(String[] args) {
        
        int[]numeros = {2,2,1,4,4,5,5,3};
        int[]contador = new int[6];
        
        for (int i = 0; i < numeros.length; i++) {
            contador[numeros[i]]+=1;
            
        }
        
        for (int j = 0; j < contador.length; j++) {
            System.out.println("numero "+j+":"+contador[j]+" veces");
            
        }
      
    }
   
    
}
