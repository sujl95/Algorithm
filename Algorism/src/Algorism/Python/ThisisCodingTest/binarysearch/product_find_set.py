# n = int(input())
# array = set(map(int, input().split()))
n = 5
array = set([8, 3, 7, 9, 2])
m = 3
target = [5, 7, 9]

for i in target:
    if i in array:
        print('yes',end=' ')
    else:
        print('no', end=' ')
