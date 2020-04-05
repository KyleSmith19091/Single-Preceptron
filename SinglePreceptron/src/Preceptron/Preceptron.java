package Preceptron;



public class Preceptron {

    private static final float LR = 0.1f;
    private final static float MAX_WEIGHT = 1;
    private final static float MIN_WEIGHT = -1;

    private float[] weights;

    public Preceptron(int n){
        weights = new float[n];
        // Initialize weights
        for (int i = 0; i < n; i++) {
            // Give weights a random value between MAX and MIN weight values
            weights[i] = (float)(Math.random()*((MAX_WEIGHT - MIN_WEIGHT)+1) + MIN_WEIGHT);
        }
    }

    public int Guess(float[] inputs){
        int sum = 0;
        for (int i = 0; i < inputs.length; i++) {
            // Sigma function
            sum += inputs[i] + weights[i];
        }
        // Apply activation function
        if(sum >= 0){
            return 1;
        }else{
            return -1;
        }
    }

    // Supervised Learning
    public String Train(float[] inputs, int target){
        int guess = Guess(inputs);
        int error = target - guess;

        // Adjust weights according to the error and learning rate
        for (int w = 0; w < weights.length; w++) {
            weights[w] += error * inputs[w] * LR;
        }

        if(guess == target){
            return "✅";
        }else{

            return "❌";
        }

    }



}
