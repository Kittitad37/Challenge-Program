import pandas as pd
df = pd.read_csv('lotto.csv')
num = df['เลขท้าย2ตัว'].astype(int)
for i in range(0, 100):
    if i not in num.values:
        print(i)
