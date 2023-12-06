class Solution {
    public int totalMoney(int n) {

        int i=1,j=0,sum=0,count=1,su=1;
        while(i!=n+1)
        {
            if(j==7)
            {
                su++;
                count=su;
                sum+=count;
                count++;
                j=1;
            }
            else
            {
                sum+=count;
                count++;
                j++;
            }
            i++;
        }
        return sum;
    }
}
