# array is the input list
def QuickSort(array):
    if len(array) <= 1:
        return array
    pivot = array[-1]
    pivots = [i for i in array if i == pivot]
    left = QuickSort([i for i in array if i < pivot])
    right = QuickSort([i for i in array if i > pivot])
    return left + pivots + right

# O(nlgn) algorithm
def Method_1(array):
    sorted_array = QuickSort(array)
    maximum = sorted_array[-1]
    minimum = sorted_array[0]
    for i in range(len(array)):
        if (array[i] == maximum):
            maximum_id = i
        elif (array[i] == minimum):
            minimum_id = i
    return (minimum_id, maximum_id)

# O(n) algorithm
def Method_2(array):
    maximum = 0
    minimum = 0
    for i in range(1, len(array)):
        if (array[i] < minimum):
            minimum = i
        elif (array[i] > maximum):
            maximum = i
    return (minimum, maximum)

def Test():
    array = [1,2,5,8,6,14,-3]
    print ('input example:')
    print (array)
    print ('O(nlgn) algorithm result:')
    print (Method_1(array))
    print ('O(n) algorithm result:')
    print (Method_2(array))


if __name__ == '__main__':
    Test()