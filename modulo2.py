#create your first tuple
tuple1 = ("disco",10,1.2)
print(tuple1)

#print the type of tuple you created
print(type(tuple1))

#print the variable on index 0
print(tuple1[0])
print(type(tuple1[0]))

#slice from index 3 to index 4
print(tuple1[3:5])

#sorting, sample tuple
Ratings = (0, 9, 6, 5, 10, 8, 9 , 6, 2)

#sort the tuple
RatingsSorted = sorted(Ratings)
print(RatingsSorted)

#nested tuples
NestedT = (1,2,("pop","rock"),(3,4),("disco",(1,2)))
print("Element 2 of tuple: ",NestedT[2])

print("Element 2, 0 of tuple: ", NestedT[2][0])
print("Element 2, 1 of tuple: ", NestedT[2][1])

#Create a list
L = ["Diana Velazquez", 10.1, 1982]
print(L)

#List slicing
print(L[2:3])

#Use extend to add elements to list
L = ["Michael Jackson", 10.2]
L.extend(['pop',10])
print(L)

#Use append to add elements to list
L = ["Michael Jackson", 10.2]
L.append(['pop',10])
print(L)

#Change the element based on the index
A = ["holi",10,1.2]
print('Before change:', A)
A[0] = 'adios'
print('After change:', A)

#delete
del(A[0])
print(A)

#examine the copy by reerence
B = ["Hard rock", 10, 1.2]
print("B[0]:", B[0])
B[0] = "banana"
print("B[0]:", B[0])

#clone the list A (by value)
A = B[:]
print(A)

#create a set
set1 = {"niña","niño","señor"}
print(set1)

#convert list to set
album_list = ["Diana",46.0,65,"30-nov-82"]
album_set = set(album_list)
print(album_set)

set1.add("abuelita")
print(set1)

#remove the element from set
set1.remove("abuelita")
print(set1)

#verify if the element is in the set
print("niño" in set1)

A= {"reggae","salsa","pop"}
B = {"rap","salsa","hip hop"}
Interseccion = A&B
print(Interseccion)

print(A.difference(B))
print(A.union(B))

#create the dictionary
Dict = {
    "key1":1,
    "key2":"2",
    "key3":[3,3,3],
    "key4":(4,4,4),
    "key5":5,
    (0,1):6
}
print(Dict)

#Access to the value by the key
print(Dict["key1"])

#Get all the keys in dictionary
print(Dict.keys())

#Get all the values
print(Dict.values())

#add keys
Dict["nuevo"] = 10
print(Dict)

#remove keys
del(Dict["nuevo"])
print(Dict)