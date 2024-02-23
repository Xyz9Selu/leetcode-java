package com.leetcode.m328_odd_even_list;

import org.junit.Test;
import org.junit.Assert;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SolutionTest {

    @Test
    public void oddEvenListTest() {
        Solution solution = new Solution();
        Assert.assertEquals(Arrays.asList(1,3,5,2,4), solution.oddEvenList(ListNode.fromList(Arrays.asList(1,2,3,4,5))).toList());
        Assert.assertEquals(Arrays.asList(2,3,6,7,1,5,4), solution.oddEvenList(ListNode.fromList(Arrays.asList(2,1,3,5,6,4,7))).toList());
    }

    @Test
    public void oddEvenListTest2() {
        Solution solution = new Solution();
        Assert.assertEquals(Arrays.asList(1,3,5,2,4), solution.oddEvenList(ListNode.fromList(Arrays.asList(1,2,3,4,5))).toList());
        Assert.assertEquals(Arrays.asList(2,3,6,7,1,5,4), solution.oddEvenList(ListNode.fromList(Arrays.asList(2,1,3,5,6,4,7))).toList());
    }
}
