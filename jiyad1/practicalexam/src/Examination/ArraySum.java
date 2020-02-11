package Examination;

public class ArraySum {
	public static void main(String[] args) {
        double[] arr = {10, 12.89, 16.5, 200, 13.7};
        double total = 0;

        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }
        
        System.out.format("The sum is: %.2f", total);
    }
}
