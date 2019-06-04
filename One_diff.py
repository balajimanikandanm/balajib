x,y=input().split()
z=0
for i in range(len(x)):
  if x[i]==y[i]:
    continue
  else:
    z+=1
if z==1:
  print("yes")
else:
  print("no")
