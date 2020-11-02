n, m = map(int, input().split())

result = 0

for i in range(n):
    data = list(map(int,input().split()))
    min_value = 10001
    for j in data:
        if min_value > j:
            min_value = j
result = min_value
print(result)

