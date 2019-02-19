package com.example.practicafinalespresso;

public class Conversor {

    public String millasAkms(String kms)
    {
        double millas=0.621371;
        double resultado = Double.valueOf(kms)/Double.valueOf(millas);
        return String.valueOf(resultado);
    }
    public String kmsAmillas(String millas)
    {
        double kms=0.621371;
        double resultado = Double.valueOf(kms)*Double.valueOf(millas);
        return String.valueOf(resultado);
    }

    public String celsiusAFahrenheit(String celsius)
    {
        int resultado = (Integer.parseInt(celsius)*9/5)+32;
        return String.valueOf(resultado);
    }

    public String fahrenheitACelsius(String fahrenheit)
    {
        int resultado = (Integer.parseInt(fahrenheit)-32)*5/9;
        return String.valueOf(resultado);
    }
}
