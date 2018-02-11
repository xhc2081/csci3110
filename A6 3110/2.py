# array is the input list
def Peak_1D(array):
    maximum = array[0]
    for i in array[1:]:
        if i > maximum:
            maximum = i
    return maximum

def Test():
    array = [2, 3, 5, 4, 6, 7, 3]
    print ('input example:')
    print (array)
    print ('result:')
    print (Peak_1D(array))


if __name__ == '__main__':
    Test()