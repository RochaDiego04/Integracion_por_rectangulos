package back;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Valores {

    //Atributos
    private String funcion;//Limite
    private double limiteInferior;//a
    private double limiteSuperior;//b
    private double base;//BASE RECTANGULO
    private double altura;//ALTURA RECTANGULO
    private int numeroRectangulos;//n
    private double deltaX;//h=(superior - inferio)/numeroRectangulos
    private double[] iteraciones;//La cantidad de iteraciones que se realizarán
    private double[] evaluaciones;//Cantidad de evaluaciones por iteración.

    //getters y setters
    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public double getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(double limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public double getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(double limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getNumeroRectangulos() {
        return numeroRectangulos;
    }

    public void setNumeroRectangulos(int numeroRectangulos) {
        this.numeroRectangulos = numeroRectangulos;
    }

    public double getDeltaX() {
        return deltaX;
    }

    public void setDeltaX(double deltaX) {
        this.deltaX = deltaX;
    }

    public double[] getIteraciones() {
        return iteraciones;
    }

    public double getIteraciones(int i) {
        return iteraciones[i];
    }

    public void setIteraciones(double[] iteraciones) {
        this.iteraciones = iteraciones;
    }

    public double[] getEvaluaciones() {
        return evaluaciones;
    }

    public double getEvaluaciones(int i) {
        return evaluaciones[i];
    }

    public void setEvaluaciones(double[] evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    public void calcular_DeltaX() {
        setDeltaX((getLimiteSuperior() - getLimiteInferior()) / getNumeroRectangulos());
    }

    public double calcular_Area() {
        double area;
        area = (getBase() * getAltura());
        return area;
    }

    private void iteraciones() {

        this.calcular_DeltaX();
//        this.iteraciones[0] = this.getLimiteInferior();
        this.iteraciones = new double[this.getNumeroRectangulos()]; // 7

        for (int i = 0; i < this.getNumeroRectangulos(); i++) {
            this.iteraciones[i] += this.iteraciones[i] + this.getDeltaX();//Entra la iteración con su valor.
        }
    }

    private void evaluaciones() {
        Expression expression;
        this.iteraciones();
        
        for (int i=0; i <= this.getNumeroRectangulos(); i++) {
            expression = new ExpressionBuilder(this.getFuncion()) 
                    .variables("X")
                    .build()
                    .setVariable("X", iteraciones[i]);
            
            evaluaciones[i] = expression.evaluate();//Evalúa nuestra función.
        }
    }

    //Calcular extremo izquierdo
    public double por_Izquierda() {
        double suma = 0;
        double resultado = 0;
        evaluaciones();
        for (int i = 0; i < getNumeroRectangulos(); i++) {
            suma += getEvaluaciones(i);
        }
        resultado = getDeltaX() * suma;
        
        return resultado;
    }

    //Calcular extremo derecho
    public double por_Derecha() {
        double suma = 0;
        double resultado = 0;
        
        for (int i = 1; i <= getNumeroRectangulos(); i++) {
            suma += evaluaciones[i];
        }
        resultado = getDeltaX() * suma;
        
        return resultado;
    }
    
    public String mostrar_Datos() {
        String datos = "";
        
        datos += "Funcion :" + getFuncion() + "\n" + 
                 "Limite Inferior:" + getLimiteInferior()+ "\n" +
                 "Limite Superior: " + getLimiteSuperior() + "\n" +
                 "Numero de rectangulos: " + getNumeroRectangulos() + "\n";
        return datos;
    }   

}
