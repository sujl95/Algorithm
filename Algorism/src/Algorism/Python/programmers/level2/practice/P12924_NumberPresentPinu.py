"""
시작 시간 2020.01.30.00:20
종료시간  2020.01.30.00:47

1 = 1
2 = 2, 3 (1 + 2)
3 = 3, 5(3+ 2), 6 (3+ 1)
4 = 4, 7, 9, 10
5 = 5, 9, 12, 14, 15
6 = 6, 11, 15, 18, 20, 21
7 = 7, 13, 18, 22, 25, 27, 28
8 = 8, 15, 21, 26, 30, 33, 35, 36

1. n => (n//2) + 1 ~ 1 까지를 스택에 넣자
2. 하나씩 꺼내서 누적합에 더한다. 
   n보다 크면 제일 큰 숫자를 빼고 계속 진행
   n이랑 같으면 answer += 1
"""

def solution(n):
    answer = 1
    cur = 0
    max_num = n//2 + 1

    for i in range(n//2 + 1, 0, -1):
        if cur == n:
            answer += 1
        elif cur + i > n:
            cur -= max_num
            max_num -= 1

        cur += i

    if cur == n:
        answer += 1

    return answer