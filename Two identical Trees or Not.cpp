// Tow trees are mirror image of each other...

#include<bits/stdc++.h>
using namespace std;

struct TreeNode{
    int data;
    struct TreeNode *left;
    struct TreeNode *right;
    TreeNode(int val) : data(val), left(NULL), right(NULL){}
};

class Solution
{
private:
public:
    Solution();
    void identicalImage(struct TreeNode *root1, struct TreeNode *root2);
};

Solution::Solution(){}
void Solution::identicalImage(struct TreeNode *root, struct TreeNode *root2)
{
    //found the mirror image of root...
    if(root == NULL)
    {
        return;
    }
    stack<struct TreeNode *> s;
    s.push(root);
    while(!s.empty())
    {
        struct TreeNode *node = s.top();
        s.pop();
        if(node)
        {
            s.push(node->left);
            s.push(node->right);
            swap(node->left, node->right);
        }
    }

    //now checking for identical image...
    queue<struct TreeNode *> q1;
    queue<struct TreeNode *> q2;

    while(!q1.empty() && !q2.empty())
    {
        struct TreeNode *node1 = q1.front();
        q1.pop();
        struct TreeNode *node2 = q2.front();
        q2.pop();

        if(node1 == NULL && node2 == NULL)
        {
            continue;
        }
        if(node1 == NULL || node2 == NULL)
        {
            cout << "Not Identical " << endl;
        }
        if(node1->data != node2->data)
        {
            cout << "No Identical "<< endl;
        }
        q1.push(node1->left);
        q1.push(node1->right);
        q2.push(node2->left);
        q2.push(node2->right);
    }
    cout << "Yes !!! They are Identical" <<endl;


}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    Solution sol;
    struct TreeNode *root = new TreeNode(20);
    root->left = new TreeNode(18);
    root->right = new TreeNode(28);
    root->left->left = new TreeNode(16);
    root->left->right = new TreeNode(19);
    root->left->left->left = new TreeNode(10);
    root->left->left->right = new TreeNode(17);
    root->right->left = new TreeNode(24);
    root->right->right = new TreeNode(30);
    root->right->left->left = new TreeNode(27);
    root->right->left->right = new TreeNode(26);
    root->right->right->right = new TreeNode(32);
    root->right->right->left = new TreeNode(29);
    sol.identicalImage(root , root);
    return 0;
}
