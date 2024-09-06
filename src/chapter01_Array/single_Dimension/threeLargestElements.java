package chapter01_Array.single_Dimension;

// Question :  find the largest three elements in the array.

public class threeLargestElements {
    public static void main(String[] args) {
        int[] arr =  {13,27,63,74,95,40,32,80};

        int firstMax = Integer.MIN_VALUE;
        int secondtMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] > firstMax){
                secondtMax = firstMax;
                firstMax = arr[i];
            }
            else if(arr[i] > secondtMax && arr[i] != firstMax){
                thirdMax = secondtMax;
                secondtMax = arr[i];
            }
            else if(arr[i] > thirdMax && arr[i] != secondtMax && arr[i] != firstMax ){
                thirdMax = arr[i];
            }
        }

        System.out.println("First max Number in the Array : "+ firstMax);
        System.out.println("Second max Number in the Array : "+ secondtMax);
        System.out.println("Second max Number in the Array : "+ thirdMax);

    }
}
