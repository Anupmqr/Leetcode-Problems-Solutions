class Solution {
public:
    int maxWidthOfVerticalArea(vector<vector<int>>& points) {
        int result =0;
        vector<int> temp;

        for(int i=0; i<points.size(); i++){
            temp.push_back(points[i][0]);
        }

        sort(temp.begin(),temp.end());

    for(int i=0; i<temp.size()-1; i++){
            if(result < temp[i+1] - temp[i])
            result = temp[i+1] - temp[i];
        }
    return result;
    }
};
