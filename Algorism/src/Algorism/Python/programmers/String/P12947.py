def solution(x):
    return x % sum(list(map(int, list(str(x))))) == 0


input = 10
print(solution(input))