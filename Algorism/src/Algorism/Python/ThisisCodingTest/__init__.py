# # 리스트에서 특정 값의 원소를 모두 제거하기
# a = [1,2,3,4,5,5,5]
#
#
# #remove_List에 포함되지 않은 값 만을 저장
# remove_set = {3,5}
# result = [i for i in a if i not in remove_set]
#
#
# print(result)

# # 리스트의 인덱싱과 슬라이싱
# a = "Hello"
# b = "World"
# print(a + " " + b)
#
# a = "String"
# print(a * 3)
#
# a = "ABCDEF"
# print(a[2:4])

# a = (1,2,3,4)
# print(a)
# a[2] = 7

# #사전 자료형
#
# data = dict()
#
# data['사과'] = 'Apple'
# data['바나나'] = 'Banana'
# data['코코넛'] = 'Coconut'
#
# print(data)
#
# if '사과' in data:
#     print("'사과'를 키로 가지는 데이터가 존재합니다.")
#
# print(list(data.keys()))
# print(list(data.values()))
# print(data.keys())
# print(data.values())


# #사전 자료형 관련 함수
#
# data = dict()
#
# data['사과'] = 'Apple'
# data['바나나'] = 'Banana'
# data['코코넛'] = 'Coconut'
#
# # 키 데이터만 담은 리스트
# key_list = data.keys()
# # 값 데이터만 담은 리스트
# value_list = data.values()
# print(key_list)
# print(value_list)
#
# # 각 키에 따른 값을 하나씩 출력
# for key in key_list:
#     print(data[key])

# #집합 자료형
#
# #집합 자료형 초기화 방법1
# data = set([1,2,3,4,4,5,])
# print(data)
#
# #집합 자료형 초기화 방법2
# data = {1,1,2,3,4,4,5}
# print(data)


# # 정수 1이 존재하는지 확인
# a = {1,2,3}
#
# a.add(3)
#
# print(1 in a)

# #집합 자료형
# a= set([1,2,3,4,5])
# b = set([3,4,5,6,7])
#
# #합집합
# print(a | b)
#
# #교집합
# print(a & b)
#
# #차집합
# print(a - b)


# #집합 자료형 관련 함수
# data = set([1,2,3])
# print(data)
#
# #새로운 원소 추가
# data.add(4)
# print(data)
#
# #새로운 원소 여러개 추가
# data.update([5,6])
# print(data)
#
# #특정한 값을 갖는 원소 삭제
# data.remove(3)
# print(data)

# a = ['H', 'e', 'l', 'l', 'o']
#
# print(set(a))


# a = [1,2,3]
#
# #append 뒤에 붙여준다
# a.append(4)
# print(a)
#
# #넣고 정렬
# a = {0,1,2,5}
#
# a.add(4)
# print(a)

# #입력을 위한 전형적인 소스코드 1)
#
# #데이터의 개수 입력
# n = int(input())
# #각 데이터를 공백을 기준으로 구분하여 입력
# data = list(map(int, input().split()))
#
# print(n)
# print(data)


# 입력: 1 2 3 4 5
# input().split() : ['1','2','3','4','5']
# map(int , input().split()): map([1,2,3,4,5])

# a = list(map(int, input().split()))
# print(a)

# a,b,c,d,e = map(int, input().split())
#
# print(a,b,c,d,e)


# '''
# 3
# 4
# 0 0 0 0
# 0 0 0 0
# 0 0 0 0
# 0 0 0 0
# '''
#
# n = int(input())
# m = int(input())
#
# arr = []
# for i in range(n):
#     arr.append(list(map(int,input().split())))
#
# print(arr)

# import sys
# # 문자열 입력 받기
# data = sys.stdin.readline().rstrip()
# print(data)

# # 자주 사용되는 표준 출력 방법
# print(8, end=' ')
# print(10)

# # 출력할 변수들
# a = 1
# b = 2
# print(a, b)
# print(7, end=" ")
# print(8, end=" ")
#
# # 출력할 변수
# answer = 7
# print(" 정답은 "+str(answer) + "입니다.")

