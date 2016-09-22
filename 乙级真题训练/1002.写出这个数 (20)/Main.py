#coding=utf-8
__author__ = 'xuxuan'

s=str(input())
sum=0
for i in range(len(s)):
    sum+=int(s[i])
s=str(sum)
chinese=['ling','yi','er','san','si','wu','liu','qi','ba','jiu']
ans=''
for i in range(len(s)):
    ans+=chinese[int(s[i])]
    if i<len(s)-1:
        ans+=' '
print ans