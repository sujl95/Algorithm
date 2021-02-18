n1 = 5
str1 = "R R R U D D"

# n = int(input())
n = int(n1)
# arr = map(str,input().split())
arr = str1.split()

x,y = 1,1

for i in arr:
    if i == "R":
        if y+1 != n+1:
            y += 1
    if i == "L":
        if y-1 != 0:
            y -= 1
    if i == "U":
        if x-1 != 0:
            x -= 1
    if i == "D":
        if x+1 != n+1:
            x += 1

print(x,y)




