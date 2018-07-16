#include <cstdio>
using namespace std;

class Solution{
private:
public:
    Solution();
};
Solution::Solution(){}
int main(int argc, char ** argv)
{
    puts("loop test");
    for (int i = 0; argv[i]; i++) {
        printf("%d: %s\n", i, argv[i]);
    }
    return 0;
}
