package com.leetcode.s206_reverse_list;

import org.junit.Test;
import java.util.Arrays;
import org.junit.Assert;

public class SolutionTest {

    @Test
    public void reverseListTest() {
        Solution solution = new Solution();
        Assert.assertEquals(Arrays.asList(5, 4, 3, 2, 1), solution.reverseList(ListNode.fromList(Arrays.asList(1, 2, 3, 4, 5))).toList());
        Assert.assertEquals(Arrays.asList(2, 1), solution.reverseList(ListNode.fromList(Arrays.asList(1, 2))).toList());
        Assert.assertEquals(Arrays.asList(), solution.reverseList(ListNode.fromList(Arrays.asList())).toList());
    }

    @Test
    public void reverseListTest2() {
        Solution solution = new Solution();
        Assert.assertEquals(Arrays.asList(5, 4, 3, 2, 1), solution.reverseList2(ListNode.fromList(Arrays.asList(1, 2, 3, 4, 5))).toList());
        Assert.assertEquals(Arrays.asList(2, 1), solution.reverseList2(ListNode.fromList(Arrays.asList(1, 2))).toList());
        Assert.assertEquals(Arrays.asList(), solution.reverseList2(ListNode.fromList(Arrays.asList())).toList());
    }

}