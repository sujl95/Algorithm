n = int(input())
s = []
answer = ""
ck = True
for i in range(n):
    s.append(list(input()))

for i in range(len(s[0])):
    for j in range(1, n):
        if s[0][i] == s[j][i]:
            ck = True
        else:
            ck = False
            break
    if ck:
        answer += s[0][i]
    else:
        answer += "?"
print(answer)

