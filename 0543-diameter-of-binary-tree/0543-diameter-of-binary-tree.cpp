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
    pair<int, int> diameterFast(TreeNode* root) {
    if (root == NULL) {
        return {0, 0};
    }
    pair<int, int> left = diameterFast(root->left);
    pair<int, int> right = diameterFast(root->right);
    int height = max(left.second, right.second) + 1;
    int dia = max(max(left.first, right.first), left.second + right.second);  // Changed line
    return {dia, height};
}
    int diameterOfBinaryTree(TreeNode* root) {
        return diameterFast(root).first;
    }
};