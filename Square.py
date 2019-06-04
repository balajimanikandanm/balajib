n=int(input())
if(10<=n<100):
    a=int(n/10)
    b=int(n%10)
    c=int((a*a)+(b*b))
    print(c)
    
elif(100<=n<1000):
    a=int(n%100)
    b=int(a%10)
    c=int(a/10)
    d=int(n/100)
    e=int((d*d)+(b*b)+(c*c))
    print(e)
