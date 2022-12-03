public class Main {
    static boolean isFind(int[] arr,int value){
        for (int i:arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] array={3,5,6,7,3,5,9,8,6,4,2,6,8,10};
        int[] duplicate=new int[array.length];
        int starIndex=0;

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                if (i!=j && array[i]==array[j] && array[i]%2==0){
                    if (!isFind(duplicate,array[i])){
                        duplicate[starIndex++]=array[i];
                    }
                    break;
                }
            }
        }
        for (int value:duplicate ){
            if (value!=0)
                System.out.println(value);
        }
    }
}
