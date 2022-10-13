public class ArraySorting {

    public static void main(String[] args) {
        int[] arr={2,34,12,54,23};
        int temp;
        //using bubble sort mechanismwe will compare two values and swap
        //outer for loop to move one index and compare
        for(int i=0;i<6;i++){
            for(int j=i+1;j<5;j++){
                if( arr[i]> arr[j]){
                    //swap
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=0;i<5;i++){
            System.out.println(arr[i]);
        }



    }}
