class Solution {
public:
    int nearestValidPoint(int x, int y, vector<vector<int>>& points) {
        int min=INT_MAX;
     
        int r=-1;
        for(int a=0;a<points.size();a++)
        {
            if((abs(x - points[a][0]) + abs(y - points[a][1])<min) &&(x==points[a][0] ||y==points[a][1]) )
            {
                min=abs(x - points[a][0]) + abs(y - points[a][1]);
               r=a;
            }
        }
        
  
        return r;
    }
};