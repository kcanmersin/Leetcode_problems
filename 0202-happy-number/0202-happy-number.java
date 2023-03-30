class Solution {
    public boolean isHappy(int n) {
        Set<Integer> hashMap = new HashSet<>();
        int c;
        int sum=0;
     
        int num =n;
        
        
        while(sum!=1)
        {
           
           
            sum=0;

              while(num>0)
        {
            
          
            sum+=((num%10)*(num%10));
            num=num/10;

        }
                        System.out.println(sum);
                         if(hashMap.contains(sum))
            {
                return false;
            }

          hashMap.add(sum);
         num=sum;
        
        }
      
        
      
            
        return true;
    }
}