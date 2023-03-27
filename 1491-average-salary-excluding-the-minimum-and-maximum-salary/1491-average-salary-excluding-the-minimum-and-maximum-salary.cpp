class Solution {
public:
    double average(vector<int>& salary) {
        
        double max=salary[0];
        double min=salary[0];
        
        for(int a=1; a<salary.size();a++)
        {
            if(salary[a]>max)
            {
                max=salary[a];
            }
            if(salary[a]<min)
            {
                min=salary[a];
            }
        }
        double sum=0;
        cout<<max<<" "<<min<<endl;
        for(int a=0; a<salary.size();a++)
        {
            if(salary[a]!=max && salary[a]!=min)
            {
                cout<<salary[a]<<endl;
                sum+=salary[a];
            }
        }
        cout<<"sum "<<sum;
        return (sum/(salary.size()-2));
    }
};