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
    void dfs(struct TreeNode *root);
    void bfs(struct TreeNode *root);
    void preOrder(struct TreeNode *root);
    void postOrder(struct TreeNode *root);
    void inOrder(struct TreeNode *root);
    void leaf(struct TreeNode *root);
};
Solution::Solution(){}
void Solution::preOrder(struct TreeNode *root)
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
        cout << node->data << " ";
        if(node->right)
        {
            s.push(node->right);
        }
        if(node->left)
        {
            s.push(node->left);
        }
    }
    cout << endl;
    return;
}
void Solution::inOrder(struct TreeNode *root)
{
    if(root == NULL)
    {
        return;
    }
    stack<struct TreeNode *> s;
    struct TreeNode *ptr = root;
    while(!s.empty() || ptr)
    {
        if(ptr)
        {
            s.push(ptr);
            ptr = ptr->left;
        }
        else{
            struct TreeNode *node = s.top();
            s.pop();
            cout << node->data<< " ";
            ptr = node->right;
        }
    }
    cout << endl;
    return;
}
void Solution::postOrder(struct TreeNode *root)
{
    if(root == NULL)
    {
        return;
    }
    stack<struct TreeNode *> s1;
    stack<struct TreeNode *> s2;
    s1.push(root);
    while(!s1.empty())
    {
        struct TreeNode *node = s1.top();
        s1.pop();
        s2.push(node);
        if(node->left)
        {
            s1.push(node->left);
        }
        if(node->right)
        {
            s1.push(node->right);
        }
    }
    while(!s2.empty())
    {
        cout << s2.top()->data << " ";
        s2.pop();
    }
    return;
}

void Solution::bfs(struct TreeNode *root)
{
    queue<struct TreeNode *> q;
    q.push(root);
    while(!q.empty())
    {
        struct TreeNode *node = q.front();
        q.pop();
        cout << node->data << " ";
        if(node->left)
        {
            q.push(node->left);
        }
        if(node->right)
        {
            q.push(node->right);
        }
    }
    cout <<  endl;
    return;
}
void Solution::dfs(struct TreeNode *root)
{
    stack<struct TreeNode *> s;
    s.push(root);
    while(!s.empty())
    {
        struct TreeNode *node = s.top();
        s.pop();
        cout << node->data << " ";
        if(node->left)
        {
            s.push(node->left);
        }
        if(node->right)
        {
            s.push(node->right);
        }
    }
    cout << endl;
    return;
}
void Solution::leaf(struct TreeNode *root)
{
    if(root == NULL)
    {
        return;
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

    sol.preOrder(root);
    sol.inOrder(root);
    sol.postOrder(root);


    return 0;
}
