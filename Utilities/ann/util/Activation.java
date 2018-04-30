/**
 * Author  : Conor Lorsung
 * Purpose : This project is a proof of concept Artificial Neural Network (ANN)
 */

package ann.util;

public interface Activation {

    public static double logThreshold(double val, boolean derive) {
        if(derive) {
            return (val*(1-val));
        } else {
            return (1/(1+Math.exp(-val)));
        }
    }

    public static double linThreshold(double[] weights) {
        return 0.0;
    }

    public static double stpThreshold(double[] weights) {
        return 0.0;
    }
}