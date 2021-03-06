//
// Created by hasee on 2020/6/2.
//

#ifndef LEETCODE_ALO_H
#define LEETCODE_ALO_H

#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>

//struct ListNode {
//    int val;
//    struct ListNode *next;
//};

int climbStairs(int n);

int strStr(const char *haystack, const char *needle);

void merge(int *A, int ASize, int m, int *B, int BSize, int n);

struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB);
#endif //LEETCODE_ALO_H
