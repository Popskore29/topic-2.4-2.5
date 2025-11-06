def permute(s, step=0):
    if step == len(s):
        print("".join(s))  # Вывод перестановки
    for i in range(step, len(s)):
        s[step], s[i] = s[i], s[step]      # Меняем символы местами
        permute(s, step + 1)                # Рекурсивный вызов для следующей позиции
        s[step], s[i] = s[i], s[step]      # Откат для следующей итерации

string = "abc"
permute(list(string))
