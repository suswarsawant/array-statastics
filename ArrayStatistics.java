
import java.util.Arrays;
public class ArrayStatistics {

	public static void main(String[] args) {
		ArrayStatistics obj=new ArrayStatistics();
		int[] numbers=new int[args.length];
		for(int i=0;i<args.length;i++) {
			numbers[i]=Integer.parseInt(args[i]);
		}
		System.out.println("Converted number array : ");
		System.out.println(Arrays.toString(numbers));

		int SumArray=obj.sumArray(numbers);
		System.out.println("The sum of numbers in the array : "+SumArray);
		
		int Average=(obj.sumArray(numbers))/numbers.length;
		System.out.println("The average of numbers in the array : "+Average);
		
		int MinValue=obj.minValueArray(numbers);
		System.out.println("The minimum value in the array : "+MinValue);
		
		int MaxValue=obj.maxValueArray(numbers);
		System.out.println("The maximum value in the array : "+MaxValue);
		
		System.out.println("Frequency of each element : ");
		countFrequencyOfEachElement(numbers);
		
		System.out.print("Median : "+obj.calculateMedian(numbers));
		
	}
	
	private int sumArray(int[] numbers) {
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum+=numbers[i];
		}
		return sum;
	}
	
	private int minValueArray(int[] numbers) {
		int min=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]<min) {
				min=numbers[i];
			}
		}
		return min;
	}
	
	private int maxValueArray(int[] numbers) {
		int max=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
		}
		return max;
	}
	
	private static void countFrequencyOfEachElement(int[] numbers){
	    boolean visited[] = new boolean[numbers.length];
	    Arrays.fill(visited, false);
	    for (int i = 0; i < numbers.length; i++) {
	        if (visited[i] == true) {
	        	continue;
	        }
	            
	        int count = 1;
	        for (int j = i + 1; j < numbers.length; j++) {
	            if (numbers[i] == numbers[j]) {
	                visited[j] = true;
	                count++;
	            }
	        }
	        System.out.println(numbers[i] + "--->" + count);
	    }
	}
	
	private double calculateMedian(int[] numbers) {
		double median=numbers[0];
		int len=numbers.length;
		if(len%2==1)
		{
			median=numbers[(len+1)/2-1];
		}
		else if(len%2==0)
		{
			median=(double)(numbers[len/2-1]+numbers[len/2])/2;
		}
		return median;
	}
	
}