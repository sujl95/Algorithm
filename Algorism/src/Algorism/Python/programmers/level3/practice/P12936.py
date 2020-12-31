def solution(n, k):
    from math import factorial
    answer = []
    array = list(range(1, n + 1))
    while n > 0:
        f = factorial(n-1)
        answer.append(array.pop(((k-1) // f)))
        n -= 1
        k %= f
    return answer


print(solution(3, 5))
