def solution(d, budget):
    answer = 0
    for i in d:
        if i <= budget:
            budget -= i
            answer += 1
        else:
            break
    return answer