# a = 10
#
# if a > 7 :
#     print(a)
#     print("출력 완료")
# print("조건문 끝")

# 성적 구간에 따른 학점 출력 예시

# score = 85
#
# arr = ["A","B","C","F"]
#
# if score >= 90:
#     print("학점: "+arr[0])
# elif score >= 80:
#     print("학점: "+arr[1])
# elif score >= 70:
#     print("학점: "+arr[2])
# else :
#     print("학점: "+arr[3])

# a = 7
# if 0 <= a and a <= 10:
#     print("a는 0이상 10 이하입니다.")


# a = 10
#
# if a > 5:
#     pass # 나중에 작성
# else:
#     print("else")

# 조건문의 간소화

# score = 85
#
# result = "합격" if score >= 80 else "불합격"
#
# print(result)

# # 1부터 9까지 각 정수의 합 구하기
#
# i = 1
# result = 0
#
# # i 가 9보다 작거나 같을 때 아래 코드를 반복적으로 실행
# while i <= 9:
#     result += i
#     i += 1
#
# print(result)

# # 1부터 9까지 홀수의 합 구하기
#
# i = 1
# result = 0
#
# # i 가 9보다 작거나 같을 때 아래 코드를 반복적으로 실행
# while i <= 9:
#     if i % 2 == 1:
#         result += i
#     i += 1
#
# print(result)

# for i in range(1, 100, 3):
#     print(i)

# def add(a,b):
#     return a + b
#
# print(add(3,7))


# a = 0
#
# def func():
#     global a
#     a += 1
#
# for i in range(10):
#     func()
#
#
# print(a)

# def operator(a, b):
#     add_var = a + b
#     subtract_var = a - b
#     multiply_var = a * b
#     divide_var = a / b
#     return add_var, subtract_var, multiply_var, divide_var
#
# a , b , c , d = operator(7, 3)
# print(a,b,c,d)


# # 람다 표현식
# def add(a, b):
#     return a + b
#
# # 일반적인 add() 메서드 사용
# print(add(3,7))
#
# # 람다 표현식으로 구현한 add() 메서드
# print((lambda a,b: a + b)(3,7))


# array = [('홍길동', 50),('이순신', 32),('아무개', 74)]
#
# def my_key(x):
#     return x[1]
#
# print(sorted(array, key=my_key))
# print(sorted(array, key=lambda x: x[1]))

# list1 = [1,2,3,4,5]
# list2 = [6,7,8,9,10]
#
# result = map(lambda a, b: a + b, list1, list2)
#
# print(list(result))

# # 자주 사용되는 내장 함수
#
# # sum()
# result = sum([1,2,3,4,5])
# print(result)
#
# # min(), max()
# min_result = min(7, 3, 5, 2)
# max_result = max(7, 3, 5, 2)
# print(min_result, max_result)
#
# # eval()
# result = eval("(3+5)*7")
# print(result)

# # sorted()
# result = sorted([9, 1, 8, 5, 4])
# reverse_result = sorted([9, 1, 8, 5, 4], reverse=True)
# print(result)
# print(reverse_result)
#
# # sorted() with key
# array = [('홍길동', 35), ('이순신', 75), ('아무개', 50)]
# result = sorted(array, key=lambda x: x[1], reverse=True)
# print(result)

# from itertools import permutations
# data = ['A','B','C] # 데이터 준비
#
# result = list(permutations(data, 3)) # 모든 순열 구하기
# print(result)

# from itertools import combinations
#
# data = ['A', 'B', 'C'] # 데이터 준비
#
# res = list(combinations(data, 2))# 2개를 뽑는 모든 조합 구하기
# print(res)

# from itertools import product
#
# data = ['A','B','C'] # 데이터 준비
#
# result = list(product(data, repeat=2)) # 2개를 뽑는 모든 순열 구하기(중복 허용)
# print(result)
#
# from itertools import combinations_with_replacement
#
# data = ['A', 'B', 'C'] # 데이터 준비
#
# result = list(combinations_with_replacement(data,2)) # 2개를 뽑는 모든 조합 구하기(중복 허용)
#
# print(result)