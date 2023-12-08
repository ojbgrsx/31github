class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = Math.round((celsius+273.15)*100000)/100000.0;
        double fahrenheit = Math.round((celsius*1.80+32.00)*100000)/100000.0;
        double[] arr = {kelvin,fahrenheit};
        return arr;
    }
}
