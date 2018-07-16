#include<bits/stdc++.h>
using namespace std;

class Solution
{
private:
	int i;
public:
    Solution();
    void setValue(const int x)
    {
        i = x;
    }
    int getValue() const{
        return i;
    }
};
Solution::Solution(){}
int main(int argc, char ** argv)
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
	int i = 47;
	Solution object1;
	object1.setValue(i);
	printf("The value is %d\n", object1.getValue());
	return 0;
}
