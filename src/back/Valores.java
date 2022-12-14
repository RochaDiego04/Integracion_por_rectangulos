package back;

import java.text.DecimalFormat;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Valores {

    //Atributos
    private String funcion;//Limite
    private double limiteInferior;//a
    private double limiteSuperior;//b
    private double aproximacion;
    private double base;//BASE RECTANGULO
    private double altura;//ALTURA RECTANGULO
    private int numeroRectangulos;//n
    private double deltaX;//h=(superior - inferio)/numeroRectangulos
    private double[] iteraciones;//La cantidad de iteraciones que se realizarán
    private double[] evaluaciones;//Cantidad de evaluaciones por iteración.
    private String FIX;

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
    
    public double getAproximacion() {
        return aproximacion;
    }

    public void setAproximacion(double aproximacion) {
        this.aproximacion = aproximacion;
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
        this.numeroRectangulos = numeroRectangulos + 1;
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

    public String getFIX() {
        return FIX;
    }

    public void setFIX(String FIX) {
        this.FIX = FIX;
    }

    public void calcular_DeltaX() {
        setDeltaX((getLimiteSuperior() - getLimiteInferior()) / (getNumeroRectangulos() - 1));
    }

    public void iteraciones() {
        this.calcular_DeltaX();
        this.iteraciones = new double[this.getNumeroRectangulos()];
        this.iteraciones[0] = this.getLimiteInferior();
        for (int i = 1; i < getNumeroRectangulos(); i++) {
            this.iteraciones[i] = this.iteraciones[i - 1] + this.getDeltaX();
        }
    }

    public void evaluaciones() {
        Expression expression;
        this.iteraciones();
        this.evaluaciones = new double[this.getNumeroRectangulos()];
        for (int i = 0; i < this.getNumeroRectangulos(); i++) {
            expression = new ExpressionBuilder(this.getFuncion())
                    .variables("x")
                    .build()
                    .setVariable("x", getIteraciones(i));

            evaluaciones[i] = expression.evaluate(); //Evalúa nuestra función.
        }
    }
    
    public void calcular_FIX(){
        String cadena = "0.";
        if(Integer.parseInt(this.getFIX()) > 0){
            for (int i = 0; i < Integer.parseInt(this.getFIX()); i++) {
                cadena = cadena + "0";
            }
         DecimalFormat FIX = new DecimalFormat(cadena);
         this.setAproximacion(Double.parseDouble(FIX.format(this.getAproximacion())));
        }
    }

    //Calcular extremo izquierdo
    public void por_Izquierda() {
        double suma = 0;

        evaluaciones();
        for (int i = 0; i < getNumeroRectangulos() - 1; i++) {
            suma += getEvaluaciones(i);
        }

        this.setAproximacion(getDeltaX() * suma);
    }

    //Calcular extremo derecho
    public void por_Derecha() {
        double suma = 0;

        evaluaciones();
        for (int i = 1; i < getNumeroRectangulos(); i++) {
            suma += getEvaluaciones(i);
        }

        this.setAproximacion(getDeltaX() * suma);
    }

    public String mostrar_Datos() {
        String datos = "";

        datos += "Funcion :" + getFuncion() + "\n"
                + "Limite Inferior:" + getLimiteInferior() + "\n"
                + "Limite Superior: " + getLimiteSuperior() + "\n"
                + "Numero de rectangulos: " + getNumeroRectangulos() + "\n"
                + "Ingrese el Fix a utilizar: " + getFIX();
        return datos;
    }

}
