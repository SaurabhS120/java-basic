# Stack
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Stack is an basic data structure which can store number of elements.
Stack works in LIFO order.When we add a element it is added at top of the stack called as push operation and also retrived from top called as pop operation.  
&nbsp;&nbsp;&nbsp;&nbsp;The push method throws StackOverflow exception when we try to add an elements hen stack is full.The pop method throws StackUnderflow exception whe we try to retrive an element from empty stack.
## Methods:
1. **push(element):** The push method is used to push/add element to stack.It takes one parameter of the element we want to add.
1. **Object pop():** This method is used to retive topmost element of stack and returns it.
1. **boolean isEmpty():** This method is used to check wether stack is empty or not and it returns true or false in boolean datatype.
1. **int search(Object key):** This method is used tu search an element in stack.THis method takes one parameter which is element to be searched.If element is found in stack then this method return its index else returns -1.
1. **Enumeration elements():** This method returns Enumeration of th stack.Te enumeration objects are used to traverse through elements of data structure.The enumeration object has tow methods hasMoreElements() used to check whether elements are left to traverse or not and nestElement() method is used to traverse to next element and returns the next element.
