# N = int(input())
# array = list(map(int, input().split())).sort()
# M = int(input())
# target = list(map(int, input().split())).sort()
# 이진 탐색 소스코드 구현(반복문)
def binary_search(array, target, start, end):
    while start <= end:
        mid = (start + end) // 2
        # 찾은 경우 중간점 인덱스 반환
        if array[mid] == target:
            return mid
        # 중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인
        elif array[mid] < target:
            start = mid + 1
        # 중간점의 값보다 찾고자 하는 값이 작은 경우 오른쪽 확인
        else:
            end = mid - 1


N = 5
array = [8, 3, 7, 9, 2]
M = 3
target = [5, 7, 9]
for i in target:
    result = binary_search(array, i, 0, N - 1)
    if result is not None:
        print('yes', end=' ')
    else:
        print('no', end=' ')

