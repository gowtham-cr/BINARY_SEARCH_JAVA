class Binary_search{
    static  int binary_search(int[]sorted_array,int num){
        int s=0;
        int e= sorted_array.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(sorted_array[mid]==num){
                return mid;
             }
            if (sorted_array[mid]<num) {
                s=mid+1;

            }
            else{
                e=mid-1;
            }

        }
        return-1;
    }
    public static void main(String[] args){
        int[]a={10,20,30,40,50,60,70,80,90,100};
        System.out.println(binary_search(a,80));
    }
}