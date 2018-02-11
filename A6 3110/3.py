import numpy as np

# array is the input array
def Peak_2D(array):
    return array.max()

def Test():
    array = np.array([[1,2,3],[4,5,6],[7,8,9]])
    print ('input example:')
    print (array)
    print ('result:')
    print (Peak_2D(array))


if __name__ == '__main__':
    Test()