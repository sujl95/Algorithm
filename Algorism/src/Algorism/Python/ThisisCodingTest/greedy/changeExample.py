n = int(input())
count = 0
arr = [500,100,50,10]

for coin in arr:
    count += n
    n %= coin


print(count)
