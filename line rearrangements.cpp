#include <iostream>
#include <string>
using namespace std;

void permute(string str, int l, int r) {
    if (l == r) {
        cout << str << endl;  // Вывод перестановки
    } else {
        for (int i = l; i <= r; i++) {
            swap(str[l], str[i]);       // Меняем местами символы
            permute(str, l + 1, r);    // Рекурсивный вызов для оставшейся части
            swap(str[l], str[i]);       // Возвращаем символы обратно (откат)
        }
    }
}

int main() {
    string s = "abc";
    permute(s, 0, s.size() - 1);
    return 0;
}
