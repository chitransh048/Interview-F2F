

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
    void verticalOrderTraversalwithRootAtCenter(struct TreeNode *root);
};

Solution::Solution(){}
void Solution::verticalOrderTraversalwithRootAtCenter(struct TreeNode *root)
{
    if(root == NULL)
    {
        return;
    }
    set<int> s;
    cout << root->data << " ";
    queue<pair<struct TreeNode *, int> > q;
    q.push(make_pair(root, 0));
    while(!q.empty())
    {
        pair<struct TreeNode *, int> p = q.front();
        q.pop();
        struct TreeNode *node = p.first;
        int hd = p.second;

        if(node->left)
        {
            q.push(make_pair(node->left, hd-1));
            if(s.find(hd-1) == s.end())
            {
                cout << node->left->data << " ";
                s.insert(hd-1);
            }
        }
        if(node->right)
        {
            q.push(make_pair(node->right, hd+1));
            if(s.find(hd+1) == s.end())
            {
                cout << node->right->data << " ";
                s.insert(hd+1);
            }
        }
    }
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
    sol.verticalOrderTraversalwithRootAtCenter(root);
    return 0;
}
