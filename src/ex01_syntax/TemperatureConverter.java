class TemperatureConverter {

    public static void main(String[] args){
        double celsius = 25.0;
        double celsius2 = 38.23;

        double fahrenheit = 120.12;
        double fahrenheit2 = 329.0;

        double f = TemperatureConverter.celsiusToFahrenheit(celsius);
        double f2 = TemperatureConverter.celsiusToFahrenheit(celsius2);

        double c = TemperatureConverter.fahrenheitToCelsius(fahrenheit);
        double c2 = TemperatureConverter.fahrenheitToCelsius(f2);

        double k = TemperatureConverter.celsiusToKelvin(c);

        System.out.printf(celsius + " C = %.2f F%n", f);
        System.out.printf(celsius2 + " C = %.2f F%n", f2);

        System.out.printf(fahrenheit + " F = %.2f C%n", c);
        System.out.printf(fahrenheit2 + " F = %.2f C%n", c2);

        System.out.printf(celsius + " C = %.2f K", k);
    }

    public static double celsiusToFahrenheit(double c){
        return (c * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double f){
        return (f - 32) * 5/9;
    }

    public static double celsiusToKelvin(double c){
        return c + 273.15;
    }
}