"""
เป็นการแข่งขะนกีฬา คือเค้าจะให้ใส่ตัวเลข ว่าเราแข่งกันกี่แมช

มีสองทีม คือ HOME / VISITOR  ระกค่าเปน H/V และตามด้วยคะแนนที่ทำได้

เราจะแข่งกี่รอบก้ตาม นับรอบที่คะแนนเยอะสุด และติดต่อกัน คือต้องคอมโบติดกัน ถึงจะนับคะแนนรวม

Input 
Round : 7
Score : H2 H3 V6 H4 V1 H5 H2

Output
Winner : HOME
Score : 7
"""

round = int(input("Round : "))
score_lst = list(input("Score : ").split(" "))
score = [int(score_lst[0][1])]
winner = [score_lst[0][0]]
index = 0

for i in range (1, len(score_lst)):
    if score_lst[i-1][0] == score_lst[i][0]:
        score[index] += int(score_lst[i][1])
    else :
        index += 1
        winner.append(score_lst[i][0])
        score.append(int(score_lst[i][1]))

print(f"Winner : {winner[score.index(max(score))]}\nScore : {max(score)}")