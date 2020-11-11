n, m = 4, 5
edges = [
    [0, 0, 1, 1, 0],
    [0, 0, 0, 1, 1],
    [1, 1, 1, 1, 1],
    [0, 0, 0, 0, 0]
]

visited = [[[False] * 5] * 4]


def dfs(x, y):
    if x < 0 or x >= n or y < 0 or y >= m:
        return False
    if edges[x][y] == 0:
        edges[x][y] = 1
        dfs(x - 1, y)
        dfs(x, y - 1)
        dfs(x + 1, y)
        dfs(x, y + 1)
        return True

    return False


cnt = 0
for i in range(n):
    for j in range(m):
        if dfs(i, j):
            cnt += 1


print(cnt)
