#include <vector>
#include <string>
#include <algorithm>
using namespace std;

vector<string> generatePermutations(string str) {
    vector<string> result;
    sort(str.begin(), str.end());
    
    do {
        result.push_back(str);
    } while (next_permutation(str.begin(), str.end()));
    
    return result;
}
