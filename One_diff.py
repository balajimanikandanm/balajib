x,y=input().split()
z=0
for i in range(len(x)):
  if x[i]==y[i]:
    continue
  else:
    c+=1
if c==1:
  print("Yes")
else:
  print("No")
