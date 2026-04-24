// Last updated: 4/24/2026, 8:14:04 AM
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    int binToDec(string str) {
        int ans = 0, len = str.length();
        for (int i = len - 1; i >= 0; --i) {
            ans += (str[len - i - 1] - '0') * pow(2, i);
        }
        return ans;
    }
    int getDecimalValue(ListNode* head) {
        string binStr = "";
        ListNode *temp = head;
        while (temp != nullptr) {
            int item = temp->val;
            binStr += to_string(item);
            temp = temp->next;
        }
        int dec = binToDec(binStr);
        return dec;
    }
};