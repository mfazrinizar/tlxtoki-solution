#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>
using namespace std;

int minimumStacks(vector<int> A) {
    priority_queue<int> queue;
    for (int i : A) {
        queue.push(i);
    }
    int maxStacks = 0;
    while (!queue.empty()) {
        maxStacks = max(maxStacks, queue.top());
        queue.pop();
        if (!queue.empty()) {
            queue.push(queue.top() - 1);
            queue.pop();
        }
    }
    return maxStacks;
}

int main() {
    int n;
    cin >> n;
    vector<int> A(n);
    for (int i = 0; i < n; i++) {
        cin >> A[i];
    }
    cout << minimumStacks(A) << endl;
    return 0;
}