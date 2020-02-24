package com.alevel.nix.java.hometask.lesson10;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void longestCommonPrefix() {

        test("fl","flower","flow","flight");
        test("","dog","racecar","car");
        test("a","a");
        test("", "a", "b");
        test("","aca", "cba");

    }

    void test(String expRes, String ... strs){
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        assertArrayEquals(expRes.toCharArray(),lcp.longestCommonPrefix(strs).toCharArray());
    }
}