package Algorithm.kotlin.leetcode

// https://leetcode.com/problems/flatten-nested-list-iterator/

/**
 * LeetCode 341: Flatten Nested List Iterator
 *
 * 문제: 중첩된 정수 리스트를 순회하는 반복자 구현
 * 입력: [[1,1],2,[1,1]]
 * 출력: 1, 1, 2, 1, 1
 *
 * 접근 방법:
 * 1. 스택 기반 (권장) - 지연 평탄화, 메모리 효율적
 * 2. 재귀 기반 - 간단하지만 모든 요소 미리 전개
 * 3. Iterator 체이닝 - 함수형 접근
 */

// NestedInteger 인터페이스 정의 (LeetCode에서 제공)
interface NestedInteger {
    fun isInteger(): Boolean
    fun getInteger(): Int
    fun getList(): List<NestedInteger>
}

/**
 * 방법 1: 스택 기반 (권장)
 *
 * 시간 복잡도: O(N) - N은 전체 정수 개수
 * 공간 복잡도: O(D) - D는 최대 깊이
 *
 * 장점:
 * - 지연 평탄화(lazy evaluation)로 메모리 효율적
 * - next() 호출 시에만 처리
 * - 큰 중첩 구조에도 빠른 응답
 *
 * 동작 원리:
 * 1. 초기 리스트를 역순으로 스택에 저장
 * 2. hasNext() 호출 시 스택 최상단을 정수가 될 때까지 전개
 * 3. 리스트를 만나면 그 요소들을 역순으로 추가
 */
class NestedIterator341_Stack(nestedList: List<NestedInteger>) : Iterator<Int> {
    private val stack = ArrayDeque<NestedInteger>()

    init {
        // 역순으로 스택에 추가 (스택이므로 역순으로 넣어야 정순)
        for (i in nestedList.indices.reversed()) {
            stack.addLast(nestedList[i])
        }
    }

    override fun hasNext(): Boolean {
        // 스택의 맨 위를 정수가 될 때까지 평탄화
        while (stack.isNotEmpty()) {
            val top = stack.last()
            if (top.isInteger()) {
                return true
            }
            // 리스트라면 스택에서 제거하고 그 요소들을 역순으로 추가
            stack.removeLast()
            val list = top.getList()
            for (i in list.indices.reversed()) {
                stack.addLast(list[i])
            }
        }
        return false
    }

    override fun next(): Int {
        return stack.removeLast().getInteger()
    }
}

/**
 * 방법 2: 재귀를 이용한 사전 평탄화
 *
 * 시간 복잡도: O(N)
 * 공간 복잡도: O(N) - 모든 정수를 저장
 *
 * 장점:
 * - 구현이 간단하고 직관적
 * - 평탄화 로직이 명확함
 *
 * 단점:
 * - 모든 요소를 미리 전개해야 함
 * - 매우 큰 리스트에는 메모리 낭비
 */
class NestedIterator341_Recursive(nestedList: List<NestedInteger>) : Iterator<Int> {
    private val flatList = mutableListOf<Int>()
    private var index = 0

    init {
        flatten(nestedList)
    }

    private fun flatten(list: List<NestedInteger>) {
        for (item in list) {
            if (item.isInteger()) {
                flatList.add(item.getInteger())
            } else {
                flatten(item.getList())
            }
        }
    }

    override fun hasNext(): Boolean = index < flatList.size

    override fun next(): Int = flatList[index++]
}

/**
 * 방법 3: Iterator 체이닝
 *
 * 시간 복잡도: O(N)
 * 공간 복잡도: O(D)
 *
 * 특징:
 * - 함수형 프로그래밍 스타일
 * - 반복자를 재귀적으로 구성
 */
class NestedIterator341_Chain(nestedList: List<NestedInteger>) : Iterator<Int> {
    private var currentIterator: Iterator<Int>? = null
    private val listIterator = nestedList.iterator()

    override fun hasNext(): Boolean {
        while (true) {
            // 현재 반복자가 있고 요소가 남아있으면 true
            if (currentIterator != null && currentIterator!!.hasNext()) {
                return true
            }
            // 다음 NestedInteger를 가져옴
            if (!listIterator.hasNext()) {
                return false
            }

            val next = listIterator.next()
            currentIterator = if (next.isInteger()) {
                // 정수면 단일 요소 반복자로 변환
                listOf(next.getInteger()).iterator()
            } else {
                // 리스트면 재귀적으로 반복자 생성
                NestedIterator341_Chain(next.getList())
            }
        }
    }

    override fun next(): Int {
        return currentIterator!!.next()
    }
}

/**
 * 핵심 포인트 정리:
 *
 * Q: 왜 스택 기반을 추천하나?
 * A: 지연 평탄화로 불필요한 메모리 사용을 줄일 수 있기 때문
 *
 * Q: 스택 대신 큐를 쓰면?
 * A: 큐를 쓰면 BFS 방식이 되어 더 많은 메모리 필요 (같은 깊이의 모든 요소 저장)
 *
 * Q: 왜 역순으로 추가하나?
 * A: 스택은 LIFO이므로, 원래 순서대로 나오려면 역순으로 저장해야 함
 *
 * 테스트 케이스:
 * Input: [[1,1],2,[1,1]]
 * Expected Output: 1, 1, 2, 1, 1
 *
 * Input: [1,[4,[6]]]
 * Expected Output: 1, 4, 6
 *
 * Input: [[[]],1]
 * Expected Output: 1
 */
