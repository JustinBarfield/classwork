#ADT List


+createList()- creates an empty list (constructor)

+isEmpty() - boolean-determines if the list is empty

+getSize() - int - returns the number of items that are in the list

+add(index : integer, item : ListItemType)- Inserts the given item at position given by the index
a pre condition is that the index is >= 0 and <= getSize()
if the index is < getSize() then the item at index moves to index +1, the item at index +1 moves to index +2 
and so on, throw an exception if the index is out of range or if the list is full

+remove(inxex : integer)- removes the item at the specified index
pre condition is that the index is >=0 and < getSize()
if the index is < getSize()-1 , then items mist be shifted as follows, the item at index+1 moves to index, the item at index+2 moves to index+1 and so on
throw an exception if the index is out of range or if the list is full

+removeAll()-removes all the items in the list

+get(index: integer)- ListItemType- returns item at position index of the list 
preconditon- the index is >= 0 and <= getSize()
throw an exception if the indec is out of range or if the list is full