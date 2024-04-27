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
    pair<int, int> diameterFast(TreeNode* root){
        if(root==NULL){
            return {0,0};
        }
        pair<int, int>left= diameterFast(root->left);
        pair<int, int> right= diameterFast(root->right);
        int leftDiameter=left.first;
        int rightDiameter=right.first;
        int leftHeight=left.second;
        int rightHeight=right.second;
        
        int currentHeight=max(leftHeight,rightHeight)+1;
        
        int diameterThroughRoot=leftHeight + rightHeight;
        
        int currentDiameter =max({leftDiameter, rightDiameter, diameterThroughRoot});
        
        
        return {currentDiameter,currentHeight};
    }
    
    int diameterOfBinaryTree(TreeNode* root) {
        return diameterFast(root).first;
    }
};