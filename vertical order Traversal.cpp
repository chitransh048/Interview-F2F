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
    void verticalOrderTraversal(struct TreeNode *root);
};

Solution::Solution(){}
void Solution::verticalOrderTraversal(struct TreeNode *root)
{
    if(root == NULL)
    {
        return;
    }
    map<int, vector<int> > mp;
    queue<pair<struct TreeNode *, int> > q;
    q.push(make_pair(root, 0));
    while(!q.empty())
    {
        pair<struct TreeNode *, int> p = q.front();
        q.pop();
        struct TreeNode *node = p.first;
        int hd = p.second;
        mp[hd].push_back(node->data);
        if(node->left)
        {
            q.push(make_pair(node->left, hd-1));
        }
        if(node->right)
        {
            q.push(make_pair(node->right, hd+1));
        }
    }
    vector<vector<int> > ans;
    for(map<int, vector<int> >::iterator iter = mp.begin(); iter != mp.end(); iter++)
    {
        ans.push_back(iter->second);
    }
    for(int iter = 0; iter < ans.size(); iter++)
    {
        for(int jter = 0; jter < ans[iter].size(); jter++)
        {
            cout << ans[iter][jter] << " ";
        }
        cout << endl;
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
    sol.verticalOrderTraversal(root);
    return 0;
}
