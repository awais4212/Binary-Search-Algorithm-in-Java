class bs{

    int beg, end, mid, key;
    int [] arr = {1, 3, 12, 14, 23, 34, 55, 65, 75, 78};

    public bs (){
        key = 34;
        beg = 0;
        end = arr.length - 1;
    }

    void binarySearch(){
        for(int i=0; i<arr.length; i++){
            mid = (beg + end) / 2;

            if (arr[mid]== key){
                System.out.println("found at Index: " + mid);
                return;

            }
            else if(arr[mid]<key){
                beg = mid+1;

            }
            else {
                end = mid -1;

            }
        }
        System.out.println(key + " is not present in the Array");
    }
}
public class Binary_Search {
    public static void main(String[] args) {

        bs b = new bs();

        b.binarySearch();
    }
}
