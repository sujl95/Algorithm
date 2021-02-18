def solution(numbers):
    answer = set()
    for i in range(0, len(numbers)):
        for j in range(1, len(numbers)):
            if i == j:
                continue
            else:
                answer.add(numbers[i]+numbers[j])
    return sorted(answer)


print(solution([2, 1, 3, 4, 1]))
