package com.example.practicafinalespresso;

/**
 * @author Sergio
 * <p>En esta clase se encuentran todos los metodos de conversion</p>
 *
 */
public class Conversor {

    /**
     * <p>Este metodo se encarga de convertir las millas a kilometros</p>
     * @param kms
     * @return el resultado de la conversion de millas a kilometros
     */
    public String millasAkms(String kms)
    {
        double millas=1.60934;
        double resultado = Double.valueOf(kms)/millas;
        return String.valueOf(resultado);

    }

    /**
     * <p>Este metodo se encarga de convertir los kilometros a millas</p>
     * @param millas
     * @return el resultado de la conversion de kilometros a millas
     */
    public String kmsAmillas(String millas)
    {
        double kms=1.60934;
        double resultado = Double.valueOf(kms)*Integer.valueOf(millas);
        return String.valueOf(resultado);
    }

    /**
     * <p>Este metodo se encarga de convertir celsius a fahrenheit</p>
     * @param celsius
     * @return el resultado de la conversion de celsius a fahrenheit
     */
    public String celsiusAFahrenheit(String celsius)
    {
        double resultado = (Double.parseDouble(celsius)*9/5)+32;
        return String.valueOf(resultado);
    }

    /**
     * <p>Este metodo se encarga de convertir fahrenheit a celsius</p>
     * @param fahrenheit
     * @return el resultado de la conversion de fahrenheit a celsius
     */
    public String fahrenheitACelsius(String fahrenheit)
    {
        double resultado = (Double.parseDouble(fahrenheit)-32)*5/9;
        return String.valueOf(resultado);
    }

    /*public String suma(String numero1, String numero2){
        int resultado = Integer.valueOf(numero1) + Integer.valueOf(numero2);
        return String.valueOf(resultado);

    }*/
}
