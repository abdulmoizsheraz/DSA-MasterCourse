Binary Search is the Effective way of Searching in Array than Linear Search
if you are given Array take the following steps
1.Take the middle of Array(SORTED small to large)
2.Now check if the target element(element you are searching for) is greater middle element than search in right side of middle Element else search in left side of middle element
3.if middle == target than target element found simple
so we will take two pointers one at start and other at end
middleElement=startingindex+lastIndex/2
-->we can repeat above three steps for our array until our target==middle
Best Case for Binary Search will be we find in the first step for example target==firstmiddleterm

 Why Binary Search 🤔?
 Order agonstic Binary Search 💁:
This is use if we dont know the Given Array is sorted or not
if(start>end){
    large to small 😄
}else{
    small to large 😠
}

