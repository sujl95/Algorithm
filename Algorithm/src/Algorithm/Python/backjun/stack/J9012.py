for i in range(int(input())):
    s = input()
    stack = []
    ck = True
    for c in s:
        if c == '(':
            stack.append(c)
        else:
            if len(stack) > 0:
                stack.pop()
            else:
                ck = False
                break
    if len(stack) > 0:
        ck = False
    # if ck:
    #     print("YES")
    # else:
    #     print("NO")
    print("YES") if ck else print("NO")
