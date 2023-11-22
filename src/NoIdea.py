n,m = list(map(int,input().split()))
w,e=0,0
set1={''}
set2={''}
array = list(map(int,input().split()))
b = list(map(int,input().split()))
q = list(map(int,input().split()))
if len(q)==m and len(b)==m:
    for j in b:
        set1.add(j)
    for r in q:
        set2.add(r)
    # set1.remove('')
    # set2.remove('')
    for i in array:
        if i in set1:
            w+=1
        elif i in set2:
            e-=1
    print(w+e)

