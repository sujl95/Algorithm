def solution(s):
    answer = False
    p, y = 0, 0

    s = s.lower()
    for i in s:
        if i == 'p':
            p += 1
        elif i == 'y':
            y += 1
    if p == y:
        return True
    else:
        return answer


str = 'pPoooyY'

solution(str)
