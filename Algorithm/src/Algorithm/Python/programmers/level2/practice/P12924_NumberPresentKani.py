def solution(n):
    count = 0
    for i in range(1, n):
        mid = n // i
        l = i // 2 if i % 2 == 0 else (i - 1) // 2
        s = 0

        if i % 2 == 0:
            # s = sum([e for e in range(mid - l + 1, mid + l + 1)])
            s = (2 * mid + 1) * l
        else:
            # s = sum([e for e in range(mid - l, mid + l)]) + mid
            s = mid * l + mid

        if s == n:
            count += 1


    return count