//mirror image of tree
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
    void mirrorImage(struct TreeNode *root);
};

Solution::Solution(){}
void Solution::mirrorImage(struct TreeNode *root)
{
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

    if(root == NULL)
    {
        return;
    }


    stack<struct TreeNode *> s1;
    s1.push(root);
    while(!s1.empty())
    {
        struct TreeNode *node = s1.top();
        s1.pop();
        cout << node->data << " ";
        if(node->right)
        {
            s1.push(node->right);
        }
        if(node->left)
        {
            s1.push(node->left);
        }
    }
    cout << endl;
    return;
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
    sol.mirrorImage(root);
    return 0;
}
