//All about leaf nodes...
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
    void boundaryTraversal(struct TreeNode *root);
    void printLeft(struct TreeNode *root);
    void printRight(struct TreeNode *root);
    void printLeaf(struct TreeNode *root);
};

Solution::Solution(){}
void Solution::printLeft(struct TreeNode *root)
{
    if(root)
    {
        if(root->left)
        {
            cout << root->data << " ";
            printLeft(root->left);
        }
        else if(root ->right)
        {
            cout << root->data << " ";
            printLeft(root->right);
        }
    }
    return;
}
void Solution::printRight(struct TreeNode *root)
{
    if(root)
    {
        if(root->right)
        {
            printRight(root->right);
            cout << root->data << " ";
        }
        else if(root->left)
        {
            printRight(root->left);
            cout << root->data << " ";
        }
    }
    return;
}
void Solution::printLeaf(struct TreeNode *root)
{
     if(root)
    {
        if(root->left)
        {
            printLeaf(root->left);
        }
        if(root->left == NULL && root->right == NULL)
        {
            cout << root->data << " ";
        }
        if(root->right)
        {
            printLeaf(root->right);
        }
    }
    return;
}
void Solution::boundaryTraversal(struct TreeNode *root)
{
    if(root)
    {
       // cout << root->data << endl;
        printLeft(root);
        printLeaf(root);
        printRight(root);
    }
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
    sol.boundaryTraversal(root);
    return 0;
}
