#coding=utf-8
__author__ = 'xuxuan'

n=int(input())
ans=0
while n!=1:
    if (n&1)==1:
        n=3*n+1
    n/=2
    ans+=1
print ans