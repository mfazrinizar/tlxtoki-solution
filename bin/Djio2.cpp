#include <iostream>
#include <vector>
#include <queue>

using namespace std;

int main() {
    int N;
    cin >> N;
    vector<int> A(N);
    priority_queue<pair<int, int>> pq;
    queue<pair<int, int>> rest;
    int time = 0, lastEaten = 0;

    for (int i = 0; i < N; i++) {
        cin >> A[i];
        if (A[i] > 0) {
            pq.push({A[i], i});
        }
    }

    while (!pq.empty() || !rest.empty()) {
        if (!pq.empty()) {
            if (pq.top().second != lastEaten) {
                lastEaten = pq.top().second;
                int remaining = pq.top().first - 1;
                pq.pop();
                if (remaining > 0) {
                    rest.push({remaining, lastEaten});
                }
            } else {
                rest.push(pq.top());
                pq.pop();
            }
        }
        if (pq.empty() && !rest.empty()) {
            while (!rest.empty()) {
                pq.push(rest.front());
                rest.pop();
            }
            lastEaten = -1;
        }
        time++;
    }

    cout << time << endl;

    return 0;
}
