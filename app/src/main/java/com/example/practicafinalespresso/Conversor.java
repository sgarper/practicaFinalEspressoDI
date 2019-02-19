package com.example.practicafinalespresso;

public class Conversor {

    public String millasAkms(String kms)
    {
        double millas=1.60934;
        double resultado = Double.valueOf(kms)/millas;
        return String.valueOf(resultado);

    }
    public String kmsAmillas(String millas)
    {
        double kms=1.60934;
        double resultado = Double.valueOf(kms)*Integer.valueOf(millas);
        return String.valueOf(resultado);
    }

    public String celsiusAFahrenheit(String celsius)
    {
        double resultado = (Double.parseDouble(celsius)*9/5)+32;
        return String.valueOf(resultado);
    }

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
