# 현재 나이트 위치 받기
input_data = input()
row = int((input_data[1]))-1
column = int(ord(input_data[0])-97)
steps = [(-2, -1), (-1, -2), (1, -2), (2, -1), (2, 1), (1, 2), (-1, 2), (-2, 1)]
cnt = 0
for step in steps:
    if 0 <= row + step[0] <= 7 and 0 <= column + step[1] <= 7:
        cnt += 1
print(cnt)