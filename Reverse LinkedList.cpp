#include<bits/stdc++.h>
using namespace std;

struct List{
    int data;
    struct List *next;
    List(int val) : data(val), next(NULL){}
};
class Solution{
private:
public:
    Solution();
    struct List *reverseLinkedList(struct List *head);
};
Solution::Solution(){}
struct List *Solution::reverseLinkedList(struct List *head)
{
    struct List *prev = NULL;
    struct List *current = head;
    struct List *next;
    while(current != NULL)
    {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }
    return prev;
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    Solution sol;
    struct List *head = new List(2);
    head->next = new List(4);
    head->next->next = new List(14);
    head->next->next->next = new List(19);
    head->next->next->next->next = new List(24);
    head->next->next->next->next->next = new List(35);

    struct List *ans = sol.reverseLinkedList(head);
    while(ans != NULL)
    {
        cout << ans->data << " ";
        ans = ans->next;
    }
    cout << endl;
    return 0;
}
