public class DistributeCandy {
    public int candy(int[] A) {
        int length = A.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int[] result = new int[length];
        int maxCandy=0;

        left[0]=1;
        for(int i=1;i<length;i++){
            if(A[i]>A[i-1]){
                left[i]=left[i-1]+1;
            } else {
                left[i]=1;
            }
            
        }

        right[length-1]=1;
        for(int i=length-2;i>=0;i--){
            if(A[i]>A[i+1]){
                right[i]=right[i+1]+1;
            } else {
                right[i]=1;
            }
        }

        for(int i=0;i<length;i++){
            result[i]=Math.max(left[i],right[i]);
            maxCandy =maxCandy+result[i];
        }
        return maxCandy;
    }
}
