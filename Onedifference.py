s1=input("s1:")
s2=input("s2:")
def EditDistanceOne(s1,s2):
  m=len(s1)
  n=len(s2)
  if abs(m-n)>1:
    return No
  count=0
  i=0
  j=0
  while i<m and j<n:
    if s1[i]!=s2[j]:
      if count==1:
        return No
      if m>n:
        i+=1
      elif m<n:
        j+=1
      else:
        i+=1
        j+=1
      count+=1
     else:
      i+=1
      j+=1
     if i<m or j<n:
      count+=1
   return count==1
if EditDistanceOne(s1,s2):
  print("No")
else:
  print("Yes")
  

  
  
