def solution(board, moves):
    answer = 0
    stack = []
    for m in range(len(moves)):
        j = moves[m]-1
        for i in range(len(board)):
            if board[i][j] != 0:
                if stack and stack[-1] == board[i][j]:
                    stack.pop()
                    answer += 2
                else:
                    stack.append(board[i][j])
                board[i][j] = 0
                break
    return answer


solution([[0, 0, 0, 0, 0], [0, 0, 1, 0, 3], [0, 2, 5, 0, 1], [4, 2, 4, 4, 2], [3, 5, 1, 3, 1]],
         [1, 5, 3, 5, 1, 2, 1, 4])
