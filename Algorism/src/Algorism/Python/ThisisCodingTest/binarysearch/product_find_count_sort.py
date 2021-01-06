# n = int(input())
n = 5
array = [0] * 1000000
product = [8, 3, 7, 9, 2]
# for i in input().split():
for i in product:
    array[int(i)] = 1

# m = int(input())
# x = list(map(int, input().split()))
m = 3
x = [5, 7, 9]

for i in x:
    if array[i] == 1:
        print('yes', end=' ')
    else:
        print('no', end=' ')
