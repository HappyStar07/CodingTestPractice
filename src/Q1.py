n = int(input())
data = list(map(int, input().split()))
cnt = 0
scare_sum = []
data.sort(reverse=True)

for x in data:
    if x <= 1:
        cnt += 1
    else:
        scare_sum.append(x)
        if len(scare_sum) >= scare_sum[0]:
            cnt+=1
            scare_sum.clear()
print(cnt)