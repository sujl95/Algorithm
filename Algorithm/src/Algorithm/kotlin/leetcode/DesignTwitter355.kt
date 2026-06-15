package Algorithm.kotlin.leetcode

private class DesignTwitter355 {
    class Twitter {
        val userMap = mutableMapOf<Int, User>()
        var sequence = 0


        fun postTweet(userId: Int, tweetId: Int) {
            val user = userMap.getOrPut(userId) { User(userId) }
            sequence += 1
            user.addTwitter(tweetId, sequence)
        }

        fun getNewsFeed(userId: Int): List<Int> {
            val user = userMap[userId] ?: return emptyList()
            val result = mutableListOf<Tweet>()
            result.addAll(user.twitters)
            user.followers.forEach {
                val followee = userMap[it]
                followee?.twitters?.forEach { tweet ->
                    result.add(tweet)
                }
            }
            return result.sortedByDescending { it.time }.take(10).map { it.id }
        }

        fun follow(followerId: Int, followeeId: Int) {
            if (followeeId == followerId) return
            val follower = userMap.getOrPut(followerId) { User(followerId) }
            follower.follow(followeeId)
        }

        fun unfollow(followerId: Int, followeeId: Int) {
            if (followeeId == followerId) return
            val follower = userMap.getOrPut(followerId) { User(followerId) }
            follower.unfollow(followeeId)
        }
    }

    class User(val id: Int) {
        val twitters = LinkedHashSet<Tweet>()
        val followers = LinkedHashSet<Int>()

        fun addTwitter(tweetId: Int, sequence: Int) {
            val tweet = Tweet(tweetId, sequence)
            twitters.add(tweet)
        }

        fun follow(followeeId: Int) {
            followers.add(followeeId)
        }
        fun unfollow(followeeId: Int) {
            followers.remove(followeeId)
        }
    }

    data class Tweet(val id: Int, val time: Int)
}
