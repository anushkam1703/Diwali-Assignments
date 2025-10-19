#include <iostream>
using namespace std;
#include <string>


// read strings
void ipStrings(string arr[], int n) {
    for (int i = 0; i < n; i++) {
        cout << "Enter string " << i + 1 << ": ";
        cin >> arr[i]; 
    }
}

//find longest string length
int longestString(string arr[], int n) {
    int maxLen = 0;
    for (int i = 0; i < n; i++) {
        if (arr[i].length() > maxLen)
            maxLen = arr[i].length();
    }
    return maxLen;
}

int main() {
    int n;
    cout << "enter the number of strings: ";
    cin >> n;

    string arr[100]; 
    ipStrings(arr, n);                         // input strings

    int longest = longestString(arr, n);      // find longest string 
    cout << "Length of the string: " << longest << endl;

    return 0;
}