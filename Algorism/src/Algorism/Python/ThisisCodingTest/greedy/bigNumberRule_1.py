str = "5 8 3"
str1 = "2 4 5 4 6"


# n, m, k = map(int, input().split())
n, m, k = map(int, str.split())

data = list(map(int, str1.split()))

data.sort()

first = data[n-1]
second = data[n-2]

'''
6 6 6 5
6 6 6 5
'''
count = int(m / (k+1)) * k
count += m % (k+1)


result = 0
result += count * first
result += (m-count) * second

print(result)