titles = [
    # singer
    'Katy_Perry',
    'Taylor_Swift',
    'Ariana_Grande',
    'Mariah_Carey',
    'Justin_Bieber',
    'Lady_Gaga',
    'Michael_Jackson',
    'Britney_Spears',
    'Johnny_Cash',
    'Jennifer_Lopez',
    # soccer
    'Lionel_Messi',
    'Cristiano_Ronaldo',
    'Neymar',
    'Wayne_Rooney',
    'Diego_Maradona',
    # Medicine
    'Penicillin',
    'Insulin',
    'Polio_vaccine',
    'Ether',
    'Arsphenamine',
]
"""
with open('test.tsv', 'w') as f:
    for t1 in titles:
        for t2 in titles:
            if t1 != t2:
                f.write(t1 + '\t' + t2 + '\n')
print('Writing done.')"""

result_list = []
with open('1498532617747-test.out.tsv') as f:
    lines = f.readlines()
    for l in lines:
        split_array = l.split('\t')
        result_list.append((split_array[0], split_array[1], float(split_array[2].split('\n')[0])))
result_list.sort(key=lambda tup: tup[2], reverse=True)

labels = list(range(20))
cluster = 20
for result in result_list:
    i1 = titles.index(result[0])
    i2 = titles.index(result[1])
    if labels[i1] != labels[i2]:
        min_label = min(labels[i1], labels[i2])
        max_label = max(labels[i1], labels[i2])
        for n,l in enumerate(labels):
            if l == max_label:
                labels[n] = min_label
        cluster = cluster - 1
    if cluster == 3:
        break

print(labels)



