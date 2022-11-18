
package back;

public class Main {
   
    public static void main(String[] args) {
         Valores objRectangulo = new Valores();
         
         objRectangulo.setFuncion("sqrt(x^3+1)");
         objRectangulo.setLimiteInferior(1);
         objRectangulo.setLimiteSuperior(2);
         objRectangulo.setNumeroRectangulos(4);
         System.out.println(objRectangulo.mostrar_Datos());
    }
}
