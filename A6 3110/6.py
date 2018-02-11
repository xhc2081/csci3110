# pid is the input list
# O(n) algorithm
def Method_1(pid):
    k = int(len(pid) / 2)
    for i in range(k):
        if pid[2 * i] != pid[2 * i + 1]:
            return pid[2 * i]
    return pid[-1]

# O(lg n) algorithm
def Method_2(pid):
    start = 0
    finish = len(pid)
    while (finish - start > 2):
        length = finish - start
        k = int((start + finish) / 2)
        if (k % 2):
            k -= 1
        if (pid[k] == pid[k + 1]):
            start = k + 2
        else:
            finish = k
    return pid[start]

def Test():
    pid = [5, 5, 12, 12, 18, 18, 19, 21, 21, 50, 50]
    print ('O(n) algorithm result: %d' % Method_1(pid))
    print ('O(lg n) algorithm result: %d' % Method_2(pid))


if __name__ == '__main__':
    Test()