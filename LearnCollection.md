Collection Interface (java.util)
      --->Collection is the root interface of the Java Collections Framework (except Map).

---------------------------------------------------------

Hiearchy
            Iterable
               ↑
            Collection
               ↑
            List / Set / Queue

-----------------------------------------------------------


Collection Interface – Important Methods

1. boolean add(e)	    =                   Adds element
2. boolean addAll(Collection<? extends E> c)  =Adds all elements
3. boolean remove(Object o)	   =            Removes element
4. boolean removeAll(Collection<?> c)	=       Removes all matching
5. boolean retainAll(Collection<?> c)	=       Keeps only matching
6. void clear()	   =              Removes all elements
7. boolean contains(Object o)	 =    Checks presence
8. boolean containsAll(Collection<?> c)	  =    hecks all
9. boolean isEmpty()   =  	Checks if empty
10. int size()	 =   Number of elements

-----------------------------------------------------------

List Interface
     ---> List is a child interface of Collection that:

   *) Allows duplicate elements

   *) Maintains insertion order

   *) Allows index-based access

Index-Based Methods
1. void add(int index, element) =  	Adds at index
2. get(int index)	=  Gets element
3. set(int index, element)   =  	Replaces element
4. remove(int index)	=  Removes element
5. int indexOf(Object o)	=  First index
6. int lastIndexOf(Object o)	=  Last index


Classes that Implement List
  1) ArrayList	=       Fast access, slow insertion/deletion
  2) LinkedList	 =   Fast insertion/deletion
  3) Vector	=          Thread-safe, legacy
  4) Stack	=          LIFO (extends Vector)

-----------------------------------------------------

HashSet (implements Set)
Key Features

   *)No duplicates

   *)No insertion order

   *)Uses hashing

   HashSet Methods
(Inherits Collection + Set methods)
   *) add()
   *) remove()
   *) contains()
   *) size()
   *) isEmpty()
   *) clear()
   *) iterator()

-------------------------------------------------------

LinkedHashSet (Hash + Order)

  1 . Maintains insertion order

  2 . Same methods as HashSet

-----------------------------------------------------------------

HashMap (NOT part of Collection)
  1 . put(key, value)	          =             Insert
  2 . get(Object key)	              =             Retrieve
  3 . remove(Object key)	          =             Delete
  4 . boolean containsKey(Object key)   =         	Key check
  5 . boolean containsValue(Object value)	 =          Value check
  6 . Set<K> keySet()	                  =             All keys
  7 . Collection<V> values()         	  =             All values
  8 . Set<Map.Entry<K,V>> entrySet()	  =         z    Key-value pairs
  9 . int size()	                      =              Size
  10 . void clear()	                  =              Remove all

HashTable (Legacy Class)

    *) Thread-safe

    *) No null key/value

    *) Slower than HashMap

-------------------------------------------------------------------

Interface/Class	  Order	    Duplicates	   Thread-Safe
ArrayList	        Yes	        Yes         	   No
LinkedList	        Yes         Yes	            No
Vector	           Ye          Yes	            Yes
HashSet     	     No	        No	            No
LinkedHashSet	     Yes	        No	            No
HashMap       	     No	        Keys: No	      No
Hashtable   	     No	        Keys: No	      Yes

We use generics and collections to store data dynamically with type safety, better performance, and structured access using interfaces like Collection, List, and hash-based classes.