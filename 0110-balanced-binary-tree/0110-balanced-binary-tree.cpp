/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int height(TreeNode* root){
        if(root==NULL) return 0;
        int left=height(root->left);
        int right=height(root->right);
        if(left==-1 || right==-1 || abs(left-right)>1) return -1;
        int depth=max(left,right)+1;
        return depth;
    }
    
    bool isBalanced(TreeNode* root) {
        if(root==NULL) return true;
        if(height(root)==-1) return false;
        return true;
    }
};