import pandas as pd
import numpy as np

JusoTable = pd.read_csv('juso.csv')


def myConcat(s):
    return ' '.join(s)


JusoTable = JusoTable.dropna(axis=0).groupby(by="읍면동").agg({
    "위도": np.average,
    "경도": np.average,
    "하위": myConcat
})

JusoTable.to_csv("./result.csv")
