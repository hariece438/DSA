public class FinishMaximumJobs {
    public int solve(int[] A, int[] B) {
        int [][]res=new int[A.length][2];
        for(int i=0;i<A.length;i++){
            res[i][0]=A[i];
            res[i][1]=B[i];
        }
        Arrays.sort(res,(a,b) -> 
        if(a[1]!=b[1]) {
            return a[1]-b[1];
        } else {
            return a[0]-b[0];
        }
        );

        int count=1;
        int lastFinish=res[0][1];

        for(int i=1;i<A.length;i++){
            if(res[i][0]>=lastFinish){
                count++;
                lastFinish=res[i][1];
            }
        }
        return count;

    }
}
