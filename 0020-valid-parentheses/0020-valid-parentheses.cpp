class Solution {
public:  
bool isValid(string s) {
    stack<char> stck;
    for(char ch : s){
        if(ch == '('|| ch == '{' || ch == '['){
            stck.push(ch);
        }else
        {
            if(stck.empty()) 
            {
             return false;
            }
            if(ch == ')' && stck.top() != '(')
            {
             return false;
            }
            if(ch == '}' && stck.top() != '{')
            {
             return false;
            }
            if(ch == ']' && stck.top() != '[')
            {
             return false;
            }
            stck.pop();
        }
    }
    return stck.empty();
}
};