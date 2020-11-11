from collections import deque

n, m = 5, 6

edges = [
    [1, 0, 1, 0, 1, 0],
    [1, 1, 1, 1, 1, 1],
    [0, 0, 0, 0, 0, 1],
    [1, 1, 1, 1, 1, 1],
    [1, 1, 1, 1, 1, 1]
]
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]


def bfs(x, y):
    queue = deque()
    queue.append((x, y))
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            my = y + dy[i]
            if nx < 0 or nx >= n or my < 0 or my >= m:
                continue
            if edges[nx][my] == 0:
                continue
            if edges[nx][my] == 1:
                edges[nx][my] = edges[x][y] + 1
                queue.append((nx, my))

    return edges[n - 1][m - 1]


print(bfs(0, 0))
