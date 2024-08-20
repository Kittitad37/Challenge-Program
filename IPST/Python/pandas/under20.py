import pandas as pd
df = pd.read_csv('covid.csv')
print(df['Province'][df['age'] < 20].value_counts())
