import pandas as pd
df = pd.read_csv('lotto.csv')
print(df['เลขท้าย2ตัว'].value_counts())
