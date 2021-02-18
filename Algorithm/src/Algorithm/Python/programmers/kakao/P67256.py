def find_func(keypad, i):
    for x in range(4):
        for y in range(3):
            if keypad[x][y] == i:
                return [x, y]


def solution(numbers, hand):
    answer = ''
    keypad = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9],
        ['*', 0, '#']
    ]
    left = [3, 0]
    right = [3, 2]
    for i in numbers:
        if i in (3, 6, 9):
            answer += 'R'
            right = find_func(keypad, i)
            print(right)
        elif i in (1, 4, 7):
            answer += 'L'
            left = find_func(keypad, i)
            print(left)
        else:
            now = find_func(keypad, i)
            left_comparison = abs(now[0] - left[0]) + abs(now[1] - left[1])
            right_comparison = abs(now[0] - right[0]) + abs(now[1] - right[1])
            if left_comparison > right_comparison:
                right = now
                answer += 'R'
            elif left_comparison < right_comparison:
                left = now
                answer += 'L'
            else:
                if hand == 'right':
                    right = now
                    answer += 'R'
                else:
                    left = now
                    answer += 'L'
    return answer


numbers2 = [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]
hand2 = "left"
print(solution(numbers2, hand2))