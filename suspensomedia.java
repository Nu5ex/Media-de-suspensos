# Media-de-suspensos
public class suspensomedia {
  public static void main (String[] args) {
    float[] numeros = {5.5f, 9f, 2f, 10f, 4.9f, 4f, 3.5f, 8f};
    
    float sum = 0;
    float suspendidos = 0;
    float mitjana = 0;

    for (int i = 0; i < numeros.length - 1; i++) {
      for(int j = i + 1; j < numeros.length; j++) {
        if (numeros[i] > numeros[j]) {
          float aux = numeros[i];
          numeros[i] = numeros[j];
          numeros[j] = aux;
        }
      }
    }
    
    System.out.print("L’array ordenat és: [");
    for (int i = 0; i < numeros.length;i++) {
      System.out.print(numeros[i] + " ");
    }
    System.out.println("]");
      for (int x = 0;x<numeros.length;x++ ) {
        if (numeros[x]<5) {
          sum = sum + numeros[x];
          suspendidos = suspendidos + 1;
          mitjana = sum / suspendidos;
      }
    }
    System.out.print("La media de los suspensos és: "+ mitjana);
  }
