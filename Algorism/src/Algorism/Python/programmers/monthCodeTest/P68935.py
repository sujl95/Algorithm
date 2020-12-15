def solution(n):
    answer = 0
    l = []
    while n > 0:
        l.append(n % 3)
        n //= 3
    j = len(l)
    for i in range(len(l)):
        answer += l[i] * (3 ** (j - 1))
        j -= 1
    return answer


print(solution(125))
