# N을 입력 받기
n = int(input())

# N명의 학생 정보를 받아 리스트에 저장
array = []
for i in range(n):
    data = input().split()
    # 이름은 문자열 그대로, 점수는 정수형으로 변환하여 저장
    array.append((data[0], int(data[1])))

# 키(Key)를 이용하여, 점수를 기준으로 정렬
array = sorted(array, key=lambda student: student[1])

# 정렬이 수행된 결과를 출력
for student in array:
    print(student[0], end=' ')
